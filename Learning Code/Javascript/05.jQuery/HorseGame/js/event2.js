// 1. left 버튼 클릭 시, 말이 50px 씩
//      왼쪽으로 이동
let move = 0

const leftMove = ()=>{
    // console.log('ck')
    if(move < 1200){
        move += 50
        $('#horse').css('right',move+'px')
    }
}
$('.left').click(()=>{
    leftMove()
})

// 2. right 버튼 클릭 시, 말이 50px 씩
//      오른쪽으로 이동
const rightMove = ()=>{
    // console.log('ck')
    if(move > 0){
        move -= 50
        $('#horse').css('right',move+'px')
    }
}
$('.right').click(()=>{
    rightMove()    
})

// 단, 말이 게임판을 벗어나지 않도록 할 것!

// 번외게임! 키보드로 작동 시키기
$('body').on('keydown',function(event){
    // console.log(event.key)
    if(event.key == 'ArrowLeft'){
        leftMove()
    }else if(event.key == 'ArrowRight'){
        rightMove()
    }else if(event.key == ' '){
        $('#horse').animate({bottom : '400px'},'100')
        $('#horse').animate({bottom : '200px'},'100')
    }
})