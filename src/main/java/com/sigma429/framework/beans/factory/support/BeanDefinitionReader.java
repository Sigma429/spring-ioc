package com.sigma429.framework.beans.factory.support;

/**
 * ClassName:BeanDefinitionReader
 * Package:com.sigma429.framework.beans.factory.support
 * Description:用来解析配置文件的，而该接口只是定义了规范
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/13 - 19:42
 * @Version:v1.0
 */
public interface BeanDefinitionReader {
    // 获取注册表对象
    BeanDefinitionRegistry getRegistry();

    // 加载配置文件并在注册表中进行注册
    void loadBeanDefinitions(String configLocation) throws Exception;
}
