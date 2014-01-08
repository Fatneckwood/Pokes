package im_winning;
import java.util.Scanner;
public class PokemonMain {
	private int healff;
	private int powa;
	private int datfast;

	public PokemonMain(int healff, int powa, int datfast){
		this.datfast = datfast;
		this.powa = powa;
		this.healff = healff;
	}
	
	public void rival(PokemonMain rival, PokemonMain player){
		System.out.println("Spruce: Hello Cal/Jacob/James and welcome to the wonderful world of pokemon! ");
		System.out.println("Spruce: This here my main whore. Err, what's its name again?");
		Scanner response = new Scanner(System.in);
		String name = response.nextLine();
		System.out.println("Spruce: Ah yes, " + name + "is its name. I remember now! Anywho, why don't you choose a pokemon, Uh what's your name?");
		Scanner newresponse = new Scanner(System.in);
		String newname = newresponse.nextLine();
		System.out.println("Spruce: "+ newname + "is it? Alright settle down now. Sit on down and choose a pokemon. Your choices are Weedle, Piplup, and a Speed Boost Blaziken. " +
				"Which would you prefer?");
		Scanner whichpokemon = new Scanner(System.in);
		String pokemon = whichpokemon.nextLine();
		System.out.println("Spruce: Oh, you want the" + pokemon +" pokemon right?" );
		//add if statements
		System.out.println(name+ ": Hey fight me irl kid.");
		Scanner we_fightin = new Scanner(System.in);
		String fight = we_fightin.nextLine();
		//add if statements
		System.out.println( fight + "? What the fuck did you just fucking say about me, you little bitch? I’ll have you know I graduated top of my class in the Navy Seals, and I’ve been involved in numerous secret raids on Al-Quaeda, and I have over 300 confirmed kills. I am trained in gorilla warfare and I’m the top sniper in the entire US armed forces. You are nothing to me but just another target. I will wipe you the fuck out with precision the likes of which has never been seen before on this Earth, mark my fucking words. You think you can get away with saying that shit to me over the Internet? Think again, fucker. As we speak I am contacting my secret network of spies across the USA and your IP is being traced right now so you better prepare for the storm, maggot. The storm that wipes out the pathetic little thing you call your life. You’re fucking dead, kid. I can be anywhere, anytime, and I can kill you in over seven hundred ways, and that’s just with my bare hands. Not only am I extensively trained in unarmed combat, but I have access to the entire arsenal of the United States Marine Corps and I will use it to its full extent to wipe your miserable ass off the face of the continent, you little shit. If only you could have known what unholy retribution your little “clever” comment was about to bring down upon you, maybe you would have held your fucking tongue. But you couldn’t, you didn’t, and now you’re paying the price, you goddamn idiot. I will shit fury all over you and you will drown in it. You’re fucking dead, kiddo. "); 
		
	}

	public void we_fightin(PokemonMain pokemon1, PokemonMain pokemon2){
		do{
			System.out.println(pokemon1+ "has been sent to battle!" + pokemon2 + "is not happy!");
			pokemon2.healff = pokemon2.healff - pokemon1.powa;
			System.out.println(pokemon1+ "showed" + pokemon2+ "dat powa!!" + pokemon2 + "is hurting after" + pokemon1.powa+ "domage!");
			pokemon1.healff = pokemon1.healff - pokemon2.powa;
			System.out.println(pokemon2+ "showed" + pokemon1+ "dat powa!!" + pokemon1 + "is hurting after" + pokemon2.powa+ "domage!");
			pokemon2.healff = pokemon2.healff - pokemon1.powa;
		
		}while(true);
	}

}
