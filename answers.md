## question 1
Create a shell script (bash, powershell & co) that will check that any descendant dir of
current or passed dir that is a git project (has .git dir or file) is synchronized with remote
repository (after this any `git push` should work).
For windows: `cmder` includes git, bash and everything that is needed.


## answer 1
#!/bin/bash

#Check that any descendant dir of current or passed dir that is a git project (has .git dir or file) is synchronized with remote repository

#check if argument is passed
if [ $# -eq 0 ]
then
#if no argument is passed then set current directory as argument
dir="$(pwd)"
else
dir="$1"
fi

#check if the argument is an existing directory
if [ ! -d "$dir" ]; then
echo "Argument is not a directory."
exit 1
fi

#function to check if the directory is a git project and if it is synchronized with remote repository
function check_git_project(){
dir="$1"
if [[ -d "$dir/.git" || -f "$dir/.git" ]]; then
cd "$dir"
#check if the git project is synchronized with remote repository
#if not then print the project name
if [[ $(git config --get remote.origin.url) ]] && [[ $(git rev-list HEAD...origin/master --count) != 0 ]]; then


## question 2

A client asks that the product you worked on is performant to be able to brag about it in
front of her friends. The product is a live comments room attached to news topics. What
do you do?

## answer 2

I would first start by assessing the existing performance of the product. I would analyze the current system architecture and identify any areas of inefficiency. I would then look for ways to improve the performance of the product, such as optimizing queries, caching data, or introducing a distributed architecture. Finally, I would implement performance tests to verify that these improvements had a tangible effect on the product.

## question 3
How would you model a payment system for a user that can add/remove funds in multiple
currencies? Think also about reports.

## answer 3


The payment system would need to model both the user's funds and the currencies in which the funds are held. A relational database would be a good choice for this.

The database would include a table for users, a table for currencies, and a table for user funds. The user table would store information about the user, such as their name, address, email, etc. The currency table would store information about the different currencies, such as their code, name, and exchange rate. The user funds table would store information about the user's funds, such as the currency, amount, date added/removed, etc.

Reports could be generated from this data by running queries on the database. For example, a report could be generated to show the user's funds in each currency, or to show the changes in the user's funds over time.


## this are the answers to the questions asked