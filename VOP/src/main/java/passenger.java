public class passenger {
    private String name,passportNumber,seatNumber;

    public passenger(String name, String passportNumber, String seatNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "passenger{" +
                "name='" + name + '\n' +
                ", passportNumber='" + passportNumber + '\n' +
                ", seatNumber='" + seatNumber + '\n' +
                '}';
    }
}
