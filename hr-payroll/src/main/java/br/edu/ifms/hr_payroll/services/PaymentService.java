package br.edu.ifms.hr_payroll.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import br.edu.ifms.hr_payroll.entities.Payment;
import br.edu.ifms.hr_payroll.entities.Worker;
import br.edu.ifms.hr_payroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

    private WorkerFeignClient workerRestClient;

    public PaymentService(WorkerFeignClient workerRestClient) {
        this.workerRestClient = workerRestClient;
    }

    public Payment getPayment(long workerId, int days) {
        Worker worker = workerRestClient.findById(workerId).getBody();
        if (worker != null) {
            return new Payment(worker.getName(), worker.getDailyIncome(), days);
        }
        return null;
    }
}