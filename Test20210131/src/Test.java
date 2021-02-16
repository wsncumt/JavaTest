import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class Test {
//    private float f = 1.0f;
//    int m = 12;
//    static int n = 1;
//    String str = new String("hello");
//    char[] ch = {'a','b'};
    public static void main(String[] args) {
        int num = 10;
        System.out.println(test(num));
//        char a = 'B';
//        a = (char)(a + 'a' -'A');
//        System.out.println(a);
        double a = Math.toDegrees(45);
        double b = Math.toRadians(45);
        System.out.println(Math.cos(Math.toDegrees(45)));
        System.out.println(Math.cos(Math.toRadians(45)));
//        String str = "    ";
//        System.out.println(str);
//        int a = 10;
//        System.out.println(-a);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        int ret = myAtoi(str);
//        System.out.println(ret);
//        int[] arr = {5,7,7,8,8,10};
//        int[] ret = searchRange(arr,10);
//        System.out.println(Arrays.toString(ret));
//        long a = -91272332l;
//        if (a < Integer.MIN_VALUE){
//            System.out.println(Integer.MIN_VALUE);
//        }else{
//            System.out.println(a);
//        }
//        String str = "Test1ng-Leet=code-Q!";
//        String str1 = reverseOnlyLetters(str);
//        System.out.println(str1);
//        float a = 10;
//        int b = (int)8846.5;
//        byte c = 10;
//        int d = -c;
//        double e = 100;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        char[] ch = {};
//        Arrays.toString(ch);
//        Test t = new Test();
//        float f = t.f;
//        te.change(te.str,te.ch);
//        System.out.println(te.str + "and");
//        System.out.println(te.ch);
//        int x = 20,y = 5;
//        System.out.println(x + y + "" + (x + y) + y);
//        x = 20;
//        y = 5;
//        System.out.println( "" + x + y + (x + y) + y);
//        int i = 7;
//        do {
//            System.out.println(--i);
//            --i;
//        }while (i != 0);
//        System.out.println(i);
//        int sum = reverse(1234);
//        boolean flag = canConstruct("fihjjjjei","hjibagacbhadfaefdjaeaebgi");
//        System.out.println("value=" + switchit(4));
//        String str = "hello";
//        str.charAt(2);
    }

    public void change(String string, char[] ch) {
        string = "test ok";
        ch[0] = 'c';
    }

    public static int reverse(int x){
        int sum = 0;
        sum = sum * 10 + x % 10;
        if( x > 10){
            reverse(x / 10);
        }
        return sum;
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        char[] ch1 = ransomNote.toCharArray();
        char[] ch2 = magazine.toCharArray();
        int[] rans = new int[26];
        int[] maga = new int[26];
        for(char c1 : ch1){
            rans[c1 - 'a']++;
        }
        for(char c2 : ch2){
            maga[c2 - 'a']++;
        }
        for(int i = 0; i < ch1.length; i++){
            if(rans[i] > maga[i]){
                return false;
            }
        }
        return true;
    }

    public static int switchit(int x) {
        int j = 1;
        switch (x) {
            case 1:j++;
            case 2:j++;
            case 3:j++;
            case 4:j++;
            case 5:j++;
            default:j++;
        }
        return j+x;
    }

    private static boolean isAlpha(char ch){
        return ((ch - 'a' >= 0 && ch - 'a' <26) || (ch - 'A' >= 0 && ch - 'A' <26));
    }
    public static String reverseOnlyLetters(String S) {
        int lo = 0;
        int hi = S.length() - 1;
        char[] ch = S.toCharArray();
        while(lo < hi){
            if(!isAlpha(S.charAt(lo))){
                lo++;
            }
            if(!isAlpha(S.charAt(hi))){
                hi--;
            }
            if(lo < hi && isAlpha(S.charAt(lo)) && isAlpha(S.charAt(hi))){
                char tmp = ch[lo];
                ch[lo] = ch[hi];
                ch[hi] = tmp;
                lo++;
                hi--;
            }
        }
        return new String(ch);
    }


//    public static int[] searchRange(int[] nums, int target) {
//        if(nums.length == 0){
//            return new int[]{-1,-1};
//        }
//        int lo = 0;
//        int hi = nums.length - 1;
//        int mid = 0;
//        while(lo < hi){
//            mid = (hi + lo) >> 1;
//            if(nums[mid] < target){
//                lo = mid + 1;
//            }else if(target < nums[mid]){
//                hi = mid -1;
//            }else{
//                break;
//            }
//        }
//
//        if(lo > hi){
//            return new int[]{-1,-1};
//        }
//        int le = lo;
//        int ri = lo;
//        while( le >= 0 && nums[le] == target  ){
//            le--;
//        }
//        while(ri < nums.length && nums[ri] == target ){
//            ri++;
//        }
//        return new int[]{le,ri};
//    }
    public static int[] x(){
        return new int[]{1};
    }
//    public static int myAtoi(String s) {
//        int i = 0;
//        long ret = 0;
//        int symbol = 1;
//        for(;i < s.length();i++){
//            if(s.charAt(i) == ' '){
//                continue;
//            }else if(){
//
//            }
//        }
//    }

    private static int findFirst(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        while(lo <= hi){
            mid = lo + ((hi - lo) >> 1);
            if(nums[mid] < target){
                lo = mid + 1;
            }else if(target < nums[mid]){
                hi = mid - 1;
            }else{
                if(mid == 0 || nums[mid - 1] != target){
                    return mid;
                }else{
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }

    private static int findLast(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        while(lo <= hi){
            mid = lo + ((hi - lo) >> 1);
            if(nums[mid] < target){
                lo = mid + 1;
            }else if(target < nums[mid]){
                hi = mid - 1;
            }else{
                if(mid == nums.length - 1 || nums[mid + 1] != target){
                    return mid;
                }else{
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }
    public static int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums,target),findLast(nums,target)};

    }

    public static int myAtoi(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int i = 0;
        long ret = 0;
        int flag = 1;
        while(s.charAt(i) == ' ' && i < s.length()){
            ++i;
        }
        if(i >= s.length()){
            return 0;
        }
        if(s.charAt(i) == '-'){
            flag = -1;
            i++;
        }else if(s.charAt(i) == '+'){
            i++;
        }

        if(i >= s.length()){
            return 0;
        }

        while(i < s.length() && (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
            int x = s.charAt(i) - '0';
            ret = ret * 10 + x;
            if(flag > 0 && ret > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(flag < 0 && -ret < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            ++i;
        }
        return flag > 0 ? (int)ret : -(int)ret;
    }

    public static int test(int b){
        try {
            b += 10;
            return b;
        }catch(RuntimeException e){

        }catch(Exception e2){

        }finally{
            b += 10;
            return b;
        }
    }
}
