
Feature: Web table user order feature

  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "american express"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table


  Scenario Template:
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipcode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expiryDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table

    Examples: Famous female scientist
      | productType | quantity | customerName      | street            | city   | state   | zipcode | cardType | cardNumber       | expiryDate | expectedName      |
      | Familybea   | 2        | Rosalind Franklin | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Rosalind Franklin |
      | MoneyCog    | 4        | Marie Curie       | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Marie Curie       |
      | Screenable  | 2        | Rachel Carson     | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Rachel Carson     |
      | Familybea   | 3        | Katherina Johnson | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Katherina Johnson |
      | Familybea   | 1        | Marry Anning      | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Marry Anning      |
      | Screenable  | 2        | Lise Meitner      | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Lise Meitner      |

    Examples: Famous male scientist
      | productType | quantity | customerName | street            | city   | state   | zipcode | cardType | cardNumber       | expiryDate | expectedName |
      | Familybea   | 2        | Tom Brady    | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Tom Brady    |
      | MoneyCog    | 4        | Steve Jobs   | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Steve Jobs   |
      | Screenable  | 2        | Bill Gates   | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Bill Gates   |
      | Familybea   | 3        | Elon Musk    | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Elon Musk    |
      | Familybea   | 1        | Kanye West   | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Kanye West   |
      | Screenable  | 2        | Andrew Tate  | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Andrew Tate  |

