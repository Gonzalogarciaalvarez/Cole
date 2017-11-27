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
public class Estudanteinternacional extends Comun {
    String nomecole;
    String nivel;
    String pais;

    public Estudanteinternacional(String nome, String direccion, String nomecole, String nivel, String pais) {
        super(nome, direccion);
        this.nomecole = nomecole;
        this.nivel = nivel;
        this.pais = pais;
    }

    public Estudanteinternacional(String nomecole, String nivel, String pais) {
        this.nomecole = nomecole;
        this.nivel = nivel;
        this.pais = pais;
    }
        public Estudanteinternacional() {
    }
    //Clase estudanteinternacional con nome, direccion, nomecole, nivel e pais

    public String getNomecole() {
        return nomecole;
    }

    public String getNivel() {
        return nivel;
    }

    public String getPais() {
        return pais;
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

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return super.toString()+ ", nomecole= " + nomecole + ", nivel= " + nivel + ", pais= " + pais;
    }


}
