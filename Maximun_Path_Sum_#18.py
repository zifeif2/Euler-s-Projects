def maximunSum (pyramid, current_row, actual_row, col):
    if col < 0 or col > current_row:
        return 0
    if current_row == actual_row:
        return pyramid[current_row][col]
    b =  maximunSum (pyramid, current_row + 1, actual_row, col)
    c =  maximunSum (pyramid, current_row + 1, actual_row, col+1)
    return pyramid[current_row][col] + max(b, c)

test = int(input())
for _ in range(test):
    actualrow = int(input())
    Matrix = [[0 for x in range(actualrow)] for y in range(actualrow)]
    for i in range(actualrow):
        temp = list(map(int, input().split()))
        j = 0
        while j < i+1:
            Matrix[i][j] = temp[j]
            j += 1
    print(maximunSum ( Matrix, 0, actualrow -1, 0))
