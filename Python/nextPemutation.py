def main():
    index = -1
    nums = [1,3,2]
    for i in range(len(nums)-2,-1 , -1):
        if nums[i]<nums[i+1]:
            index = i
            break

    if index == -1:
        print( nums[::-1])

    int_min=float('inf')
    index2 = -1
    for i in range(index+1,len(nums)):
        if nums[i]>nums[index]:
            int_min = min(int_min, nums[i])
            index2 = i 
    tmep = nums[index]
    nums[index] = nums[index2]
    nums[index2] = tmep

    print(index)
    nums[:] = nums[:index + 1] + nums[index + 1:][::-1]

    print(nums)


main()