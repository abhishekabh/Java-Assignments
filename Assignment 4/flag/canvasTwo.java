import java.awt.*;
import java.awt.geom.Line2D;
class Flag{
    Flag(){
        Frame f =new Frame("Nepal Flag");
        Canvas canvas= new MyCanvas();
        f.add(canvas);
        f.setSize(400,600);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args){
        new Flag();
    }
}
class MyCanvas extends Canvas{
    MyCanvas(){
        setBackground(Color.white);
        setSize(500,700);
    }
    public void paint(Graphics g){
        int x[]={300,105,105};
        int y[]={250,120,252};
        int x1[]={300,105,105};
        int y1[]={400,180,400};
        Polygon p= new Polygon(x,y,3);
        Polygon p1= new Polygon(x1,y1,3);
        g.setColor(Color.red);
        g.fillPolygon(p);
        g.fillPolygon(p1);
        g.setColor(Color.blue);
        g.fillRect(100, 120, 5, 285);
        g.fillRect(100,400,205,5);
        g.fillRect(170,250,130,5);
        g.setColor(Color.blue);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g2.draw(new Line2D.Float(300, 250, 105, 120));
        g2.draw(new Line2D.Float(172, 252, 300, 400));
        g.setColor(Color.white);
        g.fillOval(130,190, 50, 50);
        g.setColor(Color.red);
        g.fillOval(130,180, 50, 50);
        
        int starX[] = {130,140,145,150,160,155,160,150,145,140,130,135};
		int starY[] = {330,330,325,330,330,335,340,340,345,340,340,335}; // Starting is 240
		Polygon star = new Polygon(starX,starY,12);
		g.drawPolygon(star);
		g.setColor(Color.white);
		g.fillPolygon(star);

        
		
	
    }
} 