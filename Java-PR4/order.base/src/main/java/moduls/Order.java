package moduls;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Order<T extends Product> {
    private String id;
    private T product;

}
