
//hyvin yksinkertainen singleton-systeemikello
public class Kello {
    static float SystemTime;
    private static Kello INSTANCE = null;
    private Kello() {};

    public static Kello getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Kello();
            SystemTime = 0;
        }
        return INSTANCE;
    }

    public float getSystemTime() {
        return SystemTime;
    }

    public void advanceSystemTime(float amount) {
        SystemTime=+amount;
    }

}
