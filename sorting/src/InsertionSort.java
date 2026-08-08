public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,10,1,6,2};
        int n= arr.length;
        for (int i = 1; i <n ; i++) {
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println("array after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
