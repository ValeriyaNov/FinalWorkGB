package FinalWorkGB;


import java.util.Scanner;


    public class TerminalReader {
        private static TerminalReader terminalReader;


        public static TerminalReader terminalReader() {
            if (terminalReader == null) {
                terminalReader = new TerminalReader();
            }
            return terminalReader;
        }


        public void endLess() {
            try (Scanner scanner = new Scanner(System.in)) {
                while (true) {
                    System.out.println(Menu.STARTMENU);
                    System.out.println(Menu.QUITE);
                    String str = scanner.nextLine();
                    if (str.equals(Menu.Q)) break;
                    if (isInteger(str)) {
                        int addOrDelete = Integer.parseInt(str);
                        Execute execute = new Execute();
                        execute.execute(addOrDelete);
                    } else System.out.println(Menu.ERROR);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


        static boolean isInteger(String str) {
            try {
                Integer.parseInt(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

    }
