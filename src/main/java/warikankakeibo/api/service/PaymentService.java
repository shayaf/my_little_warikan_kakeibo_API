package warikankakeibo.api.service;

import org.springframework.stereotype.Service;
import warikankakeibo.api.dao.PaymentDao;
import warikankakeibo.api.domain.Payment;

import java.util.List;

@Service
public class PaymentService {

    private final PaymentDao paymentDao;

    public PaymentService(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    public List<Payment> getAll(Integer projectId) {
        return paymentDao.findByProjectId(projectId);
    }
}
