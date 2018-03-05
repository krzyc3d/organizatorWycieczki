package KPprojects.OrganizerLot.w.model;

import KPprojects.OrganizerLot.w.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {


        private  Long id;

//        @NotEmpty
        @Size(min=3, max=40)
        private String firstName;

//        @NotEmpty
        @Size(max=50)
        private String lastName;

//        @NotEmpty
        @Email
        private String email;


        @Size(min=3, max=40)
        private String password;

//        @NotEmpty
//        @Size(min=7, max=13)
        private int phoneNumber;

//        @NotEmpty
//        @Size(min=8, max=16)
        private String idNumber;


    public UserModel(User userEntity) {
        this.id = userEntity.getId();
        this.email = userEntity.getEmail();
        this.firstName = userEntity.getFirstName();
        this.idNumber =userEntity.getIdNumber ();
        this.lastName = userEntity.getLastName ();
        this.password = userEntity.getPassword ();
        this.phoneNumber = userEntity.getPhoneNumber ();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}


