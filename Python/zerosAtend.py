def moveZeroes(nums):
    j=0
    i=j+1
    while i<len(nums):
        print(j, i)
        print(nums)
        if nums[j]!=0:
            j=j+1
            i=j+1
        else:
            if nums[i]!=0:
                temp=nums[i]
                nums[i]=nums[j]
                nums[j]=temp
                j=j+1
                i=j+1
             
            else:
                i=i+1


        
        



moveZeroes( [0, 1, 4, 0, 5, 2])