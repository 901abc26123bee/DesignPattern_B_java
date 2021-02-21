package com.interpreter;

import java.util.HashMap;
// 抽象的運算符解釋器，這裡，每個運算符號，都只和自己左右兩個數字有關
// 但左右兩個數字有可能也是一個解析的結果
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}