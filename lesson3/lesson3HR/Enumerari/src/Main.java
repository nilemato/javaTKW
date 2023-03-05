import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for(Months luna : Months.values()){
            System.out.print(luna +  ", ");
        }

        System.out.println(Weekday.FRIDAY.isWeekDay());
        System.out.println(Weekday.FRIDAY.isHoliday());
    }
}