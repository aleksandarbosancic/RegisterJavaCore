package com.dejan.register;

public class Individual extends User{
    private String firstName="";
    private String LastName="";
    private String personalID="";

    public Individual(String s, String name, String id, String firstName, String lastName, String personalID) {
        this.firstName = firstName;
        LastName = lastName;
        this.personalID = personalID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPersonalID() {
        return personalID;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Individual that = (Individual) o;

        return personalID != null ? personalID.equals(that.personalID) : that.personalID == null;
    }

    @Override
    public int hashCode() {
        return personalID != null ? personalID.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", personalID='" + personalID + '\'' +
                ", adrres='" + adrres + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean searchObject(String query) {
        if(this.getPhoneNumber().contains(query) ||
                this.getAdrres().contains(query) ||
                this.getCity().contains(query) ||
                this.getFirstName().contains(query) ||
                this.getLastName().contains(query) ||
                this.getPersonalID().contains(query))
            return true;
        return false;
    }
}
