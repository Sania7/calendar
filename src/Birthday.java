import java.text.ParseException;
import java.time.LocalDate;


public class Birthday {
    public static void main(String[] args) throws ParseException {
        int day = 5;
        int months = 8;
        int year = 1977;
        LocalDate birth = LocalDate.of(year, months,day);
        LocalDate today = LocalDate.now();
        int i = 0;
        while (birth.plusYears(i).isBefore(today)){
            System.out.println(i + " - " + birth.plusYears(i) + " - " + birth.plusYears(i).getDayOfWeek());
            i++;
        }

    }
}

