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
    * Enter "<e-mail>"
    * Enter phone
    * Press continue button and quit

    Examples:
    |e-mail|
    |birol.cetin@example.com|
    |disposable.style.email.with+symbol@example.com|
    |other.email-with-dash@example.com|
    |fully-qualified-domain@example.com|
    |x@example.com|
    |example-indeed@strange-example.com|
    |example@s.solution|
    |admin@mailserver1|
    |user@localserver|
    |user@[IPv6:2001:DB8::1]|
    |user@tt|


