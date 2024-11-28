Feature: Login.feature
#Narrative: validate login with positive and negative datas

@test-1
Scenario: Validate user can Login with valid credentials

Given user opens the url 'makemytrip'
#Then  user should be able to see 'login' page
#Then verify 'personal account' tab selected by default
#And user clicks on 'Email' button
#Then verify 'continue' button enabled 'false' 
#When user enters username 'kirankarkeraa@gmail.com' 
#Then 'continue' button should be enabled'true'
#And user clicks on 'continue' button
#Then user should be redirected to 'password' tab
#Then verify 'Login' button enabled 'false'
#When user enters password 'Makemytrip@123' 
#Then verify 'Login' button enabled 'true'
#Then verify 'Back' button enabled 'true' 
#And user clicks on 'Back' button
#Then verify that username 'kirankarkeraa@gmail.com' should be retained 'true'  
#And user clicks on 'continue' button
#Then verify that 'password' is not retained
#When user enters password 'Makemytrip@123' 
#And user clicks on 'Login' button
#Then verify that the user can 'Login' successfully 
#
#@test-2
#Scenario Outline: Validate login page with invalid inputs
#Given user opens the url 'makemytrip'
#And user clicks on 'Email' button
#When user enters username '<username>'
#And user clicks on 'continue' button
#When user enters password '<password>'
#And user clicks on 'Login' button
#Then user should see 'error'message as 'Either Username or Password is incorrect.'displayed 'true'
#And user should be redirected to 'Login' page
#Examples: 
      #| username  | password |
      #| kirank@123.com 	  | Makemytrip@123 |
      #| kirankarkeraa@gmail.com     |     mkemytrip@123 |

