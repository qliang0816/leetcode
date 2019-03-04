package BestJava;
/*
160. Intersection of Two Linked Lists

Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 */

import Utils.ListNode.ListNode;
import Utils.ListNode.LinkedListWrapper;

/**
 * Definition for singly-linked list.
 * public class Utils.ListNode {
 * int val;
 * Utils.ListNode next;
 * Utils.ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (!LinkedListWrapper.compareTwoListNode(a, b)) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        ListNode headA = LinkedListWrapper.stringToListNode("[1,2,1,2,3]");
        ListNode headB = LinkedListWrapper.stringToListNode("[1,2,3,1,2,3]");
        LinkedListWrapper.prettyPrintLinkedList(headA);
        LinkedListWrapper.prettyPrintLinkedList(headB);
        LinkedListWrapper.prettyPrintLinkedList(new Solution160().getIntersectionNode(headA, headB));

    }
}