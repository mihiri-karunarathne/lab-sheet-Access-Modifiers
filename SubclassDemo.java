public class SubclassDemo extends AccessModifiersDemo {
    public  SubclassDemo(){
        super();
    }
    public void displayProtectedVar() {
      
        boolean value = getProtectedVar();
        System.out.println("Protected variable from SubclassDemo: " + value);
    }
}

