package com.inter.basics;

public class ZipCompressor implements ICompressor {
    @Override
    public String[] compressFiles(String file, String file1) {
        String[] zippedFiles = new String[3];
        zippedFiles[0]= file;
        zippedFiles[1]= file1;
        return zippedFiles;
    }
}
