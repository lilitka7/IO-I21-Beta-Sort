package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego SelectionSort.
 */
public class SelectionSort {

    /**
     * Sortuje podany ciag obiektow algorytmem SelectionSort.
     * @param arr Nieposortowany ciag obiektow.
     * @throws IllegalArgumentException Kiedy podany ciag jest pusty badz niepoprawny, konczymy bledem.
     *
     */
    public static void sort(int[] arr) throws IllegalArgumentException {

        // Throws an exception when arr is empty
        if (arr.length == 0) throw new IllegalArgumentException();

        for (int i = 0; i < arr.length-1; i++)
        {
            int min_index = i;

            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min_index])
                    min_index = j;

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    /////////////////////////////////

    /**
     * Sortuje podany ciag obiektow algorytmem SelectionSort typu String.
     * @param elements Nieposortowany ciag obiektow.
     * @throws IllegalArgumentException Kiedy podany ciag jest pusty badz niepoprawny, konczymy bledem.
     *
     */
    public static void sortString(String[] elements) throws IllegalArgumentException {
        selectionSort(elements,0);
    }

    private static void selectionSort(String[] elements,int start){
        if (start <= elements.length-1){
            String tmp = elements[start];
            int index = -1;
            for (int i = start + 1; i < elements.length; i++){
                if (elements[i].compareTo(tmp) < 0){
                    tmp = elements[i];
                    index = i;
                }
            }
            if (index != -1){
                swap(elements, start, index);
            }
            selectionSort(elements, start + 1);
        }
    }

    private static void swap(String[] ele, int i, int j){
        String tmp = ele[i];
        ele[i] = ele[j];
        ele[j] = tmp;
    }
}
