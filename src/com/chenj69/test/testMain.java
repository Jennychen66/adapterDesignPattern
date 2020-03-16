package com.chenj69.test;

import com.chenj69.service.studentRule;
import com.chenj69.serviceImpl.smallStudent;
// this is the test project learning from kaikeba (Mybatis 框架中常见设计模式讲解01)
public class testMain {
    public static void main(String[] args){
        studentRule mike = new smallStudent();
        mike.watchMovie();
        mike.signAfterTest();
    }
}
