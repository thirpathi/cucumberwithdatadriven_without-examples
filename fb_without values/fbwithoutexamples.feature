Feature: Automation of facebook 

Scenario: facebook login page with valid credentials

			Given User open chrome browser
			When  Enter valid "siri.sirisha.m@gmail.com" and "141001410"
			Then Open user account sucessfully
			Then logout user account
			And  close browser
