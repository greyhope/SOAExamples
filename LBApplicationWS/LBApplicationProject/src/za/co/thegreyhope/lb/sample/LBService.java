package za.co.thegreyhope.lb.sample;

import javax.jws.WebService;

import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "LBService", portName = "LBServiceSoap12HttpPort", endpointInterface = "za.co.thegreyhope.lb.sample.LBServicePortType")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class LBService {
    
    public String getLBResponse(){
        return "LB Service Response 1";
    }
    
    public LBService() {
        super();
    }
}
