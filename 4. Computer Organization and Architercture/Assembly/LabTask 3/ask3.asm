TITLE Erg3

ASSUME CS: KODIKAS, DS: DEDOMENA

KODIKAS SEGMENT
ARXI:

  MOV AX, DEDOMENA
  MOV DS, AX

  LEA DX, MSG1
  MOV AH, 09H
  INT 21H

  MOV CX, 40
  
  LEA BX, BUFFER
 

INPUT:
  MOV AH, 01H
  INT 21H
  
  CMP AL, 13
  JE OUTPUT

  CMP AL, 46
  JE STORE_CHAR
  
  CMP AL, 020H  
  JE STORE_CHAR
  
  CMP AL, '.'
  JE STORE_CHAR
  
  CMP AL, '@'
  JE STORE_CHAR
   
  CMP AL, 'A'
  JB INPUT  
    
  CMP AL, 'Z'
  JBE STORE_CHAR    
      
  CMP AL, 'a'
  JB INPUT    
       
  CMP AL, 'z'
  JBE STORE_CHAR      
        
  JMP INPUT


STORE_CHAR:
  MOV [BX], AL
  INC BX
   
  LOOP INPUT

  
OUTPUT:
  CMP BX, '0'
  JNE CHECK_BUFFER:
  JE ERROR
  
  
CHECK_BUFFER:
             
  MOV CX, BX
  LEA BX, BUFFER 
  
CHECK:
  
  MOV DL, [BX]
  INC BX
  
  CMP DL, '@'
  JE PRINT_BUFFER
  
  LOOP CHECK
  
  JMP ERROR 
  
  
PRINT_BUFFER:

  LEA DX, MSG3
  MOV AH, 09H
  INT 21H

  MOV CX, BX
  LEA BX, BUFFER  
  
  
PRINT:  

  MOV DL, [BX]
  INC BX
  
  CMP DL, '@'
  JNE DO_NOTHING
  JE FINISH
  
     
DO_NOTHING:

  MOV AH, 02H
  INT 21H
 
  LOOP PRINT
  
ERROR:  
  
  LEA DX, MSG2
  MOV AH, 09H
  INT 21H
  

FINISH:

  MOV AH, 04CH
  INT 21H

KODIKAS ENDS

DEDOMENA SEGMENT
  BUFFER DB 40 dup(0)
  MSG1 DB "Eisagete to email sas: $"
  MSG2 DB 10,13,"Den grapsate swsta to email sas $"
  MSG3 DB 10,13,"Kalwsorisate: $"
DEDOMENA ENDS

END ARXI
