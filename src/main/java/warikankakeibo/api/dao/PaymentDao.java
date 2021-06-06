package warikankakeibo.api.dao;

import org.springframework.stereotype.Component;
import warikankakeibo.api.domain.Payment;

import java.util.List;

@Component
public interface PaymentDao {

    public void create(Payment payment);

    public List<Payment> findByProjectId(Integer projectId);

    public void delete(int paymentId);
}
