package warikankakeibo.api.domain;

import lombok.Data;

import java.util.List;

@Data
public class Group {

    private int groupId;

    private String name;

    private List<Participant> participants;

    private List<Category> categories;
}
