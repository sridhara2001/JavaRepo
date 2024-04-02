package com.inter.basics;

public class FileDetails {
    public static void main(String[] args) {
        ICompressor compressor = new ZipCompressor();
        String[] files = compressor.compressFiles("File1.zip","File2.zip");
        for (String file : files){
            if(file!=null){
                System.out.println(file);
            }
        }
        System.out.println("---------------------");

        compressor = new JarCompressor();
        String[] files1 = compressor.compressFiles("File1.java","File2.java");
        for (String file : files1){
            if(file!=null){
                System.out.println(file);
            }
        }
    }
}
