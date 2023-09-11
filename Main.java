public class Main {
    public static void main(String[] args) {
        AccessModifiersDemo acess = new AccessModifiersDemo();
        SubclassDemo sub = new SubclassDemo();
        System.out.println(acess.getPrivateVar());
        System.out.println (acess.getDefaultVar());
        System.out.println(acess.getPrivateVar());
        System.out.println(acess.getPublicVar());
        sub.displayProtectedVar();

    }
}
