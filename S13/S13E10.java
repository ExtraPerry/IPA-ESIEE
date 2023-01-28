import static java.lang.Math.sqrt; 		 				  		 				   
 		 				  		 				   
class Point { 		 				  		 				   
    private float x; 		 				  		 				   
    private float y; 		 				  		 				   
 		 				  		 				   
    public Point(){ 		 				  		 				   
        this.x = (float)1.0; 		 				  		 				   
        this.y = (float)1.0; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public Point(float x, float y){ 		 				  		 				   
        this.x = x; 		 				  		 				   
        this.y = y; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public float getX(){ 		 				  		 				   
        return this.x; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public float getY(){ 		 				  		 				   
        return this.y; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public void setX(float x){ 		 				  		 				   
        this.x = x; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public void setY(float y){ 		 				  		 				   
        this.y = y; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public void decale(float dx, float dy){ 		 				  		 				   
        this.x += dx; 		 				  		 				   
        this.y += dy; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public float distance(Point p2){ 		 				  		 				   
        return (float)sqrt(((p2.getX() - this.x) * (p2.getX() - this.x)) + ((p2.getY() - this.y) * (p2.getY() - this.y))); 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public Point barycentre(Point p){ 		 				  		 				   
        p.x = (float)((p.x+x)/2.0); 		 				  		 				   
        p.y = (float)((p.y+y)/2.0); 		 				  		 				   
        return p; 		 				  		 				   
    } 		 				  		 				   
} 		 				  		 				   