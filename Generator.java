/* 7KYU CodeWars Multiplication - Generators # 2

Multiplication - Generators #2

Generators can be used to wonderful things. You can use them 
for numerous things, but here is one specific example. You 
are studying for a test so you must practice your multiplication, 
but you don't have a multiplication table showing the different 
examples. You have decided to create a generator that prints out 
a limitless list of time tables.

Task

Your generator must take one parameter `a` then everytime the 
generator is called you must return a string in the format of: 
`'a x b = c'` where c is the answer. Also, the value of `b`, 
which starts at 1, must increment by 1 each time!

*/
public class Generator {

	private final int a;
	private int num = 1;

	private Generator(int a) {
		this.a = a;
	}

	public static Generator of(int a) {
		return new Generator(a);
	}

	public String next() {
    return a + " x " + num + " = " + (a * num++);
	}
}
/*---------------------------------------------------------------
public class Generator {

	private final int a;
	private int num = 0;

	private Generator(int a) {
		this.a = a;
	}

	public static Generator of(int a) {
		return new Generator( a );
	}

	public String next() {
		return String.format( "%d x %d = %d", a, ++num, a * num );
	}
}
-----------------------------------------------------------------
public class Generator {

	private final int a;
	private int num = 0;

	private Generator(int a) {
		this.a = a;
	}

	public static Generator of(int a) {
		return new Generator( a );
	}

	public String next() {
		return a + " x " + ++num + " = " + a * num;
	}
}
-----------------------------------------------------------------
public class Generator {

	private final int a;
	private int num = 0;

	private Generator(int a) {
		this.a = a;
	}

	public static Generator of(int a) {
		return new Generator( a );
	}

	public String next() {
		++this.num;
    return String.format("%s x %s = %s", this.a, this.num, this.a * this.num);
	}
}
-----------------------------------------------------------------
public class Generator {

	private final int a;
	private int num = 0;

	private Generator(int a) {
		this.a = a;
	}

	public static Generator of(int a) {
		return new Generator( a );
	}

	public String next() {
		num += 1;
    return a + " x " + num + " = " + a * num;
	}
}
-----------------------------------------------------------------
public class Generator {

	private final int a;
	private int num = 0;

	private Generator(int a) {
		this.a = a;
	}

	public static Generator of(int a) {
		return new Generator( a );
	}

	public String next() {
		return "%d x %d = %d".formatted(a, ++num, a * num);
	}
}
-----------------------------------------------------------------
class Generator {
	private final int a;
	private int b = 0;

	private Generator(int a) {
		this.a = a;
	}

	static Generator of(final int a) {
		return new Generator(a);
	}

	String next() {
		return String.format("%d x %d = %d", a, ++b, a*b);
	}
}
-----------------------------------------------------------------
public class Generator {

	private final int a;
	private int num = 0;

	private Generator(int a) {
		this.a = a;
	}

	public static Generator of(int a) {
		return new Generator( a );
	}

	public String next() {
		// generate your generator code here.
    num = num +1;
    int c = a*num;

    return a+" x "+num+" = "+c ;
	}
}
*/
