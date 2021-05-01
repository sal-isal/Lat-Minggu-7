public class Executive extends Employee{
    private double bonus;

    public Executive(String eName, String eAddress, String ePhone, String eSocialSecurityNumber, double ePayRate){
        super(eName, eAddress, ePhone, eSocialSecurityNumber, ePayRate);
        bonus = 0;
    }

    public void awardBonus(double execBonus){
        bonus = execBonus;
    }

    @Override
    public double pay(){
        double payment = super.pay() + bonus;
        bonus = 0;

        return payment;
    }
}
