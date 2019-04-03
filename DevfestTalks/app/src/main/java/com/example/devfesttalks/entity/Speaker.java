package com.example.devfesttalks.entity;

final class Speaker {
    private final Flags flag;
    private final String name;
    private final String job;
    private final String location;

    Speaker(Flags flag, String name, String job, String location) {
        this.flag = flag;
        this.name = name;
        this.job = job;
        this.location = location;
    }

    public Flags getFlag() {
        return flag;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getLocation() {
        return location;
    }
}
