//Ax, Ay, Bx, By, Px et Py sont des variables deja declarees et initialisees 		 				  		 				   
 		 				  		 				   
boolean dedans = true; 		 				  		 				   
 		 				  		 				   
//------------------------------------------------------------------------------ 		 				  		 				   
if (Bx<Ax && By>Ay){ //Top Left 		 				  		 				   
 		 				  		 				   
    if (Px>=Bx && Px<=Ax && Py>=Ay && Py<=By){ 		 				  		 				   
        dedans = true; 		 				  		 				   
    }else{ 		 				  		 				   
        dedans = false; 		 				  		 				   
    } 		 				  		 				   
} 		 				  		 				   
//------------------------------------------------------------------------------ 		 				  		 				   
if (Ax<Bx && By>Ay){ //Top Right 		 				  		 				   
 		 				  		 				   
    if (Px>=Ax && Px<=Bx && Py>=Ay && Py<=By){ 		 				  		 				   
        dedans = true; 		 				  		 				   
    }else{ 		 				  		 				   
        dedans = false; 		 				  		 				   
    } 		 				  		 				   
} 		 				  		 				   
//------------------------------------------------------------------------------ 		 				  		 				   
if (Ax<Bx && Ay>By){ //Bottom Left 		 				  		 				   
 		 				  		 				   
    if (Px>=Ax && Px<=Bx && Py>=By && Py<=Ay){ 		 				  		 				   
        dedans = true; 		 				  		 				   
    }else{ 		 				  		 				   
        dedans = false; 		 				  		 				   
    } 		 				  		 				   
} 		 				  		 				   
//------------------------------------------------------------------------------ 		 				  		 				   
if (Bx<Ax && Ay>By){ //Bottom Right 		 				  		 				   
 		 				  		 				   
    if (Px>=Bx && Px<=Ax && Py>=By && Py<=Ay){ 		 				  		 				   
        dedans = true; 		 				  		 				   
    }else{ 		 				  		 				   
        dedans = false; 		 				  		 				   
    } 		 				  		 				   
} 		 				  		 				   