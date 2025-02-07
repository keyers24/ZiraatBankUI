@IbanCalculation
Feature:Iban Calculation
  Scenario Outline: Iban Calculation
    Given Navigate To Website
    When  Go to iban calculation page
    And   Sorted by name
    And   "<branch>" selection is made
    And   "<customerNo>" is entered
    And   "<ekNo>" entered
    And   The entered values for iban are calculated
    Then  Check the result

    Examples:
      |branch|customerNo|ekNo|
      |abana|132132132|1321|
