

public class FirstRepeatedValueChallenge {

  /**
   * This method is passed an array of Integers and 
   * should return the first repeated value in the array.
   * If there are no repeated values, the method should return null.
   * 
   * @param array
   * @return Interger
   * @author [ENTER YOUR NAME HERE]
   */
    public static Integer findFirstRepeatedValue(Integer[] array) {
        // This method should return the first repeated value in the array
        // If there are no repeated values, the method should return null

        return null;  // TODO
    }







    ////////////////////////////////// Test client //////////////////////////////////
  
    public static void main(String[] args) {
        // General Test Cases
        Integer[] test1 = {1, 2, 3, 4, 2, 5}; // Expected output: 2
        Integer[] test2 = {5, 3, 4, 3, 5, 6}; // Expected output: 3
        Integer[] test3 = {9, 8, 7, 6, 5, 4}; // Expected output: null (no duplicates)

        // Edge Cases
        Integer[] edgeCase1 = {}; // Empty array, expected output: null
        Integer[] edgeCase2 = {1, 2, 3, 4, 5, 1}; // Duplicate at first and last index, expected output: 1

        // Running tests
        System.out.println("Test 1, expected: 2  ");  
        System.out.println("         results: " + findFirstRepeatedValue(test1)); 
        System.out.println("Test 2, expected: 3 ");
        System.out.println("         results: " + findFirstRepeatedValue(test2)); // Should print 3
        System.out.println("Test 3, expected: null  ");
        System.out.println("         results: " + findFirstRepeatedValue(test3)); // Should print null
        System.out.println("Test 4, expected: null ");
        System.out.println("         results: " + findFirstRepeatedValue(edgeCase1)); // Should print null
        System.out.println("Test 5, expected: 1 ");
        System.out.println("         results: " +  findFirstRepeatedValue(edgeCase2)); // Should print 1
    }
}
