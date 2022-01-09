package gfshen.cn.server.rmi.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRmiMethod extends Remote {
    String getTime() throws RemoteException;
    String fetStringLen(String input) throws RemoteException;
}
