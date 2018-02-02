package com.github.linshuguang.service.impl;

import name.lsg.service.DemoService;

/**
 * Created by kenya on 2018/2/2.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String who) {
        return "hello " + who;
    }

}
