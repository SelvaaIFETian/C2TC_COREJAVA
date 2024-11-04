//Program to define class Notepad 
package tns.ifet.dayfive.multilevelinheritence.texteditor;

public class Notepad {
    protected String content;

    public Notepad() {
        this.content = "";
    }

    public void write(String text) {
        content += text;
    }

    public void displayContent() {
        System.out.println("Notepad Content: " + content);
    }
}

