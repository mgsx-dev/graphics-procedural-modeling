lexer grammar InternalPmDsl;
@header {
package org.mgs.graphics.pm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'Stage' ;
T13 : '{' ;
T14 : 'width' ;
T15 : 'height' ;
T16 : 'depth' ;
T17 : 'duration' ;
T18 : 'fps' ;
T19 : 'output' ;
T20 : '}' ;
T21 : 'Color' ;
T22 : '#' ;
T23 : 'Operation' ;
T24 : 'Noise' ;
T25 : 'seed' ;
T26 : 'frequency' ;
T27 : 'Perlin' ;
T28 : 'iterations' ;
T29 : 'turbulence' ;
T30 : 'Marble' ;
T31 : '(' ;
T32 : ')' ;
T33 : 'INV' ;
T34 : 'MIX' ;
T35 : ',' ;
T36 : 'SIN' ;
T37 : 'BOOL' ;
T38 : 'SCALE' ;
T39 : 'RADIAL' ;
T40 : '+' ;
T41 : '-' ;
T42 : '*' ;
T43 : 'X' ;
T44 : 'Y' ;
T45 : 'Z' ;
T46 : 'U' ;
T47 : 'V' ;
T48 : 'W' ;
T49 : 'T' ;

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2044
RULE_DECIMAL : ('0'..'9')* '.' ('0'..'9')*;

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2046
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2048
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2050
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2052
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2054
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2056
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2058
RULE_ANY_OTHER : .;


