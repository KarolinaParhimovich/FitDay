Number:1
Related requirement: User can not create a new account without confirmation of password
Name:registrationWithoutConfirmTest
Precondition: follow the link "https://www.fitday.com/fitness/Login.html"
Steps:
1.Click link of creation account
2.Enter name
3.Enter password
4.Enter email
5.Click on agreement
6.Click Sign up
Expected result: Message "Please re-enter your password."
Priority: High

Number:2
Related requirement: User can not create a new account with different passwords
Name:doNotMatchPasswordsTest
Precondition: follow the link "https://www.fitday.com/fitness/Login.html"
Steps:
1.Click link of creation account
2.Enter name
3.Enter password
4.Confirm password that does not match the first one
4.Enter email
5.Click on agreement
6.Click Sign up
Expected result: Message "The passwords you've entered do not match."
Priority: High

Number:3
Related requirement: User can log in if he enters name and password correctly
Name:loginTest
Precondition: follow the link "https://www.fitday.com/fitness/Login.html"
Steps:
1.Enter name
2.Enter password
3.Click Login button
Expected result: User can see his name at the top of page
Priority: High

Number:4
Related requirement: User fills in his data and application calculates them
Name:createAccountTest
Preconditions: follow the link "https://www.fitday.com/fitness/Login.html", user logs in
Steps:
1.User selects sex
2.User select his birthday
3.User enters his height
4.User enters his current weight
5.User enters his goal weight
6.User selects his goal date
7.User selects his activity level
8.Click save button
Expected result: User can close button
Priority: High

Number:5
Related requirement: User can save his mood changes
Name:changingMoodTest
Preconditions: follow the link "https://www.fitday.com/fitness/Login.html", user logs in
Steps:
1.User clicks edit mood
2.User shifts the slider of mood
Expected result: Save button below is enabled
Priority: Medium

Number:6
Related requirement: User can his new weight in the table at the bottom of the page after changing
Name:changingWeightTest
Preconditions: follow the link "https://www.fitday.com/fitness/Login.html", user logs in
Steps:
1.User clicks edit weight
2.User clicks edit weight button
3.Enter new weight of user
4.Click button save
Expected result: User can see his new weight in the table below
Priority: Medium

Number:7
Related requirement: User writes new post and can see his name next to his post
Name:addingPostTest
Preconditions: follow the link "https://www.fitday.com/fitness/Login.html", user logs in
Steps:
1.Click forum tab
2.Click Search and enter type of topic
3.Click go
4.Click on name of forum
5.Click Reply
6.Enter text of message
7.Click Submit
Expected result: User can see his name next to his message
Priority: Medium

Number:8
Related requirement: User marks the post he likes 
Name:likingPostTest
Preconditions: follow the link "https://www.fitday.com/fitness/Login.html", user logs in
Steps:
1.Click forum tab
2.Click Search and enter type of topic
3.Click go
4.Click on name of forum
5.Click like below some post
Expected result: User can see Unlike instead Like below post
Priority: Low

Number:9
Related requirement: User can see the number of calories consumed  after adding of food
Name:addingFoodTest
Preconditions: follow the link "https://www.fitday.com/fitness/Login.html", user logs in
Steps:
1.User clicks edit food
2.User enter name of some food
3.Click on name of appearing suitable dish
4.Input the number of portions
5.Click add to log
Expected result: User can see the number of calories on the diagram
Priority: Low

Number:10
Related requirement: User can see the number of calories spent after activity in the table
Name:addingActivTest
Preconditions: follow the link "https://www.fitday.com/fitness/Login.html", user logs in
Steps:
1.User clicks edit activ
2.User enter name of activity
3.Click on name of appearing activity
4.Input the number of minutes of activity
5.Click add to log
Expected result: User can see the number of calories in the table
Priority: Low

