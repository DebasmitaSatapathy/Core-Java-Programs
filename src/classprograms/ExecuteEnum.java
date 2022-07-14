package classprograms;

import classprograms.EnumProgram.Level;

class EnumProgram{
	enum Level{
		Low,
		Medium,
		High 
	}
}

public class ExecuteEnum {

	public static void main(String[] args) {
		EnumProgram enumObj = new EnumProgram();
		System.out.println("Enum values are");
		for (Level enumLevel : Level.values()) {
			System.out.println(enumLevel);
		}
	}

}
