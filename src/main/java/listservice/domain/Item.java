package listservice.domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Getter @Setter
public class Item {
    private String header;
    private Long headerId;
//    private String list;
//    private Long listId;
    private String promise;

    public Item() {
    }

    public Item(String header, Long headerId) {
        this.header = header;
        this.headerId = headerId;
    }
}
