package org.example;



public class Library {
    private String libraryName;
    private String libraryRegNo;
    private Address address;
    private Book [] books;

    public void lendBooks(){

    }

    public void collectDue(){

    }

    public Library(String libraryName, String libraryRegNo, Address address) {
        this.libraryName = libraryName;
        this.libraryRegNo = libraryRegNo;
        this.address = address;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryRegNo() {
        return libraryRegNo;
    }

    public void setLibraryRegNo(String libraryRegNo) {
        this.libraryRegNo = libraryRegNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
