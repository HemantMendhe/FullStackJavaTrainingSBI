public class AbstractTest {
	public static void main(String[] args) {
		//Instrument i = new Instrument();
	//	MusicalInstrument i = new MusicalInstrument();
//		StringBasedMusicalInstrument i = new StringBasedMusicalInstrument();
		Guitar g = new Guitar();
		g.utilize();
		g.play();
		g.tuneStrings();
		g.pluck();
		ElectronicGuitar eg= new ElectronicGuitar();
		eg.strum();
		Violin v= new Violin();
		v.play();
		v.boeing();
		Sitar st= new Sitar();
		st.play();
		st.utilize();
		
	}
}
abstract class Instrument {
	abstract void utilize();
}
abstract class MusicalInstrument extends Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Guitar strings");
	}

	@Override
	void play() {
		System.out.println("Playing the guitar...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the guitar....");
	}
	
	
	void pluck() {
		System.out.println("Plucking the guitar....");
	}
}

class ElectronicGuitar extends Guitar
{
	void strum()
	{
		System.out.println("The Electric Guitar is played ");
	}
}
class Violin extends MusicalInstrument
{

	@Override
	void play() {

System.out.println("Playing the violin");
		
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the violin");
		
	}
	
	void boeing()
	{
		System.out.println("the violin is boeing");
	}
}
class Cello extends Violin
{
	
}
class Sitar extends MusicalInstrument
{

	@Override
	void play() 
	{
		
		System.out.println("playing the sitar");
	}

	@Override
	void utilize()
	{
	System.out.println("utilizing the sitar");	
		
	}
	
}