Feature: Addition

  Scenario: Addition of two numbers
    Given I have two numbers "98" & "12"
    When I do Addition
    Then Result should display in console
    
 Scenario: Addition of two numbers with List
    Given I have two numbers as below list
    | 8 |
    | 9 |
    When I do Addition
    Then Result should display in console
    
Scenario: Addition of two numbers with Map
    Given I have two numbers as below map
    |num1 |  8 |
    |num2 | 10 |
    When I do Addition
    Then Result should display in console
    
 

 