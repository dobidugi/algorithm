function solution(n, m) {
    var answer = [];
    answer.push(gcd(n,m));
    answer.push(lcd(n,m));
    return answer;
}
function lcd(n,m){
    return n*m/gcd(n,m);
}
function gcd(n,m){
    while(m){
        let t = m;
        m = n % m;
        n = t;
    }
    return n;
}