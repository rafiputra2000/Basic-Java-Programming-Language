public class MethodParameters {
    public static void main(String[] args) {
        sayHelloWorld("Rafi", " Pramasukma Ekhaputera");
        sayHelloWorld("Budi", " Raharja");
        sayHelloWorld("Rafi", " nayu");

    }

    static void sayHelloWorld(String firstName, String lastName){
        System.out.println("Hello " + firstName + lastName);
    }
}
