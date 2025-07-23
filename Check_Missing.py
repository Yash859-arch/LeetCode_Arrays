def Check_Missing_Element(arr):
    new_arr = sorted(arr)
    min_ele = min(arr)
    max_ele = max(arr)
    for i,j in zip(range(min_ele , max_ele+1) , new_arr):
        if i != j:
            return i
            
