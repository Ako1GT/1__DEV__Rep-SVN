/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.IBP1.V21.P2__dao;

import com.IBP1.V21.P4__models.Login_B1;
import com.IBP1.V21.P4__models.User_B2;

/**
 *
 * @author FA-Centrale
 */
public interface UserDao {
    
    Login_B1 validerUser(Login_B1 logP41);
    
    void registerUser(User_B2 uP41);
    
}
