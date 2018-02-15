/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author DAW
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File fileName = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            //para la lectura del archivo
            fileName = new File("text.txt");
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            //para la escritura
            File file = new File("texto.txt");
            PrintWriter printWriter = new PrintWriter("texto.txt");

            //lectura actual del archivo
            int c = 0;
            while ((c = br.read()) != -1) {
                if (c != ' ') {
                    char character = (char) c;
                    //escritura en el archivo
                    printWriter.print(character);
                }
            }

            //cierre del archivo
            printWriter.close();

        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }

}
