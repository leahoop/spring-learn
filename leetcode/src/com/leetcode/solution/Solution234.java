package com.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class Solution234 {

    public static void main(String[] args) {
        ListNode l4 = new ListNode(4);
        ListNode l1 = new ListNode(1);
        ListNode l8 = new ListNode(4);
        ListNode l44 = new ListNode(8);
        ListNode l5 = new ListNode(1);
        ListNode l6 = new ListNode(4);

//        l4.next = l1;
//        l1.next = l8;
//        l8.next = l44;
//        l44.next = l5;
//        l5.next = l6;

        boolean palindrome = isPalindrome(l4);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(ListNode head) {

        ListNode node = head;
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            if (list.get(i).equals(list.get(j))) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }


}
