package СontrolFlowStatements;

public class SwitchStatement {
    /*
    Конструкція switch використовується для зручної обробки багатьох альтернативних випадків
    замість послідовної перевірки з використанням конструкції if-else. Кожен варіант (case) вказує
    на певне значення, з яким порівнюється вираз switch. Коли відповідність знайдена, виконується блок коду
    для цього варіанту. Ключове слово break використовується для виходу з конструкції switch після виконання
    потрібного варіанту.
    */
    public static void main(String[] args) {
        int dayOfWeek = 3;
        String dayName;
        //День тижня: Середа
        switch (dayOfWeek) {
            case 1:
                dayName = "Понеділок";
                break;
            case 2:
                dayName = "Вівторок";
                break;
            case 3:
                dayName = "Середа";
                break;
            case 4:
                dayName = "Четвер";
                break;
            case 5:
                dayName = "П'ятниця";
                break;
            case 6:
                dayName = "Субота";
                break;
            case 7:
                dayName = "Неділя";
                break;
            default:
                dayName = "Невідомий день";
                break;
        }

        System.out.println("День тижня: " + dayName);
    }
}
