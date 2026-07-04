class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        if len(word) <= 1:
            return True
        if word[0].isupper() and word[1].isupper():
            return word[1:].isupper()
        if word[0].isupper() and word[1].islower():
            return word[1:].islower()
        return word.islower()


if __name__ == "__main__":
    sol = Solution()
    print(sol.detectCapitalUse("USA"))
    print(sol.detectCapitalUse("FlaG"))
