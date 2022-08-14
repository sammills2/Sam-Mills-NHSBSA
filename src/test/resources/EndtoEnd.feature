Given I navigate to the landing page
And I click Start now
And I select 'wales' as the country I live in
And I click next

Scenario: GP in Wales
  And I enter 'yes' to is your GP is in Scotland or Wales
  And I click next
  And I enter 'england' to which country is your dental practice in?
  And I click next
  And I enter '01/01/2000' as my date of birth
  And I click next
  And I enter 'yes' to do you live with a partner?
  And I click next
  And I enter 'yes' to do you or your partner claim any benefits or tax credits?
  And I click next
  And I enter 'yes, we receive Universal Credit payments' to do you or your partner get paid Universal Credit?
  And I click next
  And I enter 'yes' to as part of your joint Universal Credit, do you have any of these?
  And I click next
  And I enter 'yes' to did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period?
  And I click next
  Then free 'NHS prescriptions' is displayed
  Then free 'NHS dental check-ups and treatment' is displayed
  Then free 'sight tests' is displayed
  Then free 'NHS wigs and fabric supports' is displayed
  Then money off 'new glasses or contact lenses' is displayed
  Then money off 'repairing or replacing your glasses or contact lenses' is displayed
  Then money off 'travel for NHS treatment' is displayed
  Then you could get as part of the Healthy Start scheme '£4.25 each week of your pregnancy from the 10th week' is displayed
  Then you could get as part of the Healthy Start scheme '£8.50 each week for children from birth to 1 year old' is displayed
  Then you could get as part of the Healthy Start scheme '£4.25 each week for children between 1 and 4 years old' is displayed


Scenario: GP not in scotwales
  #under 16
  #no partner
  #no benefits or tax credits
  #no universal credits
  #no to any of these
  #no combined pay
  #no pregnancy
  #no injury or illness
  #no diabetes
  #no glaucoma
  #no care home
  #no care home help

  #then prescriptions, checkups, sight tests, wigs are/n't free
  #money off new glasses, repairs, travel
  #could get pregnancy 10th week, 1 year, 1 to 4 years