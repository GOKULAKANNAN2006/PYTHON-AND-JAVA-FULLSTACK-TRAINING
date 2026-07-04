class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev = None
        current = head
        while current:
            nxt = current.next
            current.next = prev
            prev = current
            current = nxt
        return prev


if __name__ == "__main__":
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
    rev = Solution().reverseList(head)
    while rev:
        print(rev.val, end=" ")
        rev = rev.next
    print()
