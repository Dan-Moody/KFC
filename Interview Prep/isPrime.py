while (True):
    print("Type 'quit' to exit.")
    x = input("How many numbers do you want: ")

    if x == "quit":
        quit()

    try:
        number = int(x)
    except ValueError as e:
        print("Invalid input. Exiting program.")
        quit()

    def is_prime(n: int) -> bool:
        if n <= 3:
            return n > 1
        if n % 2 == 0 or n % 3 == 0:
            return False
        i = 5
        while i ** 2 <= n:
            if n % i == 0 or n % (i + 2) == 0:
                return False
            i += 6
        return True

    print(is_prime(number))
        
        
    

