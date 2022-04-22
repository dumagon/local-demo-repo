package com.zach.Java_for_Dummies.examples;

import java.io.File;
import java.lang.*;
class DummyFile{
    public static void main(String[] args)throws Exception {
        File testFile =new File("E:\\Workspace\\local-repo\\test-file.txt");
        testFile.createNewFile();
        boolean ifExists =testFile.exists();
        File someText =new File("text.txt");
       // testFile.delete();

         System.out.println(someText.getCanonicalPath());
        System.out.println(ifExists);

    }
}