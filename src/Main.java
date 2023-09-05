public class Main {
    public static void main(String[] args) {
        Kello kello = Kello.getInstance();
        System.out.println(kello.getSystemTime());
        kello.advanceSystemTime(5);
        System.out.println(kello.getSystemTime());
    }
}