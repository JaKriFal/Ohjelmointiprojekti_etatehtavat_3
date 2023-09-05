public class Kellotesti {
    public static void main(String[] args) {
        Kello kello = Kello.getInstance();
        System.out.println(kello.getSystemTime());
        kello.advanceSystemTime(5);
        System.out.println(kello.getSystemTime());

        Kello toinenkello = Kello.getInstance();

        //toimii! Kello-singletoneja on vaan yksi joten sama systeemiaika pysyy!
        System.out.println(toinenkello.getSystemTime());

    }
}
