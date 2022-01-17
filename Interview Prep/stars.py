while (True):
    print("Type 'quit' to exit.")
    x = input("How many rows do you want: ")

    if x == "quit":
        quit()

    try:
        spaces = int(x)
    except ValueError as e:
        print("Invalid input. Exiting program.")
        quit()
    
    spaces = int(x)
    for i in range(int(x)):
        print( ' ' * ( spaces - i - 1 ) + '*' * ( 1 + (i*2)) )
    # print("\n")
    

