package DateClassJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeClassJava {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        LocalDate birthday = LocalDate.of(1989,11,29);
        System.out.println("birthday = " + birthday);


        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        LocalTime startingTime = LocalTime.now();
        System.out.println("startingTime = " + startingTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime start = LocalDateTime.of(2022,06,21,10,45,15,01);
        System.out.println("start = " + start);





    }
}
