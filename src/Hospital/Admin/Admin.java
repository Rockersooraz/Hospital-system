package Hospital.Admin;

import Hospital.Hospital_MIS;

public class Admin  extends Hospital_MIS
{
    private int adminId;
    private String paymentMethod;
    private String amount;
    private String billingDate;

    public Admin(int adminId, String paymentMethod, String amount, String billingDate) {
        this.adminId = adminId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.billingDate = billingDate;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(String billingDate) {
        this.billingDate = billingDate;
    }
}
