public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={7,4,10,8,3,1};
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex=i;
            for (int j = i+1; j <n ; j++) {
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("array after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
