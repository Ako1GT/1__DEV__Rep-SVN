/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.IBP1.V21.P2__dao;

import com.IBP1.V21.P4__models.Login_B1;
import com.IBP1.V21.P4__models.User_B2;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

/**
 *
 * @author FA-Centrale
 */
public class UserDaoImpl implements UserDao{

    @Override
    public Login_B1 validerUser(Login_B1 logP41) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               
        
    }

    @Override
    public void registerUser(User_B2 uP41) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

class UserMapper implements RowMapper{
    public Login_B1 mapRow(ResultSet rs, int argl) throws SQLException{
        Login_B1 lb1 = new Login_B1();
        lb1.setLogin(rs.getString("login"));
        lb1.setPasswd(rs.getString("passwd"));
        return lb1;
    }

    @Override
    public int[] getRowsForPaths(TreePath[] path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

