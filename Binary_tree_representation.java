import java.util.*;
public class Main
{ 
    public static Scanner sc;
   
	public static void main(String[] args) {
	    sc=new Scanner(System.in);
	    System.out.println("root node: "+ createTree().data);
	    
	    
		
	}
	
	public static Node createTree(){
	   int data=sc.nextInt();
	   if(data==-1) // leaf Node
	        return null;
	    Node root=new Node(data);
	   
	    System.out.println("Enter left data for root"+root.data);
	    root.left=createTree();
	    
	    System.out.println("Enter right data for root"+root.data);
	    root.right=createTree();
	    return root;
	    
	}
}
class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data=data;
    }
}
