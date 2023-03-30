SET name=%~n1

SET inp=%name%.g4
SET bup=%name%Visitor_backup.py
SET vis=%name%Visitor.py

ren %vis% %bup%

rem qui c'è da cancellare i file
del %name%.tokens
del %name%.interp

java org.antlr.v4.Tool -Dlanguage=Python3 -visitor %inp%