import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Period {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JUNE, 25);
//        System.out.println(date.getDayOfMonth()); // день месяца
        System.out.println(date.getDayOfWeek()); // день недели
//        System.out.println(date.getDayOfYear()); //количество дней с начала года
//        System.out.println(date.getMonthValue()); // месяц
//        System.out.println(date.getYear()); //2020 год


//        GregorianCalendar newCal = new GregorianCalendar( );
//        int day = newCal.get( Calendar.DAY_OF_WEEK );
//        System.out.println(day);
    }
}
