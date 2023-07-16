
import farm.CreateAnimal;
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
            String name = "Horses" + i;
            LocalDate birthDayHorse = Date();
            farm.AddHorseInZoo(name, birthDayHorse);
        }
    }


    static LocalDate Date() {
        int year = random.nextInt(23)+2000;  // год
        int month = random.nextInt(11)+1;   // месяц
        int day = random.nextInt(27)+1;  // день

        return LocalDate.of(year, month, day);
    }
}
