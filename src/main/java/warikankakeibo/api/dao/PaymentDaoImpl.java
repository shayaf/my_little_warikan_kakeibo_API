package warikankakeibo.api.dao;

import org.springframework.stereotype.Component;
import warikankakeibo.api.domain.Category;
import warikankakeibo.api.domain.Participant;
import warikankakeibo.api.domain.Payment;

import java.util.ArrayList;
import java.util.List;

@Component
public class PaymentDaoImpl implements PaymentDao {
    @Override
    public void create(Payment payment) {

    }

    @Override
    public List<Payment> findByProjectId(Integer projectId) {
        List<Payment> paymentList = new ArrayList<>();
        Participant participant = new Participant();
        participant.setName("たら");
        participant.setGroupId(1);

        Category category = new Category();
        category.setName("category1");
        for(int i=0;i<10;i++) {
            Payment payment = new Payment();
            payment.setPaymentId(i+1);
            payment.setName("payment"+(i+1));
            payment.setPrice(1000 * (i+0));
            payment.setProjectId(1);
            payment.setCategory(category);
            payment.setPaidBy(participant);
            paymentList.add(payment);
        }
        return paymentList;
    }

    @Override
    public void delete(int paymentId) {

    }
}
