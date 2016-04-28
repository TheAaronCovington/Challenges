/*  DESCRIPTION:  Check if a string (first argument, str) ends with the given target string (second argument, target).
*/
function confirmEnding(str, target) {
  if(str.substring(str.length - target.length, str.length) === target){
    return true;
  }
  return false;
}

confirmEnding("Bastian", "n");
