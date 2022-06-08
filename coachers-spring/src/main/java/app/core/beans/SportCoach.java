package app.core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("running_coach")
@Scope("prototype")
public class SportCoach extends Coach {

	public SportCoach(@Value("${coach.plan.run}") String trainingPlan) {
		this.trainingPlan = trainingPlan;
	}

	@Override
	public String getTrainingPlan() {
		return this.trainingPlan;
	}

	@Override
	public CoachLicense getLicense() {
		return this.coachLicense;
	}

	@Override
	public String getSportField() {
		return "???";
	}

}
