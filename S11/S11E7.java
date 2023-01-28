void smiley(String a, String b, int x, int y) 		 				  		 				   
{ 		 				  		 				   
    //Eyes = a.charAt(0) 		 				  		 				   
    //Mouth = a.charAt(1) 		 				  		 				   
    //Colour = b 		 				  		 				   
    //coory X = c 		 				  		 				   
    //coory Y = y 		 				  		 				   
 		 				  		 				   
    setStrokeWidth(5); 		 				  		 				   
 		 				  		 				   
    if (b.equals("black")){ //Decides Stroke color. 		 				  		 				   
        setStrokeColor("white"); 		 				  		 				   
    }else{ 		 				  		 				   
        setStrokeColor("black"); 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    setFillColor(b);        ////Make base circles on the canvas. 		 				  		 				   
    circle(x, y, 50); 		 				  		 				   
 		 				  		 				   
    if (b.equals("black")){ //Decides Fill color. 		 				  		 				   
        setFillColor("white"); 		 				  		 				   
    }else{ 		 				  		 				   
        setFillColor("black"); 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    switch(a.charAt(0)){    //Choose the style of the Eyes. 		 				  		 				   
 		 				  		 				   
        case ':' : 		 				  		 				   
            circle(x - 20, y - 20, 10);//Left. 		 				  		 				   
            circle(x + 20, y - 20, 10);//Right. 		 				  		 				   
            break; 		 				  		 				   
 		 				  		 				   
        case 'X' : 		 				  		 				   
            line(x - 30, y - 30, x - 10, y - 20);//Top-Left. 		 				  		 				   
            line(x + 30, y - 30, x + 10, y - 20);//Top-Right. 		 				  		 				   
            line(x - 30, y - 10, x - 10, y - 20);//Bottom-Left. 		 				  		 				   
            line(x + 30, y - 10, x + 10, y - 20);//Bottom-Right. 		 				  		 				   
            break; 		 				  		 				   
 		 				  		 				   
        case ';' : 		 				  		 				   
            line(x - 30, y - 30, x - 10, y - 20);//Top-Left. 		 				  		 				   
            circle(x + 20, y - 20, 10);//Right. 		 				  		 				   
            break; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    switch(a.charAt(1)){    //Choose the style of the Mouth. 		 				  		 				   
 		 				  		 				   
        case 'P' : 		 				  		 				   
            setStrokeWidth(0); 		 				  		 				   
            setStrokeColor("red"); 		 				  		 				   
            setFillColor("red"); 		 				  		 				   
            rectangle(x + 0, y + 20, 20, 20); 		 				  		 				   
 		 				  		 				   
            setStrokeWidth(5); 		 				  		 				   
            if (b.equals("black")){ //Decides Fill color. 		 				  		 				   
                setStrokeColor("white"); 		 				  		 				   
            }else{ 		 				  		 				   
                setStrokeColor("black"); 		 				  		 				   
            } 		 				  		 				   
 		 				  		 				   
            line(x - 20, y + 20, x + 20, y + 20);//Flat-Mouth. 		 				  		 				   
            break; 		 				  		 				   
 		 				  		 				   
        case '|' : 		 				  		 				   
            if (b.equals("black")){ //Decides Fill color. 		 				  		 				   
                setFillColor("white"); 		 				  		 				   
            }else{ 		 				  		 				   
                setFillColor("black"); 		 				  		 				   
            } 		 				  		 				   
 		 				  		 				   
            line(x - 20, y + 20, x + 20, y + 20);//Flat-Mouth. 		 				  		 				   
            break; 		 				  		 				   
 		 				  		 				   
        case '/' : 		 				  		 				   
            if (b.equals("black")){ //Decides Fill color. 		 				  		 				   
                setFillColor("white"); 		 				  		 				   
            }else{ 		 				  		 				   
                setFillColor("black"); 		 				  		 				   
            } 		 				  		 				   
 		 				  		 				   
            line(x - 20, y + 10, x + 20, y + 30);//Diagonal-Mouth. 		 				  		 				   
            break; 		 				  		 				   
 		 				  		 				   
        case 'D' : 		 				  		 				   
            setStrokeWidth(0); 		 				  		 				   
            if (b.equals("black")){ //Decides Fill color. 		 				  		 				   
                setFillColor("white"); 		 				  		 				   
            }else{ 		 				  		 				   
                setFillColor("black"); 		 				  		 				   
            } 		 				  		 				   
 		 				  		 				   
            circle(x + 0, y + 20, 20); 		 				  		 				   
 		 				  		 				   
            setFillColor(b); 		 				  		 				   
 		 				  		 				   
            rectangle(x - 25, y - 5, 50, 25); 		 				  		 				   
            break; 		 				  		 				   
    } 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
//set exercice est horrible et manque de context. 		 				  		 				   