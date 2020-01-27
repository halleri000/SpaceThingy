import java.awt.*;

public class Bullet {

    int x, y, diameter=10;
    int speed, dx, dy = -10;

    public Bullet(Player player){

        x = player.getX() + player.getWidth() / 2 - diameter / 2;
        y = player.getY() - diameter;
    }

    public void move(){
        y += dy;
    }

    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x,y,diameter,diameter);
    }

    public int getY(){
        return y;
    }
}
