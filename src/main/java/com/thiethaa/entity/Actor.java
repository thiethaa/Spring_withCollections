package com.thiethaa.entity;

public class Actor{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n Actor :" + name+" " ;
    }

    void  info(){
        this.toString();
    }
}
