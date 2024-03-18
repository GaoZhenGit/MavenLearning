package com.codetend.base;

import java.io.File;

public class FileUtil {
    public static boolean checkFileExist(String path) {
        File file = new File(path);
        return file.exists();
    }
}
