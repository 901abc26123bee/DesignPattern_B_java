package com.interpreter;

import java.util.HashMap;

public class AddExpression extends SymbolExpression {


    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
    	// var 就是 {a=10 b=20}
        int res = super.left.interpreter(var) + super.right.interpreter(var);
        return res;
    }
}
