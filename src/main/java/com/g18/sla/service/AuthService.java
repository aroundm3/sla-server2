package com.g18.sla.service;

import com.g18.sla.dto.RegisterRequest;
import com.g18.sla.entity.Account;
import com.g18.sla.entity.User;
import com.g18.sla.entity.VerificationToken;
import com.g18.sla.exceptions.AccountException;
import com.g18.sla.exceptions.SLAException;
import com.g18.sla.model.NotificationEmail;
import com.g18.sla.repository.AccountRepository;
import com.g18.sla.repository.UserRepository;
import com.g18.sla.repository.VerificationTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;
    private final VerificationTokenRepository verificationTokenRepository;

    private final MailService mailService;


    @Transactional
    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        Account account = new Account();

        user.setEmail(registerRequest.getEmail());

        account.setUsername(registerRequest.getUsername());
        account.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        account.setActive(false);
        account.setUser(user);

        userRepository.save(user);
        accountRepository.save(account);
        String token = generateVerificationToken(account);

        //send mail for
        mailService.sendMail(new NotificationEmail("Please Active your Account", user.getEmail(),
                "Thank you for signing up SLS, " +
                        "please click on the below url to activate your account: " +
                        "http://localhost:8080/api/auth/accountVerification/" + token));
    }

    //check email exists
    private boolean checkEmailExistence(String email) {
        Optional<User> user = userRepository.findByEmail(email);
        return user.isPresent();
    }

    //check username exists
    private boolean checkUsernameExistence(String username){
        Optional<Account> account = accountRepository.findByUsername(username);
        return account.isPresent();
    }

    //gen token to send client when register to active account
    private String generateVerificationToken(Account account) {
        String token = UUID.randomUUID().toString();
        VerificationToken verificationToken = new VerificationToken();
        verificationToken.setToken(token);
        verificationToken.setAccount(account);

        verificationTokenRepository.save(verificationToken);
        return token;
    }


}
