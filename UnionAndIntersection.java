/******************************************************************************

                 Hashset questions
                 finding the union and intersection of two arrays
                 

*******************************************************************************/
import java.util.*;
public class Main
{

  private static void union (int[]array1, int[]array2)
  {
    HashSet < Integer > unionSet = new HashSet <> ();
    for (int val:array1)	// enhanced for loop
      unionSet.add(val);	// adding each value to Hashset
    for (int val:array2)	// enhanced for loop
      unionSet.add(val);	// adding each value to Hashset
    System.out.println ("Union of arrays : " + unionSet);

  }
  private static void intersection (int[]array1, int[]array2)
  {
    HashSet < Integer > intersectionSet = new HashSet <> ();
    HashSet < Integer > dummySet = new HashSet <> ();
    for (int val:array1)		// enhanced for loop
      intersectionSet.add(val);	// adding each value to Hashset
   for (int val:array2)
      {
      if (intersectionSet.contains(val))
       {
        dummySet.add(val);
        intersectionSet.remove(val);
        }
      }
   System.out.println("Intersection of arrays : " + dummySet);
      
  }
  
  
	  public static void main(String[]args)
	   {
	  int[]array1 = {2, 4, 5, 7, 8, 7, 3, 4, 5}; 
	  int[]array2 ={2, 10, 23, 34, 4, 5, 9};
	  union (array1, array2); 
	  intersection (array1, array2);
	      
	   }
	 }
