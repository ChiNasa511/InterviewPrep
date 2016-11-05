class Pramp {
   public static void main(String[] args) {
      String pramp = "Practice Makes Perfect";
      
   }
   
   public int[] arrArray(int[] array) {
      
      int[] right = new int[array.length];
      int[] left = new int[array.length];
      int[] result = new int[array.length];
      
      left[0] = 1;
      right[array.length - 1] = 1;
   
      // Testing: [2, 3, 4] 
      // Left: [1, 6, 12]
      // Right: [12, 6, 1]
      
      
       // Go from left to right
      for (int i = 0; i < array.length; i++) {
         left[i+1] = left[i] * array[i];
      }  
      
      // Go from right to left
      for (int i = array.length-1; i > 0; i--) {
          right[i-1] = right[i] * array[i];
      } 
      
      // Multiply both arrays
      for (int i = 0; i < array.length; i++) {
         result[i] = left[i] * right[i];
      } 
      
   return result;
}
