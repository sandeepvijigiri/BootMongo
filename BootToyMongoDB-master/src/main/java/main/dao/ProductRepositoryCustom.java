package main.dao;

import main.model.Product;
import main.model.TopLevelCountReport;

import java.util.List;


public interface ProductRepositoryCustom {
    public List<TopLevelCountReport> findBySkuOnlyAvailablesCustom(String sku);
}
