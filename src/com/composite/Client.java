package com.composite;

public class Client {
    public static void main(String[] args) {
        //從大到小創建對象 學校
        OrganizationComponent university = new University("清華大學", " 頂級大學 ");
         //創建 學院
        OrganizationComponent computerCollege = new College("理工學院", " 理工工學院 ");
        OrganizationComponent infoEngineercollege = new College("資訊工程學院", " 資訊工程學院 ");
         //創建各個學院下面的系(專業)
        computerCollege.add(new Department("軟體工程", " 軟體工程不錯 "));
        computerCollege.add(new Department("網絡工程", " 網絡工程不錯 "));
        computerCollege.add(new Department("計算機科學與技術", " 計算機科學與技術是老牌的專業 "));
        //
        infoEngineercollege.add(new Department("通信工程", " 通信工程不好學 "));
        infoEngineercollege.add(new Department("信息工程", " 信息工程好學 "));
        //將學院加入到 學校
        university.add(computerCollege);
        university.add(infoEngineercollege);

        university.print();
        System.out.println("*************************");
        computerCollege.print();
    }
}