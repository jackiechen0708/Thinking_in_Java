package fd.jc.chapter18;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * Created by JackieChen on 2016/11/7.
 */
public class MyFile {
    static int ListFile(File file){
        int count=0;
        File [] files=file.listFiles();
        for(int i=0;i<files.length;i++){
            count++;
            if(!files[i].isDirectory()){
                System.out.println(files[i].getName());
                count++;
            }else {
                count+=ListFile(files[i]);
            }

        }
        return count;

    }
}
