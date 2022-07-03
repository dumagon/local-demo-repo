
//package com.zach.Java_for_Dummies.databasics;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

public static void main(String[] args){

final String CONNECTION = "jdbc:derby: AccountDatabase;create=true";

try(
    Connection conn = DriverManager.getConnection(CONNECTION);
    Statement statement = conn.createStatement()  ){

       //Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

        statement.executeUpdate("create table ACCOUNTS"+
                                 "( NAME VARCHAR(30) NOT NULL PRIMARY KEY,"+
                                 "ADDRESS VARCHAR(30) ,"+
                                 "BALANCE FLOAT    )"   );

System.out.println("table created");

}catch(SQLException e){
    e.printStackTrace();
}
// catch(ClassNotFoundException e){
//     e.printStackTrace();
// }

}

}