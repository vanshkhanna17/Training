import java.util.*;

class Arraymanipulation {
   public static void main(String[] args) {
      System.out.println("What would you like to do with string array?");
      System.out.println("1. Sort the string array");
      System.out.println("2. Search for an element in the string array");
      System.out.println("3. Subtract one string array from another");
      System.out.println("4. Reverse the string array.");
      System.out.println("Please enter [1, 2, 3 or 4]");
      Scanner s = new Scanner(System.in);
      Arraymanipulation obj = new Arraymanipulation();
      int option = s.nextInt();
      switch (option) {
      case 1:
         obj.sort();
         break;

      case 2:
         System.out.println("What element do you want to search in the array");
         String src = s.next();
         obj.search(src);
         break;

      case 3:
         obj.sub();
         break;

      case 4:
         obj.rev();
         break;
      }
   }

   void sort() {
      String[] ar1 = { "Zebra", "Anaconda", "Banana", "Kangaroo", "Ostrich", "Lion", "Tiger" };
      System.out.println("The original array : " + Arrays.toString(ar1));
      String[] copy = ar1;
      int size = ar1.length;

      for (int i = 0; i < size - 1; i++) {
         for (int j = i + 1; j < ar1.length; j++) {
            if (copy[i].compareTo(copy[j]) > 0) {
               String temp = copy[i];
               copy[i] = copy[j];
               copy[j] = temp;
            }
         }
      }
      System.out.println("The Sorted array : " + Arrays.toString(copy));
   }

   void search(String src) {
      int c = 0;
      String[] ar1 = { "Zebra", "Anaconda", "Banana", "Kangaroo", "Ostrich", "Lion", "Tiger", "Zebra" };
      for (int i = 0; i < ar1.length; i++) {
         if (src.equals(ar1[i])) {
            System.out.println("Element \"" + src + "\" found at index " + i);
            c++;
         }
      }
      if (c == 0) {
         System.out.println("Element not found");
      }
   }

   void sub() {
      String[] ar1 = { "Zebra", "Anaconda", "Banana", "Kangaroo", "Ostrich", "Lion", "Tiger" };
      String[] ar2 = { "Zebra", "Anaconda", "Banana" };
      String[] ar3 = new String[7];
      System.out.println("Array 1: " + Arrays.toString(ar1) + " and Array 2: " + Arrays.toString(ar2));
      for (int i = 0; i < ar2.length; i++) {
         for (int j = 0; j < ar1.length; j++) {
            if (ar1[j].equals(ar2[i])) {
               continue;
            } 
            else {
               for (int k = 0; k < ar3.length; k++) {
                  ar3[k] = ar1[j];
               }
            }
         }
      }
      System.out.println("Difference Array: " + Arrays.toString(ar3));
   }

   void rev() {
      String[] ar1 = { "Zebra", "Anaconda", "Banana", "Kangaroo", "Ostrich", "Lion", "Tiger" };
      String[] ar2 = new String[ar1.length];
      System.out.println("The original array: " + Arrays.toString(ar1));
      for (int i = ar1.length - 1; i >= 0; i--) {
         ar2[ar1.length - i - 1] = ar1[i];
      }
      System.out.println("The reversed array: " + Arrays.toString(ar2));
   }

}