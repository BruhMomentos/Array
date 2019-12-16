public class Main {
    public static void main(String[] args) {
//Create an array that holds 20 positions, give each index a
//random value between 1-6, then use a for loop to count
//how many 1's were randomly generated in  the array

        int store = 0;
        int[] counts = new int[20];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = (int) (Math.random() * 6)+1;
            if(counts[i] ==  1){
                store += 1;}}

           System.out.println("How many times 1 occurs in the Array");
        System.out.println(store);

        //This shows what value was assigned to each index
        System.out.println("number\t" + "occurence ");

        for (int num = 0; num < counts.length; num++) {

            System.out.println(num + "\t" + "        " + counts[num]);}

 //Create another array holds 10 positions, give each index
// a random value between 1 and 100, then find the average
//of all the values in the arrays

            System.out.println("\n");
            int[] ints = new int[100];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = (int) (Math.random() * 100) + 1;

                ints[i]

                System.out.println(i / 100);}
        System.out.println("The average is");


























        }}





