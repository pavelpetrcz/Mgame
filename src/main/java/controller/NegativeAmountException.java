package controller;

public class NegativeAmountException extends Exception {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String title;
    private String header;
    private String content;

    public NegativeAmountException(String title, String header, String content) {

        this.title = title;
        this.header = header;
        this.content = content;

    }



}
