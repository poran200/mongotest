package mongotest;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class DAO {
    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    private MongoCollection<Document> collection;
    private String DbMachien = "localhost";
    private String dbport = "27017";
    private String dbName = "";
    private String userName= "";
    private  String password = "";

    public DAO() {
    }

    public DAO(String dbMachien, String dbport, String dbName, String userName, String password) {
        DbMachien = dbMachien;
        this.dbport = dbport;
        this.dbName = dbName;
        this.userName = userName;
        this.password = password;
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public MongoDatabase getMongoDatabase() {
        return mongoDatabase;
    }

    public void setMongoDatabase(MongoDatabase mongoDatabase) {
        this.mongoDatabase = mongoDatabase;
    }

    public MongoCollection<Document> getCollection() {
        return collection;
    }

    public void setCollection(MongoCollection<Document> collection) {
        this.collection = collection;
    }

    public String getDbMachien() {
        return DbMachien;
    }

    public void setDbMachien(String dbMachien) {
        DbMachien = dbMachien;
    }

    public String getDbport() {
        return dbport;
    }

    public void setDbport(String dbport) {
        this.dbport = dbport;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void DbconnectionOpen(){
        mongoClient = MongoClients.create();

    }
    public void DbconnectionOpenV1(){
        mongoClient = MongoClients.create("mongodb://"+getDbMachien()+":"+dbport);
       this.mongoDatabase= mongoClient.getDatabase("testdb");
    }
}
