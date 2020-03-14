package testtoutiao_0115;

/**
 * @Auther: hsx
 * @Date: 2020/1/15
 * @Description: testtoutiao_0115
 * @version: 1.0
 */
public class t1 {
    public static void main(String[] args) {

    }
    public int findNum(int a,int b){
        if(b<a){
            int temp=a;
            a=b;
            b=temp;
        }
        while(b>0){
            int t=a;
            a=b%a;
            b=t;
        }
        return 0;
    }
}
