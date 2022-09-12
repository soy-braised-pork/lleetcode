package leetcode.run.bank;

/**
 * 387、字符串中第一个唯一字符
 * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 **/
public class E_387 {

    /**
     * 输入只有小写字母，所以可以用一个数组充当哈希映射的作用，其中索引代表字符的 ASCII 码，对应的值代表出现的频率
     */
    public static int firstUniqChar(String s) {
        // 用 count 记录每个字符出现的频率
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            // 将 字符 转化成 数字
            // a 97
            //count[c - 'a']=count[c - 'a']+1     出现一次+1
            count[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // count[12] == 1 , 说明 l 只出现过一次
            if (count[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
//        firstUniqChar(s);
    }
}
