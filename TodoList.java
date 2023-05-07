import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Queue<String> todoList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan kegiatan ke dalam todoList
        todoList.offer("Bangun tidur");
        todoList.offer("Mandi pagi");
        todoList.offer("Sarapan pagi");
        todoList.offer("Berangkat kerja");
        todoList.offer("Makan siang");
        todoList.offer("Berangkat pulang kerja");
        todoList.offer("Makan malam");
        todoList.offer("Mandi malam");
        todoList.offer("Tidur");

        while (!todoList.isEmpty()) {
            System.out.println("Kegiatan selanjutnya: " + todoList.peek());
            System.out.print("Apakah kegiatan ini sudah selesai? (y/n) ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                todoList.poll();
            } else {
                todoList.offer(todoList.poll());
            }
        }

        System.out.println("Semua kegiatan telah selesai!");
    }
}
