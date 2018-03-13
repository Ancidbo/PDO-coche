/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel Cid
 */
public class coche {
    private String color;
    private boolean status;
    private String name;
    private final String id;
    private int personas;
    
    public coche (String color, boolean status, String name, String id, int personas){
        this.color=color;  
        this.status=status;
        this.id=id;
        this.name=name;
        this.personas=personas;
    }//cierre of constructor
    
    public void color(String a){
        this.color=a;
      }//cierre del color
    public String getcolor(){
        System.out.println("El modelo es: " +color + "color");
        return color;
     }//cierre de getcolor
    
    public void status(boolean b){
        this.status=b;
    }// cierre de status
    public boolean getstatus(){
        System.out.println("El coche esta: " +status);
        return status;
    }// cierre de getstatus
    
    public void name(String c){
        this.name=c;
    }//cierre de name
    public String getname(){
        System.out.println("Marca es: " +name + "name");
        return name;
    }//cierre del getname
    
    public void personas(int d){
        this.personas=d;
    }
    public int getpersonas(){
        System.out.println("Pasajeros: " +personas + "personas");
        return personas;
    }//cierre del getpersonas
    
    @Override
    public String toString(){
        String aux=" ";
        aux="\n El modelo del coche es: " +color+ "\nla marca es: " +name+ "\n el carro esta: " +status+ "\n las placas son: " +id+ "\n El transporte lleva: " +personas+ "\n pasajeros \n";
        if (status){
            aux=aux+"encendido";
            
        }else{
            aux=aux+"apagado";
        }//cierra if-else
        return aux;
    }//cierra toString
}// cierre de clase

 