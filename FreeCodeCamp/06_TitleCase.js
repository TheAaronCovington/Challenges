/*DESCRIPTION: Return the provided string with the first letter of each word capitalized. Make sure the rest
of the word is in lower case.
For the purpose of this exercise, you should also capitalize connecting words like "the" and "of".
*/
function titleCase(str) {
  var words = str.split(" ");
  for(var i = 0; i < words.length; i++){
    var x = words[i].slice(0, 1).toUpperCase();
    words[i] = x + words[i].slice(1, words[i].length).toLowerCase();
  }
  str = words.join(" ");
  return str;
}

titleCase("I'm a little tea pot");
