// sum of digits of a number using recursion

public class Sum_of_digits {
    public static void main(String args[]) {
     int result=digitSum(0623,0);
     System.out.print(result);
    }
    static int digitSum(int N,int sum){
       int rem=N%10;
       sum=sum+rem;
       N=N/10;
       if(N==0)
        return sum;
       return digitSum(N,sum);
    }
}
