package com.smashcorp.batchprocessing.jobflow.reader;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.smashcorp.batchprocessing.jobflow.model.PlanetInfo;

public class CustomFieldSetMapper implements FieldSetMapper<PlanetInfo> {


	public PlanetInfo mapFieldSet(FieldSet fieldSet) throws BindException {

		PlanetInfo PlanetInfo = new PlanetInfo();
		PlanetInfo.setId(fieldSet.readInt(0));
		PlanetInfo.setName(fieldSet.readString(1));
		PlanetInfo.setCategory(fieldSet.readString(2));
		PlanetInfo.setHabitable(fieldSet.readString(3));

		return PlanetInfo;

	}

}