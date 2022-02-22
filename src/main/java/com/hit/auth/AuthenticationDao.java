package com.hit.auth;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class AuthenticationDao {
    //Dear NISSIM:
    //AuthenticationDao Class have not been tested to validate that its working properly due to lack of time.
    public void writeMapToFile(Map<String, String> map) {
        // new file object
        File file = new File("users.txt");

        BufferedWriter bf = null;

        try {

            // create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file));

            // iterate map entries
            for (Map.Entry<String, String> entry :
                    map.entrySet()) {

                // put key and value separated by a colon
                bf.write(entry.getKey() + ":"
                        + entry.getValue());

                // new line
                bf.newLine();
            }

            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {

                // always close the writer
                bf.close();
            } catch (Exception e) {
            }

        }


    }
}
