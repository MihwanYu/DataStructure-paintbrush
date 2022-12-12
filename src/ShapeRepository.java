import java.awt.Color;
import java.awt.Point;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class ShapeRepository {
	int option;
	
	int minx= 1500;
	int miny = 1500;
	int maxx = 0;
	int maxy = 0;
	Point start = new Point(0,0);
	Point end = new Point(0,0);
	int width = 0;
	int height = 0;
	int [] array_x = new int [40];
	int [] array_y = new int [40];
	int size = 0;
	int moved = 0;
	int rotateRightCapacity = 0;
	int rotateLeftCapacity = 0;
	Image img ;
	ArrayList<Point> sketchSP = new ArrayList<Point>();	
	
	
	Color mypencolor = Color.white;
	Color myfillcolor = Color.white;
	int thick = 0;
	
	ShapeRepository(){
		
	}
	
	ShapeRepository(Image img){
		this.img = img;
	}
	
	ShapeRepository(ShapeRepository clone){
		option = clone.option;
		minx = clone.minx;
		miny = clone.miny;
		maxx = clone.maxx;
		maxy = clone.maxy;
		start = clone.start;
		end = clone.end;
		width = clone.width;
		height = clone.height;
		array_x = clone.array_x;
		array_y = clone.array_y;
		size = clone.size;
		moved = clone.moved;
		sketchSP = clone.sketchSP;
		mypencolor = clone.myfillcolor;
		myfillcolor = clone.myfillcolor;
		thick = clone.thick;
	}
	
}