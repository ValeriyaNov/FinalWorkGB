package farm;

import java.time.LocalDate;
import java.util.Random;

public class CreateAnimal {
    private static Random random = new Random();


    public void randomAnimal() {
        Farms farm = Farms.farm();
        for (int i = 0; i < 5; i++) {
            String name = "Cat" + i;
            LocalDate birthDayCat = Date();
            farm.AddCatInZoo(name, birthDayCat);
        }
        for (int i = 0; i < 5; i++) {
            String name = "Horse" + i;
            LocalDate birthDayHorse = Date();
            farm.AddHorseInZoo(name, birthDayHorse);
        }
        for (int i = 0; i < 5; i++) {
            String name = "Dog" + i;
            LocalDate birthDayDog = Date();
            farm.AddDogInZoo(name, birthDayDog);
        }
        for (int i = 0; i < 5; i++) {
            String name = "Camel" + i;
            LocalDate birthDayCamel = Date();
            farm.AddCamelInZoo(name, birthDayCamel);
        }
        for (int i = 0; i < 5; i++) {
            String name = "Hamster" + i;
            LocalDate birthDayHamster = Date();
            farm.AddHamsterInZoo(name, birthDayHamster);
        }
        for (int i = 0; i < 5; i++) {
            String name = "Donkey" + i;
            LocalDate birthDayDonkey = Date();
            farm.AddDonkeyInZoo(name, birthDayDonkey);
        }
    }



    static LocalDate Date() {
        int year = random.nextInt(23)+2000;  // год
        int month = random.nextInt(11)+1;   // месяц
        int day = random.nextInt(27)+1;  // день

        return LocalDate.of(year, month, day);
    }
}
