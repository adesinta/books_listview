package com.ades.ade_sinta_f55121062aplikasi_uts;

public class BooksData {

    private String booksName;
    private String booksDate;
    private Integer booksImage;

    public BooksData(String booksName, String booksDate, Integer booksImage) {
        this.booksName = booksName;
        this.booksDate = booksDate;
        this.booksImage = booksImage;
    }

    public String getBooksName() {
        return booksName;
    }

    public void setBooksName(String booksName) {
        this.booksName = booksName;
    }

    public String getBooksDate() {
        return booksDate;
    }

    public void setBooksDate(String booksDate) {
        this.booksDate = booksDate;
    }

    public Integer getBooksImage() {
        return booksImage;
    }

    public void setBooksImage(Integer booksImage) {
        this.booksImage = booksImage;
    }
}