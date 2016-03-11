package Lab2_12_1;

/**
 * Created by Alex on 11.03.2016.
 */
public class Main {
    public static void main (String[] args){
        MyDayOfWeek[] days = MyDayOfWeek.values();

        for (MyDayOfWeek day:days) {
            System.out.println(day);
        }
    }
}
