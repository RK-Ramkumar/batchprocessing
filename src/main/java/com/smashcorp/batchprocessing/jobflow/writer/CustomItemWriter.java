package com.smashcorp.batchprocessing.jobflow.writer;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

import com.smashcorp.batchprocessing.jobflow.model.PlanetInfo;

public class CustomItemWriter implements ItemWriter<PlanetInfo> {
	

	@Override
	public void write(Chunk<? extends PlanetInfo> planetsInfo) throws Exception {
        System.out.println("Data Saving for PlanetInfo: " + planetsInfo.getItems());
		
	}
} 