/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblacktree;

/**
 *
 * @author user7
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.HashMap;

/**
 *
 * @author Arwa
 */
public class FileReaderr {

    private HashMap<String, Integer> hmap = new HashMap<String, Integer>();

    public HashMap<String, Integer> getHmap() {
        return hmap;
    }
    int wordcount;
    private int linecount;
    String opcode;
    public String codeline;
    public void setLinecount(int linecount) {
        this.linecount = linecount;
    }

    public int getLinecount() {
        return linecount;
    }

    public String codeReader(int linecount, String filename) throws FileNotFoundException, IOException {

        BufferedReader cr = new BufferedReader(new FileReader(filename));
        StringBuilder sb = new StringBuilder();

        codeline = cr.readLine();
        //  System.out.println("line: " + line);
        for (int i = 0; i < linecount; i++) {

            codeline = cr.readLine();
        }
        return codeline;

    }

     
}

