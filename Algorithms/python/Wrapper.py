#!/usr/bin/env python
# -*- coding: utf-8 -*-

import json
from ListNode import ListNode


class Wrapper:

    def stringToIntegerList(input):
        return json.loads(input)

    def stringToListNode(self, input):
        # Generate list from the input
        numbers = self.stringToIntegerList(input)

        # Now convert that list into linked list
        dummyRoot = ListNode(0)
        ptr = dummyRoot
        for number in numbers:
            ptr.next = ListNode(number)
            ptr = ptr.next

        ptr = dummyRoot.next
        return ptr

    def prettyPrintLinkedList(node):
        while node and node.next:
            print(str(node.val) + "->", end='')
            node = node.next

        if node:
            print(node.val)
        else:
            print("Empty LinkedList")


