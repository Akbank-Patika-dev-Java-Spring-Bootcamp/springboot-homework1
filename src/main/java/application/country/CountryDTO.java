package application.country;


import java.time.LocalDateTime;

public class CountryDTO {

    private String name;

    private String id;

    private String president;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public CountryDTO(String name, String id, String president, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.name = name;
        this.id = id;
        this.president = president;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public String getPresident() {
        return president;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPresident(String president) {
        this.president = president;
    }
}
