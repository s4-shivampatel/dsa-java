public class QuickSort {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[]arr,int lb,int ub){
        int pivot=arr[lb];
        int start=lb;
        int end=ub;
        while(start<end){
            while (start<ub && arr[start]<=pivot){
                start++;
            }
            while (end>lb && arr[end]>=pivot){
                end--;
            }
            if (start<end){
                swap(arr,start,end );
            }
        }
        swap(arr,end,lb );
        return end;
    }
    public static void quickSort(int[]arr,int lb,int ub){
        if (lb<ub){
            int key=partition(arr, lb, ub);
            quickSort(arr,lb,key-1);
            quickSort(arr,key+1,ub);
        }
    }

    public static void main(String[] args) {
        int[]arr={7,6,10,5,9,2,1,15,7};
        int lb=0;
        int ub=arr.length-1;
        quickSort(arr,lb,ub);
        System.out.println("Array after quick sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
