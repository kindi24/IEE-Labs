TITLE ASK2


ASSUME CS: KODIKAS DS:DEDOMENA  

KODIKAS SEGMENT
    
ARXI:
    
    MOV AX, DEDOMENA
    MOV DS, AX
    
    INPUT:
     
    LEA DX, MSG
    MOV AH, 09H
    INT 21H
    
    MOV AH, 08H
    INT 21H
    
    MOV DL, AL
    MOV AH, 02H
    INT 21H
                   
    CMP AL, '@'
    JE END        
    
    SUB AL,48    
    MOV AH,0
    
    CMP AL,9
    JA WRONG
    
    MOV BL,2
    DIV BL    
   
    CMP AH,0
    JE ARTIOS
         
    LEA DX, MSG_PER
    MOV AH, 09H
    INT 21H
    
    JMP INPUT
    
    ARTIOS:
    
        LEA DX, MSG_ART
        MOV AH, 09H
        INT 21H
        
        JMP INPUT 
        
    WRONG:
    
        LEA DX, MSG_ERR
        MOV AH, 09H
        INT 21H
        
        JMP INPUT
        
    END:
        
    MOV AH, 4CH 
    INT 21H

KODIKAS ENDS  


DEDOMENA SEGMENT
      
    
    MSG DB 10, 13,"DWSE ENA MONOPSIFIO ARITHMO H TO @: $"
    MSG_ART  DB 10,13,"O ARITHMOS EINAI ARTIOS $" 
    MSG_PER DB 10,13,"O ARITHMOS EINAI PERITTOS $"
    MSG_ERR DB 10,13,7,7,7,"PATHSES GRAMMA ANTI GIA ARITHMO H TO @ $"  
    
    
DEDOMENA ENDS


END ARXI    