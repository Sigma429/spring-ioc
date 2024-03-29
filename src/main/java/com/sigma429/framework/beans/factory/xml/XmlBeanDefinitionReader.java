package com.sigma429.framework.beans.factory.xml;

import com.sigma429.framework.beans.BeanDefinition;
import com.sigma429.framework.beans.MutablePropertyValues;
import com.sigma429.framework.beans.PropertyValue;
import com.sigma429.framework.beans.factory.support.BeanDefinitionReader;
import com.sigma429.framework.beans.factory.support.BeanDefinitionRegistry;
import com.sigma429.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * ClassName:XmlBeanDefinitionReader
 * Package:com.sigma429.framework.beans.factory.xml
 * Description:针对xml配置文件进行解析的类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/13 - 20:15
 * @Version:v1.0
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {
    // 声明注册表对象
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        // 使用dom4j进行xml配置文件的解析
        SAXReader reader = new SAXReader();
        // 获取类路径下的配置文件
        InputStream is = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        Document document = reader.read(is);
        // 根据Document对象获取根标签对象 (beans)
        Element rootElement = document.getRootElement();
        // 获取根标签下所有的bean标签对象
        List<Element> beanElements = rootElement.elements("bean");
        // 遍历集合
        for (Element beanElement : beanElements) {
            // 获取id属性
            String id = beanElement.attributeValue("id");
            // 获取class属性
            String className = beanElement.attributeValue("class");

            // 将id属性和class属性封装到BeanDefinition对象中
            // 1，创建BeanDefinition
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);

            // 创建MutablePropertyValues对象
            MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();

            // 获取bean标签下所有的property标签对象
            List<Element> propertyElements = beanElement.elements("property");
            for (Element propertyElement : propertyElements) {
                String name = propertyElement.attributeValue("name");
                String ref = propertyElement.attributeValue("ref");
                String value = propertyElement.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                mutablePropertyValues.addPropertyValue(propertyValue);
            }
            // 将mutablePropertyValues对象封装到BeanDefinition对象中
            beanDefinition.setPropertyValues(mutablePropertyValues);

            // 将beanDefinition对象注册到注册表中
            registry.registerBeanDefinition(id, beanDefinition);
        }
    }
}
