package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public boolean function (User user, List<User> allUsers) {
        if (user==null || user.getPassword()==null || user.getEmail()==null){   // 1, 2, 3
            throw new RuntimeException("Mandatory information missing!"); // 25
        }

        if (user.getUsername()==null){  // 4
            user.setUsername(user.getEmail()); // 5
        }

        int same = 1; // 6
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) {
            same = 0; // 7
            for (int i=0;i<allUsers.size();i++) {   // 8
                User existingUser = allUsers.get(i);

                if (existingUser.getEmail() == user.getEmail()) { // 9
                    same += 1; // 10
                }

                if (existingUser.getUsername() == user.getUsername()) { // 11
                    same += 1; // 12
                }
            }
        }

        // 13
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        String password = user.getPassword();
        String passwordLower = password.toLowerCase();

        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) {
            return false; // 14
        }
        else { // 15
            if (!passwordLower.contains(" ")) { // 16
                for (int i = 0; i < specialCharacters.length(); i++) { // 17
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) { // 18
                        return same == 0;   // 19
                    }
                    // 20
                }
                // 21
            }
        }
        return false; // 22
    }

}