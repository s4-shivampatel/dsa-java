public class SortedInNonDecreasingOrder {

        public static boolean checkArrayIsSorted(int[]arr){
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]>arr[i+1]){
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        int[] arr={1,2,2,4,5};
        boolean result=SortedInNonDecreasingOrder.checkArrayIsSorted(arr);
        System.out.println(result);
    }

}
