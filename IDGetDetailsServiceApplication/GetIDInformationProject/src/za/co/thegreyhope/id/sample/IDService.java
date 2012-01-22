package za.co.thegreyhope.id.sample;

import javax.jws.WebService;

import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "IDService", portName = "IDServiceSoap12HttpPort")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class IDService {

    public IDService() {
        super();
    }
    
    public long getMarriageID(int idNumber){
        return 1234;
    }
}
