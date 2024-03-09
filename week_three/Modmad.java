/* 
 *	Generate a sequence of numbers using the modulus operation
 *
 *	Each method returns an array of n numbers
 *	if n < 0 return null
 *  if n == 0 return array of size zero
 */

 
 public class Modmad
 {
     // practice (no modulus needed)
     // Sequence: 13, 13, 13, 13, 13, 13, ...
     public static int[] practice1(int n) {
         // YOUR CODE BE HERE
         if (n < 0) { return null; }
         else if (n == 0) {
             int[] empty = new int[0];
             return empty;
         }
         int[] arr = new int[n];
         int i = 0;
         while (i < n) {
             arr[i] = 13;
             i++;
         }
         return arr;
     }	
     
     // practice (no modulus needed)
     // Sequence: 0, 1, 2, 3, 4, 5, 6, 7...
     public static int[] practice2(int n) {
         // YOUR CODE BE HERE
         if (n < 0) { return null; }
         int[] arr = new int[n];
         int i = 0;
         while (i < n) {
             arr[i] = i;
             i++;
         }
         return arr;
     }
 
     // Sequence: 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3...
     public static int[] generateA(int n) {
         // YOUR CODE BE HERE
         if (n < 0) { return null; }
         else if (n == 0) {
             int[] empty = new int[0];
             return empty;
         }
         int[] arr = new int[n];
         int i = 0;
         while (i < n) {
             arr[i] = i % 4;
             i++;
         }
         return arr;
     }
 
     // Sequence: 3, 2, 1, 0, 3, 2, 1, 0, 3, 2, 1, 0...
     public static int[] generateB(int n) {
         // YOUR CODE BE HERE
         if (n < 0) { return null; }
         else if (n == 0) {
             int[] empty = new int[0];
             return empty;
         }
         int[] arr = new int[n];
         int i = 0;
         while (i < n) {
             arr[i] = 3 - (i % 4);
             i++;
         }
         return arr;
     }
 
     // Sequence: 0, 3, 6, 0, 3, 6, 0, 3, 6...
     public static int[] generateC(int n) {
         // YOUR CODE BE HERE
         if (n < 0) { return null; }
         else if (n == 0) {
             int[] empty = new int[0];
             return empty;
         }
         int[] arr = new int[n];
         int i = 0;
         while (i < n) {
             arr[i] = (i * 3) % 9;
             i++;
         }
         return arr;
     }
 
     // Sequence: 0, 2, 4, 6, 0, 2, 4, 6, 0, 2, 4, 6...
     public static int[] generateD(int n) {
         // YOUR CODE BE HERE
         if (n < 0) { return null; }
         else if (n == 0) {
             int[] empty = new int[0];
             return empty;
         }
         int[] arr = new int[n];
         int i = 0;
         while (i < n) {
             arr[i] = (i * 2) % 8;
             i++;
         }
         return arr;
     }
 
     // Sequence: -3, -2, -1, 0, 1, 2, 3, -3, -2, -1, 0, 1, 2, 3...
     public static int[] generateE(int n) {
         // YOUR CODE BE HERE
         if (n < 0) { return null; }
         else if (n == 0) {
             int[] empty = new int[0];
             return empty;
         }
         int[] arr = new int[n];
         int i = 0;
         while (i < n) {
             arr[i] = - 3 + (i % 7);
             i++;
         }
         return arr;
     }
 
     // Sequence: 100, 105, 110, 115, 120, 100, 105, 110, 115, 120, 100...
     public static int[] generateF(int n) {
         // YOUR CODE BE HERE
         if (n < 0) { return null; }
         else if (n == 0) {
             int[] empty = new int[0];
             return empty;
         }
         int[] arr = new int[n];
         int i = 0;
         while (i < n) {
             arr[i] = 100 + ((5 * i) % 25);
             i++;
         }
         return arr;
     }
     
     // Sequence: -1, 1, 3, 5, -1, 1, 3, 5, -1, 1, 3, 5...
     public static int[] generateG(int n) {
         // YOUR CODE BE HERE
         if (n < 0) { return null; }
         else if (n == 0) {
             int[] empty = new int[0];
             return empty;
         }
         int[] arr = new int[n];
         int i = 0;
         while (i < n) {
             arr[i] = -1 + ((2 * i) % 8);
             i++;
         }
         return arr;
     }
     
     // Sequence: 0, 50, 100, 0, 50, 100...
     public static int[] generateH(int n) {
         // YOUR CODE BE HERE
         if (n < 0) { return null; }
         else if (n == 0) {
             int[] empty = new int[0];
             return empty;
         }
         int[] arr = new int[n];
         int i = 0;
         while (i < n) {
             arr[i] = (50 * i) % 150;
             i++;
         }
         return arr;
     }
     
     // Sequence: -0.5, 0, 0.5, 0, -0.5, 0, 0.5...
     // Input: [0, 1, 2, 3]
     public static double[] generateI(int n) {
         // YOUR CODE BE HERE
         if (n < 0) { return null; }
         else if (n == 0) {
             double[] empty = new double[0];
             return empty;
         }
         double[] arr = new double[n];
         double i = 0;
         int j = 0;
         while (i < n) {
             /*
             ((i + 1) % 2) every second element of the input array calculates as 0
             */
             arr[j] = ((i + 1) % 2) * (-0.5 + ((i % 4) * 0.5));
             i++;
             j++;
         }
         return arr;
     }
     
     // Sequence: 0, 1, 2, 3, 1, 2, 3, 4, 2, 3, 4, 5, 3, 4, 5, 6...
     public static int[] generateJ(int n) {
         // YOUR CODE BE HERE
         // 4 element sequence
         // modulo will increment as well
         if (n < 0) { return null; }
         else if (n == 0) {
             int[] empty = new int[0];
             return empty;
         }
         int[] arr = new int[n];
         int i = 0;
         while (i < n) {
             // arr[i] = ((i + (i / 4)) % (4 + (i / 4)) + (i / 4));
             arr[i] = ((i % 4) + (i / 4));
             i++;
         }
         return arr;
     }
 
     // oh being cheeky with the if statements?
     // return the exact number appearing in the sequence for the given i
     // if (i < 0) return i;
     // Sequence: -0.5, 0, 0.5, 0, -0.5, 0, 0.5...
     public static double generateI2(int i) {
         // YOUR CODE BE HERE
         if (i < 0) {
             return i;
         }
         int iPos = i % 4;
         return ((iPos + 1) % 2) * (-0.5 + ((iPos % 4) * 0.5));
     }	
 
     
     // oh being cheeky with the if statements?
     // return the exact number appearing in the sequence for the given i
     // if (i <= 0) return i;
     // Sequence: 0, 1, 2, 3, 1, 2, 3, 4, 2, 3, 4, 5, 3, 4, 5, 6...
     public static int generateJ2(int i) {
         if (i <= 0) {
             return i;
         }
         int res = ((i % 4) + (i / 4));
         return res;
     }
 
 }
 
 