
import java.util.*;
public class FisherYatesAlgo
{
    public static void main(String[] args) {
        int a[] ={2,1,4,7,9,5,6,3,8};
        int n=a.length;
        System.out.println("Before Shuffle the array"+ Arrays.toString(a));
        for(int i=n-1;i>0;i--){
            Random r=new Random();
            int j=r.nextInt(i+1);
            // Swap
            int temp=a[j];
            a[j]=a[i];
            a[i]=temp;
        }
        System.out.println("After Shuffle The Array"+ Arrays.toString(a));
    }
}
