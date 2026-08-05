public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n= arr.length;
        int temp;
        for (int i = 0; i < n-1; i++) {
            boolean swapped=false;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
                break;
        }
    }
    public static void main(String[] args) {
        int[] arr={15,16,6,8,5};
        BubbleSort.bubbleSort(arr);
        System.out.println("array after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}