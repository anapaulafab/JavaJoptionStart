
package Aulas;
import java.io.IOException;
import javax.swing.JOptionPane;


public class JOptionEx02 {
    

    public static void main(String[] args) throws IOException{
        
        String nome=JOptionPane.showInputDialog("Qual seu nome completo?");
        
        String[]primeiro=nome.split(" ");
        JOptionPane.showMessageDialog(null,"Seu primeiro nome é:"+primeiro[0]);
        
        System.out.println("A quantidade de caracteres é:"+nome.length());
        
        //substitui 
        String nomeLimpo=nome.replaceAll(" ","");
        
        for (String primeiro1 : primeiro) {
            System.out.println("Nomes:" + primeiro1);
        }
}
}