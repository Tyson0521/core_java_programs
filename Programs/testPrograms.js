class Queue {

    constructor(){
        this.items = {};
        this.frontIndex = 0;
        this.backIndex = 0;
    }

    // enqueue(item){
    //     this.items[this.backIndex = ]
    // }
}

//20th
//count of vowels
let a = 'Hello World';
let b = "aeiouAEIOU"
let count = 0;
function countVowel(str){
    for (const s of str) {
        if(b.includes(s)){
            count++;
        }
    }
    return count
}
// console.log(countVowel(a), "count of vowels")


//19th
//second largest
let arr = [3,5,7,1,6,8,10,15,15];
function secondLargest(arr){
    let largest = arr[0];
    let secondLargest = -1;
    let third = -1;
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest) {
            secondLargest = arr[i];
        }
        // } else if(secondLargest==largest){
            
        // }
    }
    return secondLargest;
} 
console.log(secondLargest(arr));

//18th
//sorting
let c = [5,1,4,2,8]
function sort (a){      //bubble sort
    for(let i=0; i<a.length; i++) {
        
        for(let j=1; j<a.length; j++) {
            if(a[j-1]>a[i]) {
                let temp=a[j-1];
                a[j-1]=a[i];
                a[i]=temp;
            }
        }
        
    }
    return a
}
// console.log(sort(c))

function sortSelectionSort(a){
    for(let i=0; i<a.length-1; i++) {
        let min = i
        for(let j=i+1; j<a.length; j++) {
            if(a[j]<a[min]) {
                min = j;
            }
        }
        let temp=a[i];
        a[i]=a[min];
        a[min]=temp; 
        
    } 
    return a 
}
console.log(sortSelectionSort(c))



//17th
//sum of even
let d = [1,2,3,4,5,6];
let sum = 0;
function evenSum (a){
    for(let i=0; i<a.length; i++){
        if(d[i]%2==0){
            sum = sum + d[i]
        }
    }
    return sum
}
// console.log(evenSum(d))

//16th
//prime
let e = 7;
function isPrime(a){
    if(a<2){
        return false
    }
    for(let i=2; i<=a/2; i++){
        if(a%i==0){
            return false
        }
    }
    return true
}
// console.log(isPrime(e))


//10th 
//counting of words
let s = "this is a sample sentence";
s = s.trim();
function wordsCount(a){
    let char = a.split(" ").filter(function(n){
        return n!= ''
    }).length
    return char; 
}
// console.log(wordsCount(s)) 


//15th
///reverse words
function wordsReverser(string){
    return string.split('').reverse().join('');
}
// console.log(wordsReverser('New string, same results.'));

//15th
function wordsReverse(string){
    let arr = string.split("");
    let reverse = '';
    for(let i = arr.length - 1;  i >= 0; i--){
        reverse =  reverse + arr[i];
    }
    return reverse
} 
// console.log(wordsReverse("Hello World"))






// let a = 1984;

// if(a%100==0 && a%400==0){
//     console.log('leap')
// } else if(a%4==0){
//     console.log("leap")
// } else {
    // console.log("no")
    // }
    
    
function addrec(a){
    if(a<=1)
        return a;
    return a + addrec(a-1);
}
let sum1 = addrec(4);
// console.log(sum1);
    
    
    
    
