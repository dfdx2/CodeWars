/* 
Create a function taking a positive integer as its parameter and 
returning a string containing the Roman Numeral representation 
of that integer.  Modern Roman numerals are written by expressing 
each digit separately starting with the left most digit and 
skipping any digit with a value of zero. In Roman numerals 1990 
is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is 
written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol 
in descending order: MDCLXVI.

Example:

conversion.solution(1000); //should return "M"

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000

Remember that there can't be more than 3 identical symbols in a row.

More about roman numerals -

http://en.wikipedia.org/wiki/Roman_numerals

*/




public class Conversion {

    private static String getSymbol(int num, String one, String five, String ten) {
        switch (num) {
            case 1:
                return one;
            case 2:
                return one + one;
            case 3:
                return one + one + one;
            case 4:
                return one + five;
            case 5:
                return five;
            case 6:
                return five + one;
            case 7:
                return five + one + one;
            case 8:
                return five + one + one + one;
            case 9:
                return one + ten;
        }

        return "";
    }

    public String solution(int n) {
        StringBuilder result = new StringBuilder();
        while (n >= 1000) {
            result.append("M");
            n -= 1000;
        }
        if (n >= 100) {
            result.append(getSymbol(n / 100, "C", "D", "M"));
            n %= 100;
        }
        if (n >= 10) {
            result.append(getSymbol(n / 10, "X", "L", "C"));
            n %= 10;
        }
        if (n > 0) {
            result.append(getSymbol(n, "I", "V", "X"));
        }

        return result.toString();
    }
}