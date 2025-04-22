package br.edu.ifms.hr_payroll.services;

import org.springframework.stereotype.Service;

import br.edu.ifms.hr_payroll.entities.Payment;

@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days) {
        return new Payment("Mocked Person " + workerId, 200.0, days);
    }
}