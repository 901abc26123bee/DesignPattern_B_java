package com.template;

/**
 * 模板方法
 */
public abstract class SoyaMilk {

    //模板方法, make , 模板方法可以做成final , 不讓子類去覆蓋.
    final void make() {
        select();
        if (customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    void beat() {
        System.out.println("第四步：黃豆和配料放到豆漿機去打碎 ");
    }

    void soak() {
        System.out.println("第三步， 黃豆和配料開始浸泡， 需要3小時 ");
    }

    //添加不同的配料， 抽象方法, 子類具體實現
    abstract void addCondiments();

    protected boolean customerWantCondiments() {
        return true;
    }

    void select() {
        System.out.println("第一步：選擇好的新鮮黃豆 ");
    }
}