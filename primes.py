import math


n = 1000

is_Prime = [True] * n
is_Prime[0] = is_Prime[1] = False

for i in range(2, math.ceil(math.sqrt(n))):
    if is_Prime[i]:
        for j in range(i*i, n, i):
            is_Prime[j] = False

for i in range(n):
    if i > 499 and is_Prime[i]:
        print(i)
        


        
