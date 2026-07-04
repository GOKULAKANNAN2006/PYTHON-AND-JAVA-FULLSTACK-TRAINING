class Solution:
    def arrayStringsAreEqual(self, word1: list[str], word2: list[str]) -> bool:
        return ''.join(word1) == ''.join(word2)


if __name__ == "__main__":
    sol = Solution()
    print(sol.arrayStringsAreEqual(["ab", "c"], ["a", "bc"]))
    print(sol.arrayStringsAreEqual(["a", "cb"], ["ab", "c"]))
