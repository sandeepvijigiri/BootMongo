package main.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "agreement_versions")
public class AgreementVersions {
	
	 	@Id
	    private String id;
	    
	    @Field(value = "internal_agreement_id")
	    private String internalAgreementId;
	    
	    @Field(value="drafting_status")
	    private String draftingStatus;
	    
	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getDraftingStatus() {
	        return draftingStatus;
	    }

	    public void setDraftingStatus(String draftingStatus) {
	        this.draftingStatus = draftingStatus;
	    }

	    public String getInternalAgreementId() {
	        return internalAgreementId;
	    }

	    public void setInternalAgreementId(String internalAgreementId) {
	        this.internalAgreementId = internalAgreementId;
	    }
	    
	   
	    

	     @Override
	    public String toString() {
	        return "Product{" +
	                "id='" + id + '\'' +
	                ", draftingStatus='" + draftingStatus + '\'' +
	                ", internalAgreementId='" + internalAgreementId + "'}";
	    }

		


	

}
