public class KonversiDataNumber {
    public static void main(String[] args) {

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 100;
        byte iniByte2 = (byte) iniInt2;

        System.out.println(iniInt);
        System.out.println(iniByte2);
    }
}
