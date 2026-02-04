package my.edu.aiu.mybookapp;

import java.time.LocalDate;

public class Book {
    private int id;
    private String title;
    private double price;
    private boolean isEbook;
    private LocalDate purchasedDate;

    // Constructor
    public Book(int id, String title, double price, boolean isEbook, LocalDate purchasedDate) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.isEbook = isEbook;
        this.purchasedDate = purchasedDate;
    }

    public Book() {
        this.id = id = 0;
        this.title = title = "No title";
        this.price = price = 0.00;
        this.isEbook = isEbook = false;
        this.purchasedDate = purchasedDate = LocalDate.now();


        // Setters
        public void setId(int id) {
            this.id = id;
        }


        public void setTitle(String title) {
            this.title = title;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setEbook(boolean ebook) {
            isEbook = ebook;
        }

        public void setPurchasedDate(LocalDate purchasedDate) {
            this.purchasedDate = purchasedDate;
        }

        // Getters
        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public double getPrice() {
            return price;
        }

        public boolean isEbook() {
            return isEbook;
        }

        public LocalDate getPurchasedDate() {
            return purchasedDate;
        }
    }
