class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        result = 0
        for ch in s + t:
            result ^= ord(ch)
        return chr(result)


if __name__ == "__main__":
    sol = Solution()
    print(sol.findTheDifference("abcd", "abcde"))
