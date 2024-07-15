def main():
    l=[-1,-1]

    nums = [2,7,11,15]
    target = 9
    map = {}
    for i in range(0, len(nums)):
        diff = abs(target - nums[i])
      
        if diff in map:
            l=[i, map[diff]]
            break
        map[nums[i]]=i

    print(map)
    return l



print(main())