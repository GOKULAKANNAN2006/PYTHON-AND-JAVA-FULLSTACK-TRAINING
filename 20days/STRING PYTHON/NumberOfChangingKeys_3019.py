class Solution:
    def countChangingKeys(self, s: str) -> int:
        if not s:
            return 0
        count = 0
        prev = s[0].lower()
        for ch in s[1:]:
            curr = ch.lower()
            if curr != prev:
                count += 1
                prev = curr
        return count


if __name__ == "__main__":
    sol = Solution()
    print(sol.countChangingKeys("Hello"))
    print(sol.countChangingKeys("aAaAaaA"))
