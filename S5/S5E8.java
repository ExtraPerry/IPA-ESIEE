//startX, startY, goalX et goalY sont des variables déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
int TargetX=goalX; 		 				  		 				   
int TargetY=goalY; 		 				  		 				   
 		 				  		 				   
int CurrentX=startX; 		 				  		 				   
int CurrentY=startY; 		 				  		 				   
 		 				  		 				   
if(CurrentX<TargetX){ 		 				  		 				   
    do{ 		 				  		 				   
        moveRight(); 		 				  		 				   
        CurrentX++; 		 				  		 				   
    }while(CurrentX<TargetX); 		 				  		 				   
}else if(CurrentX>TargetX){ 		 				  		 				   
    do{ 		 				  		 				   
        moveLeft(); 		 				  		 				   
        CurrentX--; 		 				  		 				   
    }while(CurrentX>TargetX); 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
if(CurrentY<TargetY){ 		 				  		 				   
    do{ 		 				  		 				   
        moveDown(); 		 				  		 				   
        CurrentY++; 		 				  		 				   
    }while(CurrentY<TargetY); 		 				  		 				   
}else if(CurrentY>TargetY){ 		 				  		 				   
    do{ 		 				  		 				   
        moveUp(); 		 				  		 				   
        CurrentY--; 		 				  		 				   
    }while(CurrentY>TargetY); 		 				  		 				   
} 		 				  		 				   