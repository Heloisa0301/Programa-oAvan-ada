package com.unicesumar.repository;

import com.unicesumar.entities.User;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserRepository implements EntityRepository<User>{
    private final Connection connection;

    public UserRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(User entity) {
        String query = "INSERT INTO users (uuid, name, email, password) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement pstmt = this.connection.prepareStatement(query);
            pstmt.setString(1, entity.getUuid().toString());
            pstmt.setString(2, entity.getName());
            pstmt.setString(3, entity.getEmail());
            pstmt.setString(4, entity.getPassword());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<User> findById(UUID id) {
        String query = "SELECT * FROM users WHERE UUID = ?";

        try {
            PreparedStatement pstmt = this.connection.prepareStatement(query);
            pstmt.setString(1, id.toString());
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()){
                User user = new User(
                        UUID.fromString(resultSet.getString("uuid")),
                        resultSet.getString("name"),
                        resultSet.getString("password"),
                        resultSet.getString("email")
                );
                return Optional.of(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        String query = "SELECT * FROM users";
        List<User> users = new ArrayList<>();

        try{
            PreparedStatement pstmt = this.connection.prepareStatement(query);
            ResultSet resultSet = pstmt.executeQuery();

            while(resultSet.next()){
                User user = new User(
                        UUID.fromString(resultSet.getString("uuid")),
                        resultSet.getString("name"),
                        resultSet.getString("password"),
                        resultSet.getString("email")
                );
                users.add(user);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public void deleteById(UUID id) {
        String query = "DELETE FROM users WHERE uuid = ?";

        try{
            PreparedStatement pstmt = this.connection.prepareStatement(query);

            pstmt.setString(1, id.toString());
            pstmt.executeUpdate();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
