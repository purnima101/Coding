



def sum(arr, size):
    if(size==0):
        return 0
    else:
        return sum(arr[1:], size-1) + arr[0]
    

def main():
    arr=[1,4,7,9,10,7]

    print(sum(arr, len(arr)))

main()