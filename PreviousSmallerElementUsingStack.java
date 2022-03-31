
import java.util.*;

public class PreviousSmallerElementUsingStack

{
    void previousSmallerElement(int a[]){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!s.empty()){
                if(s.peek()<a[i]){
                    System.out.println(s.peek());
                    break;
                }
                else{
                    s.pop();
                }
            }
            if(s.empty()){
                System.out.println(-1);
            }
            s.push(a[i]);
        }
    }
    public static void main(String[] args) {
        int a[]={2,14,8,6,5,2};
        PreviousSmallerElementUsingStack st=new PreviousSmallerElementUsingStack();
        st.previousSmallerElement(a);
    }
}
