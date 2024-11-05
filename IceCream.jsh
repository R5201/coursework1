Scanner input = new Scanner(System.in);
float v = 78;
float c = 23;
float s = 02;
float cone = 100;
float i;
System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
String f = input.nextLine();
if (f.equals("v")){i=v;} else if (f=="c"){i=c;} if (f=="s"){i=s;};
switch (f){
	case "v", "c", "s": 
		System.out.println("How many scoops would you like?");
		int scoops = input.nextInt();
		// max 3 scoops, special error message for 0
		switch (scoops){
			case 0: System.out.println("We don't sell just a cone."); break;
			case 1, 2, 3: 
				float price = (cone + (scoops*i))/100;
				System.out.printf("That will be %.2f please.%n", price);			
			break;
			default: System.out.println("That's too many scoops to fit in a cone."); break;
		}

	break;
	default: System.out.println("We don't have that flavour."); break;
}