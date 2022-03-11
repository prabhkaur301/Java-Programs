/******************************************************************************

                 Hashset question
                 Finding the count of distict elements in an array
                 

*******************************************************************************/
import java.util.*;
public class Main
{
    
    private static int distict(int[] array)
    {
        HashSet<Integer> distictSet =  new HashSet<>();
        for(int val:array)  // enhanced for loop
        distictSet.add(val); // adding each value to Hashset
        System.out.println("Distinct array size : "+distictSet);
        return distictSet.size();
    }
	public static void main(String[] args) {
	int[] array={2,4,5,7,8,7,3,4,5};
	System.out.println("Actual array size : "+array.length);
	int count=distict(array);
	System.out.println(count);
	
	
	
	}
}
