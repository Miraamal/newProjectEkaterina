package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
      writeDateAndTime("Current date.txt");


    }
    public static void writeDateAndTime(String fileName){
        try {
            Files.writeString(Path.of(fileName), LocalDateTime.now().toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

