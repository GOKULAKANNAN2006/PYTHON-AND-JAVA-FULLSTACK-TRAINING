class Solution:
    def removeTrailingZeros(self, s: str) -> str:
        return s.rstrip('0')


if __name__ == "__main__":
    sol = Solution()
    print(sol.removeTrailingZeros("51230100"))
