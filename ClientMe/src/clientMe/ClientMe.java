
package clientMe;

import dao.IDao;
import entities.Machine;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Mac;


public class ClientMe {


    public static void main(String[] args) {
        try {
            IDao<Machine> dao = (IDao<Machine>) Naming.lookup("rmi://localhost:1099/dao");
       
            for(Machine m : dao.findAll())
                System.out.println(m);
        
        } catch (NotBoundException ex) {
            Logger.getLogger(ClientMe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientMe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientMe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
