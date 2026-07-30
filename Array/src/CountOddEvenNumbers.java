public class CountOddEvenNumbers {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int evenCount=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==0){
                evenCount++;
            }
        }
        int oddCount= arr.length-evenCount;
        System.out.println("Total even numbers:"+evenCount);
        System.out.println("Total odd numbers:"+oddCount);
    }
}
