import java.rmi.*;

interface AddServerIntf extends Remote {
    double add(double d1, double d2) throws RemoteException; 
}