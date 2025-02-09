/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ieseljust.ad.repaso.repasoBinaryFiles1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author pc-raul
 */

public class repasoBinaryFiles1 {
    public static void main(String[] args) throws Exception {
        int bytes;
        int BytesCopied = 0;

        FileInputStream fis = null;
        FileOutputStream fos = null;

        File file;

        if (args.length != 2) {
            System.out.println("Nombre d'arguments, Sintaxi:\n FileCopy ");
            return;
        }

        try {
            file = new File(args[0]);
            fis = new FileInputStream(file);
            fos = new FileOutputStream(args[1]);

            System.out.println("Total:" + file.length() + " bytes");

            do {
                bytes = fis.read();
                if (bytes != -1) {
                    fos.write(bytes);
                    BytesCopied++;
                }
            } while (bytes != -1);

            System.out.println("Copied " + BytesCopied + " bytes successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
}
