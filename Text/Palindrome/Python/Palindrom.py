while True:
    count = 0
    print('Enter some text to find out how many vowels there are :\n(Type \'exit\' to close the program)')

    inputText = input()
    if (inputText == "exit"):
        break

    if inputText == inputText[::-1]:
        print('"' + inputText + '" is a Palindrome.\n')
    else:
        print('"' + inputText + '" is NOT a Palindrome.\n')




