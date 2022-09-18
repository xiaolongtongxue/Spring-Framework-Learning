package xyz.txk.hellospring.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Myself {
    @Value("TXK-test value")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Myself{" +
                "name='" + name + '\'' +
                '}';
    }
}
