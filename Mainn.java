import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {

        Farm<Animal> animalFarm = new Farm<>();
        Dog dog1 = new Dog();
        dog1.setName("Ddfkvbsdbnss");
        dog1.setDateOfBirth(2023, 01, 01);
        dog1.addCommand(Command.COME_UP);
        dog1.addCommand(Command.RUN_AWAY);
        System.out.println(dog1);

        Horse horse1 = new Horse();
        horse1.setName("Horse_6345643");
        horse1.setDateOfBirth(2023, 01, 01);
        horse1.addCommand(Command.COME_UP);
        horse1.addCommand(Command.RUN_AWAY);
        System.out.println(horse1);

        animalFarm.adopt(dog1);
        animalFarm.adopt(horse1);
        //animalFarm.adopt(new Camel(1091, "Горбун", "2016-07-15", 15));
        //animalFarm.adopt(new Dog(1209, "Байкал", "2018-07-15", false));

        try {
            while (true) {

                Menu.showMainMenu();
                try (
                        Scanner sc = new Scanner(System.in)) {
                    int i = sc.nextInt();
                    switch (i) {
                        case 1:
                            Farm.printAnimals();
                            break;
                        case 2:
                            Menu.printOnlyThisClass(animalFarm);
                            break;
                        case 3:
                            Menu.Comands();
                            break;
                        case 4:
                            Menu.newComand();
                            break;
                        case 5:
                            Menu.newAnimal();
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Try one more time");
        }
    }
}
