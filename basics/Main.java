import java.util.TimerTask;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;



public class Main {
    public static void main(String[] args) {
        int number = 0;
        int n = 2;

        System.out.println("I own => " + number + " " + pluralize("dog", number) + ".");
        flipNHeads(n);
        time();
    }

    public static String pluralize(String animal, int number) {

        if (number <= 0) {
            return animal + "s";
        }
        if (number == 1) {
            return animal;
        }
        if (number > 1) {
            return animal + "s";
        }
        return "I own no animals";

    }

public static void flipNHeads(int n ) {
    int count=0;
    int count2=0;
    while (count < n) {
        if (Math.random() < 0.5) {
            System.out.println("tails");
            count2=count2+1;
            count =0;
        }
        if (Math.random() > 0.5) {
            System.out.println("Heads");
            count = count + 1;
            count2=count2+1;
        }

    }
//    int sum =  count + count2;
    System.out.println("It took =>"+ count2 +""+"FLIPS flips to flip => "+n+ "heads in a row");
}

    public static void time() {
        int initial = 0;
        int interval = 1000;
        Timer timer = new Timer();
        String time = "HH:mm:ss";

        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern(time)));
            }
        };
        timer.scheduleAtFixedRate(task, initial, interval);
    }
}



