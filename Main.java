package cw22Dec;

public class Main {

	public static void main(String[] args) throws Exception {
		FizzBuzz fb=new FizzBuzz();
		System.out.println(fb.say(10));
		System.out.println(fb.say(9));
		System.out.println(fb.say(7));
		
		PlaintextToHtmlConverter pthc= new PlaintextToHtmlConverter();
		System.out.println(pthc.toHtml());
		
		
		TriviaGame tg=new TriviaGame();
		tg.add("Sakib");
		tg.add("Mukit");
		tg.add("Faysal");
		tg.roll(5);
		tg.roll(4);
		tg.roll(3);

	}

}
