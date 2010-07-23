lexer grammar InternalPmDsl;
@header {
package org.mgs.graphics.pm.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : '+' ;
T13 : '-' ;
T14 : '*' ;
T15 : 'X' ;
T16 : 'Y' ;
T17 : 'Z' ;
T18 : 'U' ;
T19 : 'V' ;
T20 : 'W' ;
T21 : 'T' ;
T22 : 'Stage' ;
T23 : '{' ;
T24 : 'width' ;
T25 : 'height' ;
T26 : 'output' ;
T27 : '}' ;
T28 : 'depth' ;
T29 : 'duration' ;
T30 : 'fps' ;
T31 : 'Color' ;
T32 : '#' ;
T33 : 'Operation' ;
T34 : 'Noise' ;
T35 : 'seed' ;
T36 : 'frequency' ;
T37 : 'Perlin' ;
T38 : 'iterations' ;
T39 : 'turbulence' ;
T40 : 'Marble' ;
T41 : '(' ;
T42 : ')' ;
T43 : 'INV' ;
T44 : 'MIX' ;
T45 : ',' ;
T46 : 'SIN' ;
T47 : 'BOOL' ;
T48 : 'SCALE' ;
T49 : 'RADIAL' ;

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5202
RULE_DECIMAL : ('0'..'9')* '.' ('0'..'9')*;

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5204
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5206
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5208
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5210
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5212
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5214
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5216
RULE_ANY_OTHER : .;


