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
