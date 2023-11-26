
public class Main {
    public static void main(String[] args) {
        Wonyoung wonny = new Wonyoung();
        wonny.sayHello();
        wonny.setName("Wonnie");
        System.out.println(wonny.getName());

        Liz liz = new Liz("Liz Ive");
        liz.sayHello();

        Yujin annYujin = new Yujin("Ann Yujin", 20);
        annYujin.sayHello();
    }
}