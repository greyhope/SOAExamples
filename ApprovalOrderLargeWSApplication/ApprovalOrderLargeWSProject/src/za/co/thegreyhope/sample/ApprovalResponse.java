package za.co.thegreyhope.sample;

public class ApprovalResponse {
   
    private int approvalNumber;
    private String approvalMessage;

    
    public ApprovalResponse() {
        
    }

    public void setApprovalNumber(int approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public int getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalMessage(String approvalMessage) {
        this.approvalMessage = approvalMessage;
    }

    public String getApprovalMessage() {
        return approvalMessage;
    }
}
