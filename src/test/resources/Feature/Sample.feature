Feature: Test the Jpet application
#
  #Scenario: login the application
    #Given User get the title
    #When User should enter the username
    #And User should enter the password
    #Then User should login the application
#
  #Scenario: Choose the fish
    #Given User launch the url
    #When User choose the fish
    #Then User should choose the product
#
  #Scenario: Choose the Dog
    #Given User get the current url
    #When User choose the Dos
    #Then User should choose the Dog
#
  #Scenario: Choose the Cats
    #Given User Get the url
    #When User choose the Cats
    #Then User should choose the Cat
#
  #Scenario: Choose the Reptiles
    #Given User Get the title and url
    #When User choose the Reptiles
    #Then User should choose the Reptiles
#
  #Scenario: Choose the Birds
    #Given User should get the title
    #When User choose the Birds
    #Then User should choose the Birds
#
  #Scenario: Add the fish to cart
    #Given User get the title for the application
    #When User choose the fish in the front page
    #Then User should choose add the fish to cart
#
  #Scenario: Add the Dog to cart
    #Given User launch the application
    #When User choose the Dog in the front page
    #Then User should choose add the Dog to cart
#
  #Scenario: Add the Cats to cart
    #Given User launching the url
    #When User choose the Cats in the front page
    #Then User should add the cat to cart
#
  #Scenario: Add the Reptiles to cart
    #Given User launch the url app
    #When User choose the Reptiles in the front page
    #Then User should add the Reptiles to cart
#
  #Scenario: Add the Birds to cart
    #Given User launching the application url
    #When User choose the Birds in the front page
    #Then User should add the Birds to cart
#
  Scenario: Remove the fish to cart
    Given Choose the fish to cart
    When User Add the fish to cart
    Then User Remvoe the fish to cart

  Scenario: Remove the Dog to cart
    Given Choose the Dog to cart
    When User Add the Dog to cart
    Then User Remvoe the Dog to cart

  Scenario: Remove the Cat to cart
    Given Choose the Cat to cart
    When User Add the Cat to cart
    Then User Remvoe the Cat to cart

  Scenario: Remove the Reptiles to cart
    Given Choose the Reptiles to cart
    When User Add the Reptiles to cart
    Then User Remvoe the Reptiles to cart

  Scenario: Remove the Birds to cart
    Given Choose the Birds to cart
    When User Add the Birds to cart
    Then User Remvoe the Birds to cart

  Scenario: search the fish
    Given Launch the app
    When Enter the fish name
    Then click the search button

  Scenario: search the Dog
    Given Launch the jpet app
    When Enter the Dog name
    Then click the search

  Scenario: search the cat
    Given Launch the pet app
    When Enter the Cat name
    Then click the search the

  Scenario: Search the Reptiles
    Given Launch the pet application
    When Enter the Reptiles name
    Then click search button

  Scenario: Search the Birds
    Given Launch the Jpet application
    When Enter the Birds name
    Then click search button
