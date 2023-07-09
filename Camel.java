import java.util.ArrayList;

public class Camel extends PackAnimal{
    private ArrayList<Command> commands;



    @Override
    public void addCommand(Command command) {
        if (commands == null)
            commands = new ArrayList();
        this.commands.add(command);
    }

    @Override
    public String getType() {
        return "Camel";
    }


    @Override
    public String toString() {
        return getType() + " - " +
                "id= " + getId() +
                ", name= " + getName() +
                ", dateOfBirth= " + getDateOfBirth() +
                ", commands= " + commands +
                "\n";
    }
}
