package gfshen.cn.server.rmi;


import gfshen.cn.server.rmi.impl.RmiMethodsImpl;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        RmiMethodsImpl rmiMethods = new RmiMethodsImpl();
        Remote rmiMethods1 = UnicastRemoteObject.exportObject(rmiMethods, 0);
        // 启动注册服务
        LocateRegistry.createRegistry(1099).bind("rmiMethod", rmiMethods1);
    }
}
