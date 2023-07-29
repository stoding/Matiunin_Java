import java.io.IOException;

public class TaskThree extends TestTask {

    public void executeTestTask() throws IOException {
        String[] stringArray;
        int integerElement;

        while (true) {
            System.out.println("Please input INTEGER array separating elements with ',' or input 'Back' to get back to main menu:");
            userInput = reader.readLine().replaceAll(" ", "");
            if (userInput.equalsIgnoreCase("back"))
                break;
            stringArray = userInput.split(",");
            try {
                int counter = 0;
                for (String element : stringArray) {
                    integerElement = Integer.parseInt(element);
                    if (integerElement % 3 == 0 && integerElement != 0) {
                        System.out.println(integerElement);
                        counter++;
                    }
                }
                if (counter == 0)
                    System.out.println("There are no elements in provided array that multiplies of 3");
            } catch (NumberFormatException e) {
                System.out.println("Please enter only INTEGER values");
            }
        }
    }
}
