public class minMissing {
    
    public static void main(String[] args) {		
       int[] arr = {2, 3, 7, 6, 8, -1, -10, 15};		
       System.out.println(GetMinMissingElement(arr));	
    }

    public static int GetMinMissingElement(int[] arr) {
    // assume left to be one less than starting element
    int leftElem    = arr[0] - 1;
    // assume right to be one more than starting element
    int rightElem   = arr[0] + 1;
    
    // Start from index 1
    for(int inx = 1; inx < arr.length ; inx++)
    {
        // if leftElem is equal to the current element
        // decrement is further
        if(arr[inx] == leftElem)    
            leftElem--;
        
        // if rightElem is equal to the current element
        // increment is further
        if(arr[inx] == rightElem)
            rightElem++;
    }
    
    // if leftElem is negative, return rightElem as we want positive
    if(leftElem < 0)
        return rightElem;
    // if rightElem is negative return leftElem as we want positive
    else if(rightElem < 0)
        return rightElem;
    // or else return the min of two
    return Math.min(leftElem, rightElem);
    }
}
