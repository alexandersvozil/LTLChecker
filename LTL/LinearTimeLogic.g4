grammar LinearTimeLogic;

formula:andformula
        |orformula
        |xformula
        |uformula
        |vformula
        | literal
        ;

 literal: vliteral
        | fliteral
        | atom
        | negatom
        ;

 vliteral: 'VERUM';
 fliteral: 'FALSUM';
 negatom: '~' ATOM;
 atom: ATOM;

orformula: '(' formula '|' formula ')';
andformula:'('formula '&' formula ')';
xformula:'(' 'X' formula')';
uformula:'('formula 'U' formula')';
vformula:'('formula 'V' formula')';
ATOM : ('a' .. 'z')+;
WS : [ \t\r\n]+ -> skip ;