## FRACTIONAL KNAPSACK USING GREEDY APPROACH
# To sort elements according to ratio, use custom comparator

/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr, new Comparator<Item>() {
            @Override
            public int compare(Item a1, Item a2) {
                double f2=(double)a2.value/(double)a2.weight;
                double f1=(double)a1.value/(double)a1.weight;
                
                if(f2>f1)
                return 1;
                else if(f1>f2)
                return -1;
                else return 0;
            }
        });
        
        double maxProfit=0;
        int capacity=W;
        for(int i=0;i<arr.length;i++){
            if(capacity>=arr[i].weight){
                maxProfit+=arr[i].value;
                capacity-=arr[i].weight;
            }
            else{
                maxProfit+=(double)capacity/(double)arr[i].weight * arr[i].value;
                break;
            }
        }
        
        return maxProfit;
    }
}
