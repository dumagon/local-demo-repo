.equ SWITCH,0xff200040
.equ  LED,0xff200000

.global _start
_start:

 LDR R0,=SWITCH  // loading the address of switches
 LDR R1,[R0]     // extracting the value from the address into the register(R1)
 
 LDR R0,=LED    // loading the address of leds
 
 STR R1,[R0]    // storing the value in the register(R1) into the stack memory address 
                // represented in the register(R0) 
	
	