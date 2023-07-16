import farm.*;

import java.time.LocalDate;
import java.util.ArrayList;
public class Farms extends ComandAnimal {
    private static Farms farm;
    private ArrayList<Cat> arrayCats;
    private ArrayList<Horse> arrayHorse;
    private ArrayList<Dog> arrayDogs;
    private ArrayList<Donkey> arrayDonkeys;
    private ArrayList<Camel> arrayCamels;
    private ArrayList<Hamster> arrayHamsters;



    private Farms() {
        if (arrayCats == null)
            arrayCats = new ArrayList<>();

        if (arrayHorse == null)
            arrayHorse = new ArrayList<>();
        if (arrayDogs == null)
            arrayDogs = new ArrayList<>();

        if (arrayDonkeys == null)
            arrayDonkeys = new ArrayList<>();
        if (arrayHamsters == null)
            arrayHamsters = new ArrayList<>();

        if (arrayCamels == null)
            arrayCamels = new ArrayList<>();
    }

    public static Farms farm() {
        if (farm == null)
            farm = new Farms();
        return farm;
    }


    public void AddCatInZoo(String name, LocalDate birthDay) {
        Cat cat = new Cat();
        cat.setName(name);
        cat.setDateOfBirth(birthDay);
        arrayCats.add(cat);
    }

    public void AddDogInZoo(String name, LocalDate birthDay) {
        Dog dog = new Dog();
        dog.setName(name);
        dog.setDateOfBirth(birthDay);
        arrayDogs.add(dog);
    }
    public void AddHamsterInZoo(String name, LocalDate birthDay) {
        Hamster hamster = new Hamster();
        hamster.setName(name);
        hamster.setDateOfBirth(birthDay);
        arrayHamsters.add(hamster);
    }
    public void AddHorseInZoo(String name, LocalDate birthDay) {
        Horse horse = new Horse();
        horse.setName(name);
        horse.setDateOfBirth(birthDay);
        arrayHorse.add(horse);
    }

    public void AddCamelInZoo(String name, LocalDate birthDay) {
        Camel camel = new Camel();
        camel.setName(name);
        camel.setDateOfBirth(birthDay);
        arrayCamels.add(camel);
    }
    public void AddDonkeyInZoo(String name, LocalDate birthDay) {
        Donkey donkey = new Donkey();
        donkey.setName(name);
        donkey.setDateOfBirth(birthDay);
        arrayDonkeys.add(donkey);
    }

    public void setCatCommand(int id, Comands command) {
        for (int i = 0; i < arrayCats.size(); i++) {
            int idCat = arrayCats.get(i).getId();
            if (idCat == id) {
                arrayCats.get(i).addCommand(command);
                break;
            }
        }
    }


    public void setHorseCommand(int id, Comands command) {
        for (int i = 0; i < arrayHorse.size(); i++) {
            int idHorse = arrayHorse.get(i).getId();
            if (idHorse == id) {
                arrayHorse.get(i).addCommand(command);
                break;
            }
        }
    }

    public void setDogCommand(int id, Comands command) {
        for (int i = 0; i < arrayDogs.size(); i++) {
            int idD = arrayDogs.get(i).getId();
            if (idD == id) {
                arrayDogs.get(i).addCommand(command);
                break;
            }
        }
    }
    public void setHamsterCommand(int id, Comands command) {
        for (int i = 0; i < arrayHamsters.size(); i++) {
            int idH = arrayHamsters.get(i).getId();
            if (idH == id) {
                arrayHamsters.get(i).addCommand(command);
                break;
            }
        }
    }
    public void setCamelCommand(int id, Comands command) {
        for (int i = 0; i < arrayCamels.size(); i++) {
            int idCa = arrayCamels.get(i).getId();
            if (idCa == id) {
                arrayCamels.get(i).addCommand(command);
                break;
            }
        }
    }
    public void setDonkeyCommand(int id, Comands command) {
        for (int i = 0; i < arrayDonkeys.size(); i++) {
            int idCat = arrayDonkeys.get(i).getId();
            if (idCat == id) {
                arrayDonkeys.get(i).addCommand(command);
                break;
            }
        }
    }





    public void takeOfCat(int id) {
        for (int i = 0; i < arrayCats.size(); i++) {
            int idCat = arrayCats.get(i).getId();
            if (idCat == id) {
                arrayCats.remove(i);
                break;
            }
        }
    }


