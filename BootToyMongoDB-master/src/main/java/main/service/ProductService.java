package main.service;

import main.dao.ProductRepository;
import main.model.Product;
import main.model.TopLevelCountReport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.sort;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
	
    @Autowired
    private ProductRepository repository;
    
   
    public List<Product> getContainerUniqueId(String name){
        return repository.findByContainerUniqueId(name);
    }
    
    public List<Product> getAvailableSku(String sku){
        return repository.findBySkuOnlyAvailables(sku);
    }

    public List<TopLevelCountReport> getAvailableSkuCustom(String sku){
        return repository.findBySkuOnlyAvailablesCustom(sku);
    }
    
   /* public List<TopLevelCountReport> aggregationByAll() {
    	
	     Aggregation aggregation = newAggregation(
	       group("agreement_versions.clause.top_level_category").count().as("total")    
	     );

	     AggregationResults groupResults = mongoTemplate.aggregate(
	       aggregation, Product.class, TopLevelCountReport.class);
	     
	     List<TopLevelCountReport> salesReport = groupResults.getMappedResults();
	     System.out.println("Sales Report==="+salesReport);

	     return salesReport;
	    }*/
      
}
