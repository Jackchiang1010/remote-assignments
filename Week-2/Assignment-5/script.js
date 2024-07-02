function binarySearchPosition(numbers, target) {
    // your code here
    let indexCenter;
    let indexSmall = 0;
    let indexBig = numbers.length -1;

    if( target <= numbers[indexBig] ) {
        while( indexSmall <= indexBig ) {

            indexCenter = Math.floor( ( indexSmall + indexBig ) / 2);
    
            if( numbers[indexCenter] > target ) {
    
                indexBig = indexCenter - 1;
    
            } else if( numbers[indexCenter] < target ){
    
                indexSmall = indexCenter + 1;
    
            } else {
    
                //target === indexCenter
                //but indexCenter is not the first position
                indexBig = indexCenter - 1;
                //finally indexBig === indexSmall so break while loop
    
            } 
            
        }
    
        return indexCenter;

    } else {

        return -1;

    }

    

}

//console.log(binarySearchPosition([1, 2, 5, 6, 7], 1)); // should print 0
//console.log(binarySearchPosition([1, 2, 5, 6, 7], 6)); // should print 3

//console.log(binarySearchPosition([1, 2, 5, 6, 7], 5)); // should print 2
console.log(binarySearchPosition([1, 2, 5, 6, 7, 7, 7], 7)); // should print 4
console.log(binarySearchPosition([5, 5, 5, 5, 5, 5, 5], 5)); // should print 0 (the first position)
console.log(binarySearchPosition([1, 2, 5, 6, 7], 8)); // should print -1