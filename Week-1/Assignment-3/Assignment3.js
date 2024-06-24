function countAandB(input) {
    var count = 0;
    for(var i = 0; i < input.length; i++){
        if(input[i] == 'a' || input[i] == 'b'){
            count++;
        }
    }
    return count;
}
function toNumber(input) {
    var number = [];
    for(var i = 0; i < input.length; i++){
        if(input[i] == 'a'){
            number[i] = 1;
        }
        else if(input[i] == 'b'){
            number[i] = 2;
        }
        else if(input[i] == 'c'){
            number[i] = 3;
        }
        else if(input[i] == 'd'){
            number[i] = 4;
        }
        else if(input[i] == 'e'){
            number[i] = 5;
        }
    }
    return number;
}
let input1 = ['a', 'b', 'c', 'a', 'c', 'a', 'c'];
console.log(countAandB(input1)); // should print 4 (3 ‘a’ letters and 1 ‘b’ letter)
console.log(toNumber(input1)); // should print [1, 2, 3, 1, 3, 1, 3]
let input2 = ['e', 'd', 'c', 'd', 'e'];
console.log(countAandB(input2)); // should print 0
console.log(toNumber(input2)); // should print [5, 4, 3, 4, 5]