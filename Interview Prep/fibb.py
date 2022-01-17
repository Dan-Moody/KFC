while (True):
    print("Type 'quit' to exit.")
    x = input("How many numbers do you want: ")

    if x == "quit":
        quit()

    try:
        spaces = int(x)
    except ValueError as e:
        print("Invalid input. Exiting program.")
        quit()

    first = 0
    second = 1
    print("0", end=" ")
    if int(x) != 0:
        for i in range(int(x) - 1):
            print(second, end=" ")
            third = first + second
            first = second
            second = third
    print()

        
        
    

