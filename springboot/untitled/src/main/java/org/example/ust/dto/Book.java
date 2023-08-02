package org.example.ust.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private int bookId;
    private String title;
    private int authorId;
    private double price;
}
