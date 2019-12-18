import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//Create an array that holds 20 positions, give each index a
//random value between 1-6, then use a for loop to count
//how many 1's were randomly generated in  the array

        int store = 0;
        int[] counts = new int[20];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = (int) (Math.random() * 6) + 1;
            if (counts[i] == 1) {
                store += 1;
            }
        }

        System.out.println("How many times 1 occurs in the Array");
        System.out.println(store);

        //This shows what value was assigned to each index
        System.out.println("number\t" + "occurence ");

        for (int num = 0; num < counts.length; num++) {

            System.out.println(num + "\t" + "        " + counts[num]);
        }

        //Create another array holds 10 positions, give each index
// a random value between 1 and 100, then find the average
//of all the values in the arrays

        System.out.println("\n");
        int[] ints = new int[100];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100) + 1;
        }
        int sum = 0;

        for (int e : ints) sum += e;
        System.out.println("The average of all the arrays is " + sum / 100);

        //Take the last array you made and swap 2 different index
        //positions

        //New Index 40
        System.out.println("\n");
        System.out.println("Same array with a index of 40");
        int[] ints2 = new int[40];
        for (int i = 0; i < ints2.length; i++) {
            ints2[i] = (int) (Math.random() * 100) + 1;
        }
        int sum2 = 0;

        for (int e : ints2) sum2 += e;
        System.out.println("The average of all the arrays is " + sum2 / 100);

        //New index 85
        System.out.println("\n");
        System.out.println("Same array with a index of 85");
        int[] ints3 = new int[85];
        for (int i = 0; i < ints3.length; i++) {
            ints3[i] = (int) (Math.random() * 100) + 1;
        }
        int sum3 = 0;

        for (int e : ints3) sum3 += e;
        System.out.println("The average of all the arrays is " + sum3 / 100);

        //Take the last array you made and completely reverse the
        //order of the array
        System.out.println("\n");
        int[] ints4 = {85};


    }
}
































