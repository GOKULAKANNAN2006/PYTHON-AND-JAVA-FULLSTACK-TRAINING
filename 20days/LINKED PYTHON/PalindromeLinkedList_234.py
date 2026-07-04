class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        values = []
        while head:
            values.append(head.val)
            head = head.next
        return values == values[::-1]


if __name__ == "__main__":
    head = ListNode(1, ListNode(2, ListNode(2, ListNode(1))))
    print(Solution().isPalindrome(head))
