package farm;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

    public class Execute {
        private static Scanner scanner = new Scanner(System.in);


        public void execute(Integer command) {

            Farms farm = Farms.farm();
            ComandAnimal petCommands = ComandAnimal.petCommands();

            switch (command) {
                case 1:
                    System.out.println(Menu.LISTANIMAL);
                    int numAnimal = Digit();
                    switch (numAnimal){
                        case 1:
                            System.out.println(Menu.NAME);
                            String nameCat = scanner.next();
                            //int a = 7;
                            LocalDate birthDayCat = Date();
                            farm.AddCatInZoo(nameCat, birthDayCat);
                            break;
                        case 2:
                            System.out.println(Menu.NAME);
                            String nameDog = scanner.next();
                            LocalDate birthDayDog = Date();
                            farm.AddDogInZoo(nameDog, birthDayDog);
                            break;

                        case 3:
                            System.out.println(Menu.NAME);
                            String nameHamster = scanner.next();
                            LocalDate birthDayHamster = Date();
                            farm.AddHamsterInZoo(nameHamster, birthDayHamster);
                            break;
                        case 4:
                            System.out.println(Menu.NAME);
                            String nameDonkey = scanner.next();
                            LocalDate birthDayDonkey = Date();
                            farm.AddDonkeyInZoo(nameDonkey, birthDayDonkey);
                            break;
                        case 5:
                            System.out.println(Menu.NAME);
                            String nameCamel = scanner.next();
                            LocalDate birthDayCamel = Date();
                            farm.AddCamelInZoo(nameCamel, birthDayCamel);
                            break;
                        case 6:
                            System.out.println(Menu.NAME);
                            String nameHorse = scanner.next();
                            LocalDate birthDayHorse = Date();
                            farm.AddHorseInZoo(nameHorse, birthDayHorse);
                            break;
                    }
                    break;

                case 2:
                    System.out.println(Menu.LISTANIMAL);
                    int numAnimals = Digit();
                    switch (numAnimals){
                        case 1:
                            farm.printCats();
                            System.out.println(Menu.DELEETEANIMAL);
                            int idDeleteCat = Digit();
                            farm.takeOfCat(idDeleteCat);
                            break;
                        case 2:
                            farm.printDogs();
                            System.out.println(Menu.DELEETEANIMAL);
                            int idDeleteDog = Digit();
                            farm.takeOfDog(idDeleteDog);
                            break;

                        case 3:
                            farm.printHamsters();
                            System.out.println(Menu.DELEETEANIMAL);
                            int idDeleteHam = Digit();
                            farm.takeOfHamster(idDeleteHam);
                            break;
                        case 4:
                            farm.printDonkey();
                            System.out.println(Menu.DELEETEANIMAL);
                            int idDeleteDon = Digit();
                            farm.takeOfDonkey(idDeleteDon);
                            break;
                        case 5:
                            farm.printCamel();
                            System.out.println(Menu.DELEETEANIMAL);
                            int idDeleteCam = Digit();
                            farm.takeOfCamel(idDeleteCam);
                            break;
                        case 6:
                            farm.printHorses();
                            System.out.println(Menu.DELEETEANIMAL);
                            int idDeleteHorse = Digit();
                            farm.takeOfHorse(idDeleteHorse);
                            break;
                    }
                    break;

                case 3:
                    System.out.println(Menu.LISTANIMAL);
                    int numPet = Digit();
                    switch (numPet) {
                        case 1:
                            farm.printCats();
                            break;
                        case 2:
                            farm.printDogs();
                            break;
                        case 3:
                            farm.printHamsters();
                            break;
                        case 4:
                            farm.printDonkey();
                            break;
                        case 5:
                            farm.printCamel();
                            break;
                        case 6:
                            farm.printHorses();
                            break;
                    }
                    break;

                case 4:
                    petCommands.printCommand();
                    break;
                case 5:
                    System.out.println(Menu.LISTANIMAL);
                    int numPets = Digit();
                    switch (numPets) {
                        case 1:
                            farm.printCats();
                            System.out.println(Menu.IDANIMAL);
                            int idCat = Digit();
                            petCommands.printCommand();
                            System.out.println(Menu.COMMAND);
                            int idCommandCat = Digit();
                            farm.setCatCommand(idCat, petCommands.getCommand(idCommandCat));
                            break;
                        case 2:
                            farm.printDogs();
                            System.out.println(Menu.IDANIMAL);
                            int idC = Digit();
                            petCommands.printCommand();
                            System.out.println(Menu.COMMAND);
                            int idCommandDog = Digit();
                            farm.setDogCommand(idC, petCommands.getCommand(idCommandDog));
                            break;
                        case 3:
                            farm.printHamsters();
                            System.out.println(Menu.IDANIMAL);
                            int idH = Digit();
                            petCommands.printCommand();
                            System.out.println(Menu.COMMAND);
                            int idCommandHamster = Digit();
                            farm.setHamsterCommand(idH, petCommands.getCommand(idCommandHamster));
                            break;
                        case 4:
                            farm.printDonkey();
                            System.out.println(Menu.IDANIMAL);
                            int idDon = Digit();
                            petCommands.printCommand();
                            System.out.println(Menu.COMMAND);
                            int idCommandDonkey = Digit();
                            farm.setDonkeyCommand(idDon, petCommands.getCommand(idCommandDonkey));
                            break;

                        case 5:
                            farm.printCamel();
                            System.out.println(Menu.IDANIMAL);
                            int idCam = Digit();
                            petCommands.printCommand();
                            System.out.println(Menu.COMMAND);
                            int idCommandCamel = Digit();
                            farm.setCamelCommand(idCam, petCommands.getCommand(idCommandCamel));
                            break;
                        case 6:
                            farm.printHorses();
                            System.out.println(Menu.IDANIMAL);
                            int idHorse = Digit();
                            petCommands.printCommand();
                            System.out.println(Menu.COMMAND);
                            int idCommandHorse = Digit();
                            farm.setHorseCommand(idHorse, petCommands.getCommand(idCommandHorse));
                            break;
                    }
                    break;

                case 6:
                    System.out.println(Menu.LISTANIMAL);
                    int numPete = Digit();
                    switch (numPete) {
                        case 1:
                            farm.printCats();
                            System.out.println(Menu.IDANIMAL);
                            int idCats = Digit();
                            farm.getArrayCats(idCats);
                            break;
                        case 2:
                            farm.printDogs();
                            System.out.println(Menu.IDANIMAL);
                            int idDog = Digit();
                            farm.getArrayDogs(idDog);
                            break;
                        case 3:
                            farm.printHamsters();
                            System.out.println(Menu.IDANIMAL);
                            int idHam = Digit();
                            farm.getArrayHamsters(idHam);
                            break;
                        case 4:
                            farm.printDonkey();
                            System.out.println(Menu.IDANIMAL);
                            int idDon = Digit();
                            farm.getArrayDonkeys(idDon);
                            break;
                        case 5:
                            farm.printCamel();
                            System.out.println(Menu.IDANIMAL);
                            int idCamel = Digit();
                            farm.getArrayCamels(idCamel);
                            break;
                        case 6:
                            farm.printHorses();
                            System.out.println(Menu.IDANIMAL);
                            int idHorses = Digit();
                            farm.getArrayCats(idHorses);
                            break;
                    }
                    break;

                default:
                    System.out.println("Некорректный выбор");
            }

        }


        static int Digit() {
            int digit;
            try {
                digit = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введено некорректное значение. Пожалуйста, введите целое число.");
                scanner.next(); // Очистка ввода
                digit = Digit(); // Рекурсивный вызов для повторного ввода
            }
            return digit;
        }


        static LocalDate Date() {
            System.out.println(Menu.YEAR);
            int year = Digit();
            System.out.println(Menu.MONTH);
            int month = Digit();
            System.out.println(Menu.DAY);
            int day = Digit();
            try {
                LocalDate.of(year, month, day);
                return LocalDate.of(year, month, day);
            } catch (Exception e) {
                System.out.println("Введено некорректное значение. Пожалуйста, введите заново.");
                Date(); // Рекурсивный вызов для повторного ввода
            }
            return null;
        }

    }

