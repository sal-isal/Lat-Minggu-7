public class Commission extends Hourly{
    private double totalSales;
    private double commRate;

    public Commission(String eName, String eAddress, String ePhone, String eSocialSecurityNumber, double ePayRate, double eCommRate){
        super(eName,eAddress,ePhone,eSocialSecurityNumber,ePayRate);
        commRate = 0;
    }

    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }


    @Override
    public double pay(){
        double payment = super.pay() + totalSales;
        totalSales = 0;

        return payment;
    }

    @Override
    public String toString(){
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;

        return result;
    }
}
