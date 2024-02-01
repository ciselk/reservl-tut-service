package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document //veri tabanında tablolara karsilik gelme durumu
public class ProductEntity {
    @Id
    private String title;
    private String description;
    private long deci;
}
