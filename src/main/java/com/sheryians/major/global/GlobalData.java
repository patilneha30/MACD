package com.sheryians.major.global;

import com.sheryians.major.model.CustomUserDetail;
import com.sheryians.major.model.Product;
import com.sheryians.major.model.User;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;

    static{
        cart=new ArrayList<Product>();

    }
//    CustomUserDetail customUserDetail = (CustomUserDetail) authentication.getPrincipal();
//    String userEmail = customUserDetail.getUsername();

//    @Getter
//    @Setter
//    public static class CartItem {
//        private User user;
//        private Product product;
//
//        public CartItem(User user, Product product) {
//            this.user = user;
//            this.product = product;
//        }
//    }

}
