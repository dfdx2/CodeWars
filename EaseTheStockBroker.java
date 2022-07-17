/*  6KYU CodeWars   Ease the Stock Broker
Clients place orders to a stockbroker as strings. The order can be 
simple or multiple or empty.
Type of a simple order: Quote/white-space/Quantity/white-space/Price/white-space/Status
where Quote is formed of non-whitespace character, Quantity is an int, 
Price a double (with mandatory decimal point "." ), Status is represented 
by the letter B (buy) or the letter S (sell).

Example:
"GOOG 300 542.0 B"

A multiple order is the concatenation of simple orders with a comma between each.

Example:
"ZNGA 1300 2.66 B, CLH15.NYM 50 56.32 B, OWW 1000 11.623 B, OGG 20 580.1 B"

or

"ZNGA 1300 2.66 B,CLH15.NYM 50 56.32 B,OWW 1000 11.623 B,OGG 20 580.1 B"

To ease the stockbroker your task is to produce a string of type

"Buy: b Sell: s" where b and s are 'double' formatted with no decimal, 
b representing the total price of bought stocks and s the total price of sold stocks.

Example:
"Buy: 294990 Sell: 0"

Unfortunately sometimes clients make mistakes. When you find mistakes in orders, 
you must pinpoint these badly formed orders and produce a string of type:

"Buy: b Sell: s; Badly formed nb: badly-formed 1st simple order ;
badly-formed nth simple order ;"

where nb is the number of badly formed simple orders, b representing the total 
price of bought stocks with correct simple order and s the total price of sold 
stocks with correct simple order.

Examples:
"Buy: 263 Sell: 11802; Badly formed 2: CLH16.NYM 50 56 S ;OWW 1000 11 S ;"

"Buy: 100 Sell: 56041; Badly formed 1: ZNGA 1300 2.66 ;"

Notes:
If the order is empty, Buy is 0 and Sell is 0 hence the return is: "Buy: 0 Sell: 0".
Due to Codewars whitespace differences will not always show up in test results.
With Golang (and maybe others) you can use a format with "%.0f" for "Buy" and "Sell".

*/

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class OrdersSummary {
    public static String balanceStatements(String lst) {
        String[] orders = lst.trim().split(",");
        for (int i = 0; i < orders.length; i++) {
            orders[i] = orders[i].trim();
        }
        ArrayList<String> badlyOrders = new ArrayList<>();
        double buy = 0, sell = 0;
        for (String order : orders) {
            try {
                Double orderResult = getOrderResult(order);
                if (orderResult >= 0) {
                    buy += orderResult;
                } else {
                    sell += orderResult;
                }
            } catch (Exception e) {
                badlyOrders.add(order);
            }
        }

        String result = "Buy: " + Math.round(buy) + " Sell: " + Math.round(Math.abs(sell));
        if (!badlyOrders.isEmpty()) {
            result += "; Badly formed " + badlyOrders.size() + ": ";
            for (String badlyOrder : badlyOrders) {
                result += badlyOrder + " ;";
            }
        }
        return result;
    }

    private static Double getOrderResult(String order) {
        if (order.isEmpty()) {
            return 0d;
        }

        String[] columns = order.split(" ");
        if (columns.length != 4) {
            throw new InvalidParameterException();
        }

        int quantity = Integer.parseInt(columns[1]);

        if (!columns[2].contains(".")) {
            throw new InvalidParameterException();
        }
        double price = Double.parseDouble(columns[2]);

        String status = columns[3];
        if (status.equalsIgnoreCase("B") && status.equalsIgnoreCase("S")) {
            throw new InvalidParameterException();
        }

        double result = quantity * price;
        if (status.equalsIgnoreCase("S")) {
            result *= -1;
        }
        return result;
    }
}