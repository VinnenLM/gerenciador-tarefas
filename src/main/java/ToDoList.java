import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ToDoList {
    public static void main(String[] args) {
        List<String> toDoList = new ArrayList<>();
        Scanner scanMenu = new Scanner(System.in);
        int valorMenu = -1;
        while (valorMenu != 0) {
            System.out.println("1 - Mostrar Lista / 2 - Adicionar Item / 3 - Remover Item / 0 - Sair \n");
            valorMenu = scanMenu.nextInt();
            switch (valorMenu) {
                case 1 -> {
                    AtomicInteger indice = new AtomicInteger(0);
                    toDoList.forEach(item -> System.out.println(indice.incrementAndGet() + " " + item));
                }
                case 2 -> {
                    Scanner scanAdicionar = new Scanner(System.in);
                    toDoList.add(scanAdicionar.nextLine());
                }
                case 3 -> {
                    Scanner scanRemover = new Scanner(System.in);
                    int indice = scanRemover.nextInt();
                    if (indice <= 0 || indice > toDoList.size()) {
                        System.out.println("Indice inválido!");
                    } else {
                        toDoList.remove(indice - 1);
                    }
                }
                default -> valorMenu = 0;
            }
        }
    }
}
