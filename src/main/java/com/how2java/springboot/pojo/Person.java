package com.how2java.springboot.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

//@PropertySource(value = {"classpath:person.properties"})
//@ConfigurationProperties(prefix = "person")
//@Component
@Data
public class Person implements Comparable{
    private String lastName;
    private Integer age;
    private boolean isBoss;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        if(this.age > p.getAge()){
            return 1;
        }else if(this.age == p.getAge())
            return 0;
        else return -1;
    }
}
