package warikankakeibo.api.domain;

import lombok.Data;

@Data
public class Payment {

    private int paymentId;

    private String name;

    private Category category;

    private int price;

    private Participant paidBy;

    private int projectId;
}
