const canvas = document.querySelector('canvas');
const c = canvas.getContext('2d');

canvas.width = 800
canvas.height = 575

c.fillRect(0, 0, canvas.width, canvas.height)

//Player & enemy

const gravity = 0.53
class Sprite{
    constructor ({position, velocity}) {
        this.position = position
        this.velocity = velocity
        this.height = 125
    }
    //use draw to create what spriute looks like
    draw(){
        c.fillStyle = 'gray'
        c.fillRect(this.position.x, this.position.y, 26, 100)
    }

        update(){
            this.draw()

            this.position.x += this.velocity.x
            this.position.y += this.velocity.y

            if (this.position.y + this.height + this.velocity.y >= canvas.height) {
                this.velocity.y = 0 
            }
            else this.velocity.y += gravity
        }

}

const player = new Sprite ({
    position: {
    x: 10,
    y: 10
},    velocity: {
    x: 0,
    y: 0
    }
})

player.draw()

//vs enemy
const enemy = new Sprite ({
    position: {
    x: 750,
    y: 50
},
    velocity: {
    x: 0,
    y: 0
    }
})

enemy.draw()

console.log(player)

//animate velocity of characters
const keys = {
    a: {
            pressed: false
        },
    d:{
            pressed: false
        },
    w: {
            pressed: false
        },
    s:{
            pressed: false
        },
    ArrowRight: {
            pressed: false
        },
    ArrowLeft:{
            pressed: false
        },
    ArrowUp:{
            pressed: false
        }
    }


function animate(){
    window.requestAnimationFrame(animate)
    c.fillStyle = 'black'
    c.fillRect(0, 0, canvas.width, canvas.height)
    player.update()
    enemy.update()
//;eft right
    player.velocity.x = 0
    enemy.velocity.x = 0

    if (keys.a.pressed && player.lastKey == 'a'){
        player.velocity.x = -5.518
    } else if (keys.d.pressed && player.lastKey == 'd') {
        player.velocity.x= 5.518
    }
    //enemy movement
    if (keys.ArrowLeft.pressed && enemy.lastKey == 'ArrowLeft'){
        enemy.velocity.x = -5.518
    } else if (keys.ArrowRight.pressed && enemy.lastKey == 'ArrowRight') {
        enemy.velocity.x= 5.518
    }
// up down

}


animate()
//movement animation 

window.addEventListener('keydown',(event) => {
    switch (event.key) {
        case 'd': 
        keys.d.pressed = true 
        player.lastKey = 'd'
        break
     case 'a':
        keys.a.pressed = true
        player.lastKey = 'a'
        break
    case 'w': 
        player.velocity.y = -13.5
        break

    case 'ArrowRight': 
    keys.ArrowRight.pressed = true 
    enemy.lastKey = 'ArrowRight'
    break
    case 'ArrowLeft':
    keys.ArrowLeft.pressed = true
    enemy.lastKey = 'ArrowLeft'
    break
    case 'ArrowUp': 
    enemy.velocity.y = -13.5
    break
}  
    console.log(event.key);
})

window.addEventListener('keyup',(event) => {
    switch (event.key) {
        case 'd': 
        keys.d.pressed = false
        break
        case 'a':
        keys.a.pressed = false
        break
    }  


    switch (event.key) {
        case 'ArrowRight': 
        keys.ArrowRight.pressed = false
        break
        case 'ArrowLeft':
        keys.ArrowLeft.pressed = false
        break
    }  
    console.log(event.key);
})



