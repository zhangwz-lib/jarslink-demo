package com.yc.jarslink.service.demo.test;

import com.alipay.jarslink.api.Action;
import com.alipay.jarslink.api.Module;
import com.alipay.jarslink.api.ModuleConfig;
import com.alipay.jarslink.api.ModuleManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JarslinkServiceTest {
    @Autowired
    ModuleManager moduleManager;

    @Test
    public void jarslinkServiceTest() {
        // Module module = new Mo
        Module findModule = moduleManager.find("demo");
        Map<String, Action> actions = findModule.getActions();
        Assert.assertNotNull(findModule);
        moduleManager.remove("demo");
        Module findModule2 = moduleManager.find("demo");
        Assert.assertNotNull(findModule2);
//查找和执行Action
        String actionName = "DemoAction";
        //    ModuleConfig moduleConfig = new ModuleConfig();
        //  moduleConfig.setEnabled(true);
        // moduleConfig.set
        String o = (String)findModule.doAction("DemoAction", "test");
        System.out.println(o);

    }
}