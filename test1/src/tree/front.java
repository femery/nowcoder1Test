package tree;

/**
 * @Auther: hsx
 * @Date: 2020/3/11
 * @Description: tree
 * @version: 1.0
 */
public class front {
    public static void main(String[] args) {
        front f=new front();
        System.out.println(f.num(4,2));
        System.out.println(4*2/f.num(2,4));
    }

    public int num(int a,int b){
        return b==0?a:num(b,a%b);
    }
}


