public class ForEach {
    public static void main(String[] args) {
        String[] array = {
                "Rafi", "Pramasukma", "Ekhaputera",
                "Programmer", "Zaman", "Now"
        };

        for (var i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("FOR EACH");

        for(var arrays:array){
            System.out.println(arrays);
        }
    }
}
