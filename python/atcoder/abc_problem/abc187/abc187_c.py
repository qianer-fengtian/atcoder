def resolve(str_list):
    str_list_with_exclamation = list(filter(lambda str: str.startswith('!'), str_list))
    str_list_without_exclamation = list(filter(lambda str: not str.startswith('!'), str_list))
    unsatisfied = set(map(lambda str: str.replace('!', ''), str_list_with_exclamation)) & set(str_list_without_exclamation)
    return unsatisfied.pop() if len(unsatisfied) > 0 else 'satisfiable'

if __name__ == '__main__':
    n = int(input())
    str_list = list(input() for _ in range(n))
    print(resolve(str_list))
