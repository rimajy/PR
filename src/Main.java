import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо рядок зі стандартного вводу
        String input = scanner.nextLine();

        // Розділяємо рядок на числа за пробілами
        String[] numbersArray = input.split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        // Конвертуємо рядок чисел в список цілих чисел
        for (String numStr : numbersArray) {
            int number = Integer.parseInt(numStr);
            numbers.add(number);
        }
        // Конвертуємо числа в бінарне представлення у доповнювальному коді
        List<String> binaryStrings = new ArrayList<>();
        for (int num : numbers) {
            binaryStrings.add(decimalToBinary(num));
        }

        // Сортуємо бінарні значення методом бульбашкового сортування
        bubbleSort(binaryStrings);

        // Виводимо відсортовані бінарні значення
        for (String binary : binaryStrings) {
            System.out.println(binary);
        }

    }
    // Метод для конвертації десяткового числа в бінарне представлення у доповнювальному коді
    public static String decimalToBinary(int n) {
        int limit = (int) Math.pow(2, 15) - 1; // Максимальне значення для 16-бітного представлення
        if (n > limit) {
            n = limit;
        } else if (n < -limit) {
            n = -limit;
        }
        return String.format("%16s", Integer.toBinaryString(n & 0xFFFF)).replace(' ', '0');
    }

    // Метод для сортування списку методом бульбашкового сортування
    public static void bubbleSort(List<String> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    // Swap
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}