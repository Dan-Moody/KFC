# Adds characters one at a time to a new string from the end of original
def reverse1( str ):
    temp = ""
    for i in range( len( str ) - 1, -1, -1 ):
        temp = temp + str[i]
    return temp

# Slice the string starting at the end and ending at position 0 with step -1
# Slicing ( StringName[ strinnglength::-1 ] )
def reverse2( str ):
    return str[::-1]
    
def reverse3( str ):
    reversedString = []
    i = len( str ) - 1
    while i >= 0:
        # Next 2 lines are same thing
        # reversedString.append( str[ i ] )
        reversedString += str[ i ]
        i = i - 1
    # Without join it displays the list
    return ''.join(reversedString)

# Ask the user for input
str = input( "Enter your string to be reversed : " )

# Un-comment the function you want to use
# print( reverse1( str ) )
# print( reverse2( str ) )
print( reverse3( str ) )
