package СontrolFlowStatements;

public class IfElseStatement {

/*
Конструкція if-else надає можливість виконувати різні дії, залежно від заданої умови.
Якщо умова виконується, виконується блок коду після if. Якщо умова не виконується, виконується блок коду після else.
Ця конструкція може бути вкладеною, що дозволяє обробляти більш складні умови або додаткові альтернативи.
*/

    public static void main(String[] args) {
        int score = 75;
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Оцінка: " + grade);
    }
}
