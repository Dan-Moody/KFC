# Counts the number of vowels in an inputed string.
# Uses a dictionary to have O(1) lookup time when checking if a character is a vowel.
# Otherwise its O(n) for the number of characters in a string

# Could also use .count funciton with a string of the vowels

vowels = {
  "a": "a",
  "e": "e",
  "i": "i",
  "o": "o",
  "u": "u",
  "A": "A",
  "E": "E",
  "I": "I",
  "O": "O",
  "U": "U"
}

while True:
    count = 0
    print('Enter some text to find out how many vowels there are :\n(Type \'exit\' to close the program)')

    inputText = input()
    if (inputText == "exit"):
        break

    for char in inputText:
        if char in vowels:
            count+=1

    print('Contains ' + str(count) + ' vowels.\n')

