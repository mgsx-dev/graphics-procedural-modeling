lexer grammar InternalPmDsl;
@header {
package org.mgs.graphics.pm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'import' ;
T13 : 'Stage' ;
T14 : '{' ;
T15 : 'width' ;
T16 : 'height' ;
T17 : 'depth' ;
T18 : 'duration' ;
T19 : 'fps' ;
T20 : 'output' ;
T21 : '}' ;
T22 : 'Color' ;
T23 : '#' ;
T24 : 'Operation' ;
T25 : 'Noise' ;
T26 : 'seed' ;
T27 : 'frequency' ;
T28 : 'Perlin' ;
T29 : 'iterations' ;
T30 : 'turbulence' ;
T31 : 'Marble' ;
T32 : '(' ;
T33 : ')' ;
T34 : 'INV' ;
T35 : 'MIX' ;
T36 : ',' ;
T37 : 'SIN' ;
T38 : 'BOOL' ;
T39 : 'SCALE' ;
T40 : 'RADIAL' ;
T41 : '+' ;
T42 : '-' ;
T43 : '*' ;
T44 : 'X' ;
T45 : 'Y' ;
T46 : 'Z' ;
T47 : 'U' ;
T48 : 'V' ;
T49 : 'W' ;
T50 : 'T' ;

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2144
RULE_DECIMAL : ('0'..'9')* '.' ('0'..'9')*;

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2146
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2148
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2150
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2152
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2154
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2156
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g" 2158
RULE_ANY_OTHER : .;


