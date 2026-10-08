import java.util.Scanner;

public class QuestRoom {
    static String currentRoom = "Зал";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Вы находитесь в: " + currentRoom);
            System.out.println("1. Осмотреться");
            System.out.println("2. Идти на север");
            System.out.println("3. Выход");

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Вы видите дверь и стол.");
            } else if (choice == 2) {
                currentRoom = "Кухня";
                System.out.println("Вы перешли в Кухню.");
            } else {
                break;
            }
        }
    }
}