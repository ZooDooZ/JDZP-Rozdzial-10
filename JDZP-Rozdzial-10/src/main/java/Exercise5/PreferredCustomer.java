package Exercise5;

public class PreferredCustomer extends Customer {

    private double totalValueOfPurchase;
    private double percentDiscount;

    private double totalValueAfterDiscount;

    public PreferredCustomer(String surname, String adres, String phoneNumber, String clientNumber, double totalValueOFPurchase){
        super(surname, adres, phoneNumber, clientNumber);
        this.totalValueOfPurchase = totalValueOFPurchase;
    }

    public double getTotalValueOfPurchase() {
        return totalValueOfPurchase;
    }

    public void setTotalValueOfPurchase(double totalValueOfPurchase) {
        this.totalValueOfPurchase = totalValueOfPurchase;
    }

    public double getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    public double calculateFinalPrice() {
        if (totalValueOfPurchase < 500){
            percentDiscount = 0;
            totalValueAfterDiscount = totalValueOfPurchase - (totalValueOfPurchase * percentDiscount);

        } else if(totalValueOfPurchase >= 500 && totalValueOfPurchase < 1000){
            percentDiscount = 0.05;
            totalValueAfterDiscount = totalValueOfPurchase - (totalValueOfPurchase * percentDiscount);

        } else if(totalValueOfPurchase >= 1000 && totalValueOfPurchase < 1500){
            percentDiscount = 0.06;
            totalValueAfterDiscount = totalValueOfPurchase - (totalValueOfPurchase * percentDiscount);

        } else if (totalValueOfPurchase >= 1500 && totalValueOfPurchase < 2000) {
            percentDiscount = 0.07;
            totalValueAfterDiscount = totalValueOfPurchase - (totalValueOfPurchase * percentDiscount);

        } else {
            percentDiscount = 0.10;
            totalValueAfterDiscount = totalValueOfPurchase - (totalValueOfPurchase * percentDiscount);
        }
        return totalValueAfterDiscount;
    }

    public String toString(){
        return "Surname: " + getSurname() + "\nAdres: " + getAdres()+ "\nPhone number: " + getPhoneNumber()+
                "\nClient number: " + getClientNumber() +"\nTotal value of purchase: " + totalValueOfPurchase
                + "\nTotal price after discount: " + calculateFinalPrice()+ "\nDiscount: " + (100 * percentDiscount) + "%";
    }

}
