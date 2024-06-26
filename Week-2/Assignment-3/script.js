function count(input) {
// your code here
//input字元轉ascii碼
    for( let voc = 0; voc < 26; voc++ ) {
        const vocArray = input.filter( element => element.charCodeAt() === voc + 97);
        console.log(`${vocArray[0]}:${vocArray.length}`);
    }
}

let input1 = ["a", "b", "c", "a", "c", "a", "x"];
console.log(count(input1));
// should print {a:3, b:1, c:2, x:1}

function groupByKey(input) {
// your code here
    for( let voc = 0; voc < 26; voc++ ) {
        const vocArray = input.filter( element => element.charCodeAt() === voc + 97);
        console.log(`${vocArray[0]}:${vocArray.length}`);
    }
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