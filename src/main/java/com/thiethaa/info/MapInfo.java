package com.thiethaa.info;

import com.thiethaa.entity.Actor;
import com.thiethaa.entity.Movie;

import java.util.Map;

public class MapInfo implements Info {
    private Map<Actor,Movie> mapInfo;

    public Map<Actor, Movie> getMapInfo() {
        return mapInfo;
    }

    public void setMapInfo(Map<Actor, Movie> mapInfo) {
        this.mapInfo = mapInfo;
    }

    @Override
    public String toString() {
        return "MovieInfo\n" + mapInfo;
    }

    @Override
    public void showInfo() {
        System.out.println(this);

    }
}
