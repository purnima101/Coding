


def steps(s, d):
    print(f'source : {s}, destination : {d}')
    if(s==d):
        print("reached")
        return
    
    steps(s+1, d)

def main():
    source=1
    destination = 20

    print(steps(source, destination))


main()