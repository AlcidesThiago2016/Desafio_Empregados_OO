package devsuperior.entities;

public class Andress {

    private String email;
    private Integer phone;

    public Andress() {
    }

    public Andress(String email, Integer phone) {
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
