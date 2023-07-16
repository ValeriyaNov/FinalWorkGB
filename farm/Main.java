
import farm.CreateAnimal;

public class Main {
    public static void main(String[] args) {

        CreateAnimal createAnimal = new CreateAnimal();
        createAnimal.randomAnimal();

        FinalWorkGB.TerminalReader terminalReader = FinalWorkGB.TerminalReader.terminalReader();
        terminalReader.endLess();

    }

}