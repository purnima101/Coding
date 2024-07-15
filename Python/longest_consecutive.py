def main():
    arr=[34, 2, 7, 23, 31, 38, 13, 11, 37, 19, 45, 6]
    # arr = [2,6,1,9,4,5,3]
    arr.sort()
    print(arr)
    N= len(arr)
        
    i=0
    x=1
    max_1 = float('-inf')
    while i < N-1:
        
     
        if arr[i]+1==arr[i+1]:
            x=x+1
        else:
            x=1
        max_1 = max(max_1, x)
        i=i+1
        
    print(max_1)


main()