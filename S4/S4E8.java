int Pixel = 0; 		 				  		 				   
int Radius = 0; 		 				  		 				   
String Boutton = "Grey"; 		 				  		 				   
String ColPocket = "Grey"; 		 				  		 				   
 		 				  		 				   
switch (taille) { 		 				  		 				   
    case 'M' : 		 				  		 				   
        Pixel = 40; 		 				  		 				   
        Radius = 5; 		 				  		 				   
        break; 		 				  		 				   
    case 'L' : 		 				  		 				   
        Pixel = 44; 		 				  		 				   
        Radius = 5; 		 				  		 				   
        break; 		 				  		 				   
    case 'S' : 		 				  		 				   
        Pixel = 32; 		 				  		 				   
        Radius = 4; 		 				  		 				   
        break; 		 				  		 				   
    default : 		 				  		 				   
        Pixel = 0; 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
int HalfPixel = Pixel/2; 		 				  		 				   
 		 				  		 				   
switch (couleur) { 		 				  		 				   
    case 'r' : case 'R' : 		 				  		 				   
        setFillColor("Red"); 		 				  		 				   
        Boutton = "Black"; 		 				  		 				   
        ColPocket = "White"; 		 				  		 				   
        break; 		 				  		 				   
    case 'w' : case 'W' : 		 				  		 				   
        setFillColor("White"); 		 				  		 				   
        Boutton = "Black"; 		 				  		 				   
        ColPocket = "Black"; 		 				  		 				   
        break; 		 				  		 				   
    case 'b' : case 'B' : 		 				  		 				   
        setFillColor("Blue"); 		 				  		 				   
        Boutton = "Black"; 		 				  		 				   
        ColPocket = "White"; 		 				  		 				   
        break; 		 				  		 				   
    case 'y' : case 'Y' : 		 				  		 				   
        setFillColor("Yellow"); 		 				  		 				   
        Boutton = "Black"; 		 				  		 				   
        ColPocket = "White"; 		 				  		 				   
        break; 		 				  		 				   
    case 'g' : case 'G' : 		 				  		 				   
        setFillColor("Green"); 		 				  		 				   
        Boutton = "Black"; 		 				  		 				   
        ColPocket = "White"; 		 				  		 				   
        break; 		 				  		 				   
    default : 		 				  		 				   
        setFillColor("Black"); 		 				  		 				   
        Boutton = "White"; 		 				  		 				   
        ColPocket = "White"; 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
startPolygon(); //Start Building the T-Shirt (color is set beforhand in the switch). 		 				  		 				   
addPoint(3*Pixel,0*Pixel); 		 				  		 				   
addPoint(4*Pixel,0*Pixel); 		 				  		 				   
addPoint(6*Pixel,1*Pixel); 		 				  		 				   
addPoint(8*Pixel,0*Pixel); 		 				  		 				   
addPoint(9*Pixel,0*Pixel); 		 				  		 				   
addPoint(12*Pixel,3*Pixel); 		 				  		 				   
addPoint(10*Pixel,5*Pixel); 		 				  		 				   
addPoint(9*Pixel,4*Pixel); 		 				  		 				   
addPoint(9*Pixel,9*Pixel); 		 				  		 				   
addPoint(3*Pixel,9*Pixel); 		 				  		 				   
addPoint(3*Pixel,4*Pixel); 		 				  		 				   
addPoint(2*Pixel,5*Pixel); 		 				  		 				   
addPoint(0*Pixel,3*Pixel); 		 				  		 				   
stopPolygon(); 		 				  		 				   
 		 				  		 				   
if (chemise) { 		 				  		 				   
 		 				  		 				   
    setFillColor(ColPocket); //Start building the Collar. 		 				  		 				   
    startPolygon(); 		 				  		 				   
    addPoint(3*Pixel+HalfPixel,HalfPixel); 		 				  		 				   
    addPoint(4*Pixel,0*Pixel); 		 				  		 				   
    addPoint(6*Pixel,1*Pixel); 		 				  		 				   
    addPoint(5*Pixel+HalfPixel,1*Pixel+HalfPixel); 		 				  		 				   
    stopPolygon(); 		 				  		 				   
    startPolygon(); 		 				  		 				   
    addPoint(6*Pixel,1*Pixel); 		 				  		 				   
    addPoint(8*Pixel,0*Pixel); 		 				  		 				   
    addPoint(8*Pixel+HalfPixel,HalfPixel); 		 				  		 				   
    addPoint(6*Pixel+HalfPixel,1*Pixel+HalfPixel); 		 				  		 				   
    stopPolygon(); 		 				  		 				   
 		 				  		 				   
    setFillColor(Boutton); //Start building the Buttons. 		 				  		 				   
    line(6*Pixel+HalfPixel,1*Pixel+HalfPixel,6*Pixel+HalfPixel,9*Pixel); 		 				  		 				   
    circle(6*Pixel,2*Pixel,Radius); 		 				  		 				   
    circle(6*Pixel,4*Pixel,Radius); 		 				  		 				   
    circle(6*Pixel,6*Pixel,Radius); 		 				  		 				   
    circle(6*Pixel,8*Pixel,Radius); 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
if (poche) { 		 				  		 				   
    setFillColor(ColPocket); //Start building the Pocket. 		 				  		 				   
    startPolygon(); 		 				  		 				   
    addPoint(7*Pixel,2*Pixel); 		 				  		 				   
    addPoint(8*Pixel,2*Pixel); 		 				  		 				   
    addPoint(8*Pixel,3*Pixel+HalfPixel); 		 				  		 				   
    addPoint(7*Pixel,3*Pixel+HalfPixel); 		 				  		 				   
    stopPolygon(); 		 				  		 				   
} 		 				  		 				   