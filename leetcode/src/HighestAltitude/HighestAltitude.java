package HighestAltitude;
    // №1732
    /*Опис: Є велосипедист, який здійснює поїздку по дорозі.
    Поїздка складається з n + 1 точок на різних висотах.
    Велосипедист починає свою поїздку з точки 0 з висотою, рівною 0.
    Вам надається цілочисельний масив `gain` довжиною n, де `gain[i]` є чистим
    приростом у висоті між точками i та i + 1 для всіх (0 <= i < n).
    Поверніть найвищу висоту серед усіх точок.

    Пояснення:

*/

public class HighestAltitude {
    public static void main(String[] args) {

        int[]gain={-4,-3,-2,-1,4,3,2};//2)[-5,1,5,0,-7]

        System.out.println(largestAltitude(gain));
    }

    public static int  largestAltitude(int[] gain) {
        int currentAltitude = 0; // Поточна висота-9
        int maxAltitude = 0; // Початкове значення для найвищої висоти

        for (int i = 0; i < gain.length; i++) {
            currentAltitude = currentAltitude + gain[i]; // Обчислюємо актуальну висоту на кожному кроці
            if (currentAltitude > maxAltitude) {//якщо поточна висота більше максимальної
                maxAltitude = currentAltitude; // Оновлюємо найвищу висоту, якщо поточна висота більша
            }                                   //Output: 1)-9+(9) = 0; 2)1

        }

        return maxAltitude; // Повертаємо найвищу висоту
    }

}
