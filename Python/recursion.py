
def recFunction(n):
    if(n==0):
        return
    else:   
        print(n)
        recFunction(n-1)

def printNumbers():
    recFunction(4)


printNumbers()