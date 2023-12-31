
package entities;

import java.io.Serializable;

public class Machine  implements Serializable{
    private int id;
    private String ref;
    private String marque;
    private double prix;
    private Salle salle ;
    private static final long serialVersionUID = 2271470953592136426L;

    public Machine() {
    }

    public Machine( String ref, String marque, double prix, Salle salle) {
    
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
        this.salle = salle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", ref=" + ref + ", marque=" + marque + ", prix=" + prix + ", salle=" + salle + '}';
    }

    
}
