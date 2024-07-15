
def lenOfLongSubarr (arr, n, k) : 
    #Complete the function
    i=0
    sum1=0
    j=0
    l=0
    
    while i<n and j<n:
        sum1=sum1+arr[j]
        if sum1 == k:
            l=max(l, (j-i)+1)
            j=j+1
        elif sum1<k:
            
            j = j+1
        
        else:
            i = i+1
            j = j+1
        
        
            
            
            
    return l



print(lenOfLongSubarr([1 ,4 ,3 ,3 ,5 ,5],6,16))