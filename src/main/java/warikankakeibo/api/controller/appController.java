package warikankakeibo.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import warikankakeibo.api.domain.Payment;
import warikankakeibo.api.service.PaymentService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class appController {

    private final PaymentService paymentService;

    @GetMapping("/")
    public String index() {
        return "app top";
    }

    @GetMapping("/payment")
    public List<Payment> getPaymentAll(@RequestParam("project_id") Integer projectId) {
        return paymentService.getAll(projectId);
    }
}
