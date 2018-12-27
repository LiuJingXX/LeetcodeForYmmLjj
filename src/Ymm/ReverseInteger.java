package Ymm;

public class ReverseInteger {
    public static int reverse(int x){
        int flag1=0;
        int count=0;
        int reversenum=0;
        int [] nums= new int[15];
        if(x<0){
            flag1=1;
            x=Math.abs(x);
        }

        while(x/10 != 0) {

                nums[count] = x % 10;
                count += 1;
                x = x / 10;
            //for(int j=0;j<nums.length;j++) System.out.print(nums[j]);
        }
        nums[count]=x;
        for(int i=0;i<nums.length;i++){
            reversenum+=nums[i]*(Math.pow(10,count));
            count-=1;
        }
        if(reversenum<0){
            if(Math.abs(reversenum+1)>=2147483647) return 0;
        }
        if(reversenum>=2147483647){
            return 0;
        }
        if(flag1==1) return -reversenum;
        else return reversenum;
    }


    public static int reversestring(int x){
        int flag=1;
        if(x<=-2147483648) return 0;
        if(x<0){
            flag=-1;
            x=-x;
        }
        String s =x+"";
        s = new StringBuilder(s).reverse().toString();
        try {
            x = Integer.parseInt(s);
        }catch (Exception e){
            //e.printStackTrace();
            return 0;
        }
        if(x >= 2147483647)
            return 0;
        return x * flag;
    }


    public static void main(String[] args) {
        int x=2147483647;
        //System.out.println(reverse(x));
        int y = 123456;
        System.out.println(reversestring(x));
    }
}
