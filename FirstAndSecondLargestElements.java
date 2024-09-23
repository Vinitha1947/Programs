public class FirstAndSecondLargestElements {
    public static void main(String[] args){
        int[] arr = {5, 8, 3, 12, 9, 6, 7};
        int[] result = findFirstAndSecondLargest(arr);
        System.out.println("First largest element: " + result[0]);
        System.out.println("Second largest element: " + result[1]);
    }
    public static int[] findFirstAndSecondLargest(int[] arr){
        if(arr == null || arr.length < 2){
            return new int[]{-1, -1};
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > firstMax){
                secondMax = firstMax;
                firstMax = num;
            } else if(num > secondMax && num != firstMax){
                secondMax = num;
            }
        }
        return new int[]{firstMax, secondMax};
    }
}
