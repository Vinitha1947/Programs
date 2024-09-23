import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BindCommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] commonElements = bindCommonElements(array1, array2);
        System.out.println("Common elements: " + Arrays.toString(commonElements));
    }

    public static int[] bindCommonElements(int[] array1, int[] array2) {
        List<Integer> commonList = new ArrayList<>();

        // Convert one of the arrays to a list for easy lookup
        List<Integer> array1List = new ArrayList<>();
        for (int num : array1) {
            array1List.add(num);
        }

        // Check each element in the second array
        for (int num : array2) {
            // If the element exists in the first array, add it to the common list
            if (array1List.contains(num)) {
                commonList.add(num);
            }
        }

        // Convert the common list to an array
        int[] commonArray = new int[commonList.size()];
        for (int i = 0; i < commonList.size(); i++) {
            commonArray[i] = commonList.get(i);
        }

        return commonArray;
    }
}
