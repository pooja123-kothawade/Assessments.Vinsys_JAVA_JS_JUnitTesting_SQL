let timerDisplay = document.getElementById('timer');
let startBtn = document.getElementById('start');
let pauseBtn = document.getElementById('pause');
let stopBtn = document.getElementById('stop');
let resetBtn = document.getElementById('reset');
let createBtn = document.getElementById('create');
let durationInput = document.getElementById('duration');

let timer;
let remainingTime = 0;
let isRunning = false;

function formatTime(seconds) {
    let hrs = Math.floor(seconds / 3600);
    let mins = Math.floor((seconds % 3600) / 60);
    let secs = seconds % 60;
    return `${hrs.toString().padStart(2, '0')}:${mins.toString().padStart(2, '0')}:${secs.toString().padStart(2, '0')}`;
}

function updateDisplay() {
    timerDisplay.textContent = formatTime(remainingTime);
}
function editTask(button) {
  const taskText = button.previousElementSibling;
  const newText = prompt("Edit your task:", taskText.textContent);
  if (newText !== null && newText.trim() !== "") {
    taskText.textContent = newText;
  }
}

createBtn.addEventListener('click', () => {
    const input = durationInput.value.split(':'); // e.g., "01:30:00"
    const hrs = parseInt(input[0]) || 0;
    const mins = parseInt(input[1]) || 0;
    const secs = parseInt(input[2]) || 0;
    remainingTime = hrs * 3600 + mins * 60 + secs;
    updateDisplay();
});

startBtn.addEventListener('click', () => {
    if (isRunning || remainingTime <= 0) return;
    isRunning = true;
    timer = setInterval(() => {
        if (remainingTime > 0) {
            remainingTime--;
            updateDisplay();
        } else {
            clearInterval(timer);
            isRunning = false;
            alert("Time's up!");
        }
    }, 1000);
});

pauseBtn.addEventListener('click', () => {
    clearInterval(timer);
    isRunning = false;
});

stopBtn.addEventListener('click', () => {
    clearInterval(timer);
    remainingTime = 0;
    isRunning = false;
    updateDisplay();
});

resetBtn.addEventListener('click', () => {
    clearInterval(timer);
    isRunning = false;
    const input = durationInput.value.split(':');
    const hrs = parseInt(input[0]) || 0;
    const mins = parseInt(input[1]) || 0;
    const secs = parseInt(input[2]) || 0;
    remainingTime = hrs * 3600 + mins * 60 + secs;
    updateDisplay();
});
