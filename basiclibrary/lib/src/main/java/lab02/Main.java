package lab02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int [] arr ={1,2,3,4,5,6};
        int[][] weeklyMonthTemperatures = {

                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},

                {55, 54, 60, 53, 59, 57, 61},
                {1},
                {65, 56, 55, 52, 55, 62, 57},

        };

        System.out.println("xxxxxxxxxxxxx");

        Library fun = new Library();
        fun.roll(2);
        System.out.println(fun.containsDuplicates(arr));
        System.out.println(fun.average(arr));
        System.out.println(Arrays.toString(fun.arraysLowestAav(weeklyMonthTemperatures)));
    }
}
