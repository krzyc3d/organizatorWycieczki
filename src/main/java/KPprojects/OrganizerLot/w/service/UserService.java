package KPprojects.OrganizerLot.w.service;

import KPprojects.OrganizerLot.w.entity.User;
import KPprojects.OrganizerLot.w.model.UserModel;
import KPprojects.OrganizerLot.w.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserService {

    private UserModel userModel;

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    public void intializeSession(){
        userModel = new UserModel();
    }

    public void setUserDataForTheSession(UserModel userModel){
        this.userModel.setEmail (userModel.getEmail());
        this.userModel.setFirstName(userModel.getFirstName());
        this.userModel.setLastName(userModel.getLastName ());
        this.userModel.setPassword (userModel.getPassword());
        this.userModel.setPhoneNumber (userModel.getPhoneNumber());
        this.userModel.setIdNumber(userModel.getIdNumber ());

    }

    @Transactional
    public  void saveUser(){
            User entity = User.builder()
                    .email(userModel.getEmail())
                    .firstName(userModel.getFirstName())
                    .lastName(userModel.getLastName())
                    .password(passwordEncoder.encode(userModel.getPassword()))
                    .phoneNumber(userModel.getPhoneNumber ())
                    .idNumber(userModel.getIdNumber())
                    .build();


            entity=userRepository.save(entity);

    }
}
