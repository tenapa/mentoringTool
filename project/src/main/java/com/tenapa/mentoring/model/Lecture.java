package com.tenapa.mentoring.model;

import java.util.Date;

/**
 * Created by tetianaprynda on 13.09.16.
 * Lectures: domain area / topic / lector / duration / status / scheduled time etc.
 */
public class Lecture {
    private String domainArea;
    private String topic;
    private Person lector;
    private int duration; //minutes
    private GroupStatus status;
    private Date scheduledTime;

    public String getDomainArea() {
        return domainArea;
    }

    public void setDomainArea(String domainArea) {
        this.domainArea = domainArea;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Person getLector() {
        return lector;
    }

    public void setLector(Person lector) {
        this.lector = lector;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public GroupStatus getStatus() {
        return status;
    }

    public void setStatus(GroupStatus status) {
        this.status = status;
    }

    public Date getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
}
