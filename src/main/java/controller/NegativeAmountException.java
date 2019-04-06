package controller;

public class NegativeAmountException extends Exception {

    /*Getters*/

    public String getTitle() {
        return title;
    }

    public String getHeader() {
        return header;
    }

    public String getContent() {
        return content;
    }

    private String title;
    private String header;
    private String content;

    /*Constructor*/
    public NegativeAmountException(String title, String header, String content) {
        this.title = title;
        this.header = header;
        this.content = content;
    }
}
