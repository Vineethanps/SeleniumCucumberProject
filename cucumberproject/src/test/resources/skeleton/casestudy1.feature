Feature: Register feature for test me app
Scenario: Register scenario
Given url of testmeapp "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
When  user enters "npsvr" as username
And user enters "vini" as firstname
And user enters "reddy" as lastname
And user enters "abcxyz" as password
And user enters "abcxyz" as confirmpassword
And user clicks on "female" as gender
And user enters "vini@email.com" as email
And user enters 8765364234 as mobilenumber
And user enters "<selects date>" as DOB
And user enters "<address>" as address
And user selects " " security question
And user enters "answer" as answer
Then user clicks on REGISTER