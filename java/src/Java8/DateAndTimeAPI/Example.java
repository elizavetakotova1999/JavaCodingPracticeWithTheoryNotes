package Java8.DateAndTimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Example {
    public static void main(String[] args) {
        //Створення об'єкта LocalDate та вивід поточної дати:
        LocalDate currentDate = LocalDate.now();
        System.out.println("Поточна дата: " + currentDate);

        //Робота з датою та часом:
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Поточна дата та час: " + currentDateTime);

        LocalDate date = LocalDate.of(2023, Month.JANUARY, 1);
        LocalTime time = LocalTime.of(12, 30);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("Вказана дата та час: " + dateTime);

        //Отримання значення конкретного поля дати/часу:
        LocalDateTime dateTimeNow = LocalDateTime.now();
        int year = dateTimeNow.getYear();
        Month month = dateTimeNow.getMonth();
        int dayOfMonth = dateTimeNow.getDayOfMonth();
        int hour = dateTimeNow.getHour();
        int minute = dateTimeNow.getMinute();
        int second = dateTimeNow.getSecond();

        System.out.println("Рік: " + year);
        System.out.println("Місяць: " + month);
        System.out.println("День місяця: " + dayOfMonth);
        System.out.println("Година: " + hour);
        System.out.println("Хвилина: " + minute);
        System.out.println("Секунда: " + second);

        //Обчислення тривалості між двома датами:
        LocalDate startDate = LocalDate.of(2023, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2023, Month.DECEMBER, 31);

        Period period = Period.between(startDate, endDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Кількість років: " + years);
        System.out.println("Кількість місяців: " + months);
        System.out.println("Кількість днів: " + days);

        //Форматування та парсинг дати/часу:
        LocalDateTime dateTime2 = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime2.format(formatter);
        System.out.println("Форматована дата та час: " + formattedDateTime);

        String dateStr = "01-01-2023";
        LocalDate parsedDate = LocalDate.parse(dateStr, formatter);
        System.out.println("Розпізнана дата: " + parsedDate);


    }
}
