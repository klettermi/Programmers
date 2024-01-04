function solution(str){
    let pCnt = 0;
    let yCnt = 0;

    str.split("").forEach(element => {
        if(element === 'p' || element === 'P') pCnt++;
        else if(element === 'y' || element === 'Y') yCnt++;
    });

    if(pCnt === yCnt) return true;
    return false;
}