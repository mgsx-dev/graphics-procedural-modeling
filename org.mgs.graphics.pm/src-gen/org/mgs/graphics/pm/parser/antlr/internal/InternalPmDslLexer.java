package org.mgs.graphics.pm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPmDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=5;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int RULE_DECIMAL=6;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=50;
    public static final int RULE_SL_COMMENT=9;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=8;
    public static final int T44=44;
    public static final int RULE_STRING=7;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=10;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalPmDslLexer() {;} 
    public InternalPmDslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:10:5: ( 'Stage' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:10:7: 'Stage'
            {
            match("Stage"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:11:5: ( '{' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:11:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:12:5: ( 'width' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:12:7: 'width'
            {
            match("width"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:13:5: ( 'height' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:13:7: 'height'
            {
            match("height"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:14:5: ( 'depth' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:14:7: 'depth'
            {
            match("depth"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:15:5: ( 'duration' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:15:7: 'duration'
            {
            match("duration"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:16:5: ( 'fps' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:16:7: 'fps'
            {
            match("fps"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:17:5: ( 'output' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:17:7: 'output'
            {
            match("output"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:18:5: ( '}' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:18:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:19:5: ( 'Color' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:19:7: 'Color'
            {
            match("Color"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:20:5: ( '#' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:20:7: '#'
            {
            match('#'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:21:5: ( 'Operation' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:21:7: 'Operation'
            {
            match("Operation"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:22:5: ( 'Noise' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:22:7: 'Noise'
            {
            match("Noise"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:23:5: ( 'seed' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:23:7: 'seed'
            {
            match("seed"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:24:5: ( 'frequency' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:24:7: 'frequency'
            {
            match("frequency"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:25:5: ( 'Perlin' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:25:7: 'Perlin'
            {
            match("Perlin"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:26:5: ( 'iterations' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:26:7: 'iterations'
            {
            match("iterations"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:27:5: ( 'turbulence' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:27:7: 'turbulence'
            {
            match("turbulence"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:28:5: ( 'Marble' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:28:7: 'Marble'
            {
            match("Marble"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:29:5: ( '(' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:29:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:30:5: ( ')' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:30:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:31:5: ( 'INV' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:31:7: 'INV'
            {
            match("INV"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:32:5: ( 'MIX' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:32:7: 'MIX'
            {
            match("MIX"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:33:5: ( ',' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:33:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:34:5: ( 'SIN' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:34:7: 'SIN'
            {
            match("SIN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:35:5: ( 'BOOL' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:35:7: 'BOOL'
            {
            match("BOOL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:36:5: ( 'SCALE' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:36:7: 'SCALE'
            {
            match("SCALE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:37:5: ( 'RADIAL' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:37:7: 'RADIAL'
            {
            match("RADIAL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:38:5: ( '+' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:38:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:39:5: ( '-' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:39:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:40:5: ( '*' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:40:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:41:5: ( 'X' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:41:7: 'X'
            {
            match('X'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:42:5: ( 'Y' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:42:7: 'Y'
            {
            match('Y'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:43:5: ( 'Z' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:43:7: 'Z'
            {
            match('Z'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:44:5: ( 'U' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:44:7: 'U'
            {
            match('U'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:45:5: ( 'V' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:45:7: 'V'
            {
            match('V'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:46:5: ( 'W' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:46:7: 'W'
            {
            match('W'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:47:5: ( 'T' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:47:7: 'T'
            {
            match('T'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start RULE_DECIMAL
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2068:14: ( ( '0' .. '9' )* '.' ( '0' .. '9' )* )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2068:16: ( '0' .. '9' )* '.' ( '0' .. '9' )*
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2068:16: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2068:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('.'); 
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2068:32: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2068:33: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_DECIMAL

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2070:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2070:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2070:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2070:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2070:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2072:10: ( ( '0' .. '9' )+ )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2072:12: ( '0' .. '9' )+
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2072:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2072:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2074:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2074:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2074:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2074:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2074:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2074:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2074:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2074:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2074:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2074:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2074:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2074:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2076:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2076:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2076:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFE')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2076:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2078:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2078:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2078:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2078:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2078:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2078:41: ( '\\r' )? '\\n'
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2078:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2078:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2080:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2080:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2080:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2082:16: ( . )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2082:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | RULE_DECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=46;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:78: T29
                {
                mT29(); 

                }
                break;
            case 19 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:82: T30
                {
                mT30(); 

                }
                break;
            case 20 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:86: T31
                {
                mT31(); 

                }
                break;
            case 21 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:90: T32
                {
                mT32(); 

                }
                break;
            case 22 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:94: T33
                {
                mT33(); 

                }
                break;
            case 23 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:98: T34
                {
                mT34(); 

                }
                break;
            case 24 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:102: T35
                {
                mT35(); 

                }
                break;
            case 25 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:106: T36
                {
                mT36(); 

                }
                break;
            case 26 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:110: T37
                {
                mT37(); 

                }
                break;
            case 27 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:114: T38
                {
                mT38(); 

                }
                break;
            case 28 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:118: T39
                {
                mT39(); 

                }
                break;
            case 29 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:122: T40
                {
                mT40(); 

                }
                break;
            case 30 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:126: T41
                {
                mT41(); 

                }
                break;
            case 31 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:130: T42
                {
                mT42(); 

                }
                break;
            case 32 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:134: T43
                {
                mT43(); 

                }
                break;
            case 33 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:138: T44
                {
                mT44(); 

                }
                break;
            case 34 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:142: T45
                {
                mT45(); 

                }
                break;
            case 35 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:146: T46
                {
                mT46(); 

                }
                break;
            case 36 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:150: T47
                {
                mT47(); 

                }
                break;
            case 37 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:154: T48
                {
                mT48(); 

                }
                break;
            case 38 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:158: T49
                {
                mT49(); 

                }
                break;
            case 39 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:162: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 40 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:175: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 41 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:183: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 42 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:192: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:204: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 44 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:220: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:236: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1:244: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\56\1\uffff\5\56\1\uffff\1\56\1\uffff\7\56\2\uffff\1\56"+
        "\1\uffff\2\56\3\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
        "\1\124\1\uffff\1\52\1\uffff\3\52\2\uffff\3\56\2\uffff\7\56\1\uffff"+
        "\1\56\1\uffff\10\56\2\uffff\1\56\1\uffff\2\56\13\uffff\1\124\5\uffff"+
        "\1\56\1\160\5\56\1\166\11\56\1\u0080\1\56\1\u0082\3\56\1\uffff\5"+
        "\56\1\uffff\5\56\1\u0090\3\56\1\uffff\1\56\1\uffff\1\u0095\1\56"+
        "\1\u0097\1\u0098\1\u0099\1\56\1\u009b\3\56\1\u009f\1\56\1\u00a1"+
        "\1\uffff\4\56\1\uffff\1\56\3\uffff\1\u00a7\1\uffff\2\56\1\u00aa"+
        "\1\uffff\1\56\1\uffff\1\u00ac\2\56\1\u00af\1\u00b0\1\uffff\2\56"+
        "\1\uffff\1\56\1\uffff\2\56\2\uffff\1\u00b6\4\56\1\uffff\1\u00bb"+
        "\1\u00bc\2\56\2\uffff\1\u00bf\1\u00c0\2\uffff";
    static final String DFA14_eofS =
        "\u00c1\uffff";
    static final String DFA14_minS =
        "\1\0\1\103\1\uffff\1\151\2\145\1\160\1\165\1\uffff\1\157\1\uffff"+
        "\1\160\1\157\2\145\1\164\1\165\1\111\2\uffff\1\116\1\uffff\1\117"+
        "\1\101\3\uffff\7\60\1\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff"+
        "\1\141\1\116\1\101\2\uffff\1\144\1\151\1\160\1\162\1\163\1\145\1"+
        "\164\1\uffff\1\154\1\uffff\1\145\1\151\1\145\1\162\1\145\1\162\1"+
        "\130\1\162\2\uffff\1\126\1\uffff\1\117\1\104\13\uffff\1\56\5\uffff"+
        "\1\147\1\60\1\114\1\164\1\147\1\164\1\141\1\60\1\161\1\160\1\157"+
        "\1\162\1\163\1\144\1\154\1\162\1\142\1\60\1\142\1\60\1\114\1\111"+
        "\1\145\1\uffff\1\105\3\150\1\164\1\uffff\2\165\1\162\1\141\1\145"+
        "\1\60\1\151\1\141\1\165\1\uffff\1\154\1\uffff\1\60\1\101\3\60\1"+
        "\164\1\60\1\151\1\145\1\164\1\60\1\164\1\60\1\uffff\1\156\1\164"+
        "\1\154\1\145\1\uffff\1\114\3\uffff\1\60\1\uffff\1\157\1\156\1\60"+
        "\1\uffff\1\151\1\uffff\1\60\1\151\1\145\2\60\1\uffff\1\156\1\143"+
        "\1\uffff\1\157\1\uffff\1\157\1\156\2\uffff\1\60\1\171\2\156\1\143"+
        "\1\uffff\2\60\1\163\1\145\2\uffff\2\60\2\uffff";
    static final String DFA14_maxS =
        "\1\ufffe\1\164\1\uffff\1\151\1\145\1\165\1\162\1\165\1\uffff\1\157"+
        "\1\uffff\1\160\1\157\2\145\1\164\1\165\1\141\2\uffff\1\116\1\uffff"+
        "\1\117\1\101\3\uffff\7\172\1\71\1\uffff\1\172\1\uffff\2\ufffe\1"+
        "\57\2\uffff\1\141\1\116\1\101\2\uffff\1\144\1\151\1\160\1\162\1"+
        "\163\1\145\1\164\1\uffff\1\154\1\uffff\1\145\1\151\1\145\1\162\1"+
        "\145\1\162\1\130\1\162\2\uffff\1\126\1\uffff\1\117\1\104\13\uffff"+
        "\1\71\5\uffff\1\147\1\172\1\114\1\164\1\147\1\164\1\141\1\172\1"+
        "\161\1\160\1\157\1\162\1\163\1\144\1\154\1\162\1\142\1\172\1\142"+
        "\1\172\1\114\1\111\1\145\1\uffff\1\105\3\150\1\164\1\uffff\2\165"+
        "\1\162\1\141\1\145\1\172\1\151\1\141\1\165\1\uffff\1\154\1\uffff"+
        "\1\172\1\101\3\172\1\164\1\172\1\151\1\145\1\164\1\172\1\164\1\172"+
        "\1\uffff\1\156\1\164\1\154\1\145\1\uffff\1\114\3\uffff\1\172\1\uffff"+
        "\1\157\1\156\1\172\1\uffff\1\151\1\uffff\1\172\1\151\1\145\2\172"+
        "\1\uffff\1\156\1\143\1\uffff\1\157\1\uffff\1\157\1\156\2\uffff\1"+
        "\172\1\171\2\156\1\143\1\uffff\2\172\1\163\1\145\2\uffff\2\172\2"+
        "\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\5\uffff\1\11\1\uffff\1\13\7\uffff\1\24\1\25\1\uffff"+
        "\1\30\2\uffff\1\35\1\36\1\37\10\uffff\1\47\1\uffff\1\50\3\uffff"+
        "\1\55\1\56\3\uffff\1\50\1\2\7\uffff\1\11\1\uffff\1\13\10\uffff\1"+
        "\24\1\25\1\uffff\1\30\2\uffff\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
        "\1\44\1\45\1\46\1\47\1\uffff\1\51\1\52\1\53\1\54\1\55\27\uffff\1"+
        "\31\5\uffff\1\7\11\uffff\1\27\1\uffff\1\26\15\uffff\1\16\4\uffff"+
        "\1\32\1\uffff\1\1\1\33\1\3\1\uffff\1\5\3\uffff\1\12\1\uffff\1\15"+
        "\5\uffff\1\4\2\uffff\1\10\1\uffff\1\20\2\uffff\1\23\1\34\5\uffff"+
        "\1\6\4\uffff\1\17\1\14\2\uffff\1\21\1\22";
    static final String DFA14_specialS =
        "\u00c1\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\52\1\46\1\12\3\52\1\47\1"+
            "\22\1\23\1\32\1\30\1\25\1\31\1\43\1\50\12\42\7\52\1\45\1\26"+
            "\1\11\5\45\1\24\3\45\1\21\1\14\1\13\1\16\1\45\1\27\1\1\1\41"+
            "\1\36\1\37\1\40\1\33\1\34\1\35\3\52\1\44\1\45\1\52\3\45\1\5"+
            "\1\45\1\6\1\45\1\4\1\17\5\45\1\7\3\45\1\15\1\20\2\45\1\3\3\45"+
            "\1\2\1\52\1\10\uff81\52",
            "\1\55\5\uffff\1\54\52\uffff\1\53",
            "",
            "\1\60",
            "\1\61",
            "\1\62\17\uffff\1\63",
            "\1\64\1\uffff\1\65",
            "\1\66",
            "",
            "\1\70",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100\27\uffff\1\101",
            "",
            "",
            "\1\104",
            "",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\122\1\uffff\12\123",
            "",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\uffff\125",
            "\uffff\125",
            "\1\126\4\uffff\1\127",
            "",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\122\1\uffff\12\123",
            "",
            "",
            "",
            "",
            "",
            "\1\157",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0081",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0096",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u009a",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00a0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00ab",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ad",
            "\1\u00ae",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00bd",
            "\1\u00be",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | RULE_DECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}