public class Main
{
	public static void main(String[] args) {
// 		pattern30(5);
// 		pattern22(5);
        pattern17(4);
	}
	
	
	public static void pattern17(int n){
	    for(int i=1;i<=n;i++){
	        int value1=i;
	        int value2=2;
	        for(int j=i;j<n;j++)
	        System.out.print(" ");
	        
	        for(int j=1;j<=i;j++){
	            System.out.print(value1);
	            value1--;
	            
	        }
	        for(int j=1;j<i;j++){
	            System.out.print(value2);
	            value2++;
	            
	        }
	        System.out.println();
	    }
	    
	    for(int i=1;i<n;i++){
	        int value1=n-i;
	        int value2=2;
	        for(int j=1;j<=i;j++)
	        System.out.print(" ");
	        for(int j=i;j<n;j++)
	            System.out.print(value1--);
	       for(int j=i;j<n-1;j++)
	            System.out.print(value2++);
	        
	        System.out.println();
	            
	        
	    }
	}
	
	public static void pattern22(int n){
	    int value=1;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print(value);
	            value=value==1?0:1;
	            
	        }
	        System.out.println();
	    }
	}
	
	
	public static void pattern30(int n){
	    for(int i=1;i<=n;i++){
	         int k=i;
	         int l=2;
	        for(int j=i;j<n;j++)
	        System.out.print(" ");
	         for(int j=1;j<=i;j++){
	             System.out.print(k);
	             k--;
	             
	         }
	          for(int j=1;j<i;j++){
	             System.out.print(l);
	             l++;
	             
	         }
	        
	        
	       System.out.println();
	            
	        
	    }
	}
}
