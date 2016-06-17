package main.dao;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import main.model.Product;
import main.model.TopLevelCountReport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


import java.util.List;


// Table 5.1. Supported keywords for query methods
// http://docs.spring.io/spring-data/data-mongodb/docs/current/reference/html/mongo.repositories.html
public interface ProductRepository extends MongoRepository<Product, String> , ProductRepositoryCustom{
	   
}
