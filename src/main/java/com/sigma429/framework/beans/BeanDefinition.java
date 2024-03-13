package com.sigma429.framework.beans;

/**
 * ClassName:BeanDefinition
 * Package:com.sigma429.framework.beans
 * Description:用来封装bean标签数据
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/13 - 19:30
 * @Version:v1.0
 */
public class BeanDefinition {
    private String id;
    private String className;
    private MutablePropertyValues propertyValues;

    public BeanDefinition() {
        propertyValues = new MutablePropertyValues();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public MutablePropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(MutablePropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
