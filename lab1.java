public class lab1 {
    // max of two numbers
 public static int max(int a, int b) {
     if (a > b) {
         return a;
        }
        return b;
    }
 
 // min of two numbers
 public static int min(int a, int b) {
     if (a < b) { 
         return a; 
        } 
     return b; 
    }
 
 //sum of array
 public static int sum(int[] nums) {
     int total = 0; 
     for (int n : nums) { 
         total += n; 
        } 
     return total; 
    }
 
 // average of array
 public static double average(int[] nums) {
     int total = 0; 
     for (int n : nums) { 
          total += n; 
        } 
     return (double) total / nums.length; 
    }
 
 // max of array
 public static int max(int[] nums) {
     int largest = nums[0]; 
     for (int i = 1; i < nums.length; i++) { 
          if (nums[i] > largest) { 
              largest = nums[i]; 
            } 
        } 
        return largest; 
    }
 
 // min of array
 public static int min(int[] nums) { 
     int smallest = nums[0]; 
     for (int i = 1; i < nums.length; i++) { 
           if (nums[i] < smallest) { 
               smallest = nums[i]; 
            } 
        } 
        return smallest; 
   }
 
  // main method
 public static void main(String[] args) {
     // declare and initialize array
        int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};
     
     // output array in order using while loop
     System.out.println("Array in order:"); 
     int i = 0;
     while (i < numbers.length) { 
         System.out.print(numbers[i] + " "); 
         i++; 
        } 
     System.out.println();
     
     // output array in reverse using for loop
     System.out.println("Array in reverse:"); 
     for (int j = numbers.length - 1; j >= 0; j--) {     
          System.out.print(numbers[j] + " "); 
        }    
     System.out.println();
     
     // first and last values
     System.out.println("First value: " + numbers[0]);       
     System.out.println("Last value: " + numbers[numbers.length - 1]);
     
     // demonstrate methods
     System.out.println("max(10, 4): " + max(10, 4));  
     System.out.println("min(10, 4): " + min(10, 4)); 
     System.out.println("Sum of array: " + sum(numbers)); 
     System.out.println("Average of array: " + average(numbers)); 
     System.out.println("Max in array: " + max(numbers)); 
     System.out.println("Min in array: " + min(numbers));
    }
    
}
