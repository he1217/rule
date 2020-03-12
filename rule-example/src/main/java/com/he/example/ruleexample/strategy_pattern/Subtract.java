package com.he.example.ruleexample.strategy_pattern;

public class Subtract implements Strategy {
    @Override
    public int handleNumber(int a, int b) {
        return a - b;
    }
}
