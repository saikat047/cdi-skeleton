package org.fun.skeleton;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named("test")
public class TestBean implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
