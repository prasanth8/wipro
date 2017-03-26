class Checking{
public static void main(String arg[]){
char Alphabet='a';
if(Alphabet>=48&&Alphabet<=57){
System.out.println("Digit");	
	}else if(Alphabet>='a'&&Alphabet<='z'||Alphabet>='A'&&Alphabet<='Z')
{
	System.out.println("Alphabet");
}else {
	System.out.println("Special Character");
}
	}
}