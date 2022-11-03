#TC #: Login scenario
#1- Open a chrome browser 2- Go to:
#https://web-table-2.cydeo.com/login
#3- Enter  username:  Test
#4- Enter password: Tester
#5- Verify URL:
#Expected: URL should end with “orders”
  Feature: User should be able to login with valid credentials
    Background:
      Given user is on the login page of web table app

    Scenario: Login Scenario
      When user enters username "Test"
      And user enters password "Tester"
      And user clicks login button
      Then user should see url contains orders

    Scenario: Login scenario with 2 params
      When user enters username "Test" password "Tester" and logins
      Then user should see url contains orders

    Scenario: Login scenario with data table
      When user enters below credentials
        | username     | Test   |
        | password     | Tester |
      Then user should see url contains orders
