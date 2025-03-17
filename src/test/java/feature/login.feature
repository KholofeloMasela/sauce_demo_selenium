Feature: LoggedIn user

  Scenario Outline: Validate user is able to login
    Given User navigates to login page
    When User successfully enters credentials "<username>" and "<password>"
    Then user should be able to view product page

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
#      |Adlocked_out_usermin  |secret_sauce
#      |problem_user  |secret_sauce
#      |performance_glitch_use  |secret_sauce
#      |error_user  |secret_sauce
