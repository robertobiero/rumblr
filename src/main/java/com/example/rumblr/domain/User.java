package com.example.rumblr.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;

    @Entity
    public class User  {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "userId", nullable = false, updatable = false)
        @NotNull
        private Integer userId;

        @NotNull
        @Size(min=5, max=16)
        private String username;

        @NotNull
        private String password;

        @NotNull
        @Size(min=5, max=16)
        private String firstName;

        @NotNull
        @Size(min=5, max=16)
        private String lastName;

        @NotNull
        @Size(min=5, max=50)
        private String email;

        @NotNull
        @Size(min=5, max=16)
        private String phone;

        private boolean enabled = true;


        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
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

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        @Override
        public String toString() {
            return "User{" +
                    "userId=" + userId +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    //  ", appointmentList=" + appointmentList +
                    //  ", recipientList=" + recipientList +
                    //    ", userRoles=" + userRoles +
                    '}';
        }




        public boolean isEnabled() {
            return enabled;
        }
}
