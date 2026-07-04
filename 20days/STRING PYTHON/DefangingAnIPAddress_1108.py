class Solution:
    def defangIPaddr(self, address: str) -> str:
        return address.replace('.', '[.]')


if __name__ == "__main__":
    sol = Solution()
    print(sol.defangIPaddr("1.1.1.1"))
