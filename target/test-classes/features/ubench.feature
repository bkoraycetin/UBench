@test
Feature:
  Scenario Outline:
    * Go to homepage
    * Enter valid license plate "HLY1189"
    * Press continue button
    * Enter a location
    * Select date of accident
    * Select Time of accident
    * Press continue button
    * Enter name
    * Enter lastname
    * Enter invalid "<e-mail>"
    * Enter phone
    * Press continue button

    Examples:
    |e-mail|
