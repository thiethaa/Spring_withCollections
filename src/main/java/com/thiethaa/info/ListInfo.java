package com.thiethaa.info;

import com.thiethaa.entity.Actor;

import java.util.List;

public class ListInfo implements Info {
    private List<Actor> actorList;

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }


    @Override
    public String toString() {
        return "\nActorList=\n" + actorList;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }
}
