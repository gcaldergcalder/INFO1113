public class StringLength {

	public static void main(String[] args) {
		if(args.length < 1) {
			return;
		}
		String str = args[0];
		int len = str.length();
		System.out.println(str + " is " + len + " characters long");
	}

}