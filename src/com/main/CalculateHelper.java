package com.main;

public class CalculateHelper {

	// properties
	private double leftValue;
	private double rightValue;
	private double result;
	private MathCommand command;

	// process method takes string as input
	public void process(String input) {
		// split the input string with space and store in array
		String[] args = input.split(" ");

		// Deciding MathCommand type based on first word of input string
		switch (args[0]) {
		case "divide":
			command = MathCommand.Divide;
			break;
		case "add":
			command = MathCommand.Add;
			break;
		case "subtract":
			command = MathCommand.Subtract;
			break;
		case "multiply":
			command = MathCommand.Multiply;
			break;
		}

		// consider second word as leftvalue and 3rd word as rightvalue
		leftValue = Double.parseDouble(args[1]);
		rightValue = Double.parseDouble(args[2]);

		// Create CalculateBase object based on MathCommand
		CalculateBase cb = null;
		if (command == MathCommand.Add) {
			cb = new Adder(leftValue, rightValue);
		} else if (command == MathCommand.Subtract) {
			cb = new Subtractor(leftValue, rightValue);
		} else if (command == MathCommand.Multiply) {
			cb = new Multiplier(leftValue, rightValue);
		} else if (command == MathCommand.Divide) {
			cb = new Divider(leftValue, rightValue);
		}

		// calling calculate method
		cb.calculate();
		// getting result value
		this.result = cb.getResult();
	}

	// toString method
	public String toString() {
		String operator = "";
		// deciding which operator should print between leftvalue and rightvalue
		if (command == MathCommand.Add) {
			operator = "+";
		} else if (command == MathCommand.Subtract) {
			operator = "-";
		} else if (command == MathCommand.Multiply) {
			operator = "*";
		} else if (command == MathCommand.Divide) {
			operator = "/";
		}

		return this.leftValue + " " + operator + " " + this.rightValue + " = " + this.result;
	}
}
