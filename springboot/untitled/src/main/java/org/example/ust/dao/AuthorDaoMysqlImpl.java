package org.example.ust.dao;

import org.example.ust.dto.Author;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorDaoMysqlImpl implements AuthorDao{

    private static final String INSERT_QUERY="""
            INSERT INTO AUTHORS 
            (AUTHOR_ID,AUTHOR_NAME, GENDER, AUTHOR_EMAIL, JOIN_DATE)
            VALUES (?, ?, ?, ?, ?)
            """;

    private static final String READ_BY_ID="SELECT * FROM AUTHORS WHERE AUTHOR_ID=?";
    private static final String READ_ALL="SELECT * FROM AUTHORS";

    private static final String UPDATE_QUERY = """
            UPDATE AUTHORS
            SET AUTHOR_NAME = ?, GENDER = ?,
            AUTHOR_EMAIL = ?, JOIN_DATE = ?
            WHERE AUTHOR_ID = ?
            """;
    private static final String DELETE_QUERY = " DELETE FROM AUTHORS WHERE AUTHOR_ID = ? ";


    @Override
    public int create(Author author) {

        int updated=0;
        try(var connection = DbConnection.getConnection();
            var prepareStatement = connection.prepareStatement(INSERT_QUERY)
        ){
            connection.setAutoCommit(false);
            //PreparedStatement preparedStatement=connection.prepareStatement(INSERT_QUERY);

            prepareStatement.setInt(1,author.getAuthorId());
            prepareStatement.setString(2,author.getAuthorName());
            prepareStatement.setString(3, author.getGender());
            prepareStatement.setString(4, author.getAuthorEmail());
            prepareStatement.setDate(5, Date.valueOf(author.getJoinDate()));

            updated=prepareStatement.executeUpdate();

            connection.commit();
        }
        catch(Exception e){
            System.err.println("Error while connecting to database");
            System.err.println(e.getMessage());
        }
        return updated;
    }

    @Override
    public Optional<Author> read(int authorId) {
        Author author=null;
        try(var connection = DbConnection.getConnection();
            var prepareStatement = connection.prepareStatement(READ_BY_ID)
        ){

            prepareStatement.setInt(1,authorId);
            ResultSet resultSet= prepareStatement.executeQuery();
            if (resultSet.next()){
                author =new Author();
                author.setAuthorId(resultSet.getInt(1));
                author.setAuthorName(resultSet.getString(2));
                author.setGender(resultSet.getString(3));
                author.setAuthorEmail(resultSet.getString(4));
                author.setJoinDate(resultSet.getDate(5).toLocalDate());
            }

        }catch (Exception e){
            System.err.println("Error while connecting to database");
            System.err.println(e.getMessage());
        }
        return Optional.ofNullable(author);
    }

    @Override
    public int update(Author author) {
        return 0;
    }

    @Override
    public int delete(int authorId) {
        return 0;
    }

    @Override
    public List<Author> readAll() {
        List<Author> authors =new ArrayList<>();
        try (var connection = DbConnection.getConnection();
             var prepareStatement = connection.prepareStatement(READ_ALL)
        ) {
            ResultSet resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
                Author author = new Author();
                author.setAuthorId(resultSet.getInt(1));
                author.setAuthorName(resultSet.getString(2));
                author.setGender(resultSet.getString(3));
                author.setAuthorEmail(resultSet.getString(4));
                author.setJoinDate(resultSet.getDate(5).toLocalDate());
                authors.add(author);
            }
            prepareStatement.close();
        } catch (Exception e) {
            System.err.println("Error while connecting to database");
            System.err.println(e.getMessage());
        }
        return authors;
    }

}
