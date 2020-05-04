package Aulas;


import javax.swing.JOptionPane;

public class JOptionEx01 {

    public static void main(String[] args) {

       String id =JOptionPane.showInputDialog(null,"Qual a sua idade?");
       int i = Integer.parseInt(id);
         if(i<=12) {
             JOptionPane.showMessageDialog(null,"Você é criança");
        }
         if(i>12 && i<=18){
            JOptionPane.showMessageDialog(null,"Você é adolescente");
        }
        if(i>=18 && i<65){
            JOptionPane.showMessageDialog(null,"Você é adulto"); 
        }
        if (i>=65){
            JOptionPane.showMessageDialog(null,"Você é idoso"); 
        }
       
      
    }   
    }

