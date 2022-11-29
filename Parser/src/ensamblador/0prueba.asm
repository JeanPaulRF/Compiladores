x db 19
jai db 10
x db 3
a db 2
cmp    1,0
jl     Else_Label
jmp  Exit_Label
Else_Label:


Exit_Label:

While_Label:
	cmp    1,1
	jl  Exit_Label
	jump While_Label

Exit_Label:
