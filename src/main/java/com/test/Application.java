package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {
    //psvm
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/springdata";
        String username = "suran";
        String password = "pass";

        try(Connection connection= DriverManager.getConnection(url,username,password)){
            System.out.println("connection created : " + connection);

            //String sql = "CREATE TABLE ACCOUNT(id int, username varchar(255), password varchar(255));";

            String sql = "INSERT INTO ACCOUNT VALUES(1, 'suran','pass');";

            //try with resource 자동으로 자원을 정리하는 메소드 호출 함
            try(PreparedStatement statement = connection.prepareStatement(sql)){
                statement.execute();
            }
        }
    }
}
