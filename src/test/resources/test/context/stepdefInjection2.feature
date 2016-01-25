Feature: StepDef injection2


Background:
	Given the StepDef injection works

  @RequiresBrowser
  Scenario Outline: StepDef injection2
    Given the StepDef injection2 <status>
    Given the StepDef injection3 <status>
    
  Examples:
	 |status	|
	 |works		|
    