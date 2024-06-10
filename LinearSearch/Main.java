public class Main {
    public static void main(String[] args) {
        //Linear search is a simple algorithm, it takes a key(target) to find and
        // if it matches it will tell you, if not it says no match

        //does not need to be sorted

        int[] array = {5, 7, 2, 9, 0, 3, 4, 1, 6, 8};

        int key = 6;

        int result = LinearSearch.linearSearch(array, key);

        if (result == -1){
            System.out.println(key+ " could not find: " + key);
        }else {
            System.out.println(key + " found at index " + result);
        }



    }
}