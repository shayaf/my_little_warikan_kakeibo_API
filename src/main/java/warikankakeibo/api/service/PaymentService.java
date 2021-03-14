package warikankakeibo.api.service;

import warikankakeibo.api.domain.Payment;

import java.util.List;

public interface PaymentService {

    public void add(Payment payment);

    public List<Payment> getAll();

    public void delete();
}
