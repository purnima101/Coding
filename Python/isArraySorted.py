



def isSorted(arr, size):
    if(size==0 or size==1):
        return True
    if(arr[0]>arr[1]):
        return False
    else:
        return isSorted(arr[1:], size-1)

def main():
    arr=[1,4,7,9]

    print(isSorted(arr, len(arr)))

main()