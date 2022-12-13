/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Enrico Nunes
 * @deprecated Classe descontinuada
 */
public class Ficheiro {
   
    //CLASSE INUTILIZADA NA ULTIMA VERSAO DO PROJETO.
    
    public static String read(String caminho){
        String conteudo = "";
        try{
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try{
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha + "\n";
                    linha = lerArq.readLine(); 
                }
                arq.close();
                return conteudo;
            }catch (IOException ex){
                    System.out.println("ERRO: Nao foi possivel ler o ficheiro\n");
                    return "";
                    }
            }catch (FileNotFoundException ex){
                    System.out.println("ERRO: Arquivo nao encontrado!\n");
                    return "";
        }
        
    }
    
    public static boolean Write(String caminho, String texto){
        try{
            FileWriter arq = new FileWriter(caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(texto);
            gravarArq.close();
            return true;
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}

    

