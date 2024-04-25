//package com.sheryians.major.controller;
//
//import com.sheryians.major.model.User;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class ProfileController {
//
//    @GetMapping("/profile")
//    public String userProfile(Model model) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if (authentication != null && authentication.isAuthenticated()) {
//            String currentUserName = authentication.getName(); // Email of the user
//            User currentUser = CustomUserDetail.getUserByEmail(currentUserName); // Fetch user details from database
//            model.addAttribute("currentUser", currentUser); // Pass user details to the template
//        }
//
//        return "profile"; // Return the Thymeleaf template name
//    }
//}
