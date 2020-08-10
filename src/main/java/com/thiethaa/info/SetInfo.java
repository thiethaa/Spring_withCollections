package com.thiethaa.info;

import com.thiethaa.entity.Actor;

import java.util.Set;

public class SetInfo implements Info{
    private Set<Actor> actorSet;

    public Set<Actor> getActorSet() {
        return actorSet;
    }

    public void setActorSet(Set<Actor> actorSet) {
        this.actorSet = actorSet;
    }

    @Override
    public String toString() {
        return "\nActorSet=\n" + actorSet;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }
}
