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
public class Comun {
    String nome;
    String direccion;

    public Comun(String nome, String direccion) {
        this.nome = nome;
        this.direccion = direccion;
    }
        public Comun() {
    }
        //Codifica un programa e fai o correspondente diagrama de clases do feito seguinte
        //Clase estudante con atributos: nome, direccion, nomecole, nivel
        //Clase ensinante con nome, direccion e materia
        //Clase estudanteinternacional con nome, direccion, nomecole, nivel e pais
        //En cada clase, debe levar constructor, getter setter e toString
        //Na clase principal crean un obxeto de cada clase e visualiza todos os atributos
        //Cambialle o nivel do estudante e cambialle a materia o ensinante e visualizamos

    public String getNome() {
        return nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "nome= " + nome + ", direccion= " + direccion;
    }


}
