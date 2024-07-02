function binarySearchPosition(numbers, target) {
    // your code here
    let indexCenter;
    let indexSmall = 0;
    let indexBig = numbers.length -1;

    // for( let i = 0; i <= Math.floor(numbers.length / 2); i++ ) {
    //     if( numbers[indexCenter] === target ) {
            
    //         return indexCenter;

    //     } else if( numbers[indexCenter] > target ) {

    //         indexBig = indexCenter;
    //         indexCenter = Math.floor(indexCenter / 2);

    //     } else if( numbers[indexCenter] < target ){

    //         indexSmall = indexCenter;
    //         indexCenter = Math.floor( ( indexSmall + indexBig ) / 2);

    //     } else {

    //         console.log('error');
    //         return -1;

    //     }
    // }

    while( indexSmall <= indexBig ) {

        indexCenter = Math.floor( ( indexSmall + indexBig ) / 2);

        if( numbers[indexCenter] > target ) {

            indexBig = indexCenter - 1;

        } else if( numbers[indexCenter] < target ){

            indexSmall = indexCenter + 1;

        } else if(numbers[indexCenter] === target) {

            return indexCenter;

        } 

    }
}
console.log(binarySearchPosition([1, 2, 5, 6, 7], 1)); // should print 0
console.log(binarySearchPosition([1, 2, 5, 6, 7], 6)); // should print 3