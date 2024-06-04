import java.util.HashMap;
import java.util.Map;

public class HM {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,3,3,2,4,5};
        int count = 1;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < 7; i++){
            if(hm.containsKey(arr[i])){
                hm.replace(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i] ,count);
            }
        }
        System.out.println(hm);
    }
}
