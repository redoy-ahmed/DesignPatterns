package creational.builder.model;

public class Person {

    //mandatory fields
    private final int nid;
    private final String firstName;
    private final String lastName;
    private final String accountNumber;

    //optional fields
    private final String mobileNumber;
    private final boolean isMarried;
    private final String spouseName;
    private final String address;
    private final String bloodGroup;

    private Person(PersonBuilder builder) {
        this.nid = builder.nid;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.accountNumber = builder.accountNumber;

        this.mobileNumber = builder.mobileNumber;
        this.isMarried = builder.isMarried;
        this.spouseName = builder.spouseName;
        this.address = builder.address;
        this.bloodGroup = builder.bloodGroup;
    }

    @Override
    public String toString() {
        return "Person Details:\nNID: " + nid + "\nFirst Name: " + firstName + "\nLast Name: " + lastName
                + "\nAccount Number: " + accountNumber + "\nMobile Number: " + mobileNumber + "\nIs Married: " + isMarried
                + "\nSpouse Name: " + spouseName + "\nAddress: " + address + "\nBlood Group: " + bloodGroup;
    }

    public static class PersonBuilder {

        //mandatory fields
        private int nid;
        private String firstName;
        private String lastName;
        private String accountNumber;

        //optional fields
        private String mobileNumber;
        private boolean isMarried;
        private String spouseName;
        private String address;
        private String bloodGroup;

        public PersonBuilder nid(int nid) {
            this.nid = nid;
            return this;
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = mobileNumber;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public PersonBuilder mobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public PersonBuilder isMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public PersonBuilder spouseName(String spouseName) {
            this.spouseName = spouseName;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder bloodGroup(String bloodGroup) {
            this.bloodGroup = bloodGroup;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
