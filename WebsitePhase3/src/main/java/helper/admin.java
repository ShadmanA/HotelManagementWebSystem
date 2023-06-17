/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author student
 */

import java.util.ArrayList;

public class admin{
    ArrayList<userInfo> users;
    
    //Collect information regarding the User
    public void addUser(userInfo user){
        this.users.add(user);
    }
    
    public void removeUser(userInfo user){
        for(int i = 0; i < this.users.size(); i++){
            if(this.users.get(i).username.equals(user.username)){
                this.users.remove(i);
            }
        }
    }
}
