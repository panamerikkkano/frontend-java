// Archivo Main.java
import java.io.*;
import analizador.*;
import analizadorLexico.*;
public class frontend{
    public static void main(String[] args) throws IOException{
        System.out.printf(">");
        AnalizadorLexico lex = new AnalizadorLexico();
        Analizador analizar = new Analizador(lex);
        analizar.programa();
        System.out.write('\n');
    }
}