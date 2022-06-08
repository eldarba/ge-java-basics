package app.core.beans;

import java.time.LocalDate;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
@Scope("prototype")
public class CoachLicense {

	private static int c = 101;

	private int number = c++;
	private LocalDate isueDate = LocalDate.now();

}
