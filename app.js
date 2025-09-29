// let arr=[32,12,32,21,3,1,2,4]
// for(let i=0;i<arr.length-1;i++){
//     for(let j=i+1;j<arr.length;j++){
//         if(arr[i]>arr[j]){
//             let temp=arr[i]
//             arr[i]=arr[j]
//             arr[j]=temp
//         }

//     }

// }
// console.log(arr)
function twoisum(arr,target){
    for(let i=0;i<arr.length;i++){
        for(let j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                return [arr[i],arr[j],[i,j]]
            }
        }
    }
    return []
}
console.log(twoisum([1,2,3,4],7))