package za.co.thegreyhope.mid.sample;

import javax.jws.WebService;

import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "MIDService", portName = "MIDServiceSoap12HttpPort")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class MIDService {
    public MIDService() {
        super();
    }
    
    public String getMarriageStatus(long mid){
        return "Married";
    }
}
