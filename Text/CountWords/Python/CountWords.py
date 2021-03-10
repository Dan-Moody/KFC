while True:
    print('Enter some text to find out how many vowels there are :\n(Type \'exit\' to close the program)')

    inputText = input()
    if (inputText == "exit"):
        break

    count = len(inputText.split(" "))

    print('Contains ' + str(count) + ' words.\n')

