import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо рядок зі стандартного вводу
        String input = scanner.nextLine();

        // Розділяємо рядок на числа за пробілами
        String[] numbersArray = input.split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        // Конвертуємо рядок чисел в список цілих 
        for (String numStr : numbersArray) {
            int number = Integer.parseInt(numStr);
            numbers.add(number);
        }
    }
}