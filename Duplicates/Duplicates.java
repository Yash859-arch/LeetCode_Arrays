import java.util.*;
public class Main{
    
    static boolean Check_Duplicates(int[] arr){
        HashSet<Integer> check = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(check.contains(i)){
                return true;
            }
            check.add(i);
        }
        return false;
    }
    
    public static void main(String args[]){
        int[] arr = {1,2,3,1};
        System.out.println(Check_Duplicates(arr));
    }
}
