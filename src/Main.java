import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);


        TreeMap<Integer, String> tasks = new TreeMap<Integer, String>();
        tasks.put(7, "Выполнить дз");
        tasks.put(9, "Закончить таску");
        tasks.put(3, "Написать тимлиду");
        tasks.put(1, "Купить носки");


        do {
            System.out.println("Команды:");
            System.out.println("1. Add (Добавить новую задачу)\n2. Get (Показать задачу с наибольшим приоритетом)\n3. Done (Удаляет задачу)\n4. Exit (Выход)\n");

            System.out.print("Выберите одну из команд, чтобы выполнить действие: ");
            int chooseCommand = input.nextInt();

            if (chooseCommand == 1)
            {
                System.out.print("Введите название новой задачи: ");
                input.nextLine();
                String discription = input.next();

                System.out.print("Введите приоритет новой задачи (От 0 до 9): ");
                int priority = input.nextInt();

                tasks.put(priority, discription);
            }
            else if (chooseCommand == 2)
            {
                Map.Entry<Integer, String> lastTask = tasks.lastEntry();
                System.out.println("Задача с наибольшим приоритетом: " + lastTask.getValue());
            }
            else if (chooseCommand == 3)
            {
                // do
            }
            else if (chooseCommand == 4)
            {
                System.out.println("\n\nВесь список задач:\n");
                Set<Integer> keys = tasks.keySet();
                System.out.println("Приоритеты задач -> " + keys);
                Collection <String> values = tasks.values();
                System.out.println("Задачи -> " + values);
                break;
            }
        }while(true);
    }
}