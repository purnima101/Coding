nums=[1,2,3,4,5,6,7,8,9]

for i in range(0,len(nums)-1,2):
    temp=nums[i]
    nums[i]=nums[i+1]
    nums[i+1]=temp

print(nums)