package com.nowcoder.model;

/**
 * Created by zjs on 2017/2/23.
 */
public class HostHolder {
    private static ThreadLocal<User> users = new ThreadLocal<User>();

    public User getUser(){
        return users.get();
    }
    public void setUser(User user){
        users.set(user);
    }
    public void clear(){
        users.remove();
    }

}
