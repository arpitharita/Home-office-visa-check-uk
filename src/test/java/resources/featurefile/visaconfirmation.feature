Feature: VisaConfirmation

  As user I want apply for Visa

  Scenario: An Australian Come in To UK For Tourism
    Given I am on Home Page
    When  I click on Start button
    And   I select a Nationality "Australia"
    And   I click on continue button
    And   I select reason Tourism "Tourism or visiting family and friends"
    And   I click on continue button
    Then  I verify result "You will not need a visa to come to the UK"

  Scenario: aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths

    Given I am on Home Page
    When  I click on Start button
    And   I select a Nationality "Chile"
    And   I click on continue button
    And   I select reason work "Work, academic visit or business"
    And   I click on continue button
    And   Select intendent to stay for "longer than 6 months"
    And   I click on continue button
    And   I select have planning to work for "Health and care professional"
    And   I click on continue button
    Then  I verify resultfirst "You need a visa to work in health and care"

    Scenario: aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArti cle10Or20Card
      Given I am on Home Page
      When  I click on Start button
      And   I select a Nationality "Colombia"
      And   I click on continue button
      And   I select reason join "Join partner or family for a long stay"
      And   I click on continue button
      And   I select state My partner of family member have uk immigration status "yes"
      And   I click on continue button
      Then  I verify resultsec"You’ll need a visa to join your family or partner in the UK"












