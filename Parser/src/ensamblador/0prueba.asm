x db 1
a db 2
x db 1
cmp    1,0
jl     Else_Label
jmp  Exit_Label
Else_Label:


Exit_Label:

While_Label:
	codigo de evaluacion del RS_DO
cmp    1,1
jmp  Exit_Label
	jump While_Label
Exit_Label:
