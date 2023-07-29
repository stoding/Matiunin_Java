import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTask {
    protected static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    protected static final String ANSI_RESET = "\u001B[0m";
    protected static final String ANSI_RED = "\u001B[31m";
    protected static final String ANSI_GREEN = "\u001B[32m";
    protected String userInput;

    public static void main(String[] args) throws IOException {

        System.out.println("Hello! This is a test task assigned to Serhii Matiunin.\n");
        while (true) {
            System.out.println("Please input menu option according to task that you would like to run:\n" +
                    "1. Task 1. Print 'Hello' if inputted value >7\n" +
                    "2. Task 2. Print a greetings message if inputted name is equal to an expected name\n" +
                    "3. Task 3. Given an integer array, print elements that multiplies of 3\n" +
                    "4. Exit app");

            switch (reader.readLine()) {
                case "1": {
                    TaskOne taskOne = new TaskOne();
                    taskOne.executeTestTask();
                    break;
                }
                case "2": {
                    TaskTwo taskTwo = new TaskTwo();
                    taskTwo.executeTestTask();
                    break;
                }
                case "3": {
                    TaskThree taskThree = new TaskThree();
                    taskThree.executeTestTask();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Please choose one of the available menu options");
            }
        }
    }
}



