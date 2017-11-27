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
public class Estudante extends Comun {
    String nomecole;
    String nivel;

    public Estudante() {
    }

    public Estudante( String nome, String direccion, String nomecole,  String nivel) {
        super(nome, direccion);
        this.nomecole = nomecole;
        this.nivel = nivel;
    }

    public Estudante(String nomecole, String nivel) {
        this.nomecole = nomecole;
        this.nivel = nivel;
    }

    public String getNomecole() {
        return nomecole;
    }

    public String getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNomecole(String nomecole) {
        this.nomecole = nomecole;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return super.toString()+ ", nomecole= " + nomecole + ", nivel= " + nivel;
    }

}
