package Lab2_12_2;

/**
 * Created by Alex on 11.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyDayOfWeek[] days = MyDayOfWeek.values();

        for (MyDayOfWeek day : days) {
            switch (day) {
                case MONDAY:
                case WEDNESDAY:
                case FRIDAY:
                    System.out.println("My java day: " + day);
            }
        }
    }
}
