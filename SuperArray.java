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
     if (data.length == size()) resize();
     data[size()] = value;
     size ++;
     return true;
   }
   //Phase 2 only method
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
     String newStr = "[";
     for (int i = 0; i < size(); i++) {
       newStr += data[i];
       if (i != size() -1) newStr += ", ";
     }
     newStr += "]";
     return newStr;
   }

   public String toStringDebug() {
      String newStr = "[";
      for (int i = 0; i < data.length; i++) {
          newStr+= data[i];
          if (i != data.length -1) newStr += ", ";
      }
      newStr += "]";
      return newStr;
   }
   //Returns the element at the specified position in this list.
   public String get(int index) {
      if (index >= size() || index < 0) {
        System.out.print("Invalid index error; returning null");
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
   //Phase 3
   //Returns true if this list contains the specified element.
   public boolean contains(String target) {
     for (int i = 0; i < size(); i++) {
       if (target == data[i]) {return true;}
     }
     return false;
   }
   /*Returns the index of the first occurrence of the specified element
   in this list, or -1 if this list does not contain the element.*/
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
   /*Returns the index of the last occurrence of the specified element
   in this list, or -1 if this list does not contain the element.*/
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

   /*All elements at the index or to the right, are shifted to the right
    to make   space, then insert the specified element at the specified
    position in this list. Prints an error when index is out of range.*/
/*    public void add(int index, String value) {
      if (index >= size() || index < 0) System.out.print("Invalid index error");
      if (data.length == size()) resize();
      for (int i = size() -1 ; i > -1, i--) {
        if (i > index) {
          data[i] = data[i-1];
        }
        data[index] = value;
        size++;
        }
      }
}
*/
}
