# TCS-Examination
CodeChef Difficulty 1006 problem.

TCS Examination
Two friends, Dragon and Sloth, are writing a computer science examination series. There are three subjects in this series: 
DSA
DSA, 
TOC
TOC, and 
DM
DM. Each subject carries 
100
100 marks.

You know the individual scores of both Dragon and Sloth in all 
3
3 subjects. You have to determine who got a better rank.

The rank is decided as follows:

The person with a bigger total score gets a better rank
If the total scores are tied, the person who scored higher in 
DSA
DSA gets a better rank
If the total score and the 
DSA
DSA score are tied, the person who scored higher in 
TOC
TOC gets a better rank
If everything is tied, they get the same rank.
Input Format
The first line of input contains a single integer 
T
T, denoting the number of test cases. The description of 
T
T test cases follows.
The first line of each test case contains three space-separated integers denoting the scores of Dragon in 
DSA
DSA, 
TOC
TOC and 
DM
DM respectively.
The second line of each test case contains three space-separated integers denoting the scores of Sloth in 
DSA
DSA, 
TOC
TOC and 
DM
DM respectively.
Output Format
For each test case, if Dragon got a better rank then output "Dragon", else if Sloth got a better rank then output "Sloth". If there was a tie then output "Tie". Note that the string you output should not contain quotes.
The output is case insensitive. For example, If the output is "Tie" then "TiE", "tiE", "tie", etc are also considered correct.
