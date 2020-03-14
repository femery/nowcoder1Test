package testtoutiao_0115;

/**
 * @Auther: hsx
 * @Date: 2020/1/15
 * @Description: testtoutiao_0115
 * @version: 1.0
 */
public class t2 {
    public static void main(String[] args) {
        t2 tt =new t2();
        System.out.println(tt.findRes(1,0));
    }
    public int findRes(int dividend,int divisor){
        int sum=0;
        //若除数为0，返回-1
        if(divisor==0){
            return -1;
        }
        int temp=divisor;
        while(dividend>=divisor){
            divisor=divisor+temp;
            sum++;
        }
        return sum;
    }
}
