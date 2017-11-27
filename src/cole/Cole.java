/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cole;

/**
 *
 * @author ggarciaalvarez
 */
public class Cole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comun obx = new Comun("Gon","Sanjurjo Badia");
        Estudante obx1 = new Estudante("Jaimito","Jaimitolandia","Jaimitas","Bronza");
        Ensinante obx2 = new Ensinante("Jose","Garcia Barbon","Mates");
        Estudanteinternacional obx3 = new Estudanteinternacional("Noe","Arbol2","rrrgwerh","Bach","España");
        //Codifica un programa e fai o correspondente diagrama de clases do feito seguinte
        //Clase estudante con atributos: nome, direccion, nomecole, nivel
        //Clase ensinante con nome, direccion e materia
        //Clase estudanteinternacional con nome, direccion, nomecole, nivel e pais
        //En cada clase, debe levar constructor, getter setter e toString
        //Na clase principal crean un obxeto de cada clase e visualiza todos os atributos
        //Cambialle o nivel do estudante e cambialle a materia o ensinante e visualizamos
        System.out.println(obx.toString());
        System.out.println(obx1.toString());
        System.out.println(obx2.toString());
        System.out.println(obx3.toString());
        
        obx1.setNivel("Nuevo nivel");
        obx2.setMateria("Nueva materia");
        System.out.println(obx1.toString());
        System.out.println(obx2.toString());
    }
    
}
