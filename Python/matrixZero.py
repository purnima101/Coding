def main():
    matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
    for i in range(0,len(matrix)):
        for j in range(0, len(matrix[0])):
            if matrix[i][j] == 0:
                for x in range(0,len(matrix[0])):
                    if matrix[i][x] != 0:
                        matrix[i][x] = -1
                for x in range(0,len(matrix)):
                    if matrix[x][j] != 0:
                        matrix[x][j] = -1
    print(matrix)
    for i in range(0,len(matrix)):
        for j in range(0, len(matrix[0])):
            if matrix[i][j] == -1:
                matrix[i][j] = 0

    print(matrix)


main()