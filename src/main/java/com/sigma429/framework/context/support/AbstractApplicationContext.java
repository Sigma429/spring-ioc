package com.sigma429.framework.context.support;

import com.sigma429.framework.beans.factory.support.BeanDefinitionReader;
import com.sigma429.framework.beans.factory.support.BeanDefinitionRegistry;
import com.sigma429.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:AbstractApplicationContext
 * Package:com.sigma429.framework.context.support
 * Description: ApplicationContext接口的子实现类，用于立即加载
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/13 - 20:26
 * @Version:v1.0
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    // 声明解析器变量
    protected BeanDefinitionReader beanDefinitionReader;

    // 定义用于存储bean对象的map容器
    protected Map<String, Object> singletonObjects = new HashMap<String, Object>();

    // 声明配置文件路径的变量
    protected String configLocation;

    @Override
    public void refresh() throws Exception {
        // 加载BeanDefinition对象
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        // 初始化bean
        finishBeanInitialization();
    }

    // bean的初始化
    private void finishBeanInitialization() throws Exception {
        // 获取注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();

        // 获取BeanDefinition对象
        String[] beanNames = registry.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            // 进行bean的初始化
            getBean(beanName);
        }
    }
}
