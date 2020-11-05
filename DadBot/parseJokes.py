f2 = open("Dadjokes.py","w")
f2.write("dadJokes = [\n")

# Read each line of the jokes.txt file
with open('jokes.txt') as f1:
    lines = [line.rstrip() for line in f1]

for line in lines:
    if '? ' in line:
        joke = line.split("? ",1)
        setup = joke[0].replace('\'', "\\'")
        punchline = joke[1].replace('\'', "\\'")
        f2.write(f'\t[[\"{setup}\"], [\"{punchline}\"]]\n')

f1.close()

f2.write("]\n")
f2.close()