.global _start
_start:
	
	MOV R0,#4
	MOV R1,#3
	
	CMP R0,R1
	BGT greater    // BLT , BGE ,BLE , BEQ , BNE  : less than ,greater or equal, equal ,not equal 
	BAL default
	
greater:

   MOV R2,R0
   MOV R0,#0
   BAL aftergreater


default:

  MOV R0,#0
  
aftergreater:

 EOR R3,R2,R1