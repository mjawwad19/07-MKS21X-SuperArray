public class SuperArray {
   private int size;
   private String[] data;
   // Phase 1 //
   public SuperArray() {
      data = new String[10];
   }

   public void clear() {
      size = 0;
   }

   public int size() {
      return size;
   }

   public boolean isEmpty() {
      return size == 0;
   }
  
   public boolean add(String value) {
      for (int i = 0; i < data.length; i++) {
          if (data[i] != null) {
             data[i] = String;
             return true;
          }
      }
   }

   public String toString() {
      String newStr = "[";
      for (int i = 0; i < data.length; i++) {
          if (data[i] = null) return newStr;
          else if (i != data.length-1)  newStr += data[i] + ", ";
          else newStr += data[i] + "]";
      }
   }

   public String toStringDebug() {
      String newStr = "[";
      for (int i = 0; i < data.length; i++) {
          if (i != data.length-1)  newStr += data[i] + ", ";
          else newStr += data[i] + "]";
      }
   }

   public String get(int index) {
      if (index >= size() || index < 0) return null;
      else return data[index];
   }
