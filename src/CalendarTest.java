import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {

    public static void main(String[] args)
    {

        LocalDate date = LocalDate.now();
        int month = date.getMonthValue(); //current month value
        int today = date.getDayOfMonth(); //current day of month

        date = date.minusDays(today - 1); //setting date to first day of the month by subtracting current date by it's value

        DayOfWeek weekday = date.getDayOfWeek(); //current day of week
        int value = weekday.getValue();

        System.out.println(" Mn  Tu  We  Th  Fr  We  Su");
        for (int i = 1; i < value; i++)
            System.out.print("    "); //printing spaces to adjust first row

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth()); //printing day of month using 3 decimal symbols

            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");

            date = date.plusDays(1); //incrementing day

            if (date.getDayOfWeek().getValue() == 1) //if we moved to next week
                System.out.println();                //move to next line
        }
    }
}
