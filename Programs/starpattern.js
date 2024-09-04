// let out = ""
// let star = -1
// let space = 4
// for(let i=1; i<=4; i++){
//     star+=2
//     space--;
//     for(let k=1;k<=space;k++){
//         out+=" "
//     }
//     for(let j=1;j<=star;j++){
//         out+="*"
//     }
    
//     out+="\n"
// }
// console.log(out) 


//==============================
// let out = ""
// let star = 0
// let space = 4
// for(let i=1; i<=4; i++){
//     let n = 1
//     star++
//     space--;
//     for(let k=1;k<=space;k++){
//         out+=" "
//     }
//     for(let j=1;j<=star;j++){
//         out+=n;
//         n++;
//     }
    
//     out+="\n"
// }
// console.log(out) 



// ================================
// let out = ""
// let star = 0

// for(let i=1; i<=4; i++){
//     star++
//     for(let j=1;j<=star;j++){
//         if((i+j)%2==0){
//             out+=0
//         } else {
//             out+=1
//         }
//     } 
//     out+="\n"
// }
// console.log(out) 


// ===============================
// let out = ""
// let star = -1
// let space = 4
// for(let i=1; i<=4; i++){
//     let n = 0
//     star+=2
//     space--;
//     for(let k=1;k<=space;k++){
//         out+=" "
//     }
//     for(let j=1;j<=star;j++){
//         if(j<=i){
//             n++;
//         } else {
//             n--;
//         }
//         out+=n;
//     }
//     out+="\n"
// }
// console.log(out) 





// ==============================
// let out = ""
// let star = -1
// let space = 4
// let n = 0;
// let ch = 'a';
// for(let i=1; i<=4; i++){
//     star+=2
//     space--;
//     for(let k=1;k<=space;k++){
//         out+=" "
//     }
//     for(let j=1;j<=star;j++){
//         if(i%2==0){
//             out+=ch
//             ch=nextCharacter(ch);
//         } else {
//             n++;
//             out+=n
//         }
        
//     }
    
//     out+="\n"
// }
// console.log(out) 

// function nextCharacter(c) {
//     return String.fromCharCode(c.charCodeAt(0) + 1);
// }

