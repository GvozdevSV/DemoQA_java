package constants;

import com.github.javafaker.Faker;

import java.util.Locale;

public  class Generator {
    Faker faker = new Faker(new Locale("ru"));

    String fullName = faker.name().fullName();
    String eEmail = faker.internet().emailAddress();
    String currentAddress = faker.address().buildingNumber();
}
