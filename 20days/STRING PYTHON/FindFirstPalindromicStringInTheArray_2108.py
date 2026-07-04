class Solution:
    def firstPalindrome(self, words: list[str]) -> str:
        for word in words:
            if word == word[::-1]:
                return word
        return ""


if __name__ == "__main__":
    sol = Solution()
    print(sol.firstPalindrome(["abc", "car", "ada", "racecar"]))
    print(sol.firstPalindrome(["notapalindrome", "racecar", "cool"]))
