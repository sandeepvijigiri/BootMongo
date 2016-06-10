package main.model;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "agreement_containers")
public class Product {
    @Id
    private String id;
    
    @Field(value = "container_unique_id_reference_to_master_unique_id")
    private String containerUniqueId;
    
    @Field(value="account_id")
    private String accountId;
    
    @Field(value="tag_array")
    private List<String> tagArray;
    
    @Field(value="agreement_versions")
    private List<AgreementVersions> agreementVersions;
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContainerUniqueId() {
        return containerUniqueId;
    }

    public void setContainerUniqueId(String containerUniqueId) {
        this.containerUniqueId = containerUniqueId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setState(String accountId) {
        this.accountId = accountId;
    }
    
    public List<String> getTagArray() {
		return tagArray;
	}

	public void setTagArray(List<String> tagArray) {
		this.tagArray = tagArray;
	}
	
	public List<AgreementVersions> getAgreementVersions() {
		return agreementVersions;
	}

	public void setAgreementVersions(List<AgreementVersions> agreementVersions) {
		this.agreementVersions = agreementVersions;
	}

     @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", containerUniqueId='" + containerUniqueId + '\'' +
                ", tagArray=" + tagArray + 
                ", agreementVersions=" + agreementVersions + 
                ", accountId='" + accountId + "'}";
    }


	

	
}
