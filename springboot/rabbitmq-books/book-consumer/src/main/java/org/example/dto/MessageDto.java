package org.example.dto;

import java.io.Serializable;
import java.util.List;

public record MessageDto(String name, List<String> bookList) implements Serializable {

    @Override
    public String toString() {
        return "MessageDto{" +
                "name='" + name + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
