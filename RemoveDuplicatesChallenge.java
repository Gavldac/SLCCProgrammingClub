

public class RemoveDuplicatesChallenge {

   /**
    * This method is passed an array of Integers and
    * should return an array with duplicates removed.
    * The method should also main the array's original order while
    * moving any removed null vaules to the end of the array. (The upper indecies)
    * @param array
    * @return Integer[]
    * @author [ENTER YOUR NAME HERE]
    */
    public static Integer[] removeDuplicates(Integer[] array) {
        // Students will implement this method
        return array; // Placeholder
    }

    // Helper method to compare two arrays up to a given length
    private static boolean arraysEqual(Integer[] array1, Integer[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        if (array1.length != array2.length) {
            return false;
        }
        return true;
    }

    ////////////////////////////////// Test client  ////////////////////////////////// 
    public static void main(String[] args) {
        // General Test Cases
        Integer[] test1 = {1, 2, 3, 4, 2, 5};
        Integer[] expected1 = {1, 2, 3, 4, 5, null}; // Expected result after removing duplicates

        Integer[] test2 = {5, 3, 4, 3, 5, 6};
        Integer[] expected2 = {5, 3, 4, 6, null, null}; // Expected result after removing duplicates

        Integer[] test3 = {9, 8, 7, 6, 5, 4};
        Integer[] expected3 = {9, 8, 7, 6, 5, 4}; // Expected result (no duplicates)

        // Edge Cases
        Integer[] edgeCase1 = {}; // Empty array
        Integer[] expectedEdge1 = {}; // Expected result (empty array)

        Integer[] edgeCase2 = {1, 2, 3, 4, 5, 1};
        Integer[] expectedEdge2 = {1, 2, 3, 4, 5, null}; // Expected result after removing duplicates

        // Running tests
        System.out.println("Test 1: " 
            + (arraysEqual(removeDuplicates(test1), expected1) ? "PASS" : "FAIL"));
        System.out.println("Test 2: " 
            + (arraysEqual(removeDuplicates(test2), expected2) ? "PASS" : "FAIL"));
        System.out.println("Test 3: " 
            + (arraysEqual(removeDuplicates(test3), expected3) ? "PASS" : "FAIL"));
        System.out.println("Test 4: " 
            + (arraysEqual(removeDuplicates(edgeCase1), expectedEdge1) ? "PASS" : "FAIL"));
        System.out.println("Test 5: " 
            + (arraysEqual(removeDuplicates(edgeCase2), expectedEdge2) ? "PASS" : "FAIL"));
    }
}