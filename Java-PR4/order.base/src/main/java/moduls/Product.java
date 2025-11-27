package moduls;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@Getter
public abstract class Product {
    protected String id;
    protected String name;
    protected String description;
    protected double price;
}
