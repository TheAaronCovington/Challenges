/*  DESCRIPTION: You will be provided with an initial array (the first argument in the destroyer function), 
followed by one or more arguments. Remove all elements from the initial array that are of the same value as these arguments.
*/
function destroyer(arr) {
  var temp = [];
  var list = [];
  for(var i = 1; i < arguments.length; i++){
    list.push(arguments[i]);
  }
  for(var j = 0; j < arr.length; j++){
    if(list.indexOf(arr[j]) !== -1){
      continue;
    }
    else{
      temp.push(arr[j]);
    }
  }
  
  return temp;
}
destroyer([1, 2, 3, 1, 2, 3], 2, 3);
