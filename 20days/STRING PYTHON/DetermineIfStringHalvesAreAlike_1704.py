class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        vowels = set("aeiouAEIOU")
        first = s[:len(s) // 2]
        second = s[len(s) // 2:]
        return sum(ch in vowels for ch in first) == sum(ch in vowels for ch in second)


if __name__ == "__main__":
    sol = Solution()
    print(sol.halvesAreAlike("book"))
    print(sol.halvesAreAlike("textbook"))
