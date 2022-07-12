TITLE ASK01

ASSUME CS: KWDIKAS, DS: DEDOMENA

KWDIKAS SEGMENT
    ARXI:
    
        MOV AX, DEDOMENA
        MOV DS, AX
        
        LEA DX,MINIMA
        MOV AH,9
        INT 21H
        
        MOV AL, N1
        MOV BL, N2
        MUL BL
        MOV CX, AX
        
        MOV AL, N3
        ADD AL, N4
        MOV BX, AX
        
        SUB CX, BX
        
        MOV BX, CX
        MOV AX, CX
        
        MOV CL,10
        DIV CL
        
        MOV CL, AH
        MOV BL, AL
        
        MOV DL,BL
        ADD DL,48
        MOV AH,2
        INT 21H
        
        MOV DL,CL
        ADD DL,48
        MOV AH,2
        INT 21H           
        
        MOV AH, 04CH
        INT 21H 
        
KWDIKAS ENDS

DEDOMENA SEGMENT
    
    N1  DB 4
    N2  DB 9
    N3  DB 12
    N4  DB 8
    MINIMA DB "TO APOTELESMA EINAI:  $"     
    
DEDOMENA ENDS


END ARXI
 