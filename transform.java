import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    
    String start = "aaa";
    String end = "abc";
    ArrayList<String> allWords = ArrayList<String>();
      allWords.add("aaa");
      allWords.add("bbb");
      allWords.add("aba");
      allWords.add("acc");
      allWords.add("abc");
      allWords.add("ccc");
      allWords.add("aad");
   
    System.out.println(transform(start, end, allWords);  
  }
  
  public static ArrayList<String> transform(String start, String end, ArrayList<String> allWords) {
    
    LinkedList<String> queue =  new LinkedList<String>();
    HashSet<String> visited = HashSet<String>(); 
    ArrayList<String> answer = ArrayList<String>();
  

    queue.add(start);
    visited.add(start);
    
    // Check non empty queue
    while (!queue.isEmpty()) {
      String top = queue.remove();
      
      for (String newWord : transformLetters(word, allWords)) {
        if (!visited.contains(newWord)) {
          visited.add(newWord);
        }
        if (newWord.equals(end)) {
          answer.add(newWord);
        }
        queue.add(newWord);
      }
      return answer;
    }
  }
    
          
  private HashSet<String> transformLetters (String word, ArrayList<String> allWords) {
    HashSet<String> finalAnswer = HashSet<String>(); 
          
    // Swap
    char[] arr = word.toCharArray();
    for (int i = 0; i< arr.length; i++) {
      for (char c = 'a'; c<= 'z'; c++) {
        char temp = arr[i];
        if (arr[i] != c) {
          arr[i] = c;
        }
        
        // Create new word
        String newWord = new String(arr);
        if (allWords.contains(newWord)) {
          finalAnswer.add(newWord);
        }
      }
    }
    return finalAnswer;
  }
  
}


/* 
Your previous Plain Text content is preserved below:

This question is about transforming one word into a second word.
You are given a start word, end word, and dictionary of all valid
words.

The goal is to transform the start word into the end word by
iteratively changing one character at a time.
Every changed character the new word must exist be a valid word.
The output is the path with the minimum required transformations
between the start and end words.

Examples:
 
start = 'aaa'
end = 'abc'
all_words = ['aaa', 'abb', 'bbb', 'aba', 'acc', 'abc', 'ccc', 'aad']
output: ['aaa', 'aba', 'abc']

start = 'aaa'
end = 'cac'
all_words = ['aaa', 'aba', 'cba', 'cbc', 'cac', 'cdc', 'bbb', 'ccc']
output: ['aaa', 'aba', 'cba', 'cbc', 'cac']



 */
