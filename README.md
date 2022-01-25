![Logo](https://www.browserstack.com/images/static/header-logo.jpg)

# BrowserStack Examples App Automate Cucumber TestNG <a href="https://cucumber.io"><img src="https://brandslogos.com/wp-content/uploads/images/large/cucumber-logo.png" alt="Cucumber" height="22" /></a> <a href="https://testng.org/"><img src="https://e7.pngegg.com/pngimages/640/776/png-clipart-testng-logo-software-testing-software-framework-computer-icons-automation-testing-angle-text.png" alt="TestNG" height="22" /></a>

## Introduction

TestNG is a testing framework designed to simplify a broad range of testing needs, from unit testing (testing a class in isolation of the others) to integration testing (testing entire systems made of several classes, several packages and even several external frameworks, such as application servers). Cucumber is a software tool that supports behavior-driven development (BDD).

This BrowserStack Example repository demonstrates an Appium test framework written in Cucumber and TestNG with parallel testing capabilties, thereby showcasing the prowess of Selenium Webdriver-Core Framework.

## About the tests in this repository

This repository contains the following Appium tests:

Feature name                          | Description |
| ---                                   | --- | 
| Login with credentials                | This scenario verifies a login scenario with a given set of username and password. |
| BrowserStack Echo          | This scenario displays the text entered and it asserts true. |
| BrowserStack Echo Fail            | This scenario displays the text entered and it asserts false. | 

All the above scenarios demonstrate a [Page Object Model](https://www.browserstack.com/guide/page-object-model-in-selenium) design pattern.

# BrowserStack

[BrowserStack](https://browserstack.com) provides instant access to 2,000+ real mobile devices and browsers on a highly reliable cloud infrastructure that effortlessly scales as testing needs grow.

## Prerequisites

- Create a new [BrowserStack account](https://www.browserstack.com/users/sign_up) or use an existing one.
- Identify your BrowserStack username and access key from the [BrowserStack App Automate Dashboard](https://app-automate.browserstack.com/) and export them as environment variables using the below commands.

  - For Unix based and Mac machines:

  ```sh
  export BROWSERSTACK_USERNAME=<browserstack-username> &&
  export BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
  ```

  - For Windows:

  ```shell
  set BROWSERSTACK_USERNAME=<browserstack-username>
  set BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
  ```
- Upload your Android/iOS app to BrowserStack using the REST API as mentioned [here](https://www.browserstack.com/docs/app-automate/api-reference/appium/apps#upload-an-app).

## Configuration

This repository allows you to to use configuration files similar to the following to run your Appium tests on various platforms including on-premise devices, devices running on an on-prem grid or remote Selenium/Appium grid.

```yml
{
  "user": "BROWSERSTACK_USERNAME",
  "key": "BROWSERSTACK_ACCESS_KEY",
  "app.android": "bs://70fe59dbec1c8e49cb21d201fae3b81e82d21570",
  "app.ios": "bs://468f88f2107a3d846cca71d4dbb4fdfc763da3f6",
  "app.local": "bs://468f88f2107a3d846cca71d4dbb4fdfc763da3f6",
  "platformName": "iOS",
  "deviceName": "iPhone 13",
  "platformVersion": "15.2",
  "automationName": "SampleTest",
  "tests": {
    "parallel": {
      "common_caps": {
        "project": "browserstack-examples",
        "build": "browserstack-examples-testNG",
        "name": "Parallel Test",
        "browserstack.debug": "true",
        "browserstack.networkLogs": "true",
        "browserstack.console": "verbose"
      },
      "env_caps": [
        {
          "device": "Samsung Galaxy S21",
          "platformName": "Android",
          "os_version": "11.0",
          "autoGrantPermissions": "true",
          "gpsEnabled": "true"
        },
        {
          "device": "iPhone 12 Pro",
          "platformName": "iOS",
          "os_version": "14",
          "gpsEnabled": "true"
        }
      ]
    }
    

```

## Running Your Tests

### Run a tests on BrowserStack

Please make sure that the following keys are set in the ```test_caps.json``` config file. 

The above is just an example. You can use any of hash ID or custom ID or shareable ID for your Android/iOS app. If you were to use all three (for the same app), then hash ID will be given precedence. 


Maven:
  ```sh
  mvn clean test -P bstack-parallel
  ```
  
- Output

  This executes all the scenarios in parallel on both Android and iOS devices on BrowserStack. Please refer to your [BrowserStack dashboard](https://app-automate.browserstack.com/) for test results.




