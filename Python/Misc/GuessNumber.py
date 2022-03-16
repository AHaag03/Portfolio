import random

def rng(range):
    num = random.randint(1, range)
    return num

def main():
    range = 50
    num = rng(range)
    guesses = 0
    guessesRemaining = 5
    flag = False
    print('Guess a number between 1 and', range)
    while (guesses < 5):
        print('You have', guessesRemaining, 'guesses left.')
        guess = int(input("Guess a number: "))
        if(guess < num):
            print("Guess is too low.")
        elif(guess > num):
            print("Guess is too high.")
        else:
            print("Correct!")
            flag = True
            break
        guesses += 1
        guessesRemaining -= 1
        print()
    if not flag:
        print('The correct answer was ' + str(num))

if __name__ == "__main__":
    main()
