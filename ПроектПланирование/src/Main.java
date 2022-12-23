import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    private static OptionsExecutor optionsExecutor;


    static String[] Menu = new String[]{
            "Создать задание",
            "Удалить задание",
            "Редактировать задание",
            "Вывести все задания",
            "Вывести выполненные задания",
            "Вывести невыполненные задания",
            "Вывести все задания за определенную дату выполнения",
            "Вывести выполненные задания за определенную дату выполнения",
            "Вывести невыполненные задания за определенную дату выполнения",
            "Вывести все задания за определенную дату создания",
            "Вывести выполненные задания за определенную дату создания",
            "Вывести невыполненные задания за определенную дату создания",
            "Вывести детальную информацию о задании",
            "Выполнить задание",
    };


    private static void printMenu() {
        // Выводит все пункты меню
        for (int i = 0; i < Menu.length; i++) {
            System.out.println(MessageFormat.format("{0} {1}", i + 1, Menu[i]));
        }
    }

    private static void startFunction(int num) {
        // Запуск функции по выбору из меню
        switch (num) {
            case 1 -> optionsExecutor.createTask();
            case 2 -> optionsExecutor.deleteTask();
            case 3 -> optionsExecutor.editTask();
            case 4 -> optionsExecutor.displayAllTasks();
            case 5 -> optionsExecutor.displayCompletedTasks();
            case 6 -> optionsExecutor.displayUncompletedTasks();
            case 7 -> optionsExecutor.displayAllTasksByDateOfCompleted();
            case 8 -> optionsExecutor.displayCompletedTasksByDateOfCompleted();
            case 9 -> optionsExecutor.displayUncompletedTasksByDateOfCompleted();
            case 10 -> optionsExecutor.displayAllTasksByDateOfCreation();
            case 11 -> optionsExecutor.displayCompletedTasksByDateOfCreation();
            case 12 -> optionsExecutor.displayUncompletedTasksByDateOfCreation();
            case 13 -> optionsExecutor.displayFullInformation();
            case 14 -> optionsExecutor.markTaskCompleted();
        }
    }

    public static void main(String[] args) {
        optionsExecutor = new OptionsExecutor();
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        var input = new Scanner(System.in);
        var exit = false;
        System.out.println("Планировщик заданий\nПростой как хлеб с маслом)");
        while (true) {
            System.out.println("МЕНЮ");
            printMenu();
            System.out.println("Для выполнения функции, введите номер пункта меню и нажмите enter");
            System.out.println("Для выхода из программы введите \"выйти\" и нажмите enter");
            Integer num = null;
            while (true) {
                var result = input.nextLine();
                if (result.toLowerCase(Locale.ROOT).equals("выйти")) {
                    exit = true;
                    break;
                }
                num = BaseUtils.parseIntOrNull(result);
                if (num != null)
                    if (num > 0 && num <= Menu.length)
                        break;
                System.out.println(MessageFormat.format("Неверный номер задания {0}!\nПожалуйста, повторите:", result));
            }
            if (exit) {
                System.out.println("Вы действительно хотите выйти!\nВведите \"да\", если хотите");
                if (input.nextLine().toLowerCase(Locale.ROOT).equals("да")) {
                    System.out.println("До скорой встречи) Возвращайтесь");
                    return;
                }
            } else {
                startFunction(num);
                System.out.println("Кнопка Enter - выход в главное меню");
                input.nextLine();
            }
        }
    }
}