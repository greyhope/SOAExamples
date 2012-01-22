package za.co.thegreyhope.pinvalidation;

import javax.jws.WebService;

import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(portName = "ValidateOrderSoap12HttpPort")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class ValidateOrder {
    
    public int validateOrderNumber(int ordernumber){
        if(ordernumber < 10){
            return 1;
        }else{
            return 2;
        }
    }
    
    public ValidateOrder() {
       
    }
}
