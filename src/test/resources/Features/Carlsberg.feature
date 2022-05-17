Feature: To verify the Invesment Calculator operations in carlsberg application

  Scenario: To check the dividend calculator operations
    Given The user should be in invesment page of carlsberg application 
    Then Make sure the user is in the Carlsberg homepage
    When User goto investment relations option and select the sub option investment calculator
    And User should select the dividend calculator option
    And Fill all the required datas and click calculate button
    Then User should view the calculated results
