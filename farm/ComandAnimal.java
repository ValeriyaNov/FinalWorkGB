package farm;

import java.util.ArrayList;

public class ComandAnimal {
    private static ComandAnimal petCommands;

    private static ArrayList<Comands> commandAnimals;


    public static ComandAnimal petCommands() {
        if (petCommands == null)
            petCommands = new ComandAnimal();

        commandAnimals = new ArrayList<>();
        for (Comands command : Comands.values()) {
            commandAnimals.add(command);
        }
        return petCommands;
    }


    public void printCommand() {
        int i = 1;
        for (Comands command : Comands.values()) {
            System.out.println(i + " " + command);
            i++;
        }
        System.out.println();
    }


    public Comands getCommand(int comandId) {
        int size = commandAnimals.size();
        if (size > comandId - 1) {
            return commandAnimals.get(comandId - 1);
        } else
            System.out.println("Нет такой команды");
        return null;
    }

}
