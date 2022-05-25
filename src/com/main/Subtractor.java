package com.main;

public class Subtractor extends CalculateBase{

    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        this.setResult(this.getLeftVal() - this.getRightVal());
       // System.out.println("result = "+ this.getResult());
    }
}