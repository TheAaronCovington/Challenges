/*  DESCRIPTION:  Repeat a given string (first argument) num times (second argument).
    Return an empty string if num is a negative number.
*/
function repeatStringNumTimes(str, num) {
  if(num < 0){
    return "";
  }
  else if(num === 0){
    return str;
  }
  var temp = str;
  for(var i = 1; i < num; i++){
    str += temp;
  }
  return str;
}

repeatStringNumTimes("abc", 3);
