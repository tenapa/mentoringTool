package com.tenapa.mentoring.model;

import java.util.Date;

/**
 * Created by tetianaprynda on 13.09.16.
 * Groups: mentor / mentee / planned start / planned end / actual start / actual end / status (initiation / in progress / finished / cancelled)
 */
public class Group {
    private Person mentor;
    private Person mentee;
    private Date plannedStart;
    private Date plannedEnd;
    private Date actualStart;
    private Date actualEnd;
    private GroupStatus groupStatus;

    public Person getMentor() {
        return mentor;
    }

    public void setMentor(Person mentor) {
        this.mentor = mentor;
    }

    public Person getMentee() {
        return mentee;
    }

    public void setMentee(Person mentee) {
        this.mentee = mentee;
    }

    public Date getPlannedStart() {
        return plannedStart;
    }

    public void setPlannedStart(Date plannedStart) {
        this.plannedStart = plannedStart;
    }

    public Date getPlannedEnd() {
        return plannedEnd;
    }

    public void setPlannedEnd(Date plannedEnd) {
        this.plannedEnd = plannedEnd;
    }

    public Date getActualStart() {
        return actualStart;
    }

    public void setActualStart(Date actualStart) {
        this.actualStart = actualStart;
    }

    public Date getActualEnd() {
        return actualEnd;
    }

    public void setActualEnd(Date actualEnd) {
        this.actualEnd = actualEnd;
    }

    public GroupStatus getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(GroupStatus groupStatus) {
        this.groupStatus = groupStatus;
    }
}
