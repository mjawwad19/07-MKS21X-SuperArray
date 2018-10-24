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
      data = new String[10];
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
     if (data[data.length - 1] != null) resize();
      for (int i = 0; i < data.length && added == false; i++) {
          if (data[i] == null) {
             data[i] = value;
             size ++;
             added = true;
          }
      }
      return true;
   }

   private void resize() {
     String[] temp = data;
     data = new String[temp.length  * 2];
     for (int i = 0; i < temp.length; i++) {
       data[i] = temp[i];
     }
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
      if (index >= size() || index < 0) {
        System.out.print("Invalid index ");
        return null;
      }
      else return data[index];
   }
   /*Replaces the element at the specified position in this
   list with the specified element, returns the old element.*/
   public String set(int index, String value) {
     String oldVal = "";
     if (index >= size() || index < 0) {
       System.out.print("Invalid index error; returning ");
       return null;
     }
     else {
       oldVal = data[index];
       data[index] = value;
       return oldVal;}
   }

   public boolean contains(String target) {
     for (int i = 0; i < size(); i++) {
       if (target == data[i]) {return true;}
     }
     return false;
   }

   public int indexOf(String target) {
     if (contains(target)) {
       boolean stop = false;
       for (int i = 0; i < size()
            && stop == false; i++) {
         if (target == data[i]) {
           stop = true;
           return i;
         }
       }
     }
     return -1;
   }

   public int lastIndexOf(String target) {
     if (contains(target)) {
       boolean stop = false;
       for (int i = size() -1; i > -1
            && stop == false; i--) {
         if (target == data[i]) {
           stop = true;
           return i;
         }
       }
     }
     return -1;
   }
}
