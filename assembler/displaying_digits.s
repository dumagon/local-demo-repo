.equ segDisplays,0xff200020
.equ switches,0xff200040
.global _start
_start:

// LDR R0,=switches  helpful to know the value to set a number on the display
// LDR R1,[R0]        e.g #103 sets '9'

 MOV R0,#2
 MOV R1,#7
 ADD R2,R1,R0
 
 CMP R2,#9
 
 BEQ displayNine
 
 BAL end



displayNine:
 MOV R1,#103
 LDR R0,=segDisplays
 STR R1,[R0]

 B end
	
end:	

MOV R7,#1
SWI 0
	
	
	