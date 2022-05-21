package Algorithms;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] Args){
        int[] input = {2,7,11,15};
        int target = 9;

        int[] res =twosum(input,target);

        for (int i : res){
            System.out.print(i);
        }

    }
    static int[] twosum(int[] num, int target){
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0;i < num.length; i++){
            int difference = target-num[i];
            if (map.containsKey(difference)){
                result[0] = i;
                result[1] = map.get(difference);
                return result;
            }
            map.put(num[i], i);
        }

        return result;
    }
}
