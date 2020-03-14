//java program to draw house using awt....
import java.awt.*;
class CanvesOne{
    CanvesOne() {
        Frame f= new Frame("Canvas Prac");
        Canvas canvas = new MyCanvas();
        f.add(canvas);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String args[]){
        new CanvesOne();
    }
}
class MyCanvas extends Canvas{
    MyCanvas(){
        setBackground(Color.GREEN);
        setSize(400,400);
    }
    public void paint(Graphics g){
        int x[]={200,100,300};
        int y[]={100,200,200};
        g.setColor(Color.gray);
        Polygon p =new Polygon(x, y, 3);
        g.fillPolygon(p);
        g.setColor(Color.red);
        g.fillRect(100, 200, 200, 120);
        g.setColor(Color.white);
        g.fillRect(150,220,100,60);
        g.setColor(Color.black);
        g.drawLine(170, 220, 170, 280);
        g.drawLine(190, 220, 190, 280);
        g.drawLine(210, 220, 210, 280);
        g.drawLine(230, 220, 230, 280);
    }
}