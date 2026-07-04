class Solution:
    def countSeniors(self, details: list[str]) -> int:
        count = 0
        for d in details:
            age = int(d[-2:])
            if age > 60:
                count += 1
        return count


if __name__ == "__main__":
    sol = Solution()
    print(sol.countSeniors(["7868190130M7522", "5303914400F9211", "9273338290F4010"]))
