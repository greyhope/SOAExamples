package za.co.thegreyhope.lb.sample;

import javax.jws.WebService;

import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "LBService", portName = "LBServiceSoap12HttpPort")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class LBService {
    
    public String getLBResponse(){
        return "LB Service Response 2";
    }
    public LBService() {
        super();
    }
}
