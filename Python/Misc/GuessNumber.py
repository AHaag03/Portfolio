import random

def rng(range):
    num = random.randint(1, range)
    return num

def main():
    num = rng(100)
    guesses = 0
    flag = False
    while (guesses < 5):
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
    if not flag:
        print('The correct answer was ' + str(num))

if __name__ == "__main__":
    main()
