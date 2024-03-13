package com.sigma429.framework.beans;

/**
 * ClassName:PropertyValue
 * Package:com.sigma429.framework.beans
 * Description:用来封装bean标签下的property标签的属性
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/13 - 19:00
 * @Version:v1.0
 */
public class PropertyValue {
    private String name;
    private String ref;
    private String value;

    public PropertyValue() {
    }

    public PropertyValue(String name, String ref, String value) {
        this.name = name;
        this.ref = ref;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
