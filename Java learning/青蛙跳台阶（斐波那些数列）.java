/*青蛙跳台阶(斐波那些数列).递归法*/
import java.util.Scanner;
class Frog_jumping_steps {
    public static void main(String[] args) {
        System.out.println("请输入有几多少级台阶：");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int result = Jump(j);
        System.out.println("青蛙有"+result+"种跳法");
    }
    public static int Jump(int n){
        if(n == 1||n == 2){
            return n;
        }else
            return Jump(n - 1)+(n - 2);
    }
}
————————————————————————————————————————————————————————————
/*非递归法1*/
import java.util.Scanner;
class Frog_jumping_steps {
    public static void main(String[] args) {
        System.out.println("请输入有几多少级台阶：");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int result = Jump(j);
        System.out.println("青蛙有"+result+"种跳法");
    }
    public static int Jump(int n){
    int[] arr = new int[n + 1];
    arr[0] = 1;
    arr[1] = 2;
    for(int i = 2;i <= n;i++){
        arr[i] = arr[i - 1]+arr[i - 2];
    }
    return arr[n - 1];
    }
}
————————————————————————————————————————————————————————
/*非递归法2*/
import java.util.Scanner;
class Frog_jumping_steps {
    public static void main(String[] args) {
        System.out.println("请输入有几多少级台阶：");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int result = Jump(j);
        System.out.println("青蛙有"+result+"种跳法");
    }
    public static int Jump(int n){
    if(n == 1||n ==2){
        return n;
    }
        int J1 = 1;
        int J2 = 2;
        int J3 = 0;
        for (int i = 3;i <= n;i++){
            J3 = J1 + J2;
            J1 = J2;
            J2 = J3;
        }
        return J3;
    }
}
