Feature: Login Vodafone portal

  Background: 
    Given I open the "vodafone_portal" url
	Then I validate the "page title" in "login" page

  Scenario: Login vodafone portal  	
  	When I login the page
  	Then I validate the "welcome message" in "home" page 