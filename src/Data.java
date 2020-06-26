import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Data {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());// работа только с датой
        System.out.println(LocalTime.now());// работа только со временем
        System.out.println(LocalDateTime.now());// работа с датой и временем

//        LocalDate date = LocalDate.of(2020,1,1);// выводим конкретную дату
//        System.out.println(date);
//        LocalDate date1 = LocalDate.of(2020, Month.JANUARY,1);//выводим конкретную дату
//        System.out.println(date1);

//        LocalTime time = LocalTime.of(9,12);//выводим конкретное время
//        System.out.println(time);
//
//        LocalTime time0 = LocalTime.of(9,12,34);//выводим конкретное время,секунды
//        System.out.println(time0);
//
//        LocalTime time1 = LocalTime.of(9,12,45,146);//выводим  время,наносекунды
//        System.out.println(time1);
//
//        LocalDateTime time2 = LocalDateTime.of(2020,1,1,12,34,45);//выводим  время
//        System.out.println(time2);

//        LocalDate date = LocalDate.of(2020,1,1);
//        LocalTime time = LocalTime.of(13,54,23);
//        LocalDateTime dateTime = LocalDateTime.of(date,time);
//        System.out.println(dateTime);// совместно дата и время

//        LocalDate date = LocalDate.of(2020,Month.JANUARY,1);
//        System.out.println(date);
//        date = date.plusDays(1);//прибавим один день
//        System.out.println(date);
//        date = date.plusWeeks(1);// прибавим неделю
//        System.out.println(date);
//        date = date.minusMonths(1);// прибавим месяц
//        System.out.println(date);
//        date = date.minusYears(1);// убавим год
//        System.out.println(date);
//        date = date.plusYears(1);// прибавим год
//        System.out.println(date);

//        LocalDate date = LocalDate.of(2016,Month.OCTOBER,31);
//        date = date.plusDays(1);// прибавление даты
//        System.out.println(date);

//        LocalDate date = LocalDate.of(2016,Month.JANUARY,15);
//        date.plusDays(3);
//        System.out.println(date);

//        LocalDateTime dateTime = LocalDateTime.of(2020,Month.JANUARY,1,23,23);
//        dateTime = dateTime.plusDays(1).plusHours(1);// прибавили день и час
//        System.out.println(dateTime);
    }
}
