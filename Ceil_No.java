import java.util.*;
public class Ceil_No {
    public static void main(String args[]) {
     int[] array={11,12,13,14,19,20,21};
     
     int target=;
     
     
     int result=ceil(array,target);
     System.out.println(result);
    }
     public static int ceil(int[] array,int target){
     int mid,start,end;
     start=0;
     end=array.length-1;
     
    
        while(start<=end){
            mid=(start+end)/2;
            if(array[mid]>target){
                end=mid-1;
            }
            else if(array[mid]<target){
                start=mid+1;
            }
            else{
                System.out.println("Target found");
                return mid;
            }
            
            
        }
     return start;
    }
    
}
