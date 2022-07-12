TITLE Ex4

KODIKAS SEGMENT
  ASSUME CS: KODIKAS, DS: DEDOMENA, SS: SOROS
   
  MAIN PROC NEAR             
   
    MOV AX,DEDOMENA
    MOV DS,AX
    
    MOV CX,9
    LEA BX,BUFFER  
    
    LEA DX,MINIMA
    MOV AH,09H
    INT 21H
  
  INPUT: 
    MOV AH,08H
    INT 21H
    
    CMP AL,13
    JE OUTPUT
    
    CMP AL,'0'
    JB INPUT
    
    CMP AL,'9'
    JA INPUT 
    
    MOV DL,AL
    MOV AH,02H
    INT 21H
          
    SUB AL,48
   
    MOV [BX],AL 
    INC BX
 
    LOOP INPUT
    
  OUTPUT:
    
    MOV CX,BX    
    LEA BX,BUFFER

    PUSH CX
    PUSH BX
    
   ;Klisi methodou
         
    CALL find_minmax
       
    ADD SP,2
    ADD SP,2
      
    MOV AH,04CH
    INT 21H
    
  MAIN ENDP      
  
   find_minmax PROC NEAR 
    MOV BP,SP     
    
    
    MOV BX,[BP+2]
    MOV CX,[BP+4]
      
    JCXZ EMPTY_BUFFER 
    
  ; Thetoume times sto max kai min
      
   MOV MAXNUM,0   
   MOV MINNUM,9
    
    
  ; Evresi megistou kai elaxistou aritmhou
                     
   SEARCH: 
    MOV AL,[BX] 
    CMP AL,MINNUM
    JB MIN_SET 
   
  MAX_CHECK:  
    MOV AL,[BX]
    CMP AL,MAXNUM
    JA MAX_SET
        
    JMP NEXT
    
   MIN_SET:
    MOV MINNUM, AL
    JMP MAX_CHECK
   
   MAX_SET:
    MOV MAXNUM, AL
    
   NEXT:
    INC BX

    LOOP SEARCH
    
  ; Emfanisi megistou kai elaxistou aritmhou
    
    LEA DX,MAXMSG
    MOV AH,09H
    INT 21H
      
    MOV DL,MAXNUM
    ADD DL,48
    MOV AH,02H
    INT 21H
    
    LEA DX,MINMSG
    MOV AH,09H
    INT 21H
    
    MOV DL,MINNUM
    ADD DL,48
    MOV AH,02H
    INT 21H
    
  ; Vriskoume to MO tous kai ton emfanizoume  
                                                      
    MOV AL,MAXNUM
    MOV AH,0
    ADD AL,MINNUM
    
    MOV CH,2   ; MESOS OROS PROKIPTEI OTAN DIAIRO ME 2!
    DIV CH 
    
    ; SOZO STO BL TON AL
    MOV BL,AL
    
    LEA DX,MOMSG
    MOV AH,09H
    INT 21H
       
    MOV DL,BL 
    ADD DL,48   EINAI PISFIO
    MOV AH,02H
    INT 21H  

    JMP EPISTROFI
  
  ; Emfanisi minimatos otan exoume adeio pinaka 
    
  EMPTY_BUFFER:
    LEA DX,NOMSG
    MOV AH,09H
    INT 21H
  
  ; Epistrofi sthn main
    
  EPISTROFI:  
    RET

  find_minmax ENDP    
  
KODIKAS ENDS

DEDOMENA SEGMENT 
  BUFFER DB 9 DUP(0) 
  ;DILOSI METABLITON GIA MIN, MAX
  MINNUM DB ?
  MAXNUM DB ?

  MINIMA DB "Dose 9 monopsifious arithmous: $" 
  MAXMSG   DB 10,13,"Megistos arithmos: $" 
  MINMSG   DB 10,13,"Elaxistos arithmos: $"
  MOMSG  DB 10,13,"Mesos oros: $"
  NOMSG DB 10,13, "Den yparxoun arithmoi $" 
DEDOMENA ENDS

SOROS SEGMENT STACK
   DB 256 DUP(0)
SOROS ENDS SEGMENT

END MAIN