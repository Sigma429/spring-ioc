package com.sigma429.framework.beans.factory.support;

import com.sigma429.framework.beans.BeanDefinition;

/**
 * ClassName:BeanDefinitionRegistry
 * Package:com.sigma429.framework.beans.factory.support
 * Description:注册表对象
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/13 - 19:32
 * @Version:v1.0
 */
public interface BeanDefinitionRegistry {
    // 注册BeanDefinition对象到注册表中
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    // 从注册表中删除指定名称的BeanDefinition对象
    void removeBeanDefinition(String beanName) throws Exception;

    // 根据名称从注册表中获取BeanDefinition对象
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount();

    String[] getBeanDefinitionNames();
}
