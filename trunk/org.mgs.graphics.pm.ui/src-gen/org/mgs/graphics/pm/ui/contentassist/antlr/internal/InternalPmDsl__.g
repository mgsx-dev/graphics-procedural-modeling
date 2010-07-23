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
T22 : 'import' ;
T23 : 'Stage' ;
T24 : '{' ;
T25 : 'width' ;
T26 : 'height' ;
T27 : 'output' ;
T28 : '}' ;
T29 : 'depth' ;
T30 : 'duration' ;
T31 : 'fps' ;
T32 : 'Color' ;
T33 : '#' ;
T34 : 'Operation' ;
T35 : 'Noise' ;
T36 : 'seed' ;
T37 : 'frequency' ;
T38 : 'Perlin' ;
T39 : 'iterations' ;
T40 : 'turbulence' ;
T41 : 'Marble' ;
T42 : '(' ;
T43 : ')' ;
T44 : 'INV' ;
T45 : 'MIX' ;
T46 : ',' ;
T47 : 'SIN' ;
T48 : 'BOOL' ;
T49 : 'SCALE' ;
T50 : 'RADIAL' ;

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5385
RULE_DECIMAL : ('0'..'9')* '.' ('0'..'9')*;

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5387
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5389
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5391
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5393
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5395
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5397
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mgs.graphics.pm.ui/src-gen/org/mgs/graphics/pm/ui/contentassist/antlr/internal/InternalPmDsl.g" 5399
RULE_ANY_OTHER : .;


