package com.smashcorp.batchprocessing.jobflow.processor;

import org.springframework.batch.item.ItemProcessor;
import com.smashcorp.batchprocessing.jobflow.model.PlanetInfo;

public class CustomItemProcessor implements ItemProcessor<PlanetInfo, PlanetInfo> {
    @Override
    public PlanetInfo process(PlanetInfo info) throws Exception {

        if (info.getCategory() == "IBP") {
        	info.setSector("Home");
        } else {
        	info.setSector("Extract");
        }
        System.out.println("PlanetInfo Name:" + info.getName() +":: Sector -"+ info.getSector());
		
	return info;
	
    }
} 