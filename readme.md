# Coding part of the task

Hello to anyone who will look through this guide!

My name is Serhii Matiunin, and I'm glad to share with you this project written on Java with resolving of the following tasks:

1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”
    
    Solution for this task you can find in [TaskOne](src/main/java/TaskOne.java) class.


2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
   
    Solution for this task you can find in [TaskTwo](src/main/java/TaskTwo.java) class.
> Please note that because of some issues with encoding on my PC OS, I had to add either "Вячеслав" or "Vyacheslav" strings as an expected ones

3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

    Solution for this task you can find in [TaskThree](src/main/java/TaskThree.java) class.

### Running the project in IntelliJ IDEA

Program entry point is located in the [TestTask](src/main/java/TestTask.java) class. 

### Running the project using runnable JAR file

You can locate the JAR file by following link [https://github.com/stoding/andersen/blob/master/task.jar](https://github.com/stoding/andersen/blob/master/task.jar)
# Logic part of the task

Задание, ответ в текстовой форме:

Дана скобочная последовательность: [((())()(())]]
- Можно ли считать эту последовательность правильной?
- Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?

**Ответ:**

Последовательность неправильная, так как в ней отсутствует внешняя закрывающая круглая скобка, лишняя закрывающая квадратная скобка (либо отсутствует открывающая внешняя квадратная скобка). Таким образом, на мой взгляд верная последовательность скобок будет выглядеть таким образом:

[((())()(()))] либо [[((())()(()))]]
