def digits(n):

    if n==2:
        return 1
    if n==1:
        return 0
    
    return fibbo(n-1) + fibbo(n-2)

   

def main():
    n=123

    print(digits(n))


main()