package gfshen.cn.client.rmi;

import gfshen.cn.server.rmi.api.IRmiMethod;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Random;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, InterruptedException {
        Registry registry = LocateRegistry.getRegistry("127.0.0.1",1099);
        IRmiMethod method = (IRmiMethod) registry.lookup("rmiMethod");
        while (true){
            Thread.sleep(1000);
            System.out.println(method.fetStringLen(String.valueOf(new Random().nextFloat())));
        }

    }
}
