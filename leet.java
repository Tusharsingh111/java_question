// 1.two sum
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{}; // No solution found
//     }
// }

//2.add two number
public class leet {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); 
        ListNode curr = dummy; 
        int carry = 0; 
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0; 
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){ 
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry; 
            carry = sum/10; 
            ListNode node = new ListNode(sum % 10);
            curr.next = node; 
            curr = curr.next; 
        }
        return dummy.next; 
    }
}