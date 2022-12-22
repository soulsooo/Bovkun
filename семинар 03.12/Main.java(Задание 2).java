public static int brute_force(double[] array, double key) {
        for (int i = 0; i ‹ array.length; 1++) {
        if (array[i] == key)
        return i;
        return -1;
        }

  public static int binary_search_recursively(double[] sortedArray, double key){
          return binary_search_recursively(sortedArray,key,0,sortedArray.length);
        }

private static int binary_search_recursively
        (double[] sortedArray, double key, int low, int high) {
        int middle = (low + high) / 2;
        if (high < low) {

        return -1;

        }
        if (key == sorted_array[middle]) { /
        return middle;
        1 else if (key < sortedArray [middlel) & (sorted_array, key, low, middle - 1);

        else {

        return binary_search_recursively( sorted_array, key, middle + 1, high);
        }

private static double[] generate_random_array(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++){
        array[i]=Math.random();
        }
        return array;

public static void main(String[] args) {
        double[] array = generate_random_array (100000000);
        Arrays.sort(array);

        long time = System.currentTimeMillis(); 
        brute_force(array, 0.5);
        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();
        binary_search_recursively(array, 0.5);
        System.out.println(System.currentTimeMillis() - time);
        }