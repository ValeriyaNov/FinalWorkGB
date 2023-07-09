
    import java.util.ArrayList;

    public class Hamster extends Pet {
        private ArrayList<Command> commands;


        @Override
        public String getType() {
            return "Hamster";
        }


        @Override
        public void addCommand(Command command) {
            if (commands == null)
                commands = new ArrayList();
            this.commands.add(command);
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

