import java.util.*;
public class Main{
    
    static class Activity{
        int start;
        int end;
        
        public Activity(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Activity[] arr=new Activity[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=new Activity(sc.nextInt(),sc.nextInt());
        }
    
        
      Arrays.sort(arr, new Comparator<Activity>() {
            @Override
            public int compare(Activity a1, Activity a2) {
                return a1.end - a2.end;
            }
        });
    
         
        int Time=-1;
        int maxActivities=0;
        for(int i=0;i<arr.length;i++){
           if(Time <= arr[i].start){
               maxActivities++;
               Time=arr[i].end;
           }
        }
        
        System.out.println("No of max activities:- "+maxActivities);
        
        
        
    }
}
