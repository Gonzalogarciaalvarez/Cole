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
public class Ensinante extends Comun {
    String materia;
            //Clase ensinante con nome, direccion e materia

    public Ensinante() {
    }

    public Ensinante(String nome, String direccion, String materia) {
        super(nome, direccion);
        this.materia = materia;
    }

    public Ensinante(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public String getNome() {
        return nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return super.toString()+ ", materia= " + materia;
    }
    
}
