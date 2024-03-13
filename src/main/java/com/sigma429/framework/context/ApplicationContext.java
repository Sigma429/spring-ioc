package com.sigma429.framework.context;

import com.sigma429.framework.beans.factory.BeanFactory;

/**
 * ClassName:ApplicationContext
 * Package:com.sigma429.framework.context
 * Description:定义非延时加载功能
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/13 - 20:24
 * @Version:v1.0
 */
public interface ApplicationContext extends BeanFactory {
    void refresh() throws Exception;
}
