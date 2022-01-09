package gfshen.cn.server.rmi.impl;

import gfshen.cn.server.rmi.api.IRmiMethod;
import java.rmi.RemoteException;

public class RmiMethodsImpl implements IRmiMethod {
    @Override
    public String getTime() throws RemoteException {
        return "This is from remoteServer" + String.valueOf(System.currentTimeMillis());
    }

    @Override
    public String fetStringLen(String input) throws RemoteException {
        return input.length()+"";
    }
}
