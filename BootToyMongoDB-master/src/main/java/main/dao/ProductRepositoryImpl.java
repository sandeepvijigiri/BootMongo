package main.dao;

import main.model.AgreementVersions;
import main.model.Product;
import main.model.TopLevelCountReport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.UnwindOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;

import java.net.UnknownHostException;
import java.util.List;


public class ProductRepositoryImpl implements ProductRepositoryCustom {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<TopLevelCountReport> findBySkuOnlyAvailablesCustom(String name) {
       /* Criteria criteria = Criteria.where("containerUniqueId").is(name);
        return mongoTemplate.find(Query.query(criteria), Product.class);*/
    	
    	/* Aggregation aggregation = newAggregation(
    		       group("draftingStatus").count().as("total").last("draftingStatus").as("accountId")    
    		     );
    	 		     AggregationResults groupResults = mongoTemplate.aggregate(
    		       aggregation, AgreementVersions.class, TopLevelCountReport.class);
    		     
    		     List<TopLevelCountReport> salesReport = groupResults.getMappedResults();
    		     System.out.println("Sales Report==="+salesReport);*/
    	List<TopLevelCountReport> salesReport = null;
    		     mongoChk();
    		     return salesReport;		     
    	
    	
    }
    
    public String mongoChk(){
    	
    	 MongoClient mongoClient;
		try {
			 mongoClient = new MongoClient("candidate.19.mongolayer.com" , 10929 );
			
			//mongodb://eagreedev1:eagreedev1@candidate.19.mongolayer.com:10929/dev1
	         // Now connect to your databases
	         DB db = mongoClient.getDB("dev1");
	         System.out.println("Connect to database successfully");
	         boolean auth = db.authenticate("eagreedev1", "eagreedev1".toCharArray());
	         System.out.println("Authentication: "+auth);
	         DBCollection agmt_con = db.getCollection("agreement_containers");
	         System.out.println("agmt_con==="+agmt_con);
	         DBObject groupFields = new BasicDBObject( "_id", "$agreement_versions.clause.top_level_category");
	         groupFields.put("count", new BasicDBObject( "$sum", 1));
	         System.out.println("group fields===="+groupFields);
	        // DBObject unwind = new BasicDBObject("$unwind", "agreement_versions.clause");
	         DBObject group = new BasicDBObject("$group", groupFields);
	         AggregationOutput output = agmt_con.aggregate(group);
	         
	         System.out.println("output===="+output);
	         
	         
	       //  System.out.println("db collections "+db.getCollection("agreement_containers").aggregate(group("account_id").count() ,)
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
    	
    	return "";
    }
    
    
    


}
