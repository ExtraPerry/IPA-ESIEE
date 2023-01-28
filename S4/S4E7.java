//Ax,Ay,Bx,By,Cx,Cy,Dx et Dy sont des variables deja declarees et initialisees 		 				  		 				   
 		 				  		 				   
float AB = distance(Ax,Ay,Bx,By); 		 				  		 				   
float AC = distance(Ax,Ay,Cx,Cy); 		 				  		 				   
float AD = distance(Ax,Ay,Dx,Dy); 		 				  		 				   
 		 				  		 				   
float BC = distance(Bx,By,Cx,Cy); 		 				  		 				   
float BD = distance(Bx,By,Dx,Dy); 		 				  		 				   
 		 				  		 				   
float CD = distance(Cx,Cy,Dx,Dy); 		 				  		 				   
 		 				  		 				   
double Temp_1 = 0; 		 				  		 				   
int Temp_2 = 0; 		 				  		 				   
 		 				  		 				   
if (AB < CD) { 		 				  		 				   
    Temp_1 = AB; 		 				  		 				   
    Temp_2 = 1; 		 				  		 				   
} else { 		 				  		 				   
    Temp_1 = CD; 		 				  		 				   
} 		 				  		 				   
if (AC < Temp_1){ 		 				  		 				   
    Temp_1 = AC; 		 				  		 				   
    Temp_2 = 2; 		 				  		 				   
} 		 				  		 				   
if (AD < Temp_1){ 		 				  		 				   
    Temp_1 = AD; 		 				  		 				   
    Temp_2 = 3; 		 				  		 				   
} 		 				  		 				   
if (BC < Temp_1){ 		 				  		 				   
    Temp_1 = BC; 		 				  		 				   
    Temp_2 = 4; 		 				  		 				   
} 		 				  		 				   
if (BD < Temp_1){ 		 				  		 				   
    Temp_1 = BD; 		 				  		 				   
    Temp_2 = 5; 		 				  		 				   
} 		 				  		 				   
if (CD <= Temp_1){ 		 				  		 				   
    Temp_1 = CD; 		 				  		 				   
    Temp_2 = 6; 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
switch (Temp_2) { 		 				  		 				   
    case 1 : 		 				  		 				   
        affiche("AB"); 		 				  		 				   
        break; 		 				  		 				   
    case 2 : 		 				  		 				   
        affiche("AC"); 		 				  		 				   
        break; 		 				  		 				   
    case 3 : 		 				  		 				   
        affiche("AD"); 		 				  		 				   
        break; 		 				  		 				   
    case 4 : 		 				  		 				   
        affiche("BC"); 		 				  		 				   
        break; 		 				  		 				   
    case 5 : 		 				  		 				   
        affiche("BC"); 		 				  		 				   
        break; 		 				  		 				   
    case 6 : 		 				  		 				   
        affiche("CD"); 		 				  		 				   
        break; 		 				  		 				   
} 		 				  		 				   