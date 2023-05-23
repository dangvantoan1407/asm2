package demo8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);
        LocalDate ld2 = ld1.plusDays(2);
        LocalDate ld3 = ld1.plusWeeks(3);
        System.out.println(ld3);
        LocalDate ld4 = ld1.minusDays(3);

        String bth = "2003-07-14";
        LocalDate ld5 = LocalDate.parse(bth);
        System.out.println(ld5.getDayOfWeek());
        LocalDate ld6 = LocalDate.of(2003,7,14);

        LocalDateTime lt1 = LocalDateTime.now();
        LocalDateTime lt2 = lt1.plusMinutes(5);
        LocalDateTime lt3 = lt1.minusMinutes(5);
        System.out.println(lt2);
    }
}
