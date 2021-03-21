Feature: Login to Happy for parents as generic parent

  As generic parent
  I must be able to
  Login to Happy for parents
	
  Scenario: Login to happy for parents with email
    Given I am on the happy for parents page
    When I login with email
    Then I should see the happy home page