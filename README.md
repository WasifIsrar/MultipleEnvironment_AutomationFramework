When we have multiple environments to run our tests on. We need to pass values for that respective environment dynamically. We can use properties file to store that data in respective environment file. To get that data we use Owner Library to Set that value to a variable and then get that value.
We use TestNG to run our tests by passing environment as a parameter either through TestNg.xml file or maven command.

The Action is written to take environment as an argument as a choice parameter and pass that to maven command. Execute the action to see the output as PIN IS: 6 digit pin for respective environment
