package com.prototype;


public class Clinet_proto {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "向花";
        p.deepCloneableTarget = new DeepCloneableTarget("大熊","大熊的類");

        // 深拷貝 -方式1 使用clone方法
        DeepProtoType p2 = (DeepProtoType) p.clone();

        System.out.println("p.name=" + p.name + "  p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p.name + "  p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
        
        System.out.println("--------------------");
        // 深拷貝-方式2 通過對象的序列化實現（推薦）
        DeepProtoType p3 = (DeepProtoType) p.deepClone();
        p.name = "小智";

        System.out.println("p.name=" + p.name + "  p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p3.name + "  p2.deepCloneableTarget=" + p3.deepCloneableTarget.hashCode());
    }
}