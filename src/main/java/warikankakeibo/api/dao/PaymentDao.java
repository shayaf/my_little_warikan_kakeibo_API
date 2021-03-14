package warikankakeibo.api.dao;

import warikankakeibo.api.domain.Payment;

import java.util.List;

public interface PaymentDao {

    public void create(Payment payment);

    public List<Payment> getAll();

    public void delete(int paymentId);
}
