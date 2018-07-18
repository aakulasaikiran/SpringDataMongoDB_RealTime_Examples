import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class UpdateData {

	public static void main(String[] args) {

		try {
			MongoClient mongo=new MongoClient("localhost",27017);
			DB db=mongo.getDB("db2");
        DBCollection collection=db.getCollection("Employee");
BasicDBObject query=new BasicDBObject();
query.put("Ename", "sai");


BasicDBObject newDocument = new BasicDBObject();
newDocument.put("Ename", "sai-updated");


BasicDBObject updateObj = new BasicDBObject();
updateObj.put("$set", newDocument);
collection.update(query, updateObj);



System.out.println("Data Updated Successfully");


      

DBCursor cursor1=collection.find();
while(cursor1.hasNext()) {
	System.out.println(cursor1.next());
}


		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
	
	
	

}
