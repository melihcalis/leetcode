class Solution:
    def isValid(self, s: str):
        my_stack = [0]

        for i in s:
            if i == "(" or i == "[" or i == "{":
                my_stack.append(i)
            elif i==")" and my_stack[-1] =="(":
                my_stack.pop()
            elif i=="]" and my_stack[-1] =="[":
                my_stack.pop()
            elif i=="}" and my_stack[-1] =="{":
                my_stack.pop()
            else:
                return False
        my_stack.pop()
        if len(my_stack) == 0:
            return True
        else:
            return False
        
sol = Solution()
print(sol.isValid("()[]{}"))