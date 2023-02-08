package learning;

import java.util.regex.Pattern;

public class RegexDemo {

	public static void showOutput(String pattern, String text, boolean result) {
		System.out.format("%-20s %-30s %-10s", pattern, text, result);
		System.out.println();
	}

	public static void checkAndShow(String pattern, String text) {
		boolean result;
		if (Pattern.matches(pattern, text)) {
			result = true;
		} else {
			result = false;
		}
		showOutput(pattern, text, result);
	}

	public static void main(String[] args) {

		String pattern;
		String text;
		boolean result;

		// . quello che vuoi
		// * quante volte vuoi anche zero
		// + quante volte vuoi minimo una
		// ? zero volte o una volta
		// {x} x volte
		// {x,} minimo x volte
		// {x,y} minimo x volte, massimo y volte
		// ^ facoltativo, in una stringa, ne indica l'inizio
		// ^ facoltativo, in una stringa, ne indica la fine
		pattern = ".*mario.*";
		text = "samperimario75@gmail.com ";
		checkAndShow(pattern, text);

		pattern = "mario.+samperi";
		text = "mariosamperi";
		checkAndShow(pattern, text);

		pattern = "^.*mario.*$";
		text = "samperimario75@gmail.com";
		checkAndShow(pattern, text);

		pattern = "marios*";
		text = "mario";
		checkAndShow(pattern, text);

		pattern = "marios+";
		text = "mario";
		checkAndShow(pattern, text);

		pattern = "marios?";
		text = "mario";
		checkAndShow(pattern, text);

		pattern = "marios?";
		text = "marioss";
		checkAndShow(pattern, text);

		pattern = "marios{4}";
		text = "mariossss";
		checkAndShow(pattern, text);

		pattern = "marios*";
		text = "mariossssss";
		checkAndShow(pattern, text);

		pattern = ".mario.";
		text = "samperimario75@gmail.com";
		checkAndShow(pattern, text);

		pattern = "...mario...";
		text = "erimario75@";
		checkAndShow(pattern, text);

		// [Mm] either M or m
		pattern = "[Mm]ario.*";
		text = "mario";
		checkAndShow(pattern, text);

		pattern = "[Mm]ario";
		text = "Mario";
		checkAndShow(pattern, text);

		pattern = "Mari[oaz]";
		text = "Mario";
		checkAndShow(pattern, text);

		pattern = "Mari[oaz]";
		text = "Maria";
		checkAndShow(pattern, text);

		pattern = "Mari[oaz]";
		text = "Mariz";
		checkAndShow(pattern, text);

		// [0-9] qualsiasi singolo numero da zero a nove
		pattern = "[0-9]am";
		text = "4am";
		checkAndShow(pattern, text);

		pattern = "[0-9]am";
		text = "15am";
		checkAndShow(pattern, text);

		pattern = "[a-z]_prova";
		text = "h_prova";
		checkAndShow(pattern, text);

		pattern = "[a-z]_prova";
		text = "H_prova";
		checkAndShow(pattern, text);

		pattern = "[A-Z]_prova";
		text = "H_prova";
		checkAndShow(pattern, text);

		pattern = "[a-zA-Z0-9]_prova";
		text = "6_prova";
		checkAndShow(pattern, text);

		pattern = "[a-zA-Z0-9]_prova";
		text = "w_prova";
		checkAndShow(pattern, text);

		// ^ significa "non"
		pattern = "[^0-9]_prova";
		text = "6_prova";
		checkAndShow(pattern, text);

		pattern = "[^0-9]_prova";
		text = "%_prova";
		checkAndShow(pattern, text);

		pattern = "[^aeiou]_prova";
		text = "a_prova";
		checkAndShow(pattern, text);

		// \\d significa [0-9] (the first sign is an escape \)
		pattern = "\\d_prova";
		text = "7_prova";
		checkAndShow(pattern, text);

		// \\D significa [^0-9] (no zero to nine)
		pattern = "\\D_prova";
		text = "7_prova";
		checkAndShow(pattern, text);

		pattern = "\\D_prova";
		text = "x_prova";
		checkAndShow(pattern, text);

		// \\w significa [a-zA-Z0-9]
		pattern = "\\w_prova";
		text = "7_prova";
		checkAndShow(pattern, text);

		// \\W significa [^a-zA-Z0-9]
		pattern = "\\W_prova";
		text = "7_prova";
		checkAndShow(pattern, text);

		pattern = "\\W_prova";
		text = "%_prova";
		checkAndShow(pattern, text);

		// \\s significa ogni escape char [\t\n\xOB\f\r]
		pattern = "\\s_prova";
		text = "\t_prova";
		checkAndShow(pattern, text);

		// \\S significa nessun escape char [^\t\n\xOB\f\r]
		pattern = "\\S_prova";
		text = "\t_prova";
		checkAndShow(pattern, text);

		// | significa or
		pattern = "react|angular";
		text = "angular";
		checkAndShow(pattern, text);

		// [a-c[1-3]] singolo carattere tra a-c o tra 1-3
		pattern = "[a-c[1-3]]";
		text = "z";
		checkAndShow(pattern, text);

		// [a-c[1-3]] singolo carattere tra a-c o tra 1-3
		pattern = "[a-c[1-3]]";
		text = "2";
		checkAndShow(pattern, text);

		// [a-z&&[xyz]] entrambe le condizioni vanno soddisfatte
		pattern = "[a-z&&[xyz]]";
		text = "a";
		checkAndShow(pattern, text);

		pattern = "\"[^@]*\"";
		text = "\"samperimario75dsafsads.gmailcom\"";
		checkAndShow(pattern, text);
		
		
		
		
	}
	
	
}
