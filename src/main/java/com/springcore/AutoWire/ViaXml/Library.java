package com.springcore.AutoWire.ViaXml;

public class Library {

    private Book1 book1;
    private Book2 book2;

    public Book1 getBook1() {
        return book1;
    }

    public void setBook1(Book1 book1) {
        this.book1 = book1;
    }

    public Book2 getBook2() {
        return book2;
    }

    public void setBook2(Book2 book2) {
        this.book2 = book2;
    }

    public Library() {
    }

    @Override
    public String toString() {
        return "Library{" +
                "book1=" + book1 +
                ", book2=" + book2 +
                '}';
    }
}
