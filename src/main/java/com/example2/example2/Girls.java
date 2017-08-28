package com.example2.example2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "girl")
public class Girls {
    private String cuSize;
    private Integer age;

    public String getCuSize() {
        return cuSize;
    }

    public void setCuSize(String cuSize) {
        this.cuSize = cuSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
