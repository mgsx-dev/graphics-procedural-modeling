package org.mgs.graphics.pm.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.mgs.graphics.pm.services.PmDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPmDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DECIMAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Stage'", "'{'", "'width'", "'height'", "'depth'", "'duration'", "'fps'", "'output'", "'}'", "'Color'", "'#'", "'Operation'", "'Noise'", "'seed'", "'frequency'", "'Perlin'", "'iterations'", "'turbulence'", "'Marble'", "'('", "')'", "'INV'", "'MIX'", "','", "'SIN'", "'BOOL'", "'SCALE'", "'RADIAL'", "'+'", "'-'", "'*'", "'X'", "'Y'", "'Z'", "'U'", "'V'", "'W'", "'T'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;
    public static final int RULE_DECIMAL=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalPmDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g"; }



     	private PmDslGrammarAccess grammarAccess;
     	
        public InternalPmDslParser(TokenStream input, IAstFactory factory, PmDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PmDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:78:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:79:2: (iv_ruleModel= ruleModel EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:80:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:87:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ( (lv_stage_1_0= ruleStage ) ) ) ) | ({...}? => ( ( (lv_defs_2_0= ruleModuleDef ) )+ ) ) )* ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_stage_1_0 = null;

        EObject lv_defs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:92:6: ( ( ( ( ( ({...}? => ( ( (lv_stage_1_0= ruleStage ) ) ) ) | ({...}? => ( ( (lv_defs_2_0= ruleModuleDef ) )+ ) ) )* ) ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:93:1: ( ( ( ( ({...}? => ( ( (lv_stage_1_0= ruleStage ) ) ) ) | ({...}? => ( ( (lv_defs_2_0= ruleModuleDef ) )+ ) ) )* ) ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:93:1: ( ( ( ( ({...}? => ( ( (lv_stage_1_0= ruleStage ) ) ) ) | ({...}? => ( ( (lv_defs_2_0= ruleModuleDef ) )+ ) ) )* ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:95:1: ( ( ( ({...}? => ( ( (lv_stage_1_0= ruleStage ) ) ) ) | ({...}? => ( ( (lv_defs_2_0= ruleModuleDef ) )+ ) ) )* ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:95:1: ( ( ( ({...}? => ( ( (lv_stage_1_0= ruleStage ) ) ) ) | ({...}? => ( ( (lv_defs_2_0= ruleModuleDef ) )+ ) ) )* ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:96:2: ( ( ({...}? => ( ( (lv_stage_1_0= ruleStage ) ) ) ) | ({...}? => ( ( (lv_defs_2_0= ruleModuleDef ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            	
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:99:2: ( ( ({...}? => ( ( (lv_stage_1_0= ruleStage ) ) ) ) | ({...}? => ( ( (lv_defs_2_0= ruleModuleDef ) )+ ) ) )* )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:100:3: ( ({...}? => ( ( (lv_stage_1_0= ruleStage ) ) ) ) | ({...}? => ( ( (lv_defs_2_0= ruleModuleDef ) )+ ) ) )*
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:100:3: ( ({...}? => ( ( (lv_stage_1_0= ruleStage ) ) ) ) | ({...}? => ( ( (lv_defs_2_0= ruleModuleDef ) )+ ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( (LA2_0==21|| LA2_0 >=23 && LA2_0<=24 ||LA2_0==27||LA2_0==30) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:102:4: ({...}? => ( ( (lv_stage_1_0= ruleStage ) ) ) )
            	    {
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:102:4: ({...}? => ( ( (lv_stage_1_0= ruleStage ) ) ) )
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:103:5: {...}? => ( ( (lv_stage_1_0= ruleStage ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:103:100: ( ( (lv_stage_1_0= ruleStage ) ) )
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:104:6: ( (lv_stage_1_0= ruleStage ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:107:6: ( (lv_stage_1_0= ruleStage ) )
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:108:1: (lv_stage_1_0= ruleStage )
            	    {
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:108:1: (lv_stage_1_0= ruleStage )
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:109:3: lv_stage_1_0= ruleStage
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getStageStageParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStage_in_ruleModel172);
            	    lv_stage_1_0=ruleStage();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"stage",
            	    	        		lv_stage_1_0, 
            	    	        		"Stage", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:138:4: ({...}? => ( ( (lv_defs_2_0= ruleModuleDef ) )+ ) )
            	    {
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:138:4: ({...}? => ( ( (lv_defs_2_0= ruleModuleDef ) )+ ) )
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:139:5: {...}? => ( ( (lv_defs_2_0= ruleModuleDef ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:139:100: ( ( (lv_defs_2_0= ruleModuleDef ) )+ )
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:140:6: ( (lv_defs_2_0= ruleModuleDef ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:143:6: ( (lv_defs_2_0= ruleModuleDef ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        switch ( input.LA(1) ) {
            	        case 21:
            	            {
            	            int LA1_3 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	                alt1=1;
            	            }


            	            }
            	            break;
            	        case 23:
            	            {
            	            int LA1_4 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	                alt1=1;
            	            }


            	            }
            	            break;
            	        case 24:
            	            {
            	            int LA1_5 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	                alt1=1;
            	            }


            	            }
            	            break;
            	        case 27:
            	            {
            	            int LA1_6 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	                alt1=1;
            	            }


            	            }
            	            break;
            	        case 30:
            	            {
            	            int LA1_7 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	                alt1=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:144:1: (lv_defs_2_0= ruleModuleDef )
            	    	    {
            	    	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:144:1: (lv_defs_2_0= ruleModuleDef )
            	    	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:145:3: lv_defs_2_0= ruleModuleDef
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDefsModuleDefParserRuleCall_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleModuleDef_in_ruleModel243);
            	    	    lv_defs_2_0=ruleModuleDef();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"defs",
            	    	    	        		lv_defs_2_0, 
            	    	    	        		"ModuleDef", 
            	    	    	        		currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());
            	

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleStage
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:189:1: entryRuleStage returns [EObject current=null] : iv_ruleStage= ruleStage EOF ;
    public final EObject entryRuleStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStage = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:190:2: (iv_ruleStage= ruleStage EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:191:2: iv_ruleStage= ruleStage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStageRule(), currentNode); 
            pushFollow(FOLLOW_ruleStage_in_entryRuleStage318);
            iv_ruleStage=ruleStage();
            _fsp--;

             current =iv_ruleStage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStage328); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStage


    // $ANTLR start ruleStage
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:198:1: ruleStage returns [EObject current=null] : ( 'Stage' ( (lv_name_1_0= RULE_ID ) ) '{' 'width' ( (lv_width_4_0= RULE_INT ) ) 'height' ( (lv_height_6_0= RULE_INT ) ) ( 'depth' ( (lv_depth_8_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) ) )? 'output' ( (lv_output_14_0= ruleExpression ) ) '}' ) ;
    public final EObject ruleStage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_width_4_0=null;
        Token lv_height_6_0=null;
        Token lv_depth_8_0=null;
        Token lv_duration_10_0=null;
        Token lv_fps_12_0=null;
        EObject lv_output_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:203:6: ( ( 'Stage' ( (lv_name_1_0= RULE_ID ) ) '{' 'width' ( (lv_width_4_0= RULE_INT ) ) 'height' ( (lv_height_6_0= RULE_INT ) ) ( 'depth' ( (lv_depth_8_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) ) )? 'output' ( (lv_output_14_0= ruleExpression ) ) '}' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:204:1: ( 'Stage' ( (lv_name_1_0= RULE_ID ) ) '{' 'width' ( (lv_width_4_0= RULE_INT ) ) 'height' ( (lv_height_6_0= RULE_INT ) ) ( 'depth' ( (lv_depth_8_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) ) )? 'output' ( (lv_output_14_0= ruleExpression ) ) '}' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:204:1: ( 'Stage' ( (lv_name_1_0= RULE_ID ) ) '{' 'width' ( (lv_width_4_0= RULE_INT ) ) 'height' ( (lv_height_6_0= RULE_INT ) ) ( 'depth' ( (lv_depth_8_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) ) )? 'output' ( (lv_output_14_0= ruleExpression ) ) '}' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:204:3: 'Stage' ( (lv_name_1_0= RULE_ID ) ) '{' 'width' ( (lv_width_4_0= RULE_INT ) ) 'height' ( (lv_height_6_0= RULE_INT ) ) ( 'depth' ( (lv_depth_8_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) ) )? 'output' ( (lv_output_14_0= ruleExpression ) ) '}'
            {
            match(input,12,FOLLOW_12_in_ruleStage363); 

                    createLeafNode(grammarAccess.getStageAccess().getStageKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:208:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:209:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:209:1: (lv_name_1_0= RULE_ID )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:210:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStage380); 

            			createLeafNode(grammarAccess.getStageAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleStage395); 

                    createLeafNode(grammarAccess.getStageAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,14,FOLLOW_14_in_ruleStage405); 

                    createLeafNode(grammarAccess.getStageAccess().getWidthKeyword_3(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:240:1: ( (lv_width_4_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:241:1: (lv_width_4_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:241:1: (lv_width_4_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:242:3: lv_width_4_0= RULE_INT
            {
            lv_width_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStage422); 

            			createLeafNode(grammarAccess.getStageAccess().getWidthINTTerminalRuleCall_4_0(), "width"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"width",
            	        		lv_width_4_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleStage437); 

                    createLeafNode(grammarAccess.getStageAccess().getHeightKeyword_5(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:268:1: ( (lv_height_6_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:269:1: (lv_height_6_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:269:1: (lv_height_6_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:270:3: lv_height_6_0= RULE_INT
            {
            lv_height_6_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStage454); 

            			createLeafNode(grammarAccess.getStageAccess().getHeightINTTerminalRuleCall_6_0(), "height"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"height",
            	        		lv_height_6_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:292:2: ( 'depth' ( (lv_depth_8_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:292:4: 'depth' ( (lv_depth_8_0= RULE_INT ) )
                    {
                    match(input,16,FOLLOW_16_in_ruleStage470); 

                            createLeafNode(grammarAccess.getStageAccess().getDepthKeyword_7_0(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:296:1: ( (lv_depth_8_0= RULE_INT ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:297:1: (lv_depth_8_0= RULE_INT )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:297:1: (lv_depth_8_0= RULE_INT )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:298:3: lv_depth_8_0= RULE_INT
                    {
                    lv_depth_8_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStage487); 

                    			createLeafNode(grammarAccess.getStageAccess().getDepthINTTerminalRuleCall_7_1_0(), "depth"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStageRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"depth",
                    	        		lv_depth_8_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:320:4: ( 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:320:6: 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleStage505); 

                            createLeafNode(grammarAccess.getStageAccess().getDurationKeyword_8_0(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:324:1: ( (lv_duration_10_0= RULE_INT ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:325:1: (lv_duration_10_0= RULE_INT )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:325:1: (lv_duration_10_0= RULE_INT )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:326:3: lv_duration_10_0= RULE_INT
                    {
                    lv_duration_10_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStage522); 

                    			createLeafNode(grammarAccess.getStageAccess().getDurationINTTerminalRuleCall_8_1_0(), "duration"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStageRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"duration",
                    	        		lv_duration_10_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleStage537); 

                            createLeafNode(grammarAccess.getStageAccess().getFpsKeyword_8_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:352:1: ( (lv_fps_12_0= RULE_INT ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:353:1: (lv_fps_12_0= RULE_INT )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:353:1: (lv_fps_12_0= RULE_INT )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:354:3: lv_fps_12_0= RULE_INT
                    {
                    lv_fps_12_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStage554); 

                    			createLeafNode(grammarAccess.getStageAccess().getFpsINTTerminalRuleCall_8_3_0(), "fps"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStageRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fps",
                    	        		lv_fps_12_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleStage571); 

                    createLeafNode(grammarAccess.getStageAccess().getOutputKeyword_9(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:380:1: ( (lv_output_14_0= ruleExpression ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:381:1: (lv_output_14_0= ruleExpression )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:381:1: (lv_output_14_0= ruleExpression )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:382:3: lv_output_14_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStageAccess().getOutputExpressionParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleStage592);
            lv_output_14_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"output",
            	        		lv_output_14_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleStage602); 

                    createLeafNode(grammarAccess.getStageAccess().getRightCurlyBracketKeyword_11(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStage


    // $ANTLR start entryRuleModuleDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:416:1: entryRuleModuleDef returns [EObject current=null] : iv_ruleModuleDef= ruleModuleDef EOF ;
    public final EObject entryRuleModuleDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:417:2: (iv_ruleModuleDef= ruleModuleDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:418:2: iv_ruleModuleDef= ruleModuleDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleModuleDef_in_entryRuleModuleDef638);
            iv_ruleModuleDef=ruleModuleDef();
            _fsp--;

             current =iv_ruleModuleDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleDef648); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModuleDef


    // $ANTLR start ruleModuleDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:425:1: ruleModuleDef returns [EObject current=null] : (this_ColorDef_0= ruleColorDef | this_OperationDef_1= ruleOperationDef | this_NoiseDef_2= ruleNoiseDef | this_PerlinDef_3= rulePerlinDef | this_MarbleDef_4= ruleMarbleDef ) ;
    public final EObject ruleModuleDef() throws RecognitionException {
        EObject current = null;

        EObject this_ColorDef_0 = null;

        EObject this_OperationDef_1 = null;

        EObject this_NoiseDef_2 = null;

        EObject this_PerlinDef_3 = null;

        EObject this_MarbleDef_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:430:6: ( (this_ColorDef_0= ruleColorDef | this_OperationDef_1= ruleOperationDef | this_NoiseDef_2= ruleNoiseDef | this_PerlinDef_3= rulePerlinDef | this_MarbleDef_4= ruleMarbleDef ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:431:1: (this_ColorDef_0= ruleColorDef | this_OperationDef_1= ruleOperationDef | this_NoiseDef_2= ruleNoiseDef | this_PerlinDef_3= rulePerlinDef | this_MarbleDef_4= ruleMarbleDef )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:431:1: (this_ColorDef_0= ruleColorDef | this_OperationDef_1= ruleOperationDef | this_NoiseDef_2= ruleNoiseDef | this_PerlinDef_3= rulePerlinDef | this_MarbleDef_4= ruleMarbleDef )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("431:1: (this_ColorDef_0= ruleColorDef | this_OperationDef_1= ruleOperationDef | this_NoiseDef_2= ruleNoiseDef | this_PerlinDef_3= rulePerlinDef | this_MarbleDef_4= ruleMarbleDef )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:432:5: this_ColorDef_0= ruleColorDef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleDefAccess().getColorDefParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleColorDef_in_ruleModuleDef695);
                    this_ColorDef_0=ruleColorDef();
                    _fsp--;

                     
                            current = this_ColorDef_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:442:5: this_OperationDef_1= ruleOperationDef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleDefAccess().getOperationDefParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOperationDef_in_ruleModuleDef722);
                    this_OperationDef_1=ruleOperationDef();
                    _fsp--;

                     
                            current = this_OperationDef_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:452:5: this_NoiseDef_2= ruleNoiseDef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleDefAccess().getNoiseDefParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNoiseDef_in_ruleModuleDef749);
                    this_NoiseDef_2=ruleNoiseDef();
                    _fsp--;

                     
                            current = this_NoiseDef_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:462:5: this_PerlinDef_3= rulePerlinDef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleDefAccess().getPerlinDefParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePerlinDef_in_ruleModuleDef776);
                    this_PerlinDef_3=rulePerlinDef();
                    _fsp--;

                     
                            current = this_PerlinDef_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:472:5: this_MarbleDef_4= ruleMarbleDef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleDefAccess().getMarbleDefParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMarbleDef_in_ruleModuleDef803);
                    this_MarbleDef_4=ruleMarbleDef();
                    _fsp--;

                     
                            current = this_MarbleDef_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModuleDef


    // $ANTLR start entryRuleColorDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:488:1: entryRuleColorDef returns [EObject current=null] : iv_ruleColorDef= ruleColorDef EOF ;
    public final EObject entryRuleColorDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:489:2: (iv_ruleColorDef= ruleColorDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:490:2: iv_ruleColorDef= ruleColorDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getColorDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleColorDef_in_entryRuleColorDef838);
            iv_ruleColorDef=ruleColorDef();
            _fsp--;

             current =iv_ruleColorDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorDef848); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleColorDef


    // $ANTLR start ruleColorDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:497:1: ruleColorDef returns [EObject current=null] : ( 'Color' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) ) ) '}' ) ;
    public final EObject ruleColorDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_def_3_1 = null;

        EObject lv_def_3_2 = null;

        EObject lv_def_3_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:502:6: ( ( 'Color' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) ) ) '}' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:503:1: ( 'Color' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) ) ) '}' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:503:1: ( 'Color' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) ) ) '}' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:503:3: 'Color' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) ) ) '}'
            {
            match(input,21,FOLLOW_21_in_ruleColorDef883); 

                    createLeafNode(grammarAccess.getColorDefAccess().getColorKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:507:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:508:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:508:1: (lv_name_1_0= RULE_ID )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:509:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorDef900); 

            			createLeafNode(grammarAccess.getColorDefAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getColorDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleColorDef915); 

                    createLeafNode(grammarAccess.getColorDefAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:535:1: ( ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:536:1: ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:536:1: ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:537:1: (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:537:1: (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("537:1: (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:538:3: lv_def_3_1= ruleColorFloatDef
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getColorDefAccess().getDefColorFloatDefParserRuleCall_3_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleColorFloatDef_in_ruleColorDef938);
                    lv_def_3_1=ruleColorFloatDef();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getColorDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"def",
                    	        		lv_def_3_1, 
                    	        		"ColorFloatDef", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:559:8: lv_def_3_2= ruleColorIntDef
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getColorDefAccess().getDefColorIntDefParserRuleCall_3_0_1(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleColorIntDef_in_ruleColorDef957);
                    lv_def_3_2=ruleColorIntDef();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getColorDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"def",
                    	        		lv_def_3_2, 
                    	        		"ColorIntDef", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:580:8: lv_def_3_3= ruleColorHexaDef
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getColorDefAccess().getDefColorHexaDefParserRuleCall_3_0_2(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleColorHexaDef_in_ruleColorDef976);
                    lv_def_3_3=ruleColorHexaDef();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getColorDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"def",
                    	        		lv_def_3_3, 
                    	        		"ColorHexaDef", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }


            }


            }

            match(input,20,FOLLOW_20_in_ruleColorDef989); 

                    createLeafNode(grammarAccess.getColorDefAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleColorDef


    // $ANTLR start entryRuleColorFloatDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:616:1: entryRuleColorFloatDef returns [EObject current=null] : iv_ruleColorFloatDef= ruleColorFloatDef EOF ;
    public final EObject entryRuleColorFloatDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFloatDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:617:2: (iv_ruleColorFloatDef= ruleColorFloatDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:618:2: iv_ruleColorFloatDef= ruleColorFloatDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getColorFloatDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleColorFloatDef_in_entryRuleColorFloatDef1025);
            iv_ruleColorFloatDef=ruleColorFloatDef();
            _fsp--;

             current =iv_ruleColorFloatDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFloatDef1035); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleColorFloatDef


    // $ANTLR start ruleColorFloatDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:625:1: ruleColorFloatDef returns [EObject current=null] : ( ( (lv_r_0_0= RULE_DECIMAL ) ) ( ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )? )? ) ;
    public final EObject ruleColorFloatDef() throws RecognitionException {
        EObject current = null;

        Token lv_r_0_0=null;
        Token lv_g_1_0=null;
        Token lv_b_2_0=null;
        Token lv_a_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:630:6: ( ( ( (lv_r_0_0= RULE_DECIMAL ) ) ( ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )? )? ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:631:1: ( ( (lv_r_0_0= RULE_DECIMAL ) ) ( ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )? )? )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:631:1: ( ( (lv_r_0_0= RULE_DECIMAL ) ) ( ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )? )? )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:631:2: ( (lv_r_0_0= RULE_DECIMAL ) ) ( ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )? )?
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:631:2: ( (lv_r_0_0= RULE_DECIMAL ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:632:1: (lv_r_0_0= RULE_DECIMAL )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:632:1: (lv_r_0_0= RULE_DECIMAL )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:633:3: lv_r_0_0= RULE_DECIMAL
            {
            lv_r_0_0=(Token)input.LT(1);
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1077); 

            			createLeafNode(grammarAccess.getColorFloatDefAccess().getRDECIMALTerminalRuleCall_0_0(), "r"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getColorFloatDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"r",
            	        		lv_r_0_0, 
            	        		"DECIMAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:655:2: ( ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DECIMAL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:655:3: ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )?
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:655:3: ( (lv_g_1_0= RULE_DECIMAL ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:656:1: (lv_g_1_0= RULE_DECIMAL )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:656:1: (lv_g_1_0= RULE_DECIMAL )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:657:3: lv_g_1_0= RULE_DECIMAL
                    {
                    lv_g_1_0=(Token)input.LT(1);
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1100); 

                    			createLeafNode(grammarAccess.getColorFloatDefAccess().getGDECIMALTerminalRuleCall_1_0_0(), "g"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getColorFloatDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"g",
                    	        		lv_g_1_0, 
                    	        		"DECIMAL", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:679:2: ( (lv_b_2_0= RULE_DECIMAL ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:680:1: (lv_b_2_0= RULE_DECIMAL )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:680:1: (lv_b_2_0= RULE_DECIMAL )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:681:3: lv_b_2_0= RULE_DECIMAL
                    {
                    lv_b_2_0=(Token)input.LT(1);
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1122); 

                    			createLeafNode(grammarAccess.getColorFloatDefAccess().getBDECIMALTerminalRuleCall_1_1_0(), "b"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getColorFloatDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"b",
                    	        		lv_b_2_0, 
                    	        		"DECIMAL", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:703:2: ( (lv_a_3_0= RULE_DECIMAL ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_DECIMAL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:704:1: (lv_a_3_0= RULE_DECIMAL )
                            {
                            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:704:1: (lv_a_3_0= RULE_DECIMAL )
                            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:705:3: lv_a_3_0= RULE_DECIMAL
                            {
                            lv_a_3_0=(Token)input.LT(1);
                            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1144); 

                            			createLeafNode(grammarAccess.getColorFloatDefAccess().getADECIMALTerminalRuleCall_1_2_0(), "a"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getColorFloatDefRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"a",
                            	        		lv_a_3_0, 
                            	        		"DECIMAL", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleColorFloatDef


    // $ANTLR start entryRuleColorIntDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:735:1: entryRuleColorIntDef returns [EObject current=null] : iv_ruleColorIntDef= ruleColorIntDef EOF ;
    public final EObject entryRuleColorIntDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorIntDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:736:2: (iv_ruleColorIntDef= ruleColorIntDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:737:2: iv_ruleColorIntDef= ruleColorIntDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getColorIntDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleColorIntDef_in_entryRuleColorIntDef1188);
            iv_ruleColorIntDef=ruleColorIntDef();
            _fsp--;

             current =iv_ruleColorIntDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorIntDef1198); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleColorIntDef


    // $ANTLR start ruleColorIntDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:744:1: ruleColorIntDef returns [EObject current=null] : ( ( (lv_r_0_0= RULE_INT ) ) ( ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )? )? ) ;
    public final EObject ruleColorIntDef() throws RecognitionException {
        EObject current = null;

        Token lv_r_0_0=null;
        Token lv_g_1_0=null;
        Token lv_b_2_0=null;
        Token lv_a_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:749:6: ( ( ( (lv_r_0_0= RULE_INT ) ) ( ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )? )? ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:750:1: ( ( (lv_r_0_0= RULE_INT ) ) ( ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )? )? )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:750:1: ( ( (lv_r_0_0= RULE_INT ) ) ( ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )? )? )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:750:2: ( (lv_r_0_0= RULE_INT ) ) ( ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )? )?
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:750:2: ( (lv_r_0_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:751:1: (lv_r_0_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:751:1: (lv_r_0_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:752:3: lv_r_0_0= RULE_INT
            {
            lv_r_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColorIntDef1240); 

            			createLeafNode(grammarAccess.getColorIntDefAccess().getRINTTerminalRuleCall_0_0(), "r"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getColorIntDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"r",
            	        		lv_r_0_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:774:2: ( ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:774:3: ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )?
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:774:3: ( (lv_g_1_0= RULE_INT ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:775:1: (lv_g_1_0= RULE_INT )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:775:1: (lv_g_1_0= RULE_INT )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:776:3: lv_g_1_0= RULE_INT
                    {
                    lv_g_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColorIntDef1263); 

                    			createLeafNode(grammarAccess.getColorIntDefAccess().getGINTTerminalRuleCall_1_0_0(), "g"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getColorIntDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"g",
                    	        		lv_g_1_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:798:2: ( (lv_b_2_0= RULE_INT ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:799:1: (lv_b_2_0= RULE_INT )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:799:1: (lv_b_2_0= RULE_INT )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:800:3: lv_b_2_0= RULE_INT
                    {
                    lv_b_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColorIntDef1285); 

                    			createLeafNode(grammarAccess.getColorIntDefAccess().getBINTTerminalRuleCall_1_1_0(), "b"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getColorIntDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"b",
                    	        		lv_b_2_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:822:2: ( (lv_a_3_0= RULE_INT ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_INT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:823:1: (lv_a_3_0= RULE_INT )
                            {
                            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:823:1: (lv_a_3_0= RULE_INT )
                            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:824:3: lv_a_3_0= RULE_INT
                            {
                            lv_a_3_0=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColorIntDef1307); 

                            			createLeafNode(grammarAccess.getColorIntDefAccess().getAINTTerminalRuleCall_1_2_0(), "a"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getColorIntDefRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"a",
                            	        		lv_a_3_0, 
                            	        		"INT", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleColorIntDef


    // $ANTLR start entryRuleColorHexaDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:854:1: entryRuleColorHexaDef returns [EObject current=null] : iv_ruleColorHexaDef= ruleColorHexaDef EOF ;
    public final EObject entryRuleColorHexaDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorHexaDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:855:2: (iv_ruleColorHexaDef= ruleColorHexaDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:856:2: iv_ruleColorHexaDef= ruleColorHexaDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getColorHexaDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleColorHexaDef_in_entryRuleColorHexaDef1351);
            iv_ruleColorHexaDef=ruleColorHexaDef();
            _fsp--;

             current =iv_ruleColorHexaDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorHexaDef1361); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleColorHexaDef


    // $ANTLR start ruleColorHexaDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:863:1: ruleColorHexaDef returns [EObject current=null] : ( '#' ( (lv_s_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleColorHexaDef() throws RecognitionException {
        EObject current = null;

        Token lv_s_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:868:6: ( ( '#' ( (lv_s_1_0= RULE_STRING ) ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:869:1: ( '#' ( (lv_s_1_0= RULE_STRING ) ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:869:1: ( '#' ( (lv_s_1_0= RULE_STRING ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:869:3: '#' ( (lv_s_1_0= RULE_STRING ) )
            {
            match(input,22,FOLLOW_22_in_ruleColorHexaDef1396); 

                    createLeafNode(grammarAccess.getColorHexaDefAccess().getNumberSignKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:873:1: ( (lv_s_1_0= RULE_STRING ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:874:1: (lv_s_1_0= RULE_STRING )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:874:1: (lv_s_1_0= RULE_STRING )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:875:3: lv_s_1_0= RULE_STRING
            {
            lv_s_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleColorHexaDef1413); 

            			createLeafNode(grammarAccess.getColorHexaDefAccess().getSSTRINGTerminalRuleCall_1_0(), "s"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getColorHexaDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"s",
            	        		lv_s_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleColorHexaDef


    // $ANTLR start entryRuleOperationDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:905:1: entryRuleOperationDef returns [EObject current=null] : iv_ruleOperationDef= ruleOperationDef EOF ;
    public final EObject entryRuleOperationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:906:2: (iv_ruleOperationDef= ruleOperationDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:907:2: iv_ruleOperationDef= ruleOperationDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperationDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperationDef_in_entryRuleOperationDef1454);
            iv_ruleOperationDef=ruleOperationDef();
            _fsp--;

             current =iv_ruleOperationDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDef1464); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOperationDef


    // $ANTLR start ruleOperationDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:914:1: ruleOperationDef returns [EObject current=null] : ( 'Operation' ( (lv_name_1_0= RULE_ID ) ) '{' 'output' ( (lv_output_4_0= ruleExpression ) ) '}' ) ;
    public final EObject ruleOperationDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_output_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:919:6: ( ( 'Operation' ( (lv_name_1_0= RULE_ID ) ) '{' 'output' ( (lv_output_4_0= ruleExpression ) ) '}' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:920:1: ( 'Operation' ( (lv_name_1_0= RULE_ID ) ) '{' 'output' ( (lv_output_4_0= ruleExpression ) ) '}' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:920:1: ( 'Operation' ( (lv_name_1_0= RULE_ID ) ) '{' 'output' ( (lv_output_4_0= ruleExpression ) ) '}' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:920:3: 'Operation' ( (lv_name_1_0= RULE_ID ) ) '{' 'output' ( (lv_output_4_0= ruleExpression ) ) '}'
            {
            match(input,23,FOLLOW_23_in_ruleOperationDef1499); 

                    createLeafNode(grammarAccess.getOperationDefAccess().getOperationKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:924:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:925:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:925:1: (lv_name_1_0= RULE_ID )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:926:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationDef1516); 

            			createLeafNode(grammarAccess.getOperationDefAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOperationDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleOperationDef1531); 

                    createLeafNode(grammarAccess.getOperationDefAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,19,FOLLOW_19_in_ruleOperationDef1541); 

                    createLeafNode(grammarAccess.getOperationDefAccess().getOutputKeyword_3(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:956:1: ( (lv_output_4_0= ruleExpression ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:957:1: (lv_output_4_0= ruleExpression )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:957:1: (lv_output_4_0= ruleExpression )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:958:3: lv_output_4_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOperationDefAccess().getOutputExpressionParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleOperationDef1562);
            lv_output_4_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOperationDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"output",
            	        		lv_output_4_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleOperationDef1572); 

                    createLeafNode(grammarAccess.getOperationDefAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOperationDef


    // $ANTLR start entryRuleNoiseDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:992:1: entryRuleNoiseDef returns [EObject current=null] : iv_ruleNoiseDef= ruleNoiseDef EOF ;
    public final EObject entryRuleNoiseDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoiseDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:993:2: (iv_ruleNoiseDef= ruleNoiseDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:994:2: iv_ruleNoiseDef= ruleNoiseDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNoiseDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleNoiseDef_in_entryRuleNoiseDef1608);
            iv_ruleNoiseDef=ruleNoiseDef();
            _fsp--;

             current =iv_ruleNoiseDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoiseDef1618); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNoiseDef


    // $ANTLR start ruleNoiseDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1001:1: ruleNoiseDef returns [EObject current=null] : ( 'Noise' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'frequency' ( (lv_frequency_6_0= RULE_INT ) ) '}' ) ;
    public final EObject ruleNoiseDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_seed_4_0=null;
        Token lv_frequency_6_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1006:6: ( ( 'Noise' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'frequency' ( (lv_frequency_6_0= RULE_INT ) ) '}' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1007:1: ( 'Noise' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'frequency' ( (lv_frequency_6_0= RULE_INT ) ) '}' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1007:1: ( 'Noise' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'frequency' ( (lv_frequency_6_0= RULE_INT ) ) '}' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1007:3: 'Noise' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'frequency' ( (lv_frequency_6_0= RULE_INT ) ) '}'
            {
            match(input,24,FOLLOW_24_in_ruleNoiseDef1653); 

                    createLeafNode(grammarAccess.getNoiseDefAccess().getNoiseKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1011:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1012:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1012:1: (lv_name_1_0= RULE_ID )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1013:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNoiseDef1670); 

            			createLeafNode(grammarAccess.getNoiseDefAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNoiseDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleNoiseDef1685); 

                    createLeafNode(grammarAccess.getNoiseDefAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_ruleNoiseDef1695); 

                    createLeafNode(grammarAccess.getNoiseDefAccess().getSeedKeyword_3(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1043:1: ( (lv_seed_4_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1044:1: (lv_seed_4_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1044:1: (lv_seed_4_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1045:3: lv_seed_4_0= RULE_INT
            {
            lv_seed_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNoiseDef1712); 

            			createLeafNode(grammarAccess.getNoiseDefAccess().getSeedINTTerminalRuleCall_4_0(), "seed"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNoiseDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"seed",
            	        		lv_seed_4_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,26,FOLLOW_26_in_ruleNoiseDef1727); 

                    createLeafNode(grammarAccess.getNoiseDefAccess().getFrequencyKeyword_5(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1071:1: ( (lv_frequency_6_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1072:1: (lv_frequency_6_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1072:1: (lv_frequency_6_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1073:3: lv_frequency_6_0= RULE_INT
            {
            lv_frequency_6_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNoiseDef1744); 

            			createLeafNode(grammarAccess.getNoiseDefAccess().getFrequencyINTTerminalRuleCall_6_0(), "frequency"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNoiseDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"frequency",
            	        		lv_frequency_6_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleNoiseDef1759); 

                    createLeafNode(grammarAccess.getNoiseDefAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNoiseDef


    // $ANTLR start entryRulePerlinDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1107:1: entryRulePerlinDef returns [EObject current=null] : iv_rulePerlinDef= rulePerlinDef EOF ;
    public final EObject entryRulePerlinDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerlinDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1108:2: (iv_rulePerlinDef= rulePerlinDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1109:2: iv_rulePerlinDef= rulePerlinDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPerlinDefRule(), currentNode); 
            pushFollow(FOLLOW_rulePerlinDef_in_entryRulePerlinDef1795);
            iv_rulePerlinDef=rulePerlinDef();
            _fsp--;

             current =iv_rulePerlinDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerlinDef1805); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePerlinDef


    // $ANTLR start rulePerlinDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1116:1: rulePerlinDef returns [EObject current=null] : ( 'Perlin' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'iterations' ( (lv_iterations_6_0= RULE_INT ) ) 'turbulence' ( (lv_turbulence_8_0= RULE_DECIMAL ) ) '}' ) ;
    public final EObject rulePerlinDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_seed_4_0=null;
        Token lv_iterations_6_0=null;
        Token lv_turbulence_8_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1121:6: ( ( 'Perlin' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'iterations' ( (lv_iterations_6_0= RULE_INT ) ) 'turbulence' ( (lv_turbulence_8_0= RULE_DECIMAL ) ) '}' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1122:1: ( 'Perlin' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'iterations' ( (lv_iterations_6_0= RULE_INT ) ) 'turbulence' ( (lv_turbulence_8_0= RULE_DECIMAL ) ) '}' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1122:1: ( 'Perlin' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'iterations' ( (lv_iterations_6_0= RULE_INT ) ) 'turbulence' ( (lv_turbulence_8_0= RULE_DECIMAL ) ) '}' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1122:3: 'Perlin' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'iterations' ( (lv_iterations_6_0= RULE_INT ) ) 'turbulence' ( (lv_turbulence_8_0= RULE_DECIMAL ) ) '}'
            {
            match(input,27,FOLLOW_27_in_rulePerlinDef1840); 

                    createLeafNode(grammarAccess.getPerlinDefAccess().getPerlinKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1126:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1127:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1127:1: (lv_name_1_0= RULE_ID )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1128:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePerlinDef1857); 

            			createLeafNode(grammarAccess.getPerlinDefAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPerlinDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_rulePerlinDef1872); 

                    createLeafNode(grammarAccess.getPerlinDefAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_rulePerlinDef1882); 

                    createLeafNode(grammarAccess.getPerlinDefAccess().getSeedKeyword_3(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1158:1: ( (lv_seed_4_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1159:1: (lv_seed_4_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1159:1: (lv_seed_4_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1160:3: lv_seed_4_0= RULE_INT
            {
            lv_seed_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePerlinDef1899); 

            			createLeafNode(grammarAccess.getPerlinDefAccess().getSeedINTTerminalRuleCall_4_0(), "seed"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPerlinDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"seed",
            	        		lv_seed_4_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,28,FOLLOW_28_in_rulePerlinDef1914); 

                    createLeafNode(grammarAccess.getPerlinDefAccess().getIterationsKeyword_5(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1186:1: ( (lv_iterations_6_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1187:1: (lv_iterations_6_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1187:1: (lv_iterations_6_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1188:3: lv_iterations_6_0= RULE_INT
            {
            lv_iterations_6_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePerlinDef1931); 

            			createLeafNode(grammarAccess.getPerlinDefAccess().getIterationsINTTerminalRuleCall_6_0(), "iterations"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPerlinDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"iterations",
            	        		lv_iterations_6_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,29,FOLLOW_29_in_rulePerlinDef1946); 

                    createLeafNode(grammarAccess.getPerlinDefAccess().getTurbulenceKeyword_7(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1214:1: ( (lv_turbulence_8_0= RULE_DECIMAL ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1215:1: (lv_turbulence_8_0= RULE_DECIMAL )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1215:1: (lv_turbulence_8_0= RULE_DECIMAL )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1216:3: lv_turbulence_8_0= RULE_DECIMAL
            {
            lv_turbulence_8_0=(Token)input.LT(1);
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rulePerlinDef1963); 

            			createLeafNode(grammarAccess.getPerlinDefAccess().getTurbulenceDECIMALTerminalRuleCall_8_0(), "turbulence"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPerlinDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"turbulence",
            	        		lv_turbulence_8_0, 
            	        		"DECIMAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,20,FOLLOW_20_in_rulePerlinDef1978); 

                    createLeafNode(grammarAccess.getPerlinDefAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePerlinDef


    // $ANTLR start entryRuleMarbleDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1250:1: entryRuleMarbleDef returns [EObject current=null] : iv_ruleMarbleDef= ruleMarbleDef EOF ;
    public final EObject entryRuleMarbleDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarbleDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1251:2: (iv_ruleMarbleDef= ruleMarbleDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1252:2: iv_ruleMarbleDef= ruleMarbleDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMarbleDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleMarbleDef_in_entryRuleMarbleDef2014);
            iv_ruleMarbleDef=ruleMarbleDef();
            _fsp--;

             current =iv_ruleMarbleDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarbleDef2024); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMarbleDef


    // $ANTLR start ruleMarbleDef
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1259:1: ruleMarbleDef returns [EObject current=null] : ( 'Marble' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) '}' ) ;
    public final EObject ruleMarbleDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_seed_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1264:6: ( ( 'Marble' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) '}' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1265:1: ( 'Marble' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) '}' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1265:1: ( 'Marble' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) '}' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1265:3: 'Marble' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) '}'
            {
            match(input,30,FOLLOW_30_in_ruleMarbleDef2059); 

                    createLeafNode(grammarAccess.getMarbleDefAccess().getMarbleKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1269:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1270:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1270:1: (lv_name_1_0= RULE_ID )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1271:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMarbleDef2076); 

            			createLeafNode(grammarAccess.getMarbleDefAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMarbleDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleMarbleDef2091); 

                    createLeafNode(grammarAccess.getMarbleDefAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,25,FOLLOW_25_in_ruleMarbleDef2101); 

                    createLeafNode(grammarAccess.getMarbleDefAccess().getSeedKeyword_3(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1301:1: ( (lv_seed_4_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1302:1: (lv_seed_4_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1302:1: (lv_seed_4_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1303:3: lv_seed_4_0= RULE_INT
            {
            lv_seed_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMarbleDef2118); 

            			createLeafNode(grammarAccess.getMarbleDefAccess().getSeedINTTerminalRuleCall_4_0(), "seed"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMarbleDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"seed",
            	        		lv_seed_4_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleMarbleDef2133); 

                    createLeafNode(grammarAccess.getMarbleDefAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMarbleDef


    // $ANTLR start entryRuleExpression
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1337:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1338:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1339:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2169);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2179); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1346:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1351:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1352:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1352:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1353:5: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression2226);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;

             
                    current = this_TerminalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1361:1: ( () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=40 && LA11_0<=42)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1361:2: () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1361:2: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1362:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0().getType().getClassifier());
                            try {
                            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                            } catch(ValueConverterException vce) {
                            	handleValueConverterException(vce);
                            }
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1377:2: ( (lv_op_2_0= ruleBOP ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1378:1: (lv_op_2_0= ruleBOP )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1378:1: (lv_op_2_0= ruleBOP )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1379:3: lv_op_2_0= ruleBOP
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getOpBOPParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBOP_in_ruleExpression2256);
                    lv_op_2_0=ruleBOP();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"op",
                    	        		lv_op_2_0, 
                    	        		"BOP", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1401:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1402:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1402:1: (lv_right_3_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1403:3: lv_right_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2277);
                    lv_right_3_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"right",
                    	        		lv_right_3_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleTerminalExpression
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1433:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1434:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1435:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression2315);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression2325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTerminalExpression


    // $ANTLR start ruleTerminalExpression
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1442:1: ruleTerminalExpression returns [EObject current=null] : ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( ( RULE_ID ) ) ) | this_BuiltInCall_5= ruleBuiltInCall | ( () ( (lv_variant_7_0= ruleVariant ) ) ) | ( () ( (lv_value_9_0= RULE_DECIMAL ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_9_0=null;
        EObject this_Expression_1 = null;

        EObject this_BuiltInCall_5 = null;

        Enumerator lv_variant_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1447:6: ( ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( ( RULE_ID ) ) ) | this_BuiltInCall_5= ruleBuiltInCall | ( () ( (lv_variant_7_0= ruleVariant ) ) ) | ( () ( (lv_value_9_0= RULE_DECIMAL ) ) ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1448:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( ( RULE_ID ) ) ) | this_BuiltInCall_5= ruleBuiltInCall | ( () ( (lv_variant_7_0= ruleVariant ) ) ) | ( () ( (lv_value_9_0= RULE_DECIMAL ) ) ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1448:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( ( RULE_ID ) ) ) | this_BuiltInCall_5= ruleBuiltInCall | ( () ( (lv_variant_7_0= ruleVariant ) ) ) | ( () ( (lv_value_9_0= RULE_DECIMAL ) ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case 33:
            case 34:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt12=3;
                }
                break;
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt12=4;
                }
                break;
            case RULE_DECIMAL:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1448:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( ( RULE_ID ) ) ) | this_BuiltInCall_5= ruleBuiltInCall | ( () ( (lv_variant_7_0= ruleVariant ) ) ) | ( () ( (lv_value_9_0= RULE_DECIMAL ) ) ) )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1448:2: ( '(' this_Expression_1= ruleExpression ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1448:2: ( '(' this_Expression_1= ruleExpression ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1448:4: '(' this_Expression_1= ruleExpression ')'
                    {
                    match(input,31,FOLLOW_31_in_ruleTerminalExpression2361); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression2383);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,32,FOLLOW_32_in_ruleTerminalExpression2392); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1466:6: ( () ( ( RULE_ID ) ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1466:6: ( () ( ( RULE_ID ) ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1466:7: () ( ( RULE_ID ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1466:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1467:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getModuleCallAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getModuleCallAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1477:2: ( ( RULE_ID ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1478:1: ( RULE_ID )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1478:1: ( RULE_ID )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1479:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression2427); 

                    		createLeafNode(grammarAccess.getTerminalExpressionAccess().getRefModuleDefCrossReference_1_1_0(), "ref"); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1493:5: this_BuiltInCall_5= ruleBuiltInCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBuiltInCallParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBuiltInCall_in_ruleTerminalExpression2456);
                    this_BuiltInCall_5=ruleBuiltInCall();
                    _fsp--;

                     
                            current = this_BuiltInCall_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1502:6: ( () ( (lv_variant_7_0= ruleVariant ) ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1502:6: ( () ( (lv_variant_7_0= ruleVariant ) ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1502:7: () ( (lv_variant_7_0= ruleVariant ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1502:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1503:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getVariantExpressionAction_3_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getVariantExpressionAction_3_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1513:2: ( (lv_variant_7_0= ruleVariant ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1514:1: (lv_variant_7_0= ruleVariant )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1514:1: (lv_variant_7_0= ruleVariant )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1515:3: lv_variant_7_0= ruleVariant
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getVariantVariantEnumRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariant_in_ruleTerminalExpression2492);
                    lv_variant_7_0=ruleVariant();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"variant",
                    	        		lv_variant_7_0, 
                    	        		"Variant", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1538:6: ( () ( (lv_value_9_0= RULE_DECIMAL ) ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1538:6: ( () ( (lv_value_9_0= RULE_DECIMAL ) ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1538:7: () ( (lv_value_9_0= RULE_DECIMAL ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1538:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1539:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getLiteralExpressionAction_4_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getLiteralExpressionAction_4_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1549:2: ( (lv_value_9_0= RULE_DECIMAL ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1550:1: (lv_value_9_0= RULE_DECIMAL )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1550:1: (lv_value_9_0= RULE_DECIMAL )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1551:3: lv_value_9_0= RULE_DECIMAL
                    {
                    lv_value_9_0=(Token)input.LT(1);
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleTerminalExpression2526); 

                    			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueDECIMALTerminalRuleCall_4_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_9_0, 
                    	        		"DECIMAL", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTerminalExpression


    // $ANTLR start entryRuleBuiltInCall
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1581:1: entryRuleBuiltInCall returns [EObject current=null] : iv_ruleBuiltInCall= ruleBuiltInCall EOF ;
    public final EObject entryRuleBuiltInCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInCall = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1582:2: (iv_ruleBuiltInCall= ruleBuiltInCall EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1583:2: iv_ruleBuiltInCall= ruleBuiltInCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBuiltInCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleBuiltInCall_in_entryRuleBuiltInCall2568);
            iv_ruleBuiltInCall=ruleBuiltInCall();
            _fsp--;

             current =iv_ruleBuiltInCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInCall2578); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBuiltInCall


    // $ANTLR start ruleBuiltInCall
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1590:1: ruleBuiltInCall returns [EObject current=null] : ( ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' ) | ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' ) | ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' ) | ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' ) | ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' ) | ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' ) ) ;
    public final EObject ruleBuiltInCall() throws RecognitionException {
        EObject current = null;

        EObject lv_a_3_0 = null;

        EObject lv_a_8_0 = null;

        EObject lv_b_10_0 = null;

        EObject lv_t_12_0 = null;

        EObject lv_a_17_0 = null;

        EObject lv_a_22_0 = null;

        EObject lv_rate_27_0 = null;

        EObject lv_expression_29_0 = null;

        EObject lv_expression_34_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1595:6: ( ( ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' ) | ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' ) | ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' ) | ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' ) | ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' ) | ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1596:1: ( ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' ) | ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' ) | ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' ) | ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' ) | ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' ) | ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1596:1: ( ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' ) | ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' ) | ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' ) | ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' ) | ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' ) | ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt13=1;
                }
                break;
            case 34:
                {
                alt13=2;
                }
                break;
            case 36:
                {
                alt13=3;
                }
                break;
            case 37:
                {
                alt13=4;
                }
                break;
            case 38:
                {
                alt13=5;
                }
                break;
            case 39:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1596:1: ( ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' ) | ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' ) | ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' ) | ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' ) | ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' ) | ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1596:2: ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1596:2: ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1596:3: () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')'
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1596:3: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1597:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBuiltInCallAccess().getINVAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBuiltInCallAccess().getINVAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,33,FOLLOW_33_in_ruleBuiltInCall2623); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getINVKeyword_0_1(), null); 
                        
                    match(input,31,FOLLOW_31_in_ruleBuiltInCall2633); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_0_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1615:1: ( (lv_a_3_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1616:1: (lv_a_3_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1616:1: (lv_a_3_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1617:3: lv_a_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getAExpressionParserRuleCall_0_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall2654);
                    lv_a_3_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"a",
                    	        		lv_a_3_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,32,FOLLOW_32_in_ruleBuiltInCall2664); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_0_4(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1644:6: ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1644:6: ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1644:7: () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')'
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1644:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1645:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBuiltInCallAccess().getMIXAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBuiltInCallAccess().getMIXAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,34,FOLLOW_34_in_ruleBuiltInCall2691); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getMIXKeyword_1_1(), null); 
                        
                    match(input,31,FOLLOW_31_in_ruleBuiltInCall2701); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_1_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1663:1: ( (lv_a_8_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1664:1: (lv_a_8_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1664:1: (lv_a_8_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1665:3: lv_a_8_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getAExpressionParserRuleCall_1_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall2722);
                    lv_a_8_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"a",
                    	        		lv_a_8_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,35,FOLLOW_35_in_ruleBuiltInCall2732); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_1_4(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1691:1: ( (lv_b_10_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1692:1: (lv_b_10_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1692:1: (lv_b_10_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1693:3: lv_b_10_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getBExpressionParserRuleCall_1_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall2753);
                    lv_b_10_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"b",
                    	        		lv_b_10_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,35,FOLLOW_35_in_ruleBuiltInCall2763); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_1_6(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1719:1: ( (lv_t_12_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1720:1: (lv_t_12_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1720:1: (lv_t_12_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1721:3: lv_t_12_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getTExpressionParserRuleCall_1_7_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall2784);
                    lv_t_12_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t",
                    	        		lv_t_12_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,32,FOLLOW_32_in_ruleBuiltInCall2794); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_1_8(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1748:6: ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1748:6: ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1748:7: () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')'
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1748:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1749:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBuiltInCallAccess().getSINAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBuiltInCallAccess().getSINAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,36,FOLLOW_36_in_ruleBuiltInCall2821); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getSINKeyword_2_1(), null); 
                        
                    match(input,31,FOLLOW_31_in_ruleBuiltInCall2831); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_2_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1767:1: ( (lv_a_17_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1768:1: (lv_a_17_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1768:1: (lv_a_17_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1769:3: lv_a_17_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getAExpressionParserRuleCall_2_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall2852);
                    lv_a_17_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"a",
                    	        		lv_a_17_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,32,FOLLOW_32_in_ruleBuiltInCall2862); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_2_4(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1796:6: ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1796:6: ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1796:7: () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')'
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1796:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1797:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBuiltInCallAccess().getBOOLAction_3_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBuiltInCallAccess().getBOOLAction_3_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,37,FOLLOW_37_in_ruleBuiltInCall2889); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getBOOLKeyword_3_1(), null); 
                        
                    match(input,31,FOLLOW_31_in_ruleBuiltInCall2899); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_3_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1815:1: ( (lv_a_22_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1816:1: (lv_a_22_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1816:1: (lv_a_22_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1817:3: lv_a_22_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getAExpressionParserRuleCall_3_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall2920);
                    lv_a_22_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"a",
                    	        		lv_a_22_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,32,FOLLOW_32_in_ruleBuiltInCall2930); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_3_4(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1844:6: ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1844:6: ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1844:7: () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')'
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1844:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1845:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBuiltInCallAccess().getSCALEAction_4_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBuiltInCallAccess().getSCALEAction_4_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,38,FOLLOW_38_in_ruleBuiltInCall2957); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getSCALEKeyword_4_1(), null); 
                        
                    match(input,31,FOLLOW_31_in_ruleBuiltInCall2967); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_4_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1863:1: ( (lv_rate_27_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1864:1: (lv_rate_27_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1864:1: (lv_rate_27_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1865:3: lv_rate_27_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getRateExpressionParserRuleCall_4_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall2988);
                    lv_rate_27_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"rate",
                    	        		lv_rate_27_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,35,FOLLOW_35_in_ruleBuiltInCall2998); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_4_4(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1891:1: ( (lv_expression_29_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1892:1: (lv_expression_29_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1892:1: (lv_expression_29_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1893:3: lv_expression_29_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExpressionExpressionParserRuleCall_4_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall3019);
                    lv_expression_29_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expression",
                    	        		lv_expression_29_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,32,FOLLOW_32_in_ruleBuiltInCall3029); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_4_6(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1920:6: ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1920:6: ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1920:7: () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')'
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1920:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1921:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getBuiltInCallAccess().getRADIALAction_5_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getBuiltInCallAccess().getRADIALAction_5_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,39,FOLLOW_39_in_ruleBuiltInCall3056); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getRADIALKeyword_5_1(), null); 
                        
                    match(input,31,FOLLOW_31_in_ruleBuiltInCall3066); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_5_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1939:1: ( (lv_expression_34_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1940:1: (lv_expression_34_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1940:1: (lv_expression_34_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1941:3: lv_expression_34_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExpressionExpressionParserRuleCall_5_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall3087);
                    lv_expression_34_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBuiltInCallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expression",
                    	        		lv_expression_34_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,32,FOLLOW_32_in_ruleBuiltInCall3097); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_5_4(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBuiltInCall


    // $ANTLR start entryRuleBOP
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1975:1: entryRuleBOP returns [String current=null] : iv_ruleBOP= ruleBOP EOF ;
    public final String entryRuleBOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOP = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1976:2: (iv_ruleBOP= ruleBOP EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1977:2: iv_ruleBOP= ruleBOP EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBOPRule(), currentNode); 
            pushFollow(FOLLOW_ruleBOP_in_entryRuleBOP3135);
            iv_ruleBOP=ruleBOP();
            _fsp--;

             current =iv_ruleBOP.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOP3146); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBOP


    // $ANTLR start ruleBOP
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1984:1: ruleBOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleBOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1989:6: ( (kw= '+' | kw= '-' | kw= '*' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1990:1: (kw= '+' | kw= '-' | kw= '*' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1990:1: (kw= '+' | kw= '-' | kw= '*' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt14=1;
                }
                break;
            case 41:
                {
                alt14=2;
                }
                break;
            case 42:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1990:1: (kw= '+' | kw= '-' | kw= '*' )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1991:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_ruleBOP3184); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBOPAccess().getPlusSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1998:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleBOP3203); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBOPAccess().getHyphenMinusKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2005:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_ruleBOP3222); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBOPAccess().getAsteriskKeyword_2(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBOP


    // $ANTLR start ruleVariant
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2018:1: ruleVariant returns [Enumerator current=null] : ( ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'T' ) ) ;
    public final Enumerator ruleVariant() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2022:6: ( ( ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'T' ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2023:1: ( ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'T' ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2023:1: ( ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'T' ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt15=1;
                }
                break;
            case 44:
                {
                alt15=2;
                }
                break;
            case 45:
                {
                alt15=3;
                }
                break;
            case 46:
                {
                alt15=4;
                }
                break;
            case 47:
                {
                alt15=5;
                }
                break;
            case 48:
                {
                alt15=6;
                }
                break;
            case 49:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2023:1: ( ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'T' ) )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2023:2: ( 'X' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2023:2: ( 'X' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2023:4: 'X'
                    {
                    match(input,43,FOLLOW_43_in_ruleVariant3274); 

                            current = grammarAccess.getVariantAccess().getXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVariantAccess().getXEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2029:6: ( 'Y' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2029:6: ( 'Y' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2029:8: 'Y'
                    {
                    match(input,44,FOLLOW_44_in_ruleVariant3289); 

                            current = grammarAccess.getVariantAccess().getYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVariantAccess().getYEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2035:6: ( 'Z' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2035:6: ( 'Z' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2035:8: 'Z'
                    {
                    match(input,45,FOLLOW_45_in_ruleVariant3304); 

                            current = grammarAccess.getVariantAccess().getZEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVariantAccess().getZEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2041:6: ( 'U' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2041:6: ( 'U' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2041:8: 'U'
                    {
                    match(input,46,FOLLOW_46_in_ruleVariant3319); 

                            current = grammarAccess.getVariantAccess().getUEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVariantAccess().getUEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2047:6: ( 'V' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2047:6: ( 'V' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2047:8: 'V'
                    {
                    match(input,47,FOLLOW_47_in_ruleVariant3334); 

                            current = grammarAccess.getVariantAccess().getVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVariantAccess().getVEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2053:6: ( 'W' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2053:6: ( 'W' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2053:8: 'W'
                    {
                    match(input,48,FOLLOW_48_in_ruleVariant3349); 

                            current = grammarAccess.getVariantAccess().getWEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVariantAccess().getWEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2059:6: ( 'T' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2059:6: ( 'T' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2059:8: 'T'
                    {
                    match(input,49,FOLLOW_49_in_ruleVariant3364); 

                            current = grammarAccess.getVariantAccess().getTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVariantAccess().getTEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariant


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStage_in_ruleModel172 = new BitSet(new long[]{0x0000000049A01002L});
    public static final BitSet FOLLOW_ruleModuleDef_in_ruleModel243 = new BitSet(new long[]{0x0000000049A01002L});
    public static final BitSet FOLLOW_ruleStage_in_entryRuleStage318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStage328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStage363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStage380 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStage395 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStage405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStage422 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStage437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStage454 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_16_in_ruleStage470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStage487 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruleStage505 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStage522 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStage537 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStage554 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStage571 = new BitSet(new long[]{0x0003F8F680000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStage592 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStage602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleDef_in_entryRuleModuleDef638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleDef648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorDef_in_ruleModuleDef695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDef_in_ruleModuleDef722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoiseDef_in_ruleModuleDef749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerlinDef_in_ruleModuleDef776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarbleDef_in_ruleModuleDef803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorDef_in_entryRuleColorDef838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorDef848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleColorDef883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorDef900 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleColorDef915 = new BitSet(new long[]{0x0000000000400060L});
    public static final BitSet FOLLOW_ruleColorFloatDef_in_ruleColorDef938 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleColorIntDef_in_ruleColorDef957 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleColorHexaDef_in_ruleColorDef976 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleColorDef989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFloatDef_in_entryRuleColorFloatDef1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFloatDef1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1077 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1100 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1122 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorIntDef_in_entryRuleColorIntDef1188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorIntDef1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColorIntDef1240 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColorIntDef1263 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColorIntDef1285 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColorIntDef1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorHexaDef_in_entryRuleColorHexaDef1351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorHexaDef1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleColorHexaDef1396 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleColorHexaDef1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDef_in_entryRuleOperationDef1454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDef1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOperationDef1499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationDef1516 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOperationDef1531 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOperationDef1541 = new BitSet(new long[]{0x0003F8F680000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleOperationDef1562 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperationDef1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoiseDef_in_entryRuleNoiseDef1608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoiseDef1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleNoiseDef1653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNoiseDef1670 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNoiseDef1685 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNoiseDef1695 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNoiseDef1712 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNoiseDef1727 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNoiseDef1744 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNoiseDef1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerlinDef_in_entryRulePerlinDef1795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerlinDef1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePerlinDef1840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePerlinDef1857 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePerlinDef1872 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePerlinDef1882 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePerlinDef1899 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePerlinDef1914 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePerlinDef1931 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePerlinDef1946 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rulePerlinDef1963 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePerlinDef1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarbleDef_in_entryRuleMarbleDef2014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarbleDef2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMarbleDef2059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMarbleDef2076 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMarbleDef2091 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMarbleDef2101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMarbleDef2118 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMarbleDef2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression2226 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_ruleBOP_in_ruleExpression2256 = new BitSet(new long[]{0x0003F8F680000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression2315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTerminalExpression2361 = new BitSet(new long[]{0x0003F8F680000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression2383 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTerminalExpression2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInCall_in_ruleTerminalExpression2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariant_in_ruleTerminalExpression2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleTerminalExpression2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInCall_in_entryRuleBuiltInCall2568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInCall2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBuiltInCall2623 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBuiltInCall2633 = new BitSet(new long[]{0x0003F8F680000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall2654 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBuiltInCall2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBuiltInCall2691 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBuiltInCall2701 = new BitSet(new long[]{0x0003F8F680000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall2722 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBuiltInCall2732 = new BitSet(new long[]{0x0003F8F680000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall2753 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBuiltInCall2763 = new BitSet(new long[]{0x0003F8F680000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall2784 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBuiltInCall2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBuiltInCall2821 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBuiltInCall2831 = new BitSet(new long[]{0x0003F8F680000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall2852 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBuiltInCall2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBuiltInCall2889 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBuiltInCall2899 = new BitSet(new long[]{0x0003F8F680000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall2920 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBuiltInCall2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBuiltInCall2957 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBuiltInCall2967 = new BitSet(new long[]{0x0003F8F680000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall2988 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBuiltInCall2998 = new BitSet(new long[]{0x0003F8F680000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall3019 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBuiltInCall3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBuiltInCall3056 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBuiltInCall3066 = new BitSet(new long[]{0x0003F8F680000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall3087 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBuiltInCall3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOP_in_entryRuleBOP3135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOP3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBOP3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBOP3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBOP3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVariant3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleVariant3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVariant3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVariant3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVariant3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVariant3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVariant3364 = new BitSet(new long[]{0x0000000000000002L});

}
