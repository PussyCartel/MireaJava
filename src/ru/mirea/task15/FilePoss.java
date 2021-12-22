package ru.mirea.task15;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePoss{

    public FilePoss(String fileName) {
        File file = new File(fileName + ".txt");
        try {
           file.createNewFile();
        }
        catch (IOException ie){
            ie.printStackTrace();
        }
    }

    public void writeToFile(String inf, Boolean status){
        try(FileWriter writer = new FileWriter("Task15.txt", status))
        {
            writer.write(inf);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void readFromFile(){
        try(FileReader reader = new FileReader("Task15.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
