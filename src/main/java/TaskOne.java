import java.io.IOException;

public class TaskOne extends TestTask {

    public void executeTestTask() throws IOException {
        int digit;
        String userInput;

        while (true) {
            System.out.println("Please input integer value or 'Back' to get back to main menu:");
            userInput = reader.readLine();
            if (userInput.equalsIgnoreCase("back"))
                break;
            try {
                digit = Integer.parseInt(userInput);
                if (digit > 7)
                    System.out.println(ANSI_GREEN + "Hello" + ANSI_RESET);
            } catch (NumberFormatException e) {
                System.out.println(ANSI_RED + "Only INTEGER values are supported" + ANSI_RESET);
            }
        }
    }
}

