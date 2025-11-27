package moduls;

import com.github.javafaker.Faker;

public class ProductFactory
{
    private final Faker faker = new Faker();
    public Electronics createElectronics()
    {
        return Electronics.builder()
                .id(faker.idNumber().valid() + "-electronics").build();

    }

    public Clothes createClothes()
    {
        return Clothes.builder()
                .id(faker.idNumber().valid() + "-clothes").build();

    }

    public Cakes createCakes()
    {
        return Cakes.builder()
                .id(faker.idNumber().valid() + "-cakes").build();

    }
}
