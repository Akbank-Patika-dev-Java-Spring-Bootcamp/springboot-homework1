package application.country;


import java.time.LocalDateTime;
import java.util.UUID;


public class Country {

    private String id;

    private String name;

    private String president;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public Country(String name, String president) {
        this.name = name;
        this.president = president;
        this.id = String.valueOf(UUID.randomUUID());
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPresident() {
        return president;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
