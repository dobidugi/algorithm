// 2018 카카오톡 블라인드
function solution(dartResult) {
    var answer = 0;
    let flag = false;
    let dataList = parsePoint(dartResult);
    let pointList = calcPoint(dataList);
    pointList.forEach(ele => answer+=ele );
    return answer;
}

function parsePoint(dartResult){
    let loop = dartResult.length;
    let flag = false;
    let dataList = [];
    let str = "";
    let index=0;
    for(let i=0; i<loop;i++){
        if( (dartResult[i]>="0" && dartResult[i]<="9" && flag === true ) ){
            flag = false;
            dataList.push(str);
            str = "";
            index++;
        }
        if( dartResult[i]>="0" && dartResult[i]<="9" && flag === false ){
            str+=dartResult[i];
            if(dartResult[i]==="1" && dartResult[i+1]==="0"){
                flag = false;
            }
            else {
                flag = true;
            }
        }
        else if( dartResult[i]==="S" || dartResult[i]==="D" || dartResult[i]==="T" || dartResult[i]==="#" ){
            str+=dartResult[i];
        }
        else if( dartResult[i]==="*" ) {
            str+="V";
            if(index!=0){
                dataList[index-1]+="V";
            }
        }

    }
    if(str.length!=0){
        dataList.push(str);
    }
    return dataList;
}

function calcPoint(dataList){
    let loop = dataList.length;
    let str;
    let pointList = [];
    let flag = false;
    let num1;
    for( let i=0; i<loop; i++ ){
        str="";
        for(let j=0; j<dataList[i].length; j++){
            if( dataList[i][j]>="0" && dataList[i][j]<="9"){
                if( dataList[i][j]=="1" && dataList[i][j+1]=="0" ) {
                    num1=10;
                 }
                else if( dataList[i][j]=="0" && dataList[i][j-1]=="1"){

                }
                else {
                    num1=parseInt(dataList[i][j]);
                }
            }
            else if ( dataList[i][j]=="S" ) {
                num1 *= 1;
            }
            else if ( dataList[i][j]=="D" ) {
                num1 = num1 * num1;
            }
            else if ( dataList[i][j]=="T" ){
                num1 = num1 * num1 * num1;
            }
            else if( dataList[i][j]=="#" ){
                num1*=-1;
            }
            else if( dataList[i][j]=="V" ){
                num1*=2;
            }

            if( dataList[i].length-1 === j ){
                pointList.push(num1);
            }
        }
    }
    return pointList;
}