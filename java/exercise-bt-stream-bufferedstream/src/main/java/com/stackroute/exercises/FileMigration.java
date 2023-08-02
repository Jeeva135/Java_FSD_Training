package com.stackroute.exercises;
import java.io.*;

public class FileMigration {
    int value = 0;
    StringBuilder line = new StringBuilder();
    String result;

    //Write here logic to read content of first file and write it in second file
    public String fileContentDuplicator(String firstFile, String secondFile) throws IOException {

        if (firstFile == null || secondFile == null || firstFile.isEmpty() || secondFile.isEmpty()
                || firstFile.equals(" ") || secondFile.equals(" "))
            return "Given fileName to read or write is empty, null or blank space";

        byte[] bytes;
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(firstFile.trim()))) {

            FileOutputStream fileOutputStream = new FileOutputStream(secondFile.trim());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bytes = bufferedInputStream.readAllBytes();
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.close();
            fileOutputStream.close();
        }


//        System.out.println(res

        return new String(bytes);
    }
}
