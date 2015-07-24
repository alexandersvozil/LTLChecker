grammar LinearTimeLogic;

formula: andformula
        |orformula
        |xformula
        |uformula
        |vformula
        | literal
        |negatedformula
        |gformula
        |fformula
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

negatedformula:  '~' formula;
orformula: '(' formula '|' formula ')';
andformula:'('formula '&' formula ')';
xformula:'(' 'X' formula')';
gformula:'(' 'G' formula')';
fformula:'(' 'F' formula')';
uformula:'('formula 'U' formula')';
vformula:'('formula 'V' formula')';
ATOM : ('a' .. 'z')+;
WS : [ \t\r\n]+ -> skip ;