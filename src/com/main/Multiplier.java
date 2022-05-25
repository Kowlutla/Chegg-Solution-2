package com.main;

public class Multiplier extends CalculateBase{

    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        this.setResult(this.getLeftVal() * this.getRightVal());
       // System.out.println("result = "+ this.getResult());
    }
}

