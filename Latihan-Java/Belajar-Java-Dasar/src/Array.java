public class Array {
    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[5];
        arrayString[0] = "Rafi";
        arrayString[1] = "Pramasukma";
        arrayString[2] = "Ekhaputera";
        arrayString[3] = "Eko";
        arrayString[4] = "Kurniawan";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        System.out.println(arrayString[3]);
        System.out.println(arrayString[4]);

        arrayString[0] = "Dimas";
        System.out.println(arrayString[0]);

        Integer[] angkaInt = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        System.out.println(angkaInt[8]);

        Long[] angkaLong = {
                1l,2l,3l,4l,5l,6l,7l,8l,9l,10l
        };

        System.out.println(angkaLong.length);

        String[][] karyawan = {
                {"eko", "rafi"},
                {"ini", "eko"},
                {"Jack"}

        };
        System.out.println(karyawan[0][1]);
        System.out.println(karyawan[1][1]);
        System.out.println(karyawan[2][0]);
    }
}