    public void takeOfHorse(int id) {
        for (int i = 0; i < arrayHorse.size(); i++) {
            int idHorse = arrayHorse.get(i).getId();
            if (idHorse == id) {
                arrayHorse.remove(i);
                break;
            }
        }
    }

    public void takeOfCamel(int id) {
        for (int i = 0; i < arrayCamels.size(); i++) {
            int idCamel = arrayCamels.get(i).getId();
            if (idCamel == id) {
                arrayCamels.remove(i);
                break;
            }
        }
    }

    public void takeOfDog(int id) {
        for (int i = 0; i < arrayDogs.size(); i++) {
            int idDog = arrayDogs.get(i).getId();
            if (idDog == id) {
                arrayDogs.remove(i);
                break;
            }
        }
    }

    public void takeOfHamster(int id) {
        for (int i = 0; i < arrayHamsters.size(); i++) {
            int idHamster = arrayHamsters.get(i).getId();
            if (idHamster == id) {
                arrayHamsters.remove(i);
                break;
            }
        }
    }
    public void takeOfDonkey(int id) {
        for (int i = 0; i < arrayDonkeys.size(); i++) {
            int idDonkey = arrayDonkeys.get(i).getId();
            if (idDonkey == id) {
                arrayDonkeys.remove(i);
                break;
            }
        }
    }
    public void printCats() {
        for (Cat cat : arrayCats) {
            System.out.println(cat.toString());
        }
    }


    public void printDogs() {
        for (Dog dog : arrayDogs) {
            System.out.println(dog.toString());
        }
    }

    public void printHamsters() {
        for (Hamster hamster : arrayHamsters) {
            System.out.println(hamster.toString());
        }
    }

    public void printCamel() {
        for (Camel camel : arrayCamels) {
            System.out.println(camel.toString());
        }
    }
    public void printDonkey() {
        for (Donkey donkey : arrayDonkeys) {
            System.out.println(donkey.toString());
        }
    }
    public void printHorses() {
        for (Horse horse : arrayHorse) {
            System.out.println(horse.toString());
        }
    }

    //
    public void getArrayCats(int id) {
        try {
            for (int i = 0; i < arrayCats.size(); i++) {
                int idCat = arrayCats.get(i).getId();
                if (idCat == id) {
                    arrayCats.get(i).printComand();
                    break;
                }

            }
        } catch (NullPointerException e) {
            System.out.println(Menu.NOTCOMMAND);
        }

   }

    public void getArrayHorses(int id) {
        try {
            for (int i = 0; i < arrayHorse.size(); i++) {
                int idCat = arrayHorse.get(i).getId();
                if (idCat == id) {
                    arrayHorse.get(i).printComand();
                    break;
                }

            }
        } catch (NullPointerException e) {
            System.out.println(Menu.NOTCOMMAND);
        }

    }

    public void getArrayDogs(int id) {
        try {
            for (int i = 0; i < arrayDogs.size(); i++) {
                int idD = arrayDogs.get(i).getId();
                if (idD == id) {
                    arrayDogs.get(i).printComand();
                    break;
                }

            }
        } catch (NullPointerException e) {
            System.out.println(Menu.NOTCOMMAND);
        }

    }

    public void getArrayHamsters(int id) {
        try {
            for (int i = 0; i < arrayHamsters.size(); i++) {
                int idH = arrayHamsters.get(i).getId();
                if (idH == id) {
                    arrayHamsters.get(i).printComand();
                    break;
                }

            }
        } catch (NullPointerException e) {
            System.out.println(Menu.NOTCOMMAND);
        }

    }

    public void getArrayCamels(int id) {
        try {
            for (int i = 0; i < arrayCamels.size(); i++) {
                int idC = arrayCamels.get(i).getId();
                if (idC == id) {
                    arrayCamels.get(i).printComand();
                    break;
                }

            }
        } catch (NullPointerException e) {
            System.out.println(Menu.NOTCOMMAND);
        }

    }

    public void getArrayDonkeys(int id) {
        try {
            for (int i = 0; i < arrayDonkeys.size(); i++) {
                int idDo = arrayDonkeys.get(i).getId();
                if (idDo == id) {
                    arrayDonkeys.get(i).printComand();
                    break;
                }

            }
        } catch (NullPointerException e) {
            System.out.println(Menu.NOTCOMMAND);
        }

    }



}

