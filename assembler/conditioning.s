.global _start

.equ endlist , 0xaaaaaaaa
_start:
	
  MOV R0,#4
  MOV R1,#4
  
  CMP R0,R1
  
  ADDLT R2,#5
  MOVGE R3,R0  // storing a value if equal 
  MOVEQ R0,#0  // clearing registers if the value is stored away
  MOVEQ R1,#0