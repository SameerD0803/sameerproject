const accountId = 101
let accountEmail = "sameer123@gmail.com"
var accoutPass = "12432"
accountCity = "Nagpur"
let accountState; // assigned undefined by default

//accountId = 2   // not allowed 

accountEmail = "hc@hc.com"
accoutPass = "245631"
accountCity = "Hyderabad"

console.log(accountId);

/* Prefer not to use var
   because of issue in block scope and functional scope 
*/

console.table([accountId,accountEmail,accoutPass,accountCity,accountState]);