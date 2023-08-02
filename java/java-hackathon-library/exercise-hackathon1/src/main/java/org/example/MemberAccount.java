package org.example;

public class MemberAccount {
    private int accountNo;
    private BorrowedBookInfo[] borrowedbooks;

    public void borrowBooks(){

    }

    public void returnBooks(){

    }

    public void payDues(){

    }

    public MemberAccount(int accountNo, BorrowedBookInfo[] borrowedbooks) {
        this.accountNo = accountNo;
        this.borrowedbooks = borrowedbooks;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public BorrowedBookInfo[] getBorrowedbooks() {
        return borrowedbooks;
    }

    public void setBorrowedbooks(BorrowedBookInfo[] borrowedbooks) {
        this.borrowedbooks = borrowedbooks;
    }
}
