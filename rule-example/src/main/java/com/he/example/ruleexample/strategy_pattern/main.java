package com.he.example.ruleexample.strategy_pattern;

public class main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new Subtract());
        System.out.println(context.handNumber(5, 4));
    }
}
