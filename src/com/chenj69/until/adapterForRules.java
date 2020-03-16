package com.chenj69.until;

import com.chenj69.service.studentRule;
// 适配器设计模式特征
//1） 使用抽象类分离接口与 实现类
// 2) 抽象类分摊接口中常用的方法
// 3) 是的接口实现类，可以随意选择接口中的方法类
// 用抽象类 实现 接口类中的一部分method， 降低实现类 的实现难度
public abstract class adapterForRules implements studentRule {
    @Override
    public void signAfterTest() {
        System.out.println("sign in by father");
    }
}
