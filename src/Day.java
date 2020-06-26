import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class Day {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, Month.JANUARY,1);
        Period period = Period.ofDays(10);// период в десять дней
        date = date.plus(period);
        System.out.println(date);

        LocalDateTime dateTime = LocalDateTime.of(2016, Month.MARCH, 1, 12, 30);
        Period period1 = Period.ofDays(10);
        dateTime = dateTime.plus(period1);// период в десять дней
        System.out.println(dateTime); //2016-03-11T12:30
    }
}
