public class MyClass {
    public static void main(String[] args) {
      MyClass c1 = new MyClass();
      System.out.println("In main program user defined object");
      c1.finalize();
      Integer i = new Integer(2);
      i=null;
      System.gc();
      System.out.println("In main program pre defined object");
    }
    protected void finalize(){
        System.out.println("Clearing user defined object");
    }
}
