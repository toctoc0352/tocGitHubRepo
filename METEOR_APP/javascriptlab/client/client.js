window.onload = function() {
    var button = document.getElementById('button');
    // ボタンが押されたらhello()を呼ぶ
    button.addEventListener('click', function() {
        hello();
    }, false);
};
