import com.mongodb.internal.build.MongoDriverVersion;
import mongotest.DAO;
import org.bson.Document;

public class Main {
    public static void main(String[] args) {
        String version = MongoDriverVersion.VERSION;
        System.out.println("version: "+version);
        DAO dao = new DAO();
        dao.DbconnectionOpenV1();
        var user = dao.getMongoDatabase().getCollection("user");
        Document dcoment = new Document();
        dcoment.put("uname","Jone doe");
        var insertOneResult = user.insertOne(dcoment);
        System.out.println("insertOneResult = " + insertOneResult.getInsertedId());

        var documents = user.find();
        documents.forEach(document -> System.out.println(document.get("uname")));
    }
}
