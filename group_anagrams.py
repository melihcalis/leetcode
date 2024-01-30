class Solution(object):


    def groupAnagrams(self, strs):
        anagrams_dict = {}
        
        for i in strs:
            sorted_str = ''.join(sorted(i))
            
            if sorted_str in anagrams_dict:
                anagrams_dict[sorted_str].append(i)
            else:
                anagrams_dict[sorted_str] = [i]

        return list(anagrams_dict.values())
    
sol = Solution()

print(sol.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
print(sol.groupAnagrams([""]))
print(sol.groupAnagrams(["a"]))


    
