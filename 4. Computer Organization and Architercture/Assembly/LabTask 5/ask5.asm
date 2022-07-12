TITLE Ex5

KODIKAS SEGMENT   
  ASSUME CS: KODIKAS, DS: DEDOMENA, SS: SOROS
    
  MAIN PROC NEAR
    
    MOV AX,DEDOMENA
    MOV DS,AX 
    
    ;Klisi methodou
    
    CALL INPUT_HEX
    
    ;Elegxos an to AL einai arithmos h psifio
    
    CMP AL,10
    JB MOVE1
    
    SUB AL,6
    
    MOVE1:
    
    ;Metakinisi timhs AL sto N1
    
    MOV N1,AL
    
    ;Klisi methodou
    
    CALL INPUT_HEX
    
    ;Elegxos an to AL einai arithmos h psifio
    
    CMP AL,10
    JB MOVE2
    
    SUB AL,6
    
    MOVE2:
    
    ;Metakinisi timhs AL sto N2
    
    MOV N2,AL
    
    ;Prosthesi N1 kai N2
    
    MOV BL,N1
    ADD BL,AL
    
    ;Pollaplasiasmos tou BX me to 8
    
    SHL BX,3
    
    ;Diairesh me to 16
    
    MOV AX,BX 
    MOV CL,16       
    DIV CL
    
    ;Elegxos an to AL einai sto 0A-0F
    
    CMP AL,0Ah
    JB CALL_METHOD
    
    ADD AL,6
    
   CALL_METHOD: 
    
    MOV BX,AX
     
    ;Klisi methodou
    
    CALL RESULT      
    
    MOV AH,04CH
    INT 21H

  MAIN ENDP
  
  INPUT_HEX PROC NEAR
    
    LEA DX,MINIMA
    MOV AH,09H
    INT 21H
    
   INPUT:
   
    ;Eisagoume arithmo apo 0-9 h gramma apo A-F
    
    MOV AH,07H
    INT 21H
    
    CMP AL,'0'
    JB CHARACTER
    
    CMP AL,'9'
    JA CHARACTER
    
    JMP CONVERT_TO_DIGIT
    
   CHARACTER:
    
    CMP AL,'A'
    JB INPUT
    
    CMP AL,'F'
    JA INPUT
    
    MOV DL,AL
    MOV AH,02H
    INT 21H
    
    SUB AL,49
    
    JMP RETURN
    
   CONVERT_TO_DIGIT:
   
    ;Metatropi se psifio  
       
    ADD DL,48
    
    MOV DL,AL
    MOV AH,02H
    INT 21H
    
    SUB AL,48
            
   RETURN:
    
    RET
  
  INPUT_HEX ENDP
  
  RESULT PROC NEAR
    
    ;Emfanisi minimatos 
     
    LEA DX,APOTELESMA
    MOV AH,09H
    INT 21H
    
    ;1o psifio
    
    CMP BL,10
    JB NUMBER1
    
    ADD BL,49
    
    JMP OUTPUT1
    
   NUMBER1:
    
    ADD BL,48
    
   OUTPUT1:
    
    MOV DL,BL
    MOV AH,02H
    INT 21H
    
    ;2o psifio
    
    CMP BH,10
    JB NUMBER2
    
    ADD BH,49
    
    JMP OUTPUT2
    
   NUMBER2:
    
    ADD BH,48
    
   OUTPUT2:
    
    MOV DL,BH
    MOV AH,02H
    INT 21H
    
    RET  
    
  RESULT ENDP  
  
      
KODIKAS ENDS

DEDOMENA SEGMENT 
  MINIMA DB 10,13,"Dose enan monopsifio arithmo h xaraktira: $"   
  N1 DB ?
  N2 DB ?
  APOTELESMA DB 10,13,"To apotelesma einai: $"
DEDOMENA ENDS 

SOROS SEGMENT STACK
    DB 256 DUP(0)
SOROS ENDS    

END MAIN