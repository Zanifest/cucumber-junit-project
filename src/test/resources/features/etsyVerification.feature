@Regression
Feature: etsy webpage

  Background:
    Given user is on etsy web page


    Scenario: etsy title verification
      Then user should see Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

    Scenario: etsy search functionality
      When user types Wooden spoon in search box and clicks search button
      Then user sees Wooden spoon is in the title
    @etsyStep
    Scenario: etsy search functionality with parameterization
      When user types "Wooden spoon" in search box and clicks search button
      Then user sees "Wooden spoon" is in the title