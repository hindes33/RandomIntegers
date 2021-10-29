package randomintegers;

import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom randomNumbers = new SecureRandom();
		
		int numberOfOnes = 0;
		int numberOfTwos = 0;
		int numberOfThrees = 0;
		int numberOfFours = 0;
		int numberOfFives = 0;
		int numberOfSixes = 0;
		
		for (int counter = 1; counter <= 100; counter++) {
			//pick random number from 1 to 6
			int face = 1 + randomNumbers.nextInt(6);
			
			System.out.printf("%d", face);
			
			switch (face) {
			case 1: numberOfOnes++; break;
			case 2: numberOfTwos++; break;
			case 3: numberOfThrees++; break;
			case 4: numberOfFours++; break;
			case 5: numberOfFives++; break;
			case 6: numberOfSixes++; break;
			}
			
			if (counter % 5 == 0)
				System.out.println();
		}
		
		System.out.printf("Number of Ones: %d%n", numberOfOnes);
		System.out.printf("Number of Twos: %d%n", numberOfTwos);
		System.out.printf("Number of Threes: %d%n", numberOfThrees);
		System.out.printf("Number of Fours: %d%n", numberOfFours);
		System.out.printf("Number of Fives: %d%n", numberOfFives);
		System.out.printf("Number of Sixes: %d%n", numberOfSixes);

	}

}
