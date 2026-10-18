import java.awt.*;
/** 
 * @author Jimmy McGuigan
 */

/* Question 1: 
 * The variable type to be used would be boolean,by setting size 
 * based on the amount of lives Mario has to the boolean 
 * of true and false, big and small, a if/else can be made to change size. 
 * 
 * Question 2:
 * The variables that represent Mario jumping can be set to a boolean and
 * a int, The distance on how high Mario can jump will be represented by
 * a int type and the action causing Mario to jump be it a click or a key
 * press will be true or false as a boolean.
 * 
 * Question 3:
 *  Coins would be represented as a int, any collection of coins would be
 *  collected by a second int, and if/else statements would determine 
 *  the collection of each coin in the game. 
 */

public class MarioGame 
{
	int x;
	int y;
    private boolean isJumping;
    private int coinsCollected;

    public void moveLeft() 
    {
        x -= 1;
    }

    public void moveRight() 
    {
        x += 1;
    }

    public void jump() 
    {
        if (!isJumping) 
        {
            isJumping = true;
        }
        else 
        {
        	isJumping =false;
        }
    }  
    public void collectCoin()
        {
            coinsCollected++;
        }

    public int getCoinsCollected()
        {
            return coinsCollected;
        }

}
