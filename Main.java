import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList();

        Cat cat1 = new Cat();
        cat1.setName("Barsic");
        cat1.setDateOfBirth(2020, 01, 01);
        cat1.addCommand(Command.JUMP);
        cat1.addCommand(Command.GO);
        //System.out.println(cat1);
        cats.add(cat1);

        Cat cat2 = new Cat();
        cat2.setName("Persik");
        cat2.setDateOfBirth(2023, 01, 01);
        cat2.addCommand(Command.COME_UP);
        cat2.addCommand(Command.RUN_AWAY);
        //System.out.println(cat2);
        cats.add(cat2);

        for (Cat cat:cats) {
            System.out.println(cat);
        }

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

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа реестра питомника");

        while (true) {
            System.out.println("Введите команду: 1 - Завести новое животное; \n 2 - Посмотреть список команд животного; \n 3 - Обучить животное командам; \n 4 - выйти;");
            String command = scanner.nextLine();

            if (command.equals("1")) {
                System.out.println("Введите имя животного:");
                String name = scanner.nextLine();
                System.out.println("Введите тип животного: 1 - Кошка, 2 - Собака, 3 - Хомяк, 4 - Осел, 5 - Лошадь, 6 - Верблюд");
                String type = scanner.nextLine();
                System.out.println("Дату рождения животного в формате год,месяц,день (например 2020-01-02)");
                String dB = scanner.nextLine();
                LocalDate dateB = LocalDate.parse(dB);
                System.out.println("Выберете команду для животного: 1 - GO, 2 - STOP, 3 - RUN_AWAY, 4 - COME_UP, 5 - LIE, 6 - JUMP, 7 - STAND_UP");
                String comm = scanner.nextLine();

                Horse horse1 = new Horse();
                horse1.setName("Horse_6345643");
                horse1.setDateOfBirth(2023, 01, 01);
                horse1.addCommand(Command.COME_UP);
                horse1.addCommand(Command.RUN_AWAY);
                System.out.println(horse1);



            } else if (command.equals("list")) {
                System.out.println("Введите имя животного:");
                String name = scanner.nextLine();
                petRegistry.listCommands(name);
            } else if (command.equals("add-command")) {
                System.out.println("Введите имя животного:");
                String name = scanner.nextLine();
                System.out.println("Введите команду для животного:");
                String animalCommand = scanner.nextLine();
                petRegistry.addCommand(name, animalCommand);
            } else if (command.equals("help")) {
                petRegistry.displayCommands();
            } else if (command.equals("exit")) {
                System.out.println("Программа завершена");
                break;
            } else {
                System.out.println("Неверная команда, попробуйте еще раз");
            }
        }

        scanner.close();

    }
}
