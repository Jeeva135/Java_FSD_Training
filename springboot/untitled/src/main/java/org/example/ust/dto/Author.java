package org.example.ust.dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Author {
    private  int authorId;
    private String authorName;
    private String gender;
    private String authorEmail;
    private LocalDate joinDate;
}