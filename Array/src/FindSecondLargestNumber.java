public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int [] arr={3,5,7,40,9,20};
        int firstMax=arr[0];
        int secondMax=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>firstMax){
                secondMax=firstMax;
                firstMax=arr[i];
            } else if (arr[i]>secondMax && arr[i]!=firstMax) {
                secondMax=arr[i];
            }
        }
        System.out.println("Second largest number is: "+secondMax);
    }
}
