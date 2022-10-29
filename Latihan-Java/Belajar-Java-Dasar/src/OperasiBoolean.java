public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 85;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusNilai && lulusAbsen;
        System.out.println(lulus);
    }
}
