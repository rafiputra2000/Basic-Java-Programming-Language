public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] value={80,70,50,80,100};
        sayCongrats("Rafi", value);

        sayCongrats("Budi", 80,70,80,40,100);

    }

    static void sayCongrats(String name, int ...values){
        var total = 0;
        for (var value : values){
            var nilaiTotal= total += value;
            System.out.println("Nilai ini adalah " + nilaiTotal);
            System.out.println("Nilai Total " + total);
            System.out.println("Nilai Value " + value);
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println(name + " Lulus");
        } else {
            System.out.println(name + " Gagal");
        }

    }
}
