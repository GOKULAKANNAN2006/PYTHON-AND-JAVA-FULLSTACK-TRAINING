class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        words = sentence.split()
        for i, word in enumerate(words, 1):
            if word.startswith(searchWord):
                return i
        return -1


if __name__ == "__main__":
    sol = Solution()
    print(sol.isPrefixOfWord("i love eating burgers", "burg"))
    print(sol.isPrefixOfWord("this problem is easy", "pro"))
