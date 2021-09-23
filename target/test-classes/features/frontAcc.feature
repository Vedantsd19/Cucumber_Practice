Feature: login Functionality

  Scenario Outline: To do data driven testing on yopur Login Functionality
    Given User is on login page

    When user enters username as "<userName>" & password as "<passWord>"
    Then login "<loginType>" be happen
  
  Examples:
  |userName  | passWord | loginType |
  |demouser  | password | should    |
  |admin     | admin123 | should not|
  |hr        | hr123    | should    |
