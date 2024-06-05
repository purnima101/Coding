
def search(arr, l, m, key):
    if l > m:
        return False
    
    mid = (l + m) // 2
    
    if arr[mid] == key:
        return True
    elif arr[mid] > key:
        return search(arr, l, mid - 1, key)
    else:
        return search(arr, mid + 1, m, key)

def main():
    arr = [1, 4, 7, 9, 10, 17]
    key = 10 
    l = 0
    m = len(arr) - 1

    print(search(arr, l, m, key))

main()