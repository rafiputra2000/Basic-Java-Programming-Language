public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Wow Hebat");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda CUkup");
                break;
            case "D":
                System.out.println("Maaf Anda Tidak Lulus");
                break;
            default:
                System.out.println("Maaf Anda salah memasukkan angka");
        }

        switch (nilai) {
            case "A" -> System.out.println("WOW Hebat");
            case "B", "C" -> System.out.println("Lulus");
            case "D" -> System.out.println("Tidak lulus");
            default -> {
                System.out.println("Maaf anda salah jurusan");
            }
        }

        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "wow hebat";
            case "B", "C" -> ucapan = "Lulus";
            case "D" -> ucapan = "Maaf anda tidak lulus";
            default -> {
                ucapan = "maaf anda salah jurusan";
            }
        }
        System.out.println(ucapan);

        String ucapan2 = switch (nilai) {
            case "A": yield "wow hebat";
            case "B", "C": yield "Lulus";
            case "D": yield "Maaf anda tidak lulus";
            default : {
                yield  "maaf anda salah jurusan";
            }
        };
        System.out.println(ucapan2);

    }
}
