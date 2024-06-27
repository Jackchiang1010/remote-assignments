function count(input) {
// your code here
    //input字元轉ascii碼，我的第一直覺做法
    // let answer = [];
    // for( let voc = 0; voc < 26; voc++ ) {
    //     const vocArray = input.filter( element => element.charCodeAt() === voc + 97);
    //     if( vocArray[0] !== undefined ) {
    //         answer += `${vocArray[0]}:${vocArray.length} `;
    //     }
    // }
    // //console.log(answer);
    // return answer;

    const vocArray = input.reduce( ( count, item ) => {
        if( count[item] ) {
            count[item]++;
        }
        else {
            count[item] = 1;
        }
        return count;
    }, {} );
    return vocArray;
}

let input1 = ["a", "b", "c", "a", "c", "a", "x"];
console.log(count(input1));
// should print {a:3, b:1, c:2, x:1}

function groupByKey(input) {
// your code here
   const group = input.reduce( ( sum, object ) => {
        
        if( sum[object.key] ) {
            sum[object.key] + object.value;
        }
        else {
            sum[object.key] = object.value;
        }
        return sum;
   }, {} );
   return group;
}

let input2 = [
{ key: "a", value: 3 },
{ key: "b", value: 1 },
{ key: "c", value: 2 },
{ key: "a", value: 3 },
{ key: "c", value: 5 },
];

console.log(groupByKey(input2));
// should print {a:6, b:1, c:7}