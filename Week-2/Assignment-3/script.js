function count(input) {
// your code here
    //input字元轉ascii碼，我的第一直覺做法
    let answer = [];
    for( let voc = 0; voc < 26; voc++ ) {
        const vocArray = input.filter( element => element.charCodeAt() === voc + 97);
        if( vocArray[0] !== undefined ) {
            answer += `${vocArray[0]}:${vocArray.length} `;
        }
    }
    //console.log(answer);
    return answer;

    //後來看影片學到reduce，想說可以用，但發現還是不會寫，主要被if判斷條件卡很久，參考網路上的寫法也看不太懂count[item]，後來問GPT才知道是在訪問物件屬性
    // const vocArray = input.reduce( (count, item) => {
    //     if( count[item] ) {//訪問物件 count 中名為 value 的屬性
    //         count[item]++;
    //         console.log(count);
    //         console.log(item);//a
    //         console.log(count[item]);//2
    //     }
    //     else {
    //         count[item] = 1
    //     };
    // return count;
    // }, {});

    // console.log(vocArray);
}

let input1 = ["a", "b", "c", "a", "c", "a", "x"];
console.log(count(input1));
// should print {a:3, b:1, c:2, x:1}

function groupByKey(input) {
// your code here
    const group = input.reduce( ( count, item ) => {
        if( count[item.key] ) {
            count[item.key] += item.value;
            //console.log(count[item.key]);
        }
        else {
            count[item.key] = item.value;
        }
        return count;
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