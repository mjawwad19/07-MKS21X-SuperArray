public class DriveSuperArray{
  public static void main(String[] args) {
      SuperArray l1 = new SuperArray();
      System.out.println (l1.size()); //0
      System.out.println (l1.isEmpty()); //true
      System.out.println (l1); //[]
      System.out.println (l1.toStringDebug()); // [10 null array]
      l1.add("cat");
      System.out.println (l1.size()); //1
      System.out.println (l1.isEmpty()); //false
      System.out.println (l1); //[cat]
      System.out.println (l1.toStringDebug()); // [cat, nullx9]
      l1.add("horse");
      System.out.println (l1.size()); //2
      System.out.println (l1.isEmpty()); //false
      System.out.println (l1); //[cat, horse]
      System.out.println (l1.toStringDebug()); // [cat, horse, nullx8]
      System.out.println (l1.get(1)); // horse
      System.out.println (l1.get(0)); // cat
      System.out.println (l1.get(2)); //null
      System.out.println (l1.set(2, "camel")); //null
      System.out.println (l1.set(1, "camel")); //horse
      System.out.println (l1); // [cat, camel]
  }
}
