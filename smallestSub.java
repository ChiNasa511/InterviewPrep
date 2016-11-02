class Pramp {
   public static void main(String[] args) {
      String pramp = "Practice Makes Perfect";
      System.out.println(pramp);
      
   }
   
   // Time complexity: O(n^2)
      
    public void smallSub(Character[] arr , String str) {
      
      // Smallest substring
      String smallest = "";
      
      // Iterate through the string
      for (int i = 0; i < str.length(); i++) {
           smallest =  str.substring(0, i);
         
         // Check if substring contains characters of arr
         for (int k = 0; k < arr.size(); k++)  {
               if (smallest.contains(arr[k])) {           
                  // What to do now?
                  return smallest;                    
               } else {
               smallest = str.substring(i+1, i);
            }         
      }    
   }  
}
