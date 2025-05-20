package APIs;
import java.time.*;
public class Apis2 {
    public static void main(String[] args) {
    LocalDate date = LocalDate.now();
        System.out.println(date);
       int day = date.getDayOfYear();
        System.out.println(day);
        int day1 = date.getDayOfMonth();
        System.out.println(day1);


        LocalTime time=LocalTime.now();
        System.out.println(time);
        int hour=time.getHour();
        int min=time.getMinute();
        int sec=time.getSecond();
        int nano=time.getNano();

        System.out.println(hour+":"+min+":"+sec+":"+nano);
    }
}
