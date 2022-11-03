#TC#2: Wikipedia Search Functionality Title Verification
#1. User is on Wikipedia home page
#2. User types Steve Jobs in the wiki search box
#3. User clicks wiki search button
#4. User sees Steve Jobs is in the wiki title
@Regression @wiki
  Feature: Wikipedia Search Functionality Title Verification

    Background:
      Given User is on Wikipedia home page

    Scenario:
#      Given User is on Wikipedia home page
      When User types Steve Jobs in the wiki search box
      And User clicks wiki search button
      Then User sees Steve Jobs is in the wiki title

    Scenario:
#      Given User is on Wikipedia home page
      When User types "Steve Jobs" in the wiki search box
      And User clicks wiki search button
      Then User sees "Steve Jobs" is in the wiki title

    Scenario Outline: Wikipedia search functionality Title Verification using DDT
#      Given User is on Wikipedia home page
      When User types "<searchValue>" in the wiki search box
      And User clicks wiki search button
      Then User sees "<expectedTitle>" is in the wiki title

      Examples:
        | searchValue       | expectedTitle     |
        | Bill Gates        | Bill Gates        |
        | Cristiano Ronaldo | Cristiano Ronaldo |
        | Elon Musk         | Elon Musk         |
        | Albert Einstein   | Albert Einstein   |
        | Chuck Norris      | Chuck Norris      |
        | Alisher Usmanov   | Alisher Usmanov   |


