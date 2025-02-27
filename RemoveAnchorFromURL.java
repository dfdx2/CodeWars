/* 7KYU CodeWars Remove Anchor From URL

Complete the function/method so that it returns the url with anything after the anchor (#) removed.

Examples
"www.codewars.com#about" --> "www.codewars.com"
"www.codewars.com?page=1" -->"www.codewars.com?page=1"

*/
public class RemoveAnchorFromURL {
    public static String removeUrlAnchor(String url) {
      int a = url.indexOf("#");
      return a > 0 ? url.substring(0, a) : url;
    }
}
