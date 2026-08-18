/*
Platform       : LeetCode
Problem        : 344. Reverse String
Difficulty     : Easy
Topic          : Strings, Two Pointers

Approach:
- Use two pointers: left at the beginning and right at the end.
- Swap the characters at left and right.
- Move left forward and right backward.
- Continue until left >= right.

Time Complexity : O(n)
Space Complexity: O(1)

Java Implementation:
*/
package Strings;
class Solution {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

}
