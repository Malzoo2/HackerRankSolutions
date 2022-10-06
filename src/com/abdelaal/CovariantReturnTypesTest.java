package com.abdelaal;

import java.io.*;

class Flower {
	String whatsYourName() {
		return "I have many names and types";
	}
}

class Jasmine extends Flower {
	@Override
	String whatsYourName() {
		return "Jasmine";
	}
}

class Lotus extends Flower {
	@Override
	String whatsYourName() {
		return "Lotus";
	}
}

	class Lily extends Flower {
		@Override
		String whatsYourName() {
			return "Lily";
		}
	}

	class Region {
		Flower yourNationalFlower() {
			return new Flower();
		}
	}

	class WestBengal extends Region {
		Jasmine yourNationalFlower() {
			return new Jasmine();
		}	
	}

	class AndhraPradesh extends Region {
		Lily yourNationalFlower() {
			return new Lily();
		}	
	
	}

public  class CovariantReturnTypesTest {

	public static void main(String[] args) throws IOException  {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String str = br.readLine().replaceAll("\\s+$", "").trim();
	      Region region = null;
	      switch (str) {
	        case "WestBengal":
	          region = new WestBengal();
	          break;
	        case "AndhraPradesh":
	          region = new AndhraPradesh();
	          break;
	      }	      
	      Flower flower = region.yourNationalFlower();
	      System.out.println(flower.whatsYourName());
	      br.close();
	    }

}
