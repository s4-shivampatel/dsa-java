public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
        int n=arr.length+1;
        int expectedSum=(n*(n+1))/2;
        int actualSum=0;
        for (int i = 0; i <arr.length ; i++) {
            actualSum=actualSum+arr[i];
        }
        int result=expectedSum-actualSum;
        System.out.println("The missing number is: "+result);
    }
}
