import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MjavaExample {

	public static void main(String[] args) {
		
		
		try {
			MongoClient mongo=new MongoClient("localhost",27017);
			DB db=mongo.getDB("db2");
        DBCollection collection=db.getCollection("Employee");
        BasicDBObject document=new BasicDBObject();
        document.append("Eid", 3);
        document.append("Ename","saikiran");
        document.append("Sal",2500);	
        document.append("Role","TeamLead");
		collection.insert(document)	;
        System.out.println("Data Stored Successfully..");
        
        
	}catch (Exception e) {
		System.out.println(e);
	}

}
}