Feature: SmartBear order process

  User story #TC4
  As a user, when I am on the SmartBear order page I should be able to make order


  Scenario Outline: User fills out the form as followed:
    Given User is on SmartBear Login page
    When User enters "<username>" to Username
    And User enters "<password>" to Password
    And User clicks Login button
    And User clicks Order link
    And User selects "<product>" from select dropdown
    And User enters "<quantity>" to quantity
    And User enters "<customerName>" to customer name
    And User enters "<street>" to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enters "<zipcode>" to zipcode
    And User selects "<cardType>" as card type
    And User enters "<cardNumber>" to card number
    And User enters "<expirationDate>" to expiration date
    And User clicks process button
    Then User verifies "<expectedName>"  is in the list

    Examples:
      | username | password | product     | quantity | customerName  | street          | city           | state | zipcode | cardType         | cardNumber       | expirationDate | expectedName  |
      | Tester   | test     | MyMoney     | 1        | Maria Lusia   | 23 oak ave      | Los Angeles    | CA    | 18765   | visa             | 1234123412341234 | 12/23          | Maria Lusia   |
      | Tester   | test     | FamilyAlbum | 3        | Mike Lapenta  | 113 pebble dr   | Rehoboth Beach | DE    | 19971   | Mastercard       | 2334341234123414 | 05/22          | Mike Lapenta  |
      | Tester   | test     | ScreenSaver | 9        | Irina Kurkina | 24634 connie dr | Lewes          | DE    | 19958   | American Express | 7843412341234787 | 07/25          | Irina Kurkina |