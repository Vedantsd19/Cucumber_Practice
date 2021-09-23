
Feature: Download Page

Scenario: Verification of download page link
	Given User is on home page of selenium
	When User clicks on the download link
	Then Title should be "Downloads | Selenium"