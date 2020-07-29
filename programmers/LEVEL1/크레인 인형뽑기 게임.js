function solution(board, moves) {
    var answer = 0;
    let item;
    const basket = [];
    moves.forEach(move => {
        const index = move-1;
        for(let i=0; i<board.length; i++){
            if(board[i][index] !=0){
                item = board[i][index];
                board[i][index] = 0;
                if(basket.length != 0) {
                    const lastItem = basket.pop();
                    if(item === lastItem) {
                        answer+=2;
                    } else {
                        basket.push(lastItem);
                        basket.push(item);
                    }
                    
                } else {
                    basket.push(item);
                }
                break;
            }
        }
    });
    return answer;
}