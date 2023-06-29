package org.huang.whale.utils;

import org.huang.whale.bean.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class Util {
    public static User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
