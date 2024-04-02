package com.inter.basics;

public class JarCompressor implements ICompressor {
    @Override
    public String[] compressFiles(String file, String file1) {
        String[] compressFiles = new String[3];
        compressFiles[0]= file;
        compressFiles[1]= file1;
        return compressFiles;
    }
}
