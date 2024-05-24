package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

/*
 В ранее склонированном репозитории одногруппника в новой ветке создайте новый метод в классе Main,
  который (выберите один из списка):
выводит в консоль переменные окружения
создаёт файл, в который записывает текущую дату и время
скачивает картинку из интернета и сохраняет её на компьютере
2 Сделайте коммит изменений и запуште их.
3 Создайте пул-реквест на изменения.
4 Проведите код-ревью пул-реквеста, который выставили в Вашем репозитории.
 */