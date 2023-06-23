package medium.LongestArithmetic;

import java.util.HashMap;
/*
       Дано масив `nums` цілих чисел. Повернути довжину найбільшої арифметичної підпослідовності в `nums`.
      - Підпослідовність - це масив, який можна отримати з іншого масиву, видаливши деякі або жодні елементи,
          не змінюючи порядку залишених елементів.
      - Послідовність `seq` є арифметичною, якщо `seq[i + 1] - seq[i]` є однаковим значенням
          для всіх `0 <= i < seq.length - 1`.
          */
public class LongestArithmeticSubsequence {
    public static void main(String[] args) {
        int []array = new int[]{1,2,3,4,6,8};//4
        System.out.println(longestArithSeqLength(array));
    }
    public static int longestArithSeqLength(int[] nums) {
        int maxLength = 0;
        int n = nums.length;
        HashMap<Integer, Integer>[] dp = new HashMap[n];

        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>(); // Створюємо HashMap для зберігання довжин арифметичних підпослідовностей для кожного індексу
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j]; // Обчислюємо різницю між поточним і попереднім елементами
                dp[i].put(diff, dp[j].getOrDefault(diff, 1) + 1); // Оновлюємо довжину арифметичної підпослідовності для поточного індексу з урахуванням різниці
                maxLength = Math.max(maxLength, dp[i].get(diff)); // Оновлюємо максимальну довжину, якщо поточна довжина більша
            }
        }

        return maxLength;
    }

}
