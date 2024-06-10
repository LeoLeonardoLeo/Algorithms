public class LinearSearch {
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; //return index
            }
        }
        return -1; //if nothing
    }
}
