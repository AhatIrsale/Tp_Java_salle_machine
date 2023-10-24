
package entities;

import java.io.Serializable;


public class Salle implements Serializable {
   
    private int id;
    private String code;
private static final long serialVersionUID = 2271470953592136426L;


    public int getId() {
        return id;
    }

    public Salle(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Salle() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
 
}
