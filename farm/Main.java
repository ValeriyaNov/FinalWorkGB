package farm;

public class Main {
    public static void main(String[] args) {

        CreateAnimal createAnimal = new CreateAnimal();
        createAnimal.randomAnimal();

        TerminalReader terminalReader = TerminalReader.terminalReader();
        terminalReader.endLess();

    }

}