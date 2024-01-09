/* 8KYU CodeWars JS Hello World

In JavaScript, your code is running in a function, let us step by step complete your first JS function.

Look at this example:

      --------keyword "function"
      |       ----your function name  
      |       |    ---if needed, some arguments will appear in parentheses
      |       |    |
    function myfunc(){  ---------your function code will starting with "{"
      //you should type your code here
    }----------------------------ending with "}"
If we want to print some to the screen, maybe we can use Document.write() in the web, or use alert() pop your message, but Codewars did not support these methods, we should use console.log() in your function. see this example:

function printWordToScreen(){
  var somewords="This is an example."
  console.log(somewords)
}
If we run this function, This is an example. will be seen on the screen. As you see, console.log() is an useful method. You will use it a lot!

Task
Please refer to two example above and write your first JS function.

mission 1:

use keyword function to define your function, function name should be helloWorld(don't forget the () and {})

mission 2:

use keyword var (or let or const) to define a variable str, value of str should be a string: "Hello World!"(don't forget the =).

mission 3:

type the console.log() in the next line (don't forget to put the str in the parentheses).

When you have finished the work, click "Run Tests" to see if your code is working properly.

In the end, click "Submit" to submit your code pass this kata.


*/
function helloWorld() {
  var str = "Hello World!"
  console.log(str)
}
/*---------------------------------------------------------------------
function helloWorld() {
  var i = 0;
  var vаr;
  vаr = "var";
  var str = 'str'
  var summa = "";
  const f1 = "H";
  const f2 = "e";
  const f3 = "l";
  const f4 = "l";
  const f5 = "o";
  const f6 = " ";
  const f7 = "W";
  const f8 = "o";
  const f9 = "r";
  const f10 = 'l';
  const f11 = 'd';
  const f12 = "!";
  while (i!=1){
    i++;
    summa = summa + f1 + f2 + f3 + f4 + f5 + f6 + f7 + f8 + f9 + f10 + f11 + f12
  };
  if ("if" === "iF"){
    return "Error, press F5"
  } else {
    console.log(summa)
  }
}
-------------------------------------------------------------------------
const helloWorld=_=>{let str=0;console.log("Hello World!")}
-------------------------------------------------------------------------
helloWorld = () =>  console.log('Hello World!')
-------------------------------------------------------------------------
function helloWorld() // We're not monsters, so we put curly brackets on the next line...
{ 
  var str = "Hello World!"; // ...It's alive!!!
  console.log(str);
}
--------------------------------------------------------------------------
//refer to the example and write your first JS function
// ▬▬▬.◙.▬▬▬ 
// ═▂▄▄▓▄▄▂
// ◢◤█▀▀████▄▄▄▄◢◤
// █▄ █ █▄███▀▀▀▀▀▀▀╬ 
// ◥█████◤
// - [ ] ══╩══╩══
// ╬═╬
// ╬═╬
// - [ ] ╬═╬
// ╬═╬
// ╬═╬
// ╬═╬
// ╬═╬
// ╬═╬
// ╬═╬😩/🥩
// ╬═╬/▌
// ╬═╬/ \

// just dropping off my meat

const helloWorld = () => {
  const str = "Hello World!"
  console.log(str);
}

helloWorld();
-------------------------------------------------------------------------

          _____                    _____                    _____            _____           _______                 
         /\    \                  /\    \                  /\    \          /\    \         /::\    \                
        /::\____\                /::\    \                /::\____\        /::\____\       /::::\    \               
       /:::/    /               /::::\    \              /:::/    /       /:::/    /      /::::::\    \              
      /:::/    /               /::::::\    \            /:::/    /       /:::/    /      /::::::::\    \             
     /:::/    /               /:::/\:::\    \          /:::/    /       /:::/    /      /:::/~~\:::\    \            
    /:::/____/               /:::/__\:::\    \        /:::/    /       /:::/    /      /:::/    \:::\    \           
   /::::\    \              /::::\   \:::\    \      /:::/    /       /:::/    /      /:::/    / \:::\    \          
  /::::::\    \   _____    /::::::\   \:::\    \    /:::/    /       /:::/    /      /:::/____/   \:::\____\         
 /:::/\:::\    \ /\    \  /:::/\:::\   \:::\    \  /:::/    /       /:::/    /      |:::|    |     |:::|    |        
/:::/  \:::\    /::\____\/:::/__\:::\   \:::\____\/:::/____/       /:::/____/       |:::|____|     |:::|    |        
\::/    \:::\  /:::/    /\:::\   \:::\   \::/    /\:::\    \       \:::\    \        \:::\    \   /:::/    /         
 \/____/ \:::\/:::/    /  \:::\   \:::\   \/____/  \:::\    \       \:::\    \        \:::\    \ /:::/    /          
          \::::::/    /    \:::\   \:::\    \       \:::\    \       \:::\    \        \:::\    /:::/    /           
           \::::/    /      \:::\   \:::\____\       \:::\    \       \:::\    \        \:::\__/:::/    /            
           /:::/    /        \:::\   \::/    /        \:::\    \       \:::\    \        \::::::::/    /             
          /:::/    /          \:::\   \/____/          \:::\    \       \:::\    \        \::::::/    /              
         /:::/    /            \:::\    \               \:::\    \       \:::\    \        \::::/    /               
        /:::/    /              \:::\____\               \:::\____\       \:::\____\        \::/____/                
        \::/    /                \::/    /                \::/    /        \::/    /         ~~                      
         \/____/                  \/____/                  \/____/          \/____/                                  
                                                                                                                     
          _____                   _______                   _____            _____                    _____          
         /\    \                 /::\    \                 /\    \          /\    \                  /\    \         
        /::\____\               /::::\    \               /::\____\        /::\    \                /::\    \        
       /:::/    /              /::::::\    \             /:::/    /       /::::\    \              /::::\    \       
      /:::/   _/___           /::::::::\    \           /:::/    /       /::::::\    \            /::::::\    \      
     /:::/   /\    \         /:::/~~\:::\    \         /:::/    /       /:::/\:::\    \          /:::/\:::\    \     
    /:::/   /::\____\       /:::/    \:::\    \       /:::/    /       /:::/__\:::\    \        /:::/  \:::\    \    
   /:::/   /:::/    /      /:::/    / \:::\    \     /:::/    /       /::::\   \:::\    \      /:::/    \:::\    \   
  /:::/   /:::/   _/___   /:::/____/   \:::\____\   /:::/    /       /::::::\   \:::\    \    /:::/    / \:::\    \  
 /:::/___/:::/   /\    \ |:::|    |     |:::|    | /:::/    /       /:::/\:::\   \:::\____\  /:::/    /   \:::\ ___\ 
|:::|   /:::/   /::\____\|:::|____|     |:::|    |/:::/____/       /:::/  \:::\   \:::|    |/:::/____/     \:::|    |
|:::|__/:::/   /:::/    / \:::\    \   /:::/    / \:::\    \       \::/   |::::\  /:::|____|\:::\    \     /:::|____|
 \:::\/:::/   /:::/    /   \:::\    \ /:::/    /   \:::\    \       \/____|:::::\/:::/    /  \:::\    \   /:::/    / 
  \::::::/   /:::/    /     \:::\    /:::/    /     \:::\    \            |:::::::::/    /    \:::\    \ /:::/    /  
   \::::/___/:::/    /       \:::\__/:::/    /       \:::\    \           |::|\::::/    /      \:::\    /:::/    /   
    \:::\__/:::/    /         \::::::::/    /         \:::\    \          |::| \::/____/        \:::\  /:::/    /    
     \::::::::/    /           \::::::/    /           \:::\    \         |::|  ~|               \:::\/:::/    /     
      \::::::/    /             \::::/    /             \:::\    \        |::|   |                \::::::/    /      
       \::::/    /               \::/____/               \:::\____\       \::|   |                 \::::/    /       
        \::/____/                 ~~                      \::/    /        \:|   |                  \::/____/        
         ~~                                                \/____/          \|___|                   ~~              
                                                                                                                     

function helloWorld(){
    const str = "Hello World!"
    console.log(str)
}



*/