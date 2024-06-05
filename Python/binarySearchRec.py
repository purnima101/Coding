def search(arr, l,m,mid, key):
    if arr[mid]==key:
        return True
    if l==m:
        return False
    if(arr[mid]>key):
        pass
        
    

def main():
    arr=[1,4,7,9,10,7]
    key=12
    l=0
    m=len(arr)-1
    mid=l+m//2

    print(search(arr,l,m,mid, key))

main()