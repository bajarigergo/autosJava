/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autosprogram;

public class Auto {
    private boolean uzemanyag;
    private boolean beinditva;
    private static int bemutato;
    
    public Auto(){
        this(false);
    }
    public Auto(boolean beinditva){
        this(beinditva, true);
    }
    
    public Auto(boolean beinditva,boolean uzemanyag){
        Auto.bemutato++;
        this.uzemanyag = uzemanyag;
        setBeindit(beinditva);
        System.out.printf("****** %d. bemutató ******\n",bemutato);
        System.out.println("üzemanyag: "+(uzemanyag?"✔":"✖"));
        System.out.println("beindítva: "+(beinditva?"✔":"✖"));
        System.out.println("*************************");
    }
    
    public void setBeindit(boolean beinditva){
        this.beinditva = beinditva;
        if(this.beinditva==true){
            System.out.println("Az autót beindították");
        }else{
            System.out.println("Az autót leállították");
        }
    }
    public void megy(){
        if (beinditva && uzemanyag){
            uzemanyag = false;
            System.out.println("Az autó megérkezett, nincs üzemanyag");
        }else if(uzemanyag == false){
            System.out.println("Nincs üzemanyag");
        }else{
            System.out.println("Nincs beindítva");
        }
    }
    public void tankol(){
        if (beinditva == false){
            uzemanyag = true;
            System.out.println("Tankolva van");
        }else{
            System.out.println("Le kell állítani az autót");
        }
    }
}
