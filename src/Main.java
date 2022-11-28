/*
23/11/22 - NOVUS FS SOFTWARE DEVELOPER PROGRAMME
Exercise 3:
Create programme called MaxAndMin.
Create, Initialise, Pre-fill with random values.
Find and output the maximum and minimum values from the array.
 */

//Import necessary libraries
import java.util.Random;
import java.util.ArrayList; // import the ArrayList class

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<String> numbers = new ArrayList<>(); // Create an ArrayList object
        int size=10;
        int max=0;
        int min=10;

        for(int i=0; i<size; i++) {
            int num = rand.nextInt(10) + 1;
            numbers.add(Integer.toString(num));
        }

        for (String number : numbers) {
            System.out.println(Integer.parseInt(number));

            if (Integer.parseInt(number) > max) {
                max = Integer.parseInt(number);
            }
            if (Integer.parseInt(number) < min) {
                min = Integer.parseInt(number);
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


    }
}