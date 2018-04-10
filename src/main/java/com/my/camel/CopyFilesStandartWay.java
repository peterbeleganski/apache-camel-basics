package com.my.camel;

import java.io.*;

public class CopyFilesStandartWay {
    public static void main(String[] args) throws IOException {

        // Step 1 Create a file Object to read the directions

        File inputDirectory = new File("data/input");
        File outputDirectory = new File("data/output");

        // Step 2 Read the files from the directory and iterate the files
        File[] files  = inputDirectory.listFiles();
        for(File sourse: files) {
            if(sourse.isFile()) {
                File dest = new File(
                   outputDirectory.getPath()
                   + File.separator
                   + sourse.getName());
                // Step 3 Create the output stream and read the files

                OutputStream oStream = new FileOutputStream(dest);
                byte[] buffer = new byte[(int) sourse.length()];
                FileInputStream iStream = new FileInputStream(sourse);
                iStream.read(buffer);

                try{
                    oStream.write(buffer);
                } catch (IOException ex) {
                    System.out.println("IOExeption ->  " + ex.getMessage());
                }finally {
                    // Step 4 Close the streams
                    oStream.close();
                    iStream.close();
                }
            }
        }
    }
}
