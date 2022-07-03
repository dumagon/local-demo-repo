.global _start
_start:
	
 MOV R0,#1
 MOV R1,#2
 PUSH  {R0,R1}  // pushing values to the stack
 BL calc         // BL branch later , a return branch 
 POP {R0,R1}      // setting the values back to the registers
 B end 
 
 calc:
 
  MOV R0,#34
  MOV R1,#4
  ADD R2,R1,R0
  BX lr               // returns back to BL 
  
 end: 
 