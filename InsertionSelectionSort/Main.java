import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        //selection sort
        int[] selectionArray = new int[50];
        System.out.println("\n" + "Selection sort");
        System.out.println("Random array of numbers");
        for (int i = 0; i < selectionArray.length; i++) {
            selectionArray[i] = rnd.nextInt(1000); //random numbers between 0 and 999
            System.out.println(selectionArray[i]);
        }

        System.out.println("\n" + "Sorted array using selection sort" + "\n");
        selectionSort(selectionArray); //calling selection sort

        for (int i = 0; i < selectionArray.length; i++) {
            System.out.println(selectionArray[i]);
        }

        //insertion sort

        int[] insertionArray = new int[50];
        System.out.println("\n" + "Insertion sort");
        System.out.println("Random array of numbers" + "\n");
        for (int i = 0; i < insertionArray.length; i++) {
            insertionArray[i] = rnd.nextInt(1000); //0 - 999
            System.out.println(insertionArray[i]);
        }

        System.out.println("\n" + "Sorted array using insertion sort" + "\n");
        insertionSort(insertionArray); //calling insertion sort

        for (int i = 0; i < insertionArray.length; i++) {
            System.out.println(insertionArray[i]);
        }

    }

    public static void selectionSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++) { //looping through array
            int small = i; //setting the smallest element of the array
            for (int j = i + 1; j < n; j++) { //loop through the rest of the elements
                if(array[small] > array[j]){ //if the smallest is greater than the one next to it
                    //if we find a smaller element then update the index of the smallest element
                    small = j;
                }
            }
            //variable swapping of smallest to current
            int temp = array[i];
            array[i] = array[small];
            array[small] = temp;
        }
    }
    public static void insertionSort(int[] array){
        int n = array.length;
        for (int i = 1; i < n; i++) { //starts at element 1 not 0
            int temp = array[i]; //setting a temp to the current index in the array
            int previous = i - 1; // previous is element 0, or the element
            // before index i
            while (previous >= 0 && temp < array[previous]){
                array[previous + 1] = array[previous]; //the shift starts
                previous--;
            }
            array[previous + 1] = temp; //the previous is now the current index
        }
    }
}