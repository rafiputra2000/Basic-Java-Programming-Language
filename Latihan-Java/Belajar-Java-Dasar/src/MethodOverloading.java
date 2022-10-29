public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Rafi Pramasukma", "Ekhaputera");
        sayHello("Rafi Pramasukma Ekhaputera");

    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + lastName);
    }

    static void sayHello(String fullName){
        System.out.println("Hello" + fullName);
    }
}
