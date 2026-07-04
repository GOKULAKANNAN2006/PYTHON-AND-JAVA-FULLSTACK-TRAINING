class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        words = s.split()
        return " ".join(words[:k])


if __name__ == "__main__":
    sol = Solution()
    print(sol.truncateSentence("Hello how are you Contestant", 4))
    print(sol.truncateSentence("What is the solution", 1))
