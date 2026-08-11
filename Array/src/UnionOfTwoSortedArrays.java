import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[]arr1={1,2,2,3,4};
        int[]arr2={2,3,5};
        int ptr1=0;
        int ptr2=0;
        List<Integer> res=new ArrayList<>();

        while(ptr1< arr1.length || ptr2< arr2.length){

            //skip duplicate
            while(ptr1>0 && ptr1<arr1.length && arr1[ptr1]==arr1[ptr1-1]){
                ptr1++;
            }
            while(ptr2>0 && ptr2<arr2.length && arr2[ptr2]==arr2[ptr2-1]){
                ptr2++;
            }

            // if one array is exhaust or ptr is out of bound
            if (ptr1>= arr1.length){
                res.add(arr2[ptr2]);
                ptr2++;
                continue;  //skip comparison
            }
            if (ptr2>= arr2.length){
                res.add(arr1[ptr1]);
                ptr1++;
                continue;
            }


            //comparison
            if (arr1[ptr1]<arr2[ptr2]){
                res.add(arr1[ptr1]);
                ptr1++;
            }
            else if(arr1[ptr1]>arr2[ptr2]){
                res.add(arr2[ptr2]);
                ptr2++;
            }else {
                res.add(arr1[ptr1]);
                ptr1++;
                ptr2++;
            }
        }
        System.out.println(res);
    }
}
