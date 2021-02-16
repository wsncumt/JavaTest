public class While {
    public static void main(String[] args) {
        int[] arr = {5,2,4,1,3,6,0};
        int ret = thirdMax(arr);
        System.out.println(ret);
//    boolean result = false;
//    if(result != 1){
//
//    }
//        int max1 = Integer.MIN_VALUE;
//        long max = (long)Integer.MIN_VALUE - 1;
//        System.out.println(max1);
//        System.out.println(max);
//        long a = 1;
//        char ch = 'a';
//        float f = 1.0f;
//        byte b = 0;
//        double d = 1.0;
//        Object o = new Object();
//        switch (o){
//
//        }
    }
    public static int thirdMax(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }
        long min = (long)Integer.MIN_VALUE - 1;
        long max1 = min;
        long max2 = max1;
        long max3 = max2;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }else if(nums[i] == max1) {
                continue;
            }else{
                if(nums[i] > max2){
                    max3 = max2;
                    max2 = nums[i];
                }else if(nums[i] == max2){
                    continue;
                }else{
                    if(nums[i] > max3){
                        max3 = nums[i];
                    }
                }
            }
        }

        return max3 == min ? (int)max1 : (int)max3;
    }

}
