package br.com.philippesis.semaforoemetodossincronizados;

import java.io.FileWriter;
import java.io.IOException;

public class Reporter {

    public Reporter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    private FileWriter fileWriter;
    public synchronized void addRecord(String author, String message) throws IOException {
        fileWriter.write("\n<<<<<<<<<<>>>>>>>>>>\n");
        fileWriter.write("Message written by:" + author + "\n");
        fileWriter.write("Message content:" + message);
    }

}
