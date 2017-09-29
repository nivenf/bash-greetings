# Bash Greetings

![alt text](https://scontent.fphx1-2.fna.fbcdn.net/v/t34.0-12/22091598_1413443542024931_1737732502_n.png?oh=2568936165ce25ec0dd6925ceac21df3&oe=59CFCC84)

---INSTALLATION GUIDE---

1. Place friends.java, greeting.java, and box.java files into your home directory

2. Make a text file called "favorites.txt", place it into your home directory and add usernames every line

2. Edit your profile in bash (vim .profile)

3. Place the following code at the end:

clear

spo=$(date "+%H")
java greeting $spo > greet.txt
spo=$(whoami)

printf " " > startup.txt
cat greet.txt >> startup.txt

printf " " >> startup.txt

printf $spo >> startup.txt

printf " \n" >> startup.txt
printf " The current date is " >> startup.txt
date '+%B %d ' >> startup.txt
printf " It is currently " >> startup.txt
date '+%H:%M ' >> startup.txt

echo -e "\e[33m"
cat startup.txt | java box

rm greet.txt
rm startup.txt

who | cut -d" " -f1 >> users_online.txt

echo -e "\e[96m"
java friends $spo | java box

rm users_online.txt

echo -e "\e[92m" # change this line if you want a different color
		
5. javac the three java files: friends.java, greeting.java, and box.java

6. Re-run your .profile file (source ~/.profile) or re-log in

Made by Niven Francis
