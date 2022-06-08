package app.core.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("runningCoach")
@Scope("prototype")
public class SportCoach extends Coach implements BeanNameAware {

	private String beanName;

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
		return this.beanName;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;

	}

}
