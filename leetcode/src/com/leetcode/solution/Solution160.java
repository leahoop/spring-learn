package com.leetcode.solution;

import java.util.Stack;

public class Solution160 {

    public static void main(String[] args) {

//        ListNode l0 = new ListNode(0);
//        ListNode l9 = new ListNode(9);
//        ListNode l1 = new ListNode(1);
//        ListNode l3 = new ListNode(3);
//        ListNode l2 = new ListNode(2);
//        ListNode l4 = new ListNode(4);
//
//        l3.next = l2;
//        l2.next = l4;
//
//        l0.next = l9;
//        l9.next = l1;
//        l1.next = l2;

        ListNode l4 = new ListNode(4);
        ListNode l1 = new ListNode(1);
        ListNode l8 = new ListNode(8);
        ListNode l44 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        ListNode l55 = new ListNode(5);
        ListNode l0 = new ListNode(0);
        ListNode l11 = new ListNode(1);

        l4.next = l1;
        l1.next = l8;
        l8.next = l44;
        l44.next = l5;

        l55.next = l0;
        l0.next = l11;
        l11.next = l8;


        ListNode intersectionNode = getIntersectionNode(l4, l55);

//        System.out.println(intersectionNode.val);

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> stackA = new Stack<>();
        ListNode a = headA;
        while (a != null) {
            stackA.push(a);
            a = a.next;
        }

        Stack<ListNode> stackB = new Stack<>();
        ListNode b = headB;
        while (b != null) {
            stackB.push(b);
            b = b.next;
        }

        int n = 0;
        ListNode temp = null;
        while (!stackA.empty() && !stackB.empty()) {
            ListNode popA = stackA.pop();
            ListNode popB = stackB.pop();
            if (popA != popB && n == 0) {
                return null;
            }
            if (popA == popB) {
                n++;
                temp = popA;
            } else {
                return temp;
            }
        }
        return temp;
    }

}
