package studentBackend;

public class CreditCardPayment {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
    
    public double getRoomAmount(String roomType) {
        double roomAmount = 0.0;

        switch (roomType) {
            case "Single Room":
                roomAmount = 800.0;
                break;
            case "Twins Room":
                roomAmount = 600.0;
                break;
            case "Quadruple Room":
                roomAmount = 450.0;
                break;
        }

        return roomAmount;
    }
}