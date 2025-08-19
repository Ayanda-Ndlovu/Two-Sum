Two Sum Problem (Java)

This project contains a simple Java implementation of the classic Two Sum Problem.
The program finds two indices in an array such that the numbers at those indices add up to a specified target value.

📌 Problem Statement

Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to target.

Example:
Input:

nums = [2, 7, 11, 15], target = 9


Output:

Indices: [0, 1]
Values: 2 + 7 = 9

🛠️ Implementation Details

Uses a HashMap for efficient lookups.

Runs in O(n) time complexity with O(n) space complexity.

Returns the indices as an array of size 2.

🚀 How to Run
Option 1: Hardcoded Example

Save the file as Main.java.

Compile:

javac Main.java


Run:

java Main


Output:

Indices: [0, 1]
Values: 2 + 7 = 9

Option 2: User Input Example

Modify the main method to accept user input:

import java.util.*;

public class Main {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1}; // fallback if no solution
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter numbers separated by spaces: ");
        String[] parts = sc.nextLine().split(" ");
        int[] nums = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Solve
        int[] result = twoSum(nums, target);
        if (result[0] != -1) {
            System.out.println("Indices: " + Arrays.toString(result));
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No solution found.");
        }

        sc.close();
    }
}

💻 Example Run (User Input)
Enter numbers separated by spaces: 2 7 11 15
Enter target: 9
Indices: [0, 1]
Values: 2 + 7 = 9

🔧 Future Improvements

Handle multiple test cases in a single run.

Extend to Three Sum and Four Sum variations.

Add unit tests for validation.
