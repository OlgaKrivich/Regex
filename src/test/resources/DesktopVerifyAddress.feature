@Regression
Feature: Desktop Checkout for Guest User
  As a customer
  I want to be able proceed to Contact us page
  So that I can verify the address

  Scenario: Proceed to Contact us page, final review the address

    Given Open Epam home page
    When Proceed to Contact us page
    Then I verify the following address
      | Country       | USA              |
      | Postal code   | PA 18940         |
      | City          | Newtown          |
      | Street name   | University Drive |
      | Street number | 41               |
      | Office        | 202              |