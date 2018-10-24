public class SuperArray {
   private int size;
   private String[] data;
   // Phase 1 //
   public SuperArray() {
      data = new String[10];
   }
   //Removes all of the elements from this list.
   public void clear() {
      size = 0;
   }
   //Removes all of the elements from this list.
   public int size() {
     return size;
   }
   //Returns true if this list contains no elements.
   public boolean isEmpty() {
      return size == 0;
   }
   //Appends the specified element to the end of this list. Returns true.
   public boolean add(String value) {
     boolean added = false;
      for (int i = 0; i < data.length && added == false; i++) {
          if (data[i] == null) {
             data[i] = value;
             size ++;
             added = true;
          }
      }
      return true;
   }
   /*Returns the data in the format: "[A, B, FISH, cat, Dog]"
   Without double quotes around the data elements.*/
   public String toString() {
     if (size == 0) return "[]";
     String newStr = "[";
     for (int i = 0; i < size(); i++) {
       if (i != size() -1) newStr += data[i] + ", ";
       else newStr += data[i] + "]";
     }
     return newStr;
   }

   public String toStringDebug() {
      String newStr = "[";
      for (int i = 0; i < data.length; i++) {
          if (i < data.length-1)  newStr += data[i] + ", ";
          else newStr += data[i] + "]";
      }
      return newStr;
   }
   //Returns the element at the specified position in this list.
   public String get(int index) {
      if (index >= size() || index < 0) return null;
      else return data[index];
   }
}
