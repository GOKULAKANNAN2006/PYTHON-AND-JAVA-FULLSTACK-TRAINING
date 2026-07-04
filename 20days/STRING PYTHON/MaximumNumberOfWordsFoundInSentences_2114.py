class Solution:
    def mostWordsFound(self, sentences: list[str]) -> int:
        return max(len(s.split()) for s in sentences)


if __name__ == "__main__":
    sol = Solution()
    print(sol.mostWordsFound(["alice and bob love leetcode", "i think so", "this is great"]))
