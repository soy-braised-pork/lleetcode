package leetcode.run.bank;

import java.util.HashMap;

/**
 *
 * 1、两数之和
 *
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 **/
public class E_1 {
    public static int[] twoSum(int[] nums, int target) {
//        执行用时：112 ms	执行内存：41.8 MB
//        if(nums.length<=1){
//            return null;
//        }
//        for(int i=0;i<nums.length;i++){
//            for(int j=1;j<nums.length;j++){
//                if(target-nums[j] == nums[i] && i!=j){
//                    return new int[]{i, j};
//                }
//            }
//        }

        //以下是高级技法 指针+hashmap   执行用时：1 ms     执行内存：41.8 MB
        //hashmap 记录 val -> index 的映射      key 放 数组值；value 放 数组索引
        HashMap<Integer, Integer> valToIndex = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
            //查表，看是否有 need
            if(valToIndex.containsKey(need)){
                return new int[]{valToIndex.get(need),i};
            }
            //存入 value -> index 的映射
            valToIndex.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums={2,5,5,11};
        int target=10;
        System.out.println(twoSum(nums,target));
    }
}
