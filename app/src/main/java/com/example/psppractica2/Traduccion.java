package com.example.psppractica2;

public class Traduccion {
    private String fromLang, text, to;

    public Traduccion(String fromLang, String text, String to) {
        this.fromLang = fromLang;
        this.text = text;
        this.to = to;
    }

    public String getFromLang() {
        return fromLang;
    }

    public void setFromLang(String fromLang) {
        this.fromLang = fromLang;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "fromLang=" + fromLang + '&' +
                "text=" + text + '&' +
                "to=" + to;
    }
}
