package constants;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Generator {
    public static class Generate {
        static Faker faker = new Faker(new Locale("ru"));

        public static final String FULL_NAME = faker.name().fullName();
        public static final String FIRST_NAME = faker.name().firstName();
        public static final String LAST_NAME = faker.name().lastName();
        public static final String AGE = String.valueOf(faker.number().numberBetween(18,99));

        public static final String E_MAIL = faker.internet().emailAddress();
        public static final String SALARY = String.valueOf(faker.number().numberBetween(50000,350000));
        public static final String DEPARTMENT = faker.company().industry();
        public static final String CURRENT_ADDRESS = faker.address().city() + " " + faker.address().streetAddress() + faker.address().buildingNumber();
        public static final String PERMANENT_ADDRESS = faker.address().city() + " " + faker.address().streetAddress() + faker.address().buildingNumber();
    }

}
