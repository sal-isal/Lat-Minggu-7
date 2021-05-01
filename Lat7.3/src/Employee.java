public class Employee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String eName, String eAddress, String ePhone, String eSocialSecurityNumber, double ePayRate){
        super(eName,eAddress,ePhone);
        socialSecurityNumber = eSocialSecurityNumber;
        payRate = ePayRate;
    }

    @Override
    public String toString(){
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecurityNumber;

        return result;
    }

    @Override
    public double pay(){
        return payRate;
    }

}
