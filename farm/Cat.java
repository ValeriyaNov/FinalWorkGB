package farm;

import FinalWorkGB.Comands;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cat extends Pet {
    private ArrayList<Comands> commandAnimals;

    public Cat() {
    }

    @Override
    public String getType() {
        return "Cat";
    }
    public void printComand() {
        for (int i = 0; i < commandAnimals.size(); i ++){
            System.out.println(commandAnimals.get(i));
        }
    }



    @Override
    public void addCommand(Comands commandAnimal) {
        if (commandAnimals == null)
            commandAnimals = new ArrayList();
        this.commandAnimals.add(commandAnimal);
    }


    @Override
    public String toString() {
        return getType() + " - " +
                "id= " + getId() +
                ", name= " + getName() +
                ", dateOfBirth= " + getDateOfBirth() +
                ", commands= " + commandAnimals +
                "\n";
    }

    @Override
    public void addAnimal(String name, LocalDate birthDay) {
        setName(name);
        setDateOfBirth(birthDay);
    }

}
