package com.sigma429.framework.beans.factory;

/**
 * ClassName:BeanFactory
 * Package:com.sigma429.framework.beans.factory
 * Description:IOC容器父接口
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/13 - 20:21
 * @Version:v1.0
 */
public interface BeanFactory {
    // 根据bean对象的名称获取bean对象
    Object getBean(String name) throws Exception;

    // 根据bean对象的名称获取bean对象，并进行类型转换
    <T> T getBean(String name, Class<? extends T> clazz) throws Exception;
}
