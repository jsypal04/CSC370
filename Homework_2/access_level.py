def access_level(rights: list, minPermission: int):
    output: str = ''
    for right in rights:
        if right >= minPermission:
            output += 'A'
        else:
            output += 'D'
    return output

if __name__ == '__main__':
    print(access_level([0,1,2,3,4,5], 2))
    print(access_level([5,3,2,10,0], 20))
    print(access_level([], 20))
    print(access_level([34,78,9,52,11,1], 49))
    