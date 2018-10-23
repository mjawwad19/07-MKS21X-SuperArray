public class Driver{
  public static void main(String[] args) {
      SuperArray l1 = new SuperArray();
      System.out.println (l1.size()); //0
      System.out.println (l1.isEmpty()); //true
      System.out.println (l1.toStringDebug()); // [10 null array]
      System.out.println (l1); //[]
      l1.add("cat");
      System.out.println (l1.size()); //1
      System.out.println (l1.isEmpty()); //false
      System.out.println (l1.toStringDebug()); // [cat, nullx9]
      System.out.println (l1); // [cat]
      l1.add("horse");
      System.out.println (l1.size()); //2
      System.out.println (l1.isEmpty()); //false
      System.out.println (l1.toStringDebug()); // [cat, horse, nullx8]
      System.out.println (l1); // [cat, horse]
  }
}

