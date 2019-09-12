package com.study.sms.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "trainer_user_id")
    private User trainer;

    @ManyToOne
    @JoinColumn(name = "assistant_user_id")
    private User assistant;

    @OneToMany
    private Set<Lecture> lectures;


//    public Course() {
//    }
//
//    public Course(long id, String name, User trainer, User assistant, Set<Lecture> lectures) {
//        Id = id;
//        this.name = name;
//        this.trainer = trainer;
//        this.assistant = assistant;
//        this.lectures = lectures;
//    }
//
//    public long getId() {
//        return Id;
//    }
//
//    public void setId(long id) {
//        Id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public User getTrainer() {
//        return trainer;
//    }
//
//    public void setTrainer(User trainer) {
//        this.trainer = trainer;
//    }
//
//    public User getAssistant() {
//        return assistant;
//    }
//
//    public void setAssistant(User assistant) {
//        this.assistant = assistant;
//    }
//
//    public Set<Lecture> getLectures() {
//        return lectures;
//    }
//
//    public void setLectures(Set<Lecture> lectures) {
//        this.lectures = lectures;
//    }
}
