package com.test.elasticsearch.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ScriptType;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.data.elasticsearch.core.query.UpdateQuery;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {
	
   @Autowired
   private ElasticsearchOperations elasticsearchOperations;

   public void testUpdateQuery() {
	
	   Map<String,Object> params = new HashMap<>(); 
	   params.put("message","this is a test message to test");
	   
	   UpdateQuery updateQuery = UpdateQuery.builder(
			Query.findAll()).withScriptType(ScriptType.STORED) 
			.withScriptName("updateScript01").withParams(params).build();
	   
	 this.elasticsearchOperations.update(updateQuery,IndexCoordinates.of("sampleIndex1"));
  }
	 
}
