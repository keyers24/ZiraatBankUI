@LoanCalculation
Feature:Loan Calculation
  @ConsumerLoan
  Scenario Outline: Consumer Loan Calculation
    Given Navigate to website
    When  Click on the consumer loan button
    And   The credit option is defined as a consumer loan
    And   Enter the "<amount>" information
    And   Enter the "<maturity>" date information
    And   Enter the "<interest>" rate
    And   Entered values are calculated
    Then  Values are verified

    Examples:
      |amount|maturity|interest|
      |1000000|12      |4.00    |


  @VehicleLoan
  Scenario Outline: Vehicle Loan Calculation
    Given Navigate to website
    When  Click on the vehicle loan button
    And   The credit option is defined as a vehicle loan
    And   Enter the "<amount>" information
    And   Enter the "<maturity>" date information
    And   Enter the "<interest>" rate
    And   Entered values are calculated
    Then  Values are verified

    Examples:
      |amount|maturity|interest|
      |200000|24      |5.00    |

  @HousingLoan
  Scenario Outline: Housing Loan Calculation
    Given Navigate to website
    When  Click on the housing loan button
    And   The credit option is defined as a housing loan
    And   Enter the "<amount>" information
    And   Enter the "<maturity>" date information
    And   Enter the "<interest>" rate
    And   Entered values are calculated
    Then  Values are verified

    Examples:
      |amount|maturity|interest|
      |5000000|36      |5.00    |