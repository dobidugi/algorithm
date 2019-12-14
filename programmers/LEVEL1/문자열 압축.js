// 2020 카카오톡 블라인드 테스트

function solution(s) {
    var answer = 0;
    let loop = s.length ;
    let n = 1;
    let list = [];
    let tc = 1;
    let str = "";
    let limit;
    let resList = [];  // 결과리스트
    for (let i = 0; i < loop; i++) {
        list = strSplit(s, n++);
        tc = 1;
        str = "";
        for (let i = 0; i < list.length; i++) {

            if (list[i] === list[i + 1]) {
                tc++;

            } else {
                if (tc === 1) str += list[i];
                else str += tc.toString() + list[i];
                tc = 1;
            }
        }
        resList.push(str.length);

    }
    resList.sort((a, b) => a - b);
    answer = resList[0];
    return answer;
}

function strSplit(s, n) {
    let ret = [];
    let j = 0;
    for (let i = 0; i < s.length; i += n) {
        ret.push(s.substr(j, n));
        j += n;
    }
    return ret;
}