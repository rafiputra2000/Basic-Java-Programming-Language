public class Break_and_continue {
    public static void main(String[] args) {

        var counter = 1;

        while (true){
            System.out.println("perulangan ke-" + counter);
            counter++;

            if(counter > 10){
                break;
            }
        }
        System.out.println("Perulangan berhenti");

        //    ************

        for(var counter2= 1; counter2 <= 100; counter2++){
            if(counter2 % 2 == 0){
                continue;
            }
            System.out.println("Data Ganjil " + counter2);
    }




    }
}
