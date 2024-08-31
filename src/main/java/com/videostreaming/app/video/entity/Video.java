package com.videostreaming.app.video.entity;

import com.videostreaming.app.course.entity.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Video {
    @Id
    private  String videoId;

    private  String title;

    private  String description;

    private  String  contentType;

    private  String filePath;

//    @ManyToOne
//    private Course course;
}
