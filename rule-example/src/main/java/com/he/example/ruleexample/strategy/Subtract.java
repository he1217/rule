package com.he.example.ruleexample.strategy;

/**
 *  @ClassName Subtract
 *  @Description Subtract
 *  @author he.xuelong
 *  @Date 2020年03月12日 18:33
 * 
 */
public class Subtract implements Strategy {
    @Override
    public int handleNumber(int a, int b) {
        return a - b;
    }
}
