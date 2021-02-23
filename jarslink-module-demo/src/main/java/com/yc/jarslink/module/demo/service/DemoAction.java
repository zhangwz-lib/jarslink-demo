package com.yc.jarslink.module.demo.service;

import com.alipay.jarslink.api.Action;


public class DemoAction implements Action<String, String> {
    @Override
    public String execute(String actionRequest) {

        return actionRequest;
    }

    @Override
    public String getActionName() {
        return "DemoAction";
    }

    public void actionTest() {
        System.out.println("==============================");
    }

}