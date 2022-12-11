package Homework;

public class MobileTest{
    public static void main(String[] args) {
        System.out.println(mobile.latest_os_v);
        mobile.newOS();
        mobile m1 = new mobile("Black",4.8f);
        mobile.newOS();
        System.out.println(m1.current_0s);
        m1.upgradeToLatestOS();
        System.out.println(m1.current_0s);
        System.out.println();
        mobile m2 = new mobile("white",4.8f);

        System.out.println(m1);





    }
}
