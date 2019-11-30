package com.paranoid.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Paranoid
 * @create 2019-11-30 23:57
 */
@Data //提供空参构造 全部参数的set get方法 重写 equals hashcode toString 方法
@AllArgsConstructor //提供全参构造
public class Person {
    private String name;
    private Integer age;
}
