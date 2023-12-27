package school_09;

public class VIPCustomer extends Customer{

    private int agentID;
    double saleRatio; //7. 0.1

    public VIPCustomer(){ //6. //super();
        customerGrade = "VIP"; //7.
        bonusRatio = 0.05; //7.
        saleRatio = 0.1; //7.
    }

    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    public int getAgentID(){
        return agentID;
    }


}
