import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Binary search needs the array to be sorted

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which number would you like to find? (1 - 10)");
        int target = scanner.nextInt();
        int index = binarySearch(array, target);

        if(index != -1) {
            System.out.println(target + " found at index: " + index);
        } else {
            System.out.println("Number not found in the array");
        }
    }
    public static int binarySearch(int[] array, int target){
        int low = 0; //start of the array
        int high = array.length - 1; //end of the array

        while(low <= high){
            int middle = low + (high - low) / 2;
            int tempMiddle = array[middle]; //temp middle always changes

            if(tempMiddle < target){
                low = middle + 1;
            }
            else if(tempMiddle > target){
                high = middle - 1;
            }
            else{
                return middle; //target is found
            }
        }
        return -1; //target is not found
    }
}