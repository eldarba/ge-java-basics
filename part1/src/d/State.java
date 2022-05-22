package d;

public class State {

	private String name;

	public State(String name) {
		super();
		this.name = name;
	}

	public class Citizen {
		private String name;

		public Citizen(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public String getStateName() {
			return State.this.name;
		}

	}

	public static class Flag {
		String color;
	}

}
