def main():
    x=0
    nums=[3,4,5,1,2]
    l=len(nums)
    for i in range(0,l-1):
        if(nums[i]>nums[i+1]):
            x=i+1
            break



    k = l-x
    print(k)
    new_list=[0]*l
    for j in range(0,len(nums)):
        new_list[(j+k)%l]=nums[j]

    for i in range(0,l-1):
        if(new_list[i]>new_list[i+1]):
            return False

    return True



print(main())