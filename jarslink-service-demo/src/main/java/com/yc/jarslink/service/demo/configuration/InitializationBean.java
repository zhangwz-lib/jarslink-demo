package com.yc.jarslink.service.demo.configuration;

import com.alipay.jarslink.api.ModuleLoader;
import com.alipay.jarslink.api.ModuleManager;
import com.alipay.jarslink.api.impl.AbstractModuleRefreshScheduler;
import com.alipay.jarslink.api.impl.ModuleLoaderImpl;
import com.alipay.jarslink.api.impl.ModuleManagerImpl;
import com.yc.jarslink.service.demo.modelmanager.ModuleRefreshSchedulerImpl;
import org.springframework.context.annotation.Bean;

//@Configuration
public class InitializationBean {

    /**
     * 模块加载引擎
     *
     * @return
     */
    @Bean
    ModuleLoader initializationModuleLoader() {
        return new ModuleLoaderImpl();
    }


    /**
     * 模块管理引擎
     *
     * @return
     */
    @Bean
    ModuleManager initializationModuleManager() {
        return new ModuleManagerImpl();
    }


    @Bean
    AbstractModuleRefreshScheduler initializationModuleRefreshScheduler(ModuleLoader moduleLoader, ModuleManager moduleManager) {
        return new ModuleRefreshSchedulerImpl(moduleLoader, moduleManager);
    }

}