/*  DESCRIPTION: Write a function that splits an array (first argument) into groups the length of size 
(second argument) and returns them as a two-dimensional array.
*/

function chunkArrayInGroups(arr, size) {
  var result = [];
  var N = arr.length/size;
  for(var i = 0; i < N; i++){
    result.push(arr.slice(0, size));
    arr = arr.slice(size, arr.length);
  }
  return result;
}

chunkArrayInGroups(["a", "b", "c", "d"], 2);
