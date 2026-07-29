public class FindLargestNumber {


    public static void main(String[] args) {
        int [] arr={3,5,7,40,9,20};
        int max=arr[0];
        for (int i =1 ; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest number is:"+max);
    }
}
