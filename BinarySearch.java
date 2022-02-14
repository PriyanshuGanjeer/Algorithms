

public class BinarySearch 
{
    public static void main(String[] args) {
        
       int a= Binary.search();
      
        System.out.println("Position of Key at index"+" "+ a);
    }
}
class Binary{
    public static int search(){
int a[]={-3,-2,0,1,3,5,6,9};
        int key=3;
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key){
                return mid;
                
                
                
            }
            else if(a[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return-1;
    }
}