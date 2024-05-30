def search(arr, size, key):
    if(size==0):
        return False
    if(arr[0]==key):
        return True
   
    return search(arr[1:], size-1, key)
    

def main():
    arr=[1,4,7,9,10,7]
    key=12

    print(search(arr, len(arr), key))

main()