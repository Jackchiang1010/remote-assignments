function binarySearchPosition(numbers, target) {
    // your code here
    let indexCenter = Math.floor(numbers.length / 2);
    let indexSmall = 0;
    let indexBig = numbers.length -1;

    for( let i = 0; i <= Math.floor(numbers.length / 2); i++ ) {
        if( numbers[indexCenter] === target ) {

            //console.log(`indexCenterIF: ${indexCenter}`);
            return indexCenter;

        } else if( numbers[indexCenter] > target ) {

            indexBig = indexCenter;
            indexCenter = Math.floor(indexCenter / 2);
            //console.log(`indexBig: ${indexBig}`);
            //console.log(`indexCenter: ${indexCenter}`);

        } else if( numbers[indexCenter] < target ){

            indexSmall = indexCenter;
            indexCenter = Math.floor( ( indexSmall + indexBig ) / 2);
            //console.log(`indexSmall: ${indexSmall}`);

        } else {

            console.log('error');
            return -1;

        }
    }
}
console.log(binarySearchPosition([1, 2, 5, 6, 7], 1)); // should print 0
console.log(binarySearchPosition([1, 2, 5, 6, 7], 6)); // should print 3