function avg(data) {
    // your code here

    let total = 0;
    let avgPrice = 0;

    data.products.forEach( product => {
        total += product.price;
    } );

    avgPrice = total / data.products.length;

    return avgPrice;
    
}
console.log(
    avg({
        size: 3,
        products: [
            {
                name: 'Product 1',
                price: 100,
            },
            {
                name: 'Product 2',
                price: 700,
            },
            {
                name: 'Product 3',
                price: 250,
            },
        ],
    })
); // should print the average price of all products