package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Coach {

	@Autowired
	protected CoachLicense coachLicense;
	protected String trainingPlan;

	abstract public String getTrainingPlan();

	abstract public CoachLicense getLicense();

	abstract public String getSportField();
}
