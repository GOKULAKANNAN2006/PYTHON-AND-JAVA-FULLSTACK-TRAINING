class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(0, head)
        first = dummy
        second = dummy
        for _ in range(n + 1):
            second = second.next
        while second:
            first = first.next
            second = second.next
        first.next = first.next.next
        return dummy.next


if __name__ == "__main__":
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
    result = Solution().removeNthFromEnd(head, 2)
    while result:
        print(result.val, end=" ")
        result = result.next
    print()
