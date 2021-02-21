package com.composite;

import java.util.ArrayList;
import java.util.List;

 public class College extends OrganizationComponent {
    List<OrganizationComponent> organizationComponentLists = new ArrayList<>();

    //構造器
    public College(String name, String des) {
        super(name, des);
    }

    @Override
    // 實際開發業務中，College 的 add 和 University 的 add不一定完全一樣
    protected void add(OrganizationComponent organizationComponent) {
        super.add(organizationComponent);
        organizationComponentLists.add(organizationComponent);

    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        super.remove(organizationComponent);
        organizationComponentLists.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "--------------");
          //遍歷 organizationComponentLists
        for (OrganizationComponent organizationComponent : organizationComponentLists) {
            organizationComponent.print(); }
    }
}
