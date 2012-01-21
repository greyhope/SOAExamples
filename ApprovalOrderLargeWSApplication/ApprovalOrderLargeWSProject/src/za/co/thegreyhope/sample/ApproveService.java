package za.co.thegreyhope.sample;

import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "ApproveService", portName = "ApproveServiceSoap12HttpPort")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
@XmlSeeAlso( { ApprovalResponse.class, Order.class })
public class ApproveService {
   
    public ApprovalResponse approveOrder(Order value){
        ApprovalResponse response = new ApprovalResponse();
        response.setApprovalMessage("Approved Large Order");
        response.setApprovalNumber(1);
        return response;
    }
            
    public ApproveService() {
        
    }
}
