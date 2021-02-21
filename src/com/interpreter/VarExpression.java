package com.interpreter;

import java.util.HashMap;
// 變量解釋器
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    // var 就是 {a=10 b=20}
    // interpreter 根據變量名稱返回對應值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        // interpreter 根据 变量名称，返回对应值
        return var.get(key);
    }
}