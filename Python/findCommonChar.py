def main():
    common_dict = dict()
    words = ["cool","lock","cook"]
    dict_len = len(words)
    new_list = []
    for each in words:
        for i in each:
            if i not in common_dict:
                common_dict[i] = 1
            else:
                common_dict[i] += 1

    print(common_dict)
    
    for key, value in common_dict.items():
        if value % dict_len == 0:
            new_list.append(key)
    
    print(new_list)

main()