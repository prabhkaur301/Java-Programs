import java.util.LinkedList;
import java.util.Queue;
public class Main
{
	public static void main(String[] args) {
	int[] arr={1,0,2,3,0,4,5,0};
    duplicateZeros(arr);
	}
    //brute-force approach
    //       int i=0;              
    //     while(i<arr.length){
    //         if(arr[i]==0){
    //             for(int j=arr.length-1;j>i;j--)
    //                 arr[j]=arr[j-1];
    //             i+=2;
    //         }
    //         else
    //             i++;
    //     }
  
    // using queue
	  public static void duplicateZeros(int[] arr) {
	      Queue<Integer> q= new LinkedList<>();        \\using queue
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
            System.out.println("queue bf "+ q);
            if(arr[i]==0)
                q.add(0);
            arr[i]=q.remove();
            System.out.println("queue af "+ q);
        }
           for(int k=0;k<arr.length;k++)
               System.out.print(arr[k]+" ");
           
           System.out.print("\n");
        }
        
    
}
