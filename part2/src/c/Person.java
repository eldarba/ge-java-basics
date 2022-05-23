package c;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "id")
@EqualsAndHashCode(of = "id")
public class Person {
	
	private int id;
	private String name;
	private int age;
	
	
	
	

}
