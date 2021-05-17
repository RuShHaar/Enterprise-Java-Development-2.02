package Task1;

import java.util.ArrayList;

public class OddIntegers {

    public Integer[] oddNums(int n){
        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i=0; i <= n; i++){
            if(i%2 != 0){
                numList.add(i);
            }
        }

       Integer[] array = numList.toArray(new Integer[0]);

        return array;
    }
}
