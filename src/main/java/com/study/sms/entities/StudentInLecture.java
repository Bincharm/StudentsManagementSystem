package com.study.sms.entities;

import com.study.sms.enums.AttendanceType;

import javax.persistence.*;

@Entity
public class StudentInLecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "student_user_id")
    private User student;

    @Enumerated(EnumType.STRING)
    private AttendanceType attendanceType;
}
