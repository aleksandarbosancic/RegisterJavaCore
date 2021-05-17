package com.dejan.register;

public class WeldedFace extends User{
    private String id="";
    private String name="";

    public WeldedFace(String id1, String name1, String s, String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeldedFace that = (WeldedFace) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "WeldedFace{" +
                "adrres='" + adrres + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean searchObject(String query) {
       if(this.getPhoneNumber().contains(query) ||
                this.getAdrres().contains(query) ||
                this.getCity().contains(query) ||
               this.getId().contains(query))
           return true;
       return false;
    }
}
