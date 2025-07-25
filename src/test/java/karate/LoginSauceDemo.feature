Feature: tests auto sur Login to SauceDemo

  Background:
        * configure driver = { headless: false, screenshotOnEveryStep: true, type: 'chromium' }


  Scenario: Scenar01 - Successful login
    Given driver 'https://www.saucedemo.com/'
    And input("input[data-test='username']", "standard_user")
    And input("input[data-test='password']", "secret_sauce")
    And click("input[data-test='login-button']")
    Then waitFor("div.inventory_list")
    And match driver.url contains '/inventory.html'
    * driver.quit()