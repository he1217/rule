package com.he.example.ruleexample.strategy;

/**
 *  @ClassName main
 *  @Description main
 *  @author he.xuelong
 *  @Date 2020年03月12日 18:32
 * 
 */
public class main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new Subtract());
        System.out.println(context.handNumber(5, 4));
    }
}
