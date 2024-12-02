import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num * 2) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    // Метод для тестирования решения
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Пример 1
        int[] arr1 = {10, 2, 5, 3};
        System.out.println(solution.checkIfExist(arr1));  // Вывод: true

        // Пример 2
        int[] arr2 = {3, 1, 7, 11};
        System.out.println(solution.checkIfExist(arr2));  // Вывод: false

        // Дополнительные тесты
        int[] arr3 = {0, 0};
        
        System.out.println(solution.checkIfExist(arr3));  // Вывод: true

        int[] arr4 = {-2, 0, 10, -19, 4, 6, -8};
        System.out.println(solution.checkIfExist(arr4));  // Вывод: false

        int[] arr5 = {7, 1, 14, 11};
        System.out.println(solution.checkIfExist(arr5));  // Вывод: true
    }
}