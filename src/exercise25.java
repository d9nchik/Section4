public class exercise25 {
    public static void main(String[] args) {
        String vehiclePlateNumber = "";

        vehiclePlateNumber += (char) ('A' + (int) (Math.random() * ('Z' - 'A'+1)));
        vehiclePlateNumber += (char) ('A' + (int) (Math.random() * ('Z' - 'A'+1)));
        vehiclePlateNumber += (char) ('A' + (int) (Math.random() * ('Z' - 'A'+1)));
        vehiclePlateNumber += (char) ('0' + (int) (Math.random() * ('9' - '0'+1)));
        vehiclePlateNumber += (char) ('0' + (int) (Math.random() * ('9' - '0'+1)));
        vehiclePlateNumber += (char) ('0' + (int) (Math.random() * ('9' - '0'+1)));
        vehiclePlateNumber += (char) ('0' + (int) (Math.random() * ('9' - '0'+1)));

        System.out.println("Vehicle plate number is " + vehiclePlateNumber);
    }
}
