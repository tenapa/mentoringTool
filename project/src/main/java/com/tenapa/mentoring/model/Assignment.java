package com.tenapa.mentoring.model;


/**
 * Created by tetianaprynda on 13.09.16.
 * Phase participant assignments: person / role (mentor, mentee, curator, lector) / status (proposed, approved rm, confirmed cdp, on hold)
 */
public class Assignment {
    private Person person;
    private Role role;
    private MenteeStatus status;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public MenteeStatus getStatus() {
        return status;
    }

    public void setStatus(MenteeStatus status) {
        this.status = status;
    }
}
