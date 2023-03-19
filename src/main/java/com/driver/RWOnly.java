package com.driver;

public class RWOnly {
    private String name = "ReadWriteOnly";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // java: name has private access in com.driver.RWOnly
}
