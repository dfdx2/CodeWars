/* 8KYU CodeWars For UFC Fans (Total Beginners): Conor McGregor vs George Saint Pierre

This is a beginner friendly kata especially for UFC/MMA fans.

It's a fight between the two legends: Conor McGregor vs George Saint Pierre in Madison Square Garden. Only one fighter will remain standing, and after the fight in an interview with Joe Rogan the winner will make his legendary statement. It's your job to return the right statement depending on the winner!

If the winner is George Saint Pierre he will obviously say:

"I am not impressed by your performance."
If the winner is Conor McGregor he will most undoubtedly say:

"I'd like to take this chance to apologize.. To absolutely NOBODY!"
Good Luck!

Note
The given name may varies in casing, eg., it can be "George Saint Pierre" or "geOrGe saiNT pieRRE". Your solution should treat both as the same thing (case-insensitive).

*/

var quote = function(fighter) {
  var a = fighter.toLowerCase();
  if (a.includes("george saint pierre")) {
    return "I am not impressed by your performance.";
  }
  return "I'd like to take this chance to apologize.. To absolutely NOBODY!";
};
/*-------------------------------------------------------------------------------
var quote = function(fighter) {
  switch(fighter.toLowerCase()) {
    case 'conor mcgregor': return "I'd like to take this chance to apologize.. To absolutely NOBODY!";
    case 'george saint pierre': return "I am not impressed by your performance.";
    default : 'Who are you?' 
  }
};
----------------------------------------------------------------------------------
var quote = function(fighter) {
  return fighter.toLowerCase() === "george saint pierre" ? "I am not impressed by your performance." : "I'd like to take this chance to apologize.. To absolutely NOBODY!";
};
---------------------------------------------------------------------------------
const quote = fighter => fighter.toLowerCase() === 'conor mcgregor' ? "I'd like to take this chance to apologize.. To absolutely NOBODY!" : "I am not impressed by your performance."
----------------------------------------------------------------------------------
var quote = function(fighter) {
  if (fighter === 'george saint pierre') {
    return  "I am not impressed by your performance.";
  } else if (fighter ===  'Conor McGregor') {
  return "I'd like to take this chance to apologize.. To absolutely NOBODY!";
  } else if (fighter === 'George Saint Pierre') {
  return  "I am not impressed by your performance.";
  } else if (fighter ===  'conor mcgregor'){
 return "I'd like to take this chance to apologize.. To absolutely NOBODY!";
  } else if (fighter === 'GEORGE SAINT PIERRE') {
  return  "I am not impressed by your performance.";
  } else if (fighter ===  'CONOR MCGREGOR'){
 return "I'd like to take this chance to apologize.. To absolutely NOBODY!";
  } 
};
---------------------------------------------------------------------------------
var quote = function (fighter) {

	switch (fighter.toLowerCase()) {
  
		case 'george saint pierre':
			return 'I am not impressed by your performance.';
      
		case 'conor mcgregor':
			return 'I\'d like to take this chance to apologize.. To absolutely NOBODY!';
      
    case 'alistair overeem':
      return 'I clearly felt the tap';
      
    case 'Julian “Nitrane” Lane':
      return 'Let me bang, bro';
      
    case 'Chris Weidman\'s Dad':
      return 'ANd thHis iS sTIll My bOi'.toLowerCase();
    
    case 'Luke Rockhold':
      return 'That\'s how you overcome things, that\'s how you put yourself out there, you believe it and you achieve it';
      
    case 'Michael Bisping':
      return 'Conceive, believe, achieve. Shut the **** up';
      
    case 'Yoel Romero':
      return 'I looove u Mike';
      
    case 'Khabib':
      return 'Send me location';
    
    case 'Nate Diaz':
      return 'I\'m not surprised, ***********'
	}
};
----------------------------------------------------------------------------------
var quote = function(fighter) {
  return fighter.toLowerCase() == "conor mcgregor" ? "I'd like to take this chance to apologize.. To absolutely NOBODY!" : "I am not impressed by your performance.";
};
----------------------------------------------------------------------------------
const quote = fighter =>
  /conor mcgregor/i.test(fighter) ? `I'd like to take this chance to apologize.. To absolutely NOBODY!` : `I am not impressed by your performance.`;
*/