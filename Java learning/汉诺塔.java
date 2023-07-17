class HanoiTower {
    public static void main(String[] args) {
        hanoiTower(2,'A','B','C');
    }
    public static void hanoiTower(int n,char a,char b,char c){
        if(n == 1){
            System.out.println("第"+ n + "个盘从" + a + "移动到" + c);
        }else{
            hanoiTower(n - 1,a , c, b);
            System.out.println("第"+ n + "个盘从" + a + "移动到" + c);
            hanoiTower(n - 1,b , a , c);
        }
    }
}
————————————————————————————————————————————————————————————————————————————————————
import java.util.Scanner;
class HanoiTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入有多少盘：");
        int temp = sc.nextInt();
        Object n1 = hanoiTower(temp,'A','B','C');//Objict是所有类型父类，能存整形和字符型
    }
    public static Object hanoiTower(int n,char a,char b,char c){
        if(n == 1){
            System.out.println("第"+ n + "个盘从" + a + "移动到" + c);
        }else{
            hanoiTower(n - 1,a , c, b);
            System.out.println("第"+ n + "个盘从" + a + "移动到" + c);
            hanoiTower(n - 1,b , a , c);
        }
        return null;
    }
}
