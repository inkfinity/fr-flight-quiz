package hell;

import java.util.Scanner;

public class Boredom {

	public static void main(String[] args) {
		System.out.println("Please enter your first name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Nice to meet you, " + name + "!");
		System.out.println();
		System.out.println("Your being here is an indicator of one of two factors:");
		System.out.println("Either you want to find out what Flight you belong in on Flight Rising...");
		System.out.println("...or you're bored as hell. (Same)");
		System.out.println("Both are valid, so let's get started!");
		System.out.println();
		System.out.println("This quiz only consists of ONE question. **YOU MUST ANSWER IN LOWERCASE OR IT'LL BREAK**");
		System.out.println("What is your favorite type of noodle (dish)?");
		String answer = scan.next();
		System.out.println("Congration, you belong in: ");
		
		switch ( answer ) {
			case "ramen": 
					System.out.println("Wind Flight!");
					System.out.println("Wind papa likes his swirly, whirly, curly noodles. :3");
					break;
			case "lasagna": 
					System.out.println("Fire Flight!");
					System.out.println("When you eat your noodles, you expect an EXPLOSION of flavor. Get it? Explosion? ...Well, anyway, fire noodle approves.");
					break;
			case "lo mein": 
					System.out.println("Earth Flight");
					System.out.println("Such flavor, much impact, very wow.");
					break;
			case "pad thai": 
					System.out.println("Nature Flight");
					System.out.println("Earth Papa's close relative, you enjoy flavor but with just a little more...subtlety.");
					break;
			case "farfalline": 
					System.out.println("Nature Flight");
					System.out.println("Butterfly, fly away. *Cue early '00s Miley Cyrus music*");
					break;
			case "rotini":
					System.out.println("Nature Flight");
					System.out.println("Let's be real guys, the Nature Flight is a little SCREWY. Get it? Screwy? ...I'll see myself out now.");
					break;
			case "angel hair":
					System.out.println("Light Flight");
					System.out.println("Just like Glittermomma, your taste buds prefer The Lightest Touch");
					break;
			case "macaroni":
					System.out.println("Lightning Flight");
					System.out.println("IT'S IN A BOX. IT'S CONVENIENT. WE CAN WORK FASTER!!! Gotta go fast");
					break;
			case "mac and cheese":
				System.out.println("Lightning Flight");
				System.out.println("IT'S IN A BOX. IT'S CONVENIENT. WE CAN WORK FASTER!!!");
				break;
			case "ravioli":
					System.out.println("Arcane Flight");
					System.out.println("Ooh, we gonna put the sauce IN the pasta. Magical!!!! -- Magic Dad, probably");
					break;
			
			default:
					System.out.println("sry didn't get that far my friend, can only memorize So Much Pasta");
			}
		
		scan.close();
		
		}
	}


