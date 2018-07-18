import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class DisplayData {

	public static void main(String[] args) {

		try {
			MongoClient mongo = new MongoClient("localhost", 27017);
			DB db = mongo.getDB("db2");
			DBCollection collection = db.getCollection("Employee");
			DBCursor cursor = collection.find();
     while(cursor.hasNext()) {
    	 System.out.println(cursor.next());
     }
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("Data not Their ");
			System.out.println("Please Insert Data...");
		}
	}

}
