public class Scope {
    public static void main(String[] args) {
//        System.out.println(hi); // tidak bisa karena beda scope

    }

    static void sayHello(String name){
        String hello = "Hello " + name;
        if (!name.isBlank()){
            String hi = "Hi" + name;
            System.out.println(hi);
        }

        System.out.println(hello);
//        System.out.println(hi); // tidak bisa dikarenakan beda scope
    }
}
