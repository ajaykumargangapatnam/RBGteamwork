Feature: OpenStore LoginCases

Scenario: User Login in OpenStore
  
   Given User Open Chrome Browser
   When  User Opens URL "https://demo.opencart.com/"
   Then  User click on MyAccount
   And   User Click Login
   When  Enter UserName "demo" and Password "demo"
   Then  Click on Loginbutton
   And   Close The browser