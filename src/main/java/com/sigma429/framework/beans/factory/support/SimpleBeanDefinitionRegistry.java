package com.sigma429.framework.beans.factory.support;

import com.sigma429.framework.beans.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:SimpleBeanDefinitionRegistry
 * Package:com.sigma429.framework.beans.factory.support
 * Description:注册表接口的子实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/13 - 20:05
 * @Version:v1.0
 */
public class SimpleBeanDefinitionRegistry implements BeanDefinitionRegistry {
    // 定义一个容器，用来存储BeanDefinition对象
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<String, BeanDefinition>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public void removeBeanDefinition(String beanName) throws Exception {
        beanDefinitionMap.remove(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws Exception {
        return beanDefinitionMap.get(beanName);
    }

    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    public int getBeanDefinitionCount() {
        return beanDefinitionMap.size();
    }

    public String[] getBeanDefinitionNames() {
        return beanDefinitionMap.keySet().toArray(new String[0]);
    }
}
