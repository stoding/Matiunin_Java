import java.io.IOException;

public class TaskTwo extends TestTask {
    private static final String EXPECTED_NAME_RU = "Вячеслав";
    private static final String EXPECTED_NAME_ENG = "Vyacheslav";
    private static final String WRONG_NAME_MESSAGE = ANSI_RED + "Invalid name" + ANSI_RESET;
    private static final String GREETINGS_MESSAGE = ANSI_GREEN + "Hello, %s" + ANSI_RESET;

    public void executeTestTask() throws IOException {
        while (true) {
            System.out.println("Please enter your name or 'Back' to get back to main menu:");
            userInput = reader.readLine();
            if (userInput.equalsIgnoreCase("back"))
                break;
            else if (userInput.equals(EXPECTED_NAME_RU) || userInput.equals(EXPECTED_NAME_ENG))
                System.out.println(String.format(GREETINGS_MESSAGE, userInput));
            else
                System.out.println(WRONG_NAME_MESSAGE);
        }
    }
}
