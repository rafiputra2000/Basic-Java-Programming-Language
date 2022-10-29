public class IfStatement {
    public static void main(String[] args) {
        var nilai = 95;
        var absen = 70;

//        if (nilai >= 85 && absen >= 80){
//            System.out.println("Selamat Anda lulus");
//        } else {
//            System.out.println("Maaf anda tidak lulus");
//        }

        if(nilai >= 80 && absen >= 80){
            System.out.println("Selamat nilai A");
        } else if (nilai >= 75 && absen >=75) {
            System.out.println("Selamat nilai B");
        } else if (nilai >= 70 && absen >= 70){
            System.out.println("Selamat nilai C");
        } else if (nilai >= 65 && absen >= 65) {
            System.out.println("Selamat nilai D");
        } else {
            System.out.println("Maaf anda tidak lulus");
        }
    }
}
