import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value) return i;
        }
        return -1;

    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(string)) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == value)
                return middle;

            if (array[middle] < value)
                left = middle + 1;

            else
                right = middle - 1;
            //delete unneeded halves
        }
        return -1;

    }

    public static int binarySearch(String[] array, String string) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle].equals(string))
                return middle;

            if (string.compareTo(array[middle]) > 0)
                left = middle + 1;

            else
                right = middle - 1;
            //delete unneeded halves
        }
        return -1;

    }
}
