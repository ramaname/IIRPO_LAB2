import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class QuestRoom {
    static String currentRoom = "Зал";
    static List<String> inventory = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Вы находитесь в: " + currentRoom);
            System.out.println("1. Осмотреться");
            System.out.println("2. Идти на север");
            System.out.println("3. Выход");
            System.out.println("4. Взять предмет");

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Вы видите дверь и стол.");
            } else if (choice == 2) {
                currentRoom = "Кухня";
                System.out.println("Вы перешли в Кухню.");
            }
            else if (choice == 4) {
                if (currentRoom.equals("Кухня")) {
                    inventory.add("Ключ");
                    System.out.println("Вы взяли Ключ!");
            } else {
                System.out.println("Здесь нечего брать.");
            }
        }
            else {
                break;
            }
        }
    }
}