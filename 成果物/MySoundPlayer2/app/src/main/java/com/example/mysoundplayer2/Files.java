package com.example.mysoundplayer2;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

//public class Files extends AppCompatActivity {
//
//    private List<Integer> files = new ArrayList<Integer>();
//
//    public Files()
//    {
//        files.add(R.raw.music1);
//        files.add(R.raw.music2);
//        files.add(R.raw.music3);
//        files.add(R.raw.music4);
//        files.add(R.raw.music5);
//    }
//
//    public int getFileID(int i)
//    {
//        return this.files.get(i);
//    }
//
//    public String getFileName(int i)
//    {
//        String filename = getResources().getResourceName(getFileID(i));
//
//        return removeExtension(filename);
////        return filename;
//
//    }
//
//    public int getSize()
//    {
//        return files.size();
//    }
//
//    //"https://www.techiedelight.com/ja/get-filename-without-extension-in-java/"より
//    public String removeExtension(String fileName) {
//        int lastIndex = fileName.lastIndexOf('.');
//        if (lastIndex != -1) {
//            fileName = fileName.substring(0, lastIndex);
//        }
//        return fileName;
//    }
//
//}
