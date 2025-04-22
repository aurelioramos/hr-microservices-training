package br.edu.ifms.hr_payroll.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import br.edu.ifms.hr_payroll.entities.Payment;
import br.edu.ifms.hr_payroll.entities.Worker;

@Service
public class PaymentService {

    @Value("${hr-worker.host}")
    private String workerHost;

    private RestClient restClient;

    public PaymentService(RestClient restClient) {
        this.restClient = restClient;
    }

    public Payment getPayment(long workerId, int days) {
        Worker worker = restClient.method(HttpMethod.GET)
                .uri(workerHost + "/workers/{workerId}", workerId)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(Worker.class);
        if (worker != null) {
            return new Payment(worker.getName(), worker.getDailyIncome(), days);
        }       
        return null;
    }
}