package za.co.thegreyhope.lb.sample;

import java.rmi.Remote;

import javax.jws.WebService;

@WebService
public interface LBServicePortType extends Remote {
    public String getLBResponse();
}
