package com.yc.jarslink.service.demo.load;

import com.alipay.jarslink.api.Module;
import com.alipay.jarslink.api.ModuleLoader;
import com.alipay.jarslink.api.ModuleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import static com.yc.jarslink.service.demo.modelmanager.ModuleRefreshSchedulerImpl.buildModuleConfig;

@Service
public class LoadModule {

    @Autowired
    ModuleLoader moduleLoader;

    @Autowired
    ModuleManager moduleManager;

    @PostConstruct
    public void init() {
        start();
    }

    public void start() {
     //   Module module = moduleLoader.load(buildModuleConfig());
      //  moduleManager.register(module);
       // moduleManager.
      //  moduleLoader.
        System.out.println("=================++++++++++++++++");
    }
}