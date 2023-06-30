/*循环法*/
import java.util.Scanner; 
public class Fibonacci_sequence{
    public static void main(String[] args) {
        int f1 = 1,f2 = 1,tmp;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入斐波那契数列的第n项：");
        int n = sc.nextInt();
        System.out.println("斐波那契数列前n项为：");
        for(int i =1;i<=n;i++){
            System.out.print(f1+"\t");
            tmp = f1+f2;
            f1 = f2;
            f2 = tmp;
        }
    }
}
——————————————————————————————————————————————————————————————
/*递归法*/
import java.util.Scanner;
public class Fibonacci_sequence{
    public static void main(String[] args) {
        System.out.print("请输入第n项：");
        Scanner sc =new Scanner(System.in);
        int fib = sc.nextInt();
        int value = getNum(fib);
        System.out.print("第n项对应的数字为："+value);
    }
    public static  int getNum(int n) {
        int num;
        if (n==1) {
            num=1;
        }else if (n==2) {
            num=1;
        }else {
            num=getNum(n-1)+getNum(n-2);
        }
        return num;
    }
}
