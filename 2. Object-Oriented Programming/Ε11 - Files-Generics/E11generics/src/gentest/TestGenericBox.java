
package gentest;
public class TestGenericBox {
    
   public static void main(String[] args) {
      GenericBox<String> box1 = new GenericBox<String>("Hello");
      String str = box1.getContent();  // no explicit downcasting needed
      System.out.println(box1);
      
      GenericBox<Integer> box2 = new GenericBox<Integer>(123);  // autobox int to Integer
      int i = box2.getContent();       // downcast to Integer, auto-unbox to int
      System.out.println(box2);
      
      GenericBox<Double> box3 = new GenericBox<Double>(55.66);  // autobox double to Double
      double d = box3.getContent();     // downcast to Double, auto-unbox to double
      System.out.println(box3);
      
      GenericBox<Foititis>boxF = new GenericBox<Foititis>(new Foititis("Petros", 887));
      //boxF.setContent(new Foititis("Than", 445));
      System.out.println(boxF);
      
   }
}