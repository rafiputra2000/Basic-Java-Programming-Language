public class TipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 10000;
        int iniInt = 1000000;
        long iniLong = 1000000;
        long iniLong2 = 100000000;

        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;

        long balance = 1_000_000_000_000L;
        int amount = 1_000_000_000;


        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniLong2);

        System.out.println(iniFloat);
        System.out.println(iniDouble);

        System.out.println(decimalInt);
        System.out.println(hexInt);
        System.out.println(binInt);
    }
}
