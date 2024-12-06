def maximumMeetings(n,start,end):
    # code here
    dic=[]
    for i in range(len(start)):
        dic.append([start[i], end[i], i])
        
    sorted_list = sorted(dic, key=lambda x: x[1])
    time = 0
    x=0
    max_end_time=0
    for i in end:
        max_end_time=max(max_end_time,i)
    i=0
    while(i<n and time<=max_end_time):
        # print(time)
        # print(f' hi - {sorted_list[i][0]}')
        if time==sorted_list[i][0]:
            # print(f' hi - {sorted_list[i][0]}')
            time=time+(sorted_list[i][1]-sorted_list[i][0])
            x=x+1
            i=i+1
        else:
            if(time>sorted_list[i][0]):
                i=i+1
            time=time+1
    
    return x

print(maximumMeetings(6, [1 ,3, 0, 5, 8, 5],[2, 4, 6, 7, 9, 9]))

# maximumMeetings(6, [1 ,3, 0, 5, 8, 5],[2, 4, 6, 7, 9, 9])
            