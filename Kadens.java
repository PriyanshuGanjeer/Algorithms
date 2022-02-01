//

//Maximum Sum Subarray Problem (Kadane’s Algorithm)

public class Kadens {
    public static void main(String ss[]){
        int a[]={-1,2,-4,7,7,8,-6,-2};
        int n=a.length;
        int maxsum=0;
        int currsum=0;
        for(int i=0;i<n;i++){
            currsum=currsum+a[i];
            if(currsum>maxsum){
                maxsum=currsum;
                
            }
            if(currsum<0){
                currsum=0;
            }
        }
        System.out.println(maxsum);
    }
}