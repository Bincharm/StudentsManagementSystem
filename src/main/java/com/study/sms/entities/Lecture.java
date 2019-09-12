package com.study.sms.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;

    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Lecture() {
    }

    public Lecture(Long id, String subject, LocalDateTime date, Course course) {
        this.id = id;
        this.subject = subject;
        this.date = date;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
