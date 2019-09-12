import javax.swing.*;
import java.util.Date;

public class Message {
    private Date createdAt;
    private Date updatedAt;
    private String message;
    private String author;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Message{" +
                "createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", message='" + message + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


    public void update(String updateMessage) {

    }

    public Message(String message) {
        this.message = message;
        this.author = System.getProperty("user.name");
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }
}