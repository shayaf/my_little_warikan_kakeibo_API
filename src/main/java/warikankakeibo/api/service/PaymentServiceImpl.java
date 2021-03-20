package warikankakeibo.api.service;

import org.springframework.stereotype.Service;
import warikankakeibo.api.dao.PaymentDao;
import warikankakeibo.api.domain.Payment;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void add(Payment payment) {

    }

    @Override
    public List<Payment> getAll() {
        return null;
    }

    @Override
    public void delete() {

    }
}
