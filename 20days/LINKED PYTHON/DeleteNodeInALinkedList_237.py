class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def deleteNode(self, node):
        node.val = node.next.val
        node.next = node.next.next


if __name__ == "__main__":
    head = ListNode(4, ListNode(5, ListNode(1, ListNode(9))))
    sol = Solution()
    sol.deleteNode(head.next)
    current = head
    while current:
        print(current.val, end=" ")
        current = current.next
    print()
