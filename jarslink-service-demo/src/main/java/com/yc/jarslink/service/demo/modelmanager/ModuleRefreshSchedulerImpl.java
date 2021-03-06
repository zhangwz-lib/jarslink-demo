package com.yc.jarslink.service.demo.modelmanager;

import com.alipay.jarslink.api.ModuleConfig;
import com.alipay.jarslink.api.ModuleLoader;
import com.alipay.jarslink.api.ModuleManager;
import com.alipay.jarslink.api.impl.AbstractModuleRefreshScheduler;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

//@Service
public class ModuleRefreshSchedulerImpl extends AbstractModuleRefreshScheduler {

    public ModuleRefreshSchedulerImpl(ModuleLoader moduleLoader, ModuleManager moduleManager) {
        super();
        super.setModuleLoader(moduleLoader);
        super.setModuleManager(moduleManager);
    }

    @Override
    public List<ModuleConfig> queryModuleConfigs() {
        return ImmutableList.of(ModuleRefreshSchedulerImpl.buildModuleConfig());
    }

    public static ModuleConfig buildModuleConfig() {
        URL test = null;
        try {
            test = new URL("file", null, -1, "/C:/Users/yxj/Desktop/jarslink-module-demo-1.0.0.jar", null);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        ModuleConfig moduleConfig = new ModuleConfig();
        moduleConfig.setName("demo");
        moduleConfig.setEnabled(true);
        moduleConfig.setVersion("1.0.0.20170621");
        moduleConfig.setProperties(ImmutableMap.of("svnPath", new Object()));
        moduleConfig.setModuleUrl(ImmutableList.of(test));
        return moduleConfig;
    }
}