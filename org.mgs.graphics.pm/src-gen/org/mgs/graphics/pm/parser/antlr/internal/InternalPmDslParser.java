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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Stage'", "'{'", "'width'", "'height'", "'depth'", "'duration'", "'fps'", "'output'", "'}'", "'Color'", "'#'", "'Operation'", "'Noise'", "'seed'", "'frequency'", "'Perlin'", "'iterations'", "'turbulence'", "'Marble'", "'('", "')'", "'INV'", "'MIX'", "','", "'SIN'", "'BOOL'", "'SCALE'", "'RADIAL'", "'+'", "'-'", "'*'", "'X'", "'Y'", "'Z'", "'U'", "'V'", "'W'", "'T'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_DECIMAL=7;
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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:87:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) ) ) | ({...}? => ( ( (lv_defs_3_0= ruleModuleDef ) )+ ) ) )+ {...}?) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_stage_2_0 = null;

        EObject lv_defs_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:92:6: ( ( ( ( ( ({...}? => ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) ) ) | ({...}? => ( ( (lv_defs_3_0= ruleModuleDef ) )+ ) ) )+ {...}?) ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:93:1: ( ( ( ( ({...}? => ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) ) ) | ({...}? => ( ( (lv_defs_3_0= ruleModuleDef ) )+ ) ) )+ {...}?) ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:93:1: ( ( ( ( ({...}? => ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) ) ) | ({...}? => ( ( (lv_defs_3_0= ruleModuleDef ) )+ ) ) )+ {...}?) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:95:1: ( ( ( ({...}? => ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) ) ) | ({...}? => ( ( (lv_defs_3_0= ruleModuleDef ) )+ ) ) )+ {...}?) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:95:1: ( ( ( ({...}? => ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) ) ) | ({...}? => ( ( (lv_defs_3_0= ruleModuleDef ) )+ ) ) )+ {...}?) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:96:2: ( ( ({...}? => ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) ) ) | ({...}? => ( ( (lv_defs_3_0= ruleModuleDef ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            	
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:99:2: ( ( ({...}? => ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) ) ) | ({...}? => ( ( (lv_defs_3_0= ruleModuleDef ) )+ ) ) )+ {...}?)
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:100:3: ( ({...}? => ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) ) ) | ({...}? => ( ( (lv_defs_3_0= ruleModuleDef ) )+ ) ) )+ {...}?
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:100:3: ( ({...}? => ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) ) ) | ({...}? => ( ( (lv_defs_3_0= ruleModuleDef ) )+ ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==EOF) ) {
                    int LA4_1 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) &&getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup()) ) {
                        alt4=1;
                    }


                }
                else if ( LA4_0 >=12 && LA4_0<=13 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    int LA4_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) &&getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        alt4=1;
                    }
                    else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        alt4=2;
                    }


                }
                else if ( LA4_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    int LA4_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) &&getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        alt4=1;
                    }
                    else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        alt4=2;
                    }


                }
                else if ( LA4_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    int LA4_5 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) &&getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        alt4=1;
                    }
                    else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        alt4=2;
                    }


                }
                else if ( LA4_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    int LA4_6 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) &&getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        alt4=1;
                    }
                    else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        alt4=2;
                    }


                }
                else if ( LA4_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    int LA4_7 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) &&getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        alt4=1;
                    }
                    else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        alt4=2;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:102:4: ({...}? => ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) ) )
            	    {
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:102:4: ({...}? => ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) ) )
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:103:5: {...}? => ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:103:100: ( ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? ) )
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:104:6: ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:107:6: ( ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )? )
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:107:7: ( (lv_imports_1_0= ruleImport ) )* ( (lv_stage_2_0= ruleStage ) )?
            	    {
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:107:7: ( (lv_imports_1_0= ruleImport ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==12) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:108:1: (lv_imports_1_0= ruleImport )
            	    	    {
            	    	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:108:1: (lv_imports_1_0= ruleImport )
            	    	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:109:3: lv_imports_1_0= ruleImport
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleImport_in_ruleModel173);
            	    	    lv_imports_1_0=ruleImport();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"imports",
            	    	    	        		lv_imports_1_0, 
            	    	    	        		"Import", 
            	    	    	        		currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:131:3: ( (lv_stage_2_0= ruleStage ) )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==13) ) {
            	        int LA2_1 = input.LA(2);

            	        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	            alt2=1;
            	        }
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:132:1: (lv_stage_2_0= ruleStage )
            	            {
            	            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:132:1: (lv_stage_2_0= ruleStage )
            	            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:133:3: lv_stage_2_0= ruleStage
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getStageStageParserRuleCall_0_1_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleStage_in_ruleModel195);
            	            lv_stage_2_0=ruleStage();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		set(
            	            	       			current, 
            	            	       			"stage",
            	            	        		lv_stage_2_0, 
            	            	        		"Stage", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:162:4: ({...}? => ( ( (lv_defs_3_0= ruleModuleDef ) )+ ) )
            	    {
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:162:4: ({...}? => ( ( (lv_defs_3_0= ruleModuleDef ) )+ ) )
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:163:5: {...}? => ( ( (lv_defs_3_0= ruleModuleDef ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:163:100: ( ( (lv_defs_3_0= ruleModuleDef ) )+ )
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:164:6: ( (lv_defs_3_0= ruleModuleDef ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:167:6: ( (lv_defs_3_0= ruleModuleDef ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( LA3_0 ==22 && (getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ||! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) &&getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)) ) {
            	            int LA3_3 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	                alt3=1;
            	            }


            	        }
            	        else if ( LA3_0 ==24 && (getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)||! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) &&getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) &&getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)) ) {
            	            int LA3_4 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	                alt3=1;
            	            }


            	        }
            	        else if ( LA3_0 ==25 && (getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ||! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) &&getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)) ) {
            	            int LA3_5 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	                alt3=1;
            	            }


            	        }
            	        else if ( LA3_0 ==28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ||! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) ) {
            	            int LA3_6 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	                alt3=1;
            	            }


            	        }
            	        else if ( LA3_0 ==31 && (getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)||! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) &&getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) &&getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)) ) {
            	            int LA3_7 = input.LA(2);

            	            if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	                alt3=1;
            	            }


            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:168:1: (lv_defs_3_0= ruleModuleDef )
            	    	    {
            	    	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:168:1: (lv_defs_3_0= ruleModuleDef )
            	    	    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:169:3: lv_defs_3_0= ruleModuleDef
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDefsModuleDefParserRuleCall_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleModuleDef_in_ruleModel268);
            	    	    lv_defs_3_0=ruleModuleDef();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"defs",
            	    	    	        		lv_defs_3_0, 
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
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup())");
            }

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


    // $ANTLR start entryRuleImport
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:214:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:215:2: (iv_ruleImport= ruleImport EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:216:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport349);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport359); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:223:1: ruleImport returns [EObject current=null] : ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:228:6: ( ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:229:1: ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:229:1: ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:229:3: 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            match(input,12,FOLLOW_12_in_ruleImport394); 

                    createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:233:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:234:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:234:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:235:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport411); 

            			createLeafNode(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_1_0, 
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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleStage
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:265:1: entryRuleStage returns [EObject current=null] : iv_ruleStage= ruleStage EOF ;
    public final EObject entryRuleStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStage = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:266:2: (iv_ruleStage= ruleStage EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:267:2: iv_ruleStage= ruleStage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStageRule(), currentNode); 
            pushFollow(FOLLOW_ruleStage_in_entryRuleStage452);
            iv_ruleStage=ruleStage();
            _fsp--;

             current =iv_ruleStage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStage462); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:274:1: ruleStage returns [EObject current=null] : ( 'Stage' ( (lv_name_1_0= RULE_ID ) ) '{' 'width' ( (lv_width_4_0= RULE_INT ) ) 'height' ( (lv_height_6_0= RULE_INT ) ) ( 'depth' ( (lv_depth_8_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) ) )? 'output' ( (lv_output_14_0= ruleExpression ) ) '}' ) ;
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
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:279:6: ( ( 'Stage' ( (lv_name_1_0= RULE_ID ) ) '{' 'width' ( (lv_width_4_0= RULE_INT ) ) 'height' ( (lv_height_6_0= RULE_INT ) ) ( 'depth' ( (lv_depth_8_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) ) )? 'output' ( (lv_output_14_0= ruleExpression ) ) '}' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:280:1: ( 'Stage' ( (lv_name_1_0= RULE_ID ) ) '{' 'width' ( (lv_width_4_0= RULE_INT ) ) 'height' ( (lv_height_6_0= RULE_INT ) ) ( 'depth' ( (lv_depth_8_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) ) )? 'output' ( (lv_output_14_0= ruleExpression ) ) '}' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:280:1: ( 'Stage' ( (lv_name_1_0= RULE_ID ) ) '{' 'width' ( (lv_width_4_0= RULE_INT ) ) 'height' ( (lv_height_6_0= RULE_INT ) ) ( 'depth' ( (lv_depth_8_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) ) )? 'output' ( (lv_output_14_0= ruleExpression ) ) '}' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:280:3: 'Stage' ( (lv_name_1_0= RULE_ID ) ) '{' 'width' ( (lv_width_4_0= RULE_INT ) ) 'height' ( (lv_height_6_0= RULE_INT ) ) ( 'depth' ( (lv_depth_8_0= RULE_INT ) ) )? ( 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) ) )? 'output' ( (lv_output_14_0= ruleExpression ) ) '}'
            {
            match(input,13,FOLLOW_13_in_ruleStage497); 

                    createLeafNode(grammarAccess.getStageAccess().getStageKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:284:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:285:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:285:1: (lv_name_1_0= RULE_ID )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:286:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStage514); 

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

            match(input,14,FOLLOW_14_in_ruleStage529); 

                    createLeafNode(grammarAccess.getStageAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,15,FOLLOW_15_in_ruleStage539); 

                    createLeafNode(grammarAccess.getStageAccess().getWidthKeyword_3(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:316:1: ( (lv_width_4_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:317:1: (lv_width_4_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:317:1: (lv_width_4_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:318:3: lv_width_4_0= RULE_INT
            {
            lv_width_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStage556); 

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

            match(input,16,FOLLOW_16_in_ruleStage571); 

                    createLeafNode(grammarAccess.getStageAccess().getHeightKeyword_5(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:344:1: ( (lv_height_6_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:345:1: (lv_height_6_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:345:1: (lv_height_6_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:346:3: lv_height_6_0= RULE_INT
            {
            lv_height_6_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStage588); 

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

            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:368:2: ( 'depth' ( (lv_depth_8_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:368:4: 'depth' ( (lv_depth_8_0= RULE_INT ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleStage604); 

                            createLeafNode(grammarAccess.getStageAccess().getDepthKeyword_7_0(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:372:1: ( (lv_depth_8_0= RULE_INT ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:373:1: (lv_depth_8_0= RULE_INT )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:373:1: (lv_depth_8_0= RULE_INT )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:374:3: lv_depth_8_0= RULE_INT
                    {
                    lv_depth_8_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStage621); 

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

            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:396:4: ( 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:396:6: 'duration' ( (lv_duration_10_0= RULE_INT ) ) 'fps' ( (lv_fps_12_0= RULE_INT ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleStage639); 

                            createLeafNode(grammarAccess.getStageAccess().getDurationKeyword_8_0(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:400:1: ( (lv_duration_10_0= RULE_INT ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:401:1: (lv_duration_10_0= RULE_INT )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:401:1: (lv_duration_10_0= RULE_INT )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:402:3: lv_duration_10_0= RULE_INT
                    {
                    lv_duration_10_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStage656); 

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

                    match(input,19,FOLLOW_19_in_ruleStage671); 

                            createLeafNode(grammarAccess.getStageAccess().getFpsKeyword_8_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:428:1: ( (lv_fps_12_0= RULE_INT ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:429:1: (lv_fps_12_0= RULE_INT )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:429:1: (lv_fps_12_0= RULE_INT )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:430:3: lv_fps_12_0= RULE_INT
                    {
                    lv_fps_12_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStage688); 

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

            match(input,20,FOLLOW_20_in_ruleStage705); 

                    createLeafNode(grammarAccess.getStageAccess().getOutputKeyword_9(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:456:1: ( (lv_output_14_0= ruleExpression ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:457:1: (lv_output_14_0= ruleExpression )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:457:1: (lv_output_14_0= ruleExpression )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:458:3: lv_output_14_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStageAccess().getOutputExpressionParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleStage726);
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

            match(input,21,FOLLOW_21_in_ruleStage736); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:492:1: entryRuleModuleDef returns [EObject current=null] : iv_ruleModuleDef= ruleModuleDef EOF ;
    public final EObject entryRuleModuleDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:493:2: (iv_ruleModuleDef= ruleModuleDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:494:2: iv_ruleModuleDef= ruleModuleDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleModuleDef_in_entryRuleModuleDef772);
            iv_ruleModuleDef=ruleModuleDef();
            _fsp--;

             current =iv_ruleModuleDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleDef782); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:501:1: ruleModuleDef returns [EObject current=null] : (this_ColorDef_0= ruleColorDef | this_OperationDef_1= ruleOperationDef | this_NoiseDef_2= ruleNoiseDef | this_PerlinDef_3= rulePerlinDef | this_MarbleDef_4= ruleMarbleDef ) ;
    public final EObject ruleModuleDef() throws RecognitionException {
        EObject current = null;

        EObject this_ColorDef_0 = null;

        EObject this_OperationDef_1 = null;

        EObject this_NoiseDef_2 = null;

        EObject this_PerlinDef_3 = null;

        EObject this_MarbleDef_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:506:6: ( (this_ColorDef_0= ruleColorDef | this_OperationDef_1= ruleOperationDef | this_NoiseDef_2= ruleNoiseDef | this_PerlinDef_3= rulePerlinDef | this_MarbleDef_4= ruleMarbleDef ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:507:1: (this_ColorDef_0= ruleColorDef | this_OperationDef_1= ruleOperationDef | this_NoiseDef_2= ruleNoiseDef | this_PerlinDef_3= rulePerlinDef | this_MarbleDef_4= ruleMarbleDef )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:507:1: (this_ColorDef_0= ruleColorDef | this_OperationDef_1= ruleOperationDef | this_NoiseDef_2= ruleNoiseDef | this_PerlinDef_3= rulePerlinDef | this_MarbleDef_4= ruleMarbleDef )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 28:
                {
                alt7=4;
                }
                break;
            case 31:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("507:1: (this_ColorDef_0= ruleColorDef | this_OperationDef_1= ruleOperationDef | this_NoiseDef_2= ruleNoiseDef | this_PerlinDef_3= rulePerlinDef | this_MarbleDef_4= ruleMarbleDef )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:508:5: this_ColorDef_0= ruleColorDef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleDefAccess().getColorDefParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleColorDef_in_ruleModuleDef829);
                    this_ColorDef_0=ruleColorDef();
                    _fsp--;

                     
                            current = this_ColorDef_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:518:5: this_OperationDef_1= ruleOperationDef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleDefAccess().getOperationDefParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOperationDef_in_ruleModuleDef856);
                    this_OperationDef_1=ruleOperationDef();
                    _fsp--;

                     
                            current = this_OperationDef_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:528:5: this_NoiseDef_2= ruleNoiseDef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleDefAccess().getNoiseDefParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNoiseDef_in_ruleModuleDef883);
                    this_NoiseDef_2=ruleNoiseDef();
                    _fsp--;

                     
                            current = this_NoiseDef_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:538:5: this_PerlinDef_3= rulePerlinDef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleDefAccess().getPerlinDefParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePerlinDef_in_ruleModuleDef910);
                    this_PerlinDef_3=rulePerlinDef();
                    _fsp--;

                     
                            current = this_PerlinDef_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:548:5: this_MarbleDef_4= ruleMarbleDef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getModuleDefAccess().getMarbleDefParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMarbleDef_in_ruleModuleDef937);
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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:564:1: entryRuleColorDef returns [EObject current=null] : iv_ruleColorDef= ruleColorDef EOF ;
    public final EObject entryRuleColorDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:565:2: (iv_ruleColorDef= ruleColorDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:566:2: iv_ruleColorDef= ruleColorDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getColorDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleColorDef_in_entryRuleColorDef972);
            iv_ruleColorDef=ruleColorDef();
            _fsp--;

             current =iv_ruleColorDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorDef982); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:573:1: ruleColorDef returns [EObject current=null] : ( 'Color' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) ) ) '}' ) ;
    public final EObject ruleColorDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_def_3_1 = null;

        EObject lv_def_3_2 = null;

        EObject lv_def_3_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:578:6: ( ( 'Color' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) ) ) '}' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:579:1: ( 'Color' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) ) ) '}' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:579:1: ( 'Color' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) ) ) '}' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:579:3: 'Color' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) ) ) '}'
            {
            match(input,22,FOLLOW_22_in_ruleColorDef1017); 

                    createLeafNode(grammarAccess.getColorDefAccess().getColorKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:583:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:584:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:584:1: (lv_name_1_0= RULE_ID )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:585:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorDef1034); 

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

            match(input,14,FOLLOW_14_in_ruleColorDef1049); 

                    createLeafNode(grammarAccess.getColorDefAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:611:1: ( ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:612:1: ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:612:1: ( (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:613:1: (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:613:1: (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("613:1: (lv_def_3_1= ruleColorFloatDef | lv_def_3_2= ruleColorIntDef | lv_def_3_3= ruleColorHexaDef )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:614:3: lv_def_3_1= ruleColorFloatDef
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getColorDefAccess().getDefColorFloatDefParserRuleCall_3_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleColorFloatDef_in_ruleColorDef1072);
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
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:635:8: lv_def_3_2= ruleColorIntDef
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getColorDefAccess().getDefColorIntDefParserRuleCall_3_0_1(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleColorIntDef_in_ruleColorDef1091);
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
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:656:8: lv_def_3_3= ruleColorHexaDef
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getColorDefAccess().getDefColorHexaDefParserRuleCall_3_0_2(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleColorHexaDef_in_ruleColorDef1110);
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

            match(input,21,FOLLOW_21_in_ruleColorDef1123); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:692:1: entryRuleColorFloatDef returns [EObject current=null] : iv_ruleColorFloatDef= ruleColorFloatDef EOF ;
    public final EObject entryRuleColorFloatDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFloatDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:693:2: (iv_ruleColorFloatDef= ruleColorFloatDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:694:2: iv_ruleColorFloatDef= ruleColorFloatDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getColorFloatDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleColorFloatDef_in_entryRuleColorFloatDef1159);
            iv_ruleColorFloatDef=ruleColorFloatDef();
            _fsp--;

             current =iv_ruleColorFloatDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFloatDef1169); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:701:1: ruleColorFloatDef returns [EObject current=null] : ( ( (lv_r_0_0= RULE_DECIMAL ) ) ( ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )? )? ) ;
    public final EObject ruleColorFloatDef() throws RecognitionException {
        EObject current = null;

        Token lv_r_0_0=null;
        Token lv_g_1_0=null;
        Token lv_b_2_0=null;
        Token lv_a_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:706:6: ( ( ( (lv_r_0_0= RULE_DECIMAL ) ) ( ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )? )? ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:707:1: ( ( (lv_r_0_0= RULE_DECIMAL ) ) ( ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )? )? )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:707:1: ( ( (lv_r_0_0= RULE_DECIMAL ) ) ( ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )? )? )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:707:2: ( (lv_r_0_0= RULE_DECIMAL ) ) ( ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )? )?
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:707:2: ( (lv_r_0_0= RULE_DECIMAL ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:708:1: (lv_r_0_0= RULE_DECIMAL )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:708:1: (lv_r_0_0= RULE_DECIMAL )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:709:3: lv_r_0_0= RULE_DECIMAL
            {
            lv_r_0_0=(Token)input.LT(1);
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1211); 

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

            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:731:2: ( ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DECIMAL) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:731:3: ( (lv_g_1_0= RULE_DECIMAL ) ) ( (lv_b_2_0= RULE_DECIMAL ) ) ( (lv_a_3_0= RULE_DECIMAL ) )?
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:731:3: ( (lv_g_1_0= RULE_DECIMAL ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:732:1: (lv_g_1_0= RULE_DECIMAL )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:732:1: (lv_g_1_0= RULE_DECIMAL )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:733:3: lv_g_1_0= RULE_DECIMAL
                    {
                    lv_g_1_0=(Token)input.LT(1);
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1234); 

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

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:755:2: ( (lv_b_2_0= RULE_DECIMAL ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:756:1: (lv_b_2_0= RULE_DECIMAL )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:756:1: (lv_b_2_0= RULE_DECIMAL )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:757:3: lv_b_2_0= RULE_DECIMAL
                    {
                    lv_b_2_0=(Token)input.LT(1);
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1256); 

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

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:779:2: ( (lv_a_3_0= RULE_DECIMAL ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_DECIMAL) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:780:1: (lv_a_3_0= RULE_DECIMAL )
                            {
                            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:780:1: (lv_a_3_0= RULE_DECIMAL )
                            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:781:3: lv_a_3_0= RULE_DECIMAL
                            {
                            lv_a_3_0=(Token)input.LT(1);
                            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1278); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:811:1: entryRuleColorIntDef returns [EObject current=null] : iv_ruleColorIntDef= ruleColorIntDef EOF ;
    public final EObject entryRuleColorIntDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorIntDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:812:2: (iv_ruleColorIntDef= ruleColorIntDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:813:2: iv_ruleColorIntDef= ruleColorIntDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getColorIntDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleColorIntDef_in_entryRuleColorIntDef1322);
            iv_ruleColorIntDef=ruleColorIntDef();
            _fsp--;

             current =iv_ruleColorIntDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorIntDef1332); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:820:1: ruleColorIntDef returns [EObject current=null] : ( ( (lv_r_0_0= RULE_INT ) ) ( ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )? )? ) ;
    public final EObject ruleColorIntDef() throws RecognitionException {
        EObject current = null;

        Token lv_r_0_0=null;
        Token lv_g_1_0=null;
        Token lv_b_2_0=null;
        Token lv_a_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:825:6: ( ( ( (lv_r_0_0= RULE_INT ) ) ( ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )? )? ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:826:1: ( ( (lv_r_0_0= RULE_INT ) ) ( ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )? )? )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:826:1: ( ( (lv_r_0_0= RULE_INT ) ) ( ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )? )? )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:826:2: ( (lv_r_0_0= RULE_INT ) ) ( ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )? )?
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:826:2: ( (lv_r_0_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:827:1: (lv_r_0_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:827:1: (lv_r_0_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:828:3: lv_r_0_0= RULE_INT
            {
            lv_r_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColorIntDef1374); 

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

            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:850:2: ( ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:850:3: ( (lv_g_1_0= RULE_INT ) ) ( (lv_b_2_0= RULE_INT ) ) ( (lv_a_3_0= RULE_INT ) )?
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:850:3: ( (lv_g_1_0= RULE_INT ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:851:1: (lv_g_1_0= RULE_INT )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:851:1: (lv_g_1_0= RULE_INT )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:852:3: lv_g_1_0= RULE_INT
                    {
                    lv_g_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColorIntDef1397); 

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

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:874:2: ( (lv_b_2_0= RULE_INT ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:875:1: (lv_b_2_0= RULE_INT )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:875:1: (lv_b_2_0= RULE_INT )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:876:3: lv_b_2_0= RULE_INT
                    {
                    lv_b_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColorIntDef1419); 

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

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:898:2: ( (lv_a_3_0= RULE_INT ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_INT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:899:1: (lv_a_3_0= RULE_INT )
                            {
                            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:899:1: (lv_a_3_0= RULE_INT )
                            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:900:3: lv_a_3_0= RULE_INT
                            {
                            lv_a_3_0=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleColorIntDef1441); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:930:1: entryRuleColorHexaDef returns [EObject current=null] : iv_ruleColorHexaDef= ruleColorHexaDef EOF ;
    public final EObject entryRuleColorHexaDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorHexaDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:931:2: (iv_ruleColorHexaDef= ruleColorHexaDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:932:2: iv_ruleColorHexaDef= ruleColorHexaDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getColorHexaDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleColorHexaDef_in_entryRuleColorHexaDef1485);
            iv_ruleColorHexaDef=ruleColorHexaDef();
            _fsp--;

             current =iv_ruleColorHexaDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorHexaDef1495); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:939:1: ruleColorHexaDef returns [EObject current=null] : ( '#' ( (lv_s_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleColorHexaDef() throws RecognitionException {
        EObject current = null;

        Token lv_s_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:944:6: ( ( '#' ( (lv_s_1_0= RULE_STRING ) ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:945:1: ( '#' ( (lv_s_1_0= RULE_STRING ) ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:945:1: ( '#' ( (lv_s_1_0= RULE_STRING ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:945:3: '#' ( (lv_s_1_0= RULE_STRING ) )
            {
            match(input,23,FOLLOW_23_in_ruleColorHexaDef1530); 

                    createLeafNode(grammarAccess.getColorHexaDefAccess().getNumberSignKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:949:1: ( (lv_s_1_0= RULE_STRING ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:950:1: (lv_s_1_0= RULE_STRING )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:950:1: (lv_s_1_0= RULE_STRING )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:951:3: lv_s_1_0= RULE_STRING
            {
            lv_s_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleColorHexaDef1547); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:981:1: entryRuleOperationDef returns [EObject current=null] : iv_ruleOperationDef= ruleOperationDef EOF ;
    public final EObject entryRuleOperationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:982:2: (iv_ruleOperationDef= ruleOperationDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:983:2: iv_ruleOperationDef= ruleOperationDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOperationDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleOperationDef_in_entryRuleOperationDef1588);
            iv_ruleOperationDef=ruleOperationDef();
            _fsp--;

             current =iv_ruleOperationDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDef1598); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:990:1: ruleOperationDef returns [EObject current=null] : ( 'Operation' ( (lv_name_1_0= RULE_ID ) ) '{' 'output' ( (lv_output_4_0= ruleExpression ) ) '}' ) ;
    public final EObject ruleOperationDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_output_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:995:6: ( ( 'Operation' ( (lv_name_1_0= RULE_ID ) ) '{' 'output' ( (lv_output_4_0= ruleExpression ) ) '}' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:996:1: ( 'Operation' ( (lv_name_1_0= RULE_ID ) ) '{' 'output' ( (lv_output_4_0= ruleExpression ) ) '}' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:996:1: ( 'Operation' ( (lv_name_1_0= RULE_ID ) ) '{' 'output' ( (lv_output_4_0= ruleExpression ) ) '}' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:996:3: 'Operation' ( (lv_name_1_0= RULE_ID ) ) '{' 'output' ( (lv_output_4_0= ruleExpression ) ) '}'
            {
            match(input,24,FOLLOW_24_in_ruleOperationDef1633); 

                    createLeafNode(grammarAccess.getOperationDefAccess().getOperationKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1000:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1001:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1001:1: (lv_name_1_0= RULE_ID )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1002:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationDef1650); 

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

            match(input,14,FOLLOW_14_in_ruleOperationDef1665); 

                    createLeafNode(grammarAccess.getOperationDefAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,20,FOLLOW_20_in_ruleOperationDef1675); 

                    createLeafNode(grammarAccess.getOperationDefAccess().getOutputKeyword_3(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1032:1: ( (lv_output_4_0= ruleExpression ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1033:1: (lv_output_4_0= ruleExpression )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1033:1: (lv_output_4_0= ruleExpression )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1034:3: lv_output_4_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOperationDefAccess().getOutputExpressionParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleOperationDef1696);
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

            match(input,21,FOLLOW_21_in_ruleOperationDef1706); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1068:1: entryRuleNoiseDef returns [EObject current=null] : iv_ruleNoiseDef= ruleNoiseDef EOF ;
    public final EObject entryRuleNoiseDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoiseDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1069:2: (iv_ruleNoiseDef= ruleNoiseDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1070:2: iv_ruleNoiseDef= ruleNoiseDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNoiseDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleNoiseDef_in_entryRuleNoiseDef1742);
            iv_ruleNoiseDef=ruleNoiseDef();
            _fsp--;

             current =iv_ruleNoiseDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoiseDef1752); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1077:1: ruleNoiseDef returns [EObject current=null] : ( 'Noise' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'frequency' ( (lv_frequency_6_0= RULE_INT ) ) '}' ) ;
    public final EObject ruleNoiseDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_seed_4_0=null;
        Token lv_frequency_6_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1082:6: ( ( 'Noise' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'frequency' ( (lv_frequency_6_0= RULE_INT ) ) '}' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1083:1: ( 'Noise' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'frequency' ( (lv_frequency_6_0= RULE_INT ) ) '}' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1083:1: ( 'Noise' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'frequency' ( (lv_frequency_6_0= RULE_INT ) ) '}' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1083:3: 'Noise' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'frequency' ( (lv_frequency_6_0= RULE_INT ) ) '}'
            {
            match(input,25,FOLLOW_25_in_ruleNoiseDef1787); 

                    createLeafNode(grammarAccess.getNoiseDefAccess().getNoiseKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1087:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1088:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1088:1: (lv_name_1_0= RULE_ID )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1089:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNoiseDef1804); 

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

            match(input,14,FOLLOW_14_in_ruleNoiseDef1819); 

                    createLeafNode(grammarAccess.getNoiseDefAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,26,FOLLOW_26_in_ruleNoiseDef1829); 

                    createLeafNode(grammarAccess.getNoiseDefAccess().getSeedKeyword_3(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1119:1: ( (lv_seed_4_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1120:1: (lv_seed_4_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1120:1: (lv_seed_4_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1121:3: lv_seed_4_0= RULE_INT
            {
            lv_seed_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNoiseDef1846); 

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

            match(input,27,FOLLOW_27_in_ruleNoiseDef1861); 

                    createLeafNode(grammarAccess.getNoiseDefAccess().getFrequencyKeyword_5(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1147:1: ( (lv_frequency_6_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1148:1: (lv_frequency_6_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1148:1: (lv_frequency_6_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1149:3: lv_frequency_6_0= RULE_INT
            {
            lv_frequency_6_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNoiseDef1878); 

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

            match(input,21,FOLLOW_21_in_ruleNoiseDef1893); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1183:1: entryRulePerlinDef returns [EObject current=null] : iv_rulePerlinDef= rulePerlinDef EOF ;
    public final EObject entryRulePerlinDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerlinDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1184:2: (iv_rulePerlinDef= rulePerlinDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1185:2: iv_rulePerlinDef= rulePerlinDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPerlinDefRule(), currentNode); 
            pushFollow(FOLLOW_rulePerlinDef_in_entryRulePerlinDef1929);
            iv_rulePerlinDef=rulePerlinDef();
            _fsp--;

             current =iv_rulePerlinDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerlinDef1939); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1192:1: rulePerlinDef returns [EObject current=null] : ( 'Perlin' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'iterations' ( (lv_iterations_6_0= RULE_INT ) ) 'turbulence' ( (lv_turbulence_8_0= RULE_DECIMAL ) ) '}' ) ;
    public final EObject rulePerlinDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_seed_4_0=null;
        Token lv_iterations_6_0=null;
        Token lv_turbulence_8_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1197:6: ( ( 'Perlin' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'iterations' ( (lv_iterations_6_0= RULE_INT ) ) 'turbulence' ( (lv_turbulence_8_0= RULE_DECIMAL ) ) '}' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1198:1: ( 'Perlin' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'iterations' ( (lv_iterations_6_0= RULE_INT ) ) 'turbulence' ( (lv_turbulence_8_0= RULE_DECIMAL ) ) '}' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1198:1: ( 'Perlin' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'iterations' ( (lv_iterations_6_0= RULE_INT ) ) 'turbulence' ( (lv_turbulence_8_0= RULE_DECIMAL ) ) '}' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1198:3: 'Perlin' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) 'iterations' ( (lv_iterations_6_0= RULE_INT ) ) 'turbulence' ( (lv_turbulence_8_0= RULE_DECIMAL ) ) '}'
            {
            match(input,28,FOLLOW_28_in_rulePerlinDef1974); 

                    createLeafNode(grammarAccess.getPerlinDefAccess().getPerlinKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1202:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1203:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1203:1: (lv_name_1_0= RULE_ID )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1204:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePerlinDef1991); 

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

            match(input,14,FOLLOW_14_in_rulePerlinDef2006); 

                    createLeafNode(grammarAccess.getPerlinDefAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,26,FOLLOW_26_in_rulePerlinDef2016); 

                    createLeafNode(grammarAccess.getPerlinDefAccess().getSeedKeyword_3(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1234:1: ( (lv_seed_4_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1235:1: (lv_seed_4_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1235:1: (lv_seed_4_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1236:3: lv_seed_4_0= RULE_INT
            {
            lv_seed_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePerlinDef2033); 

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

            match(input,29,FOLLOW_29_in_rulePerlinDef2048); 

                    createLeafNode(grammarAccess.getPerlinDefAccess().getIterationsKeyword_5(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1262:1: ( (lv_iterations_6_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1263:1: (lv_iterations_6_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1263:1: (lv_iterations_6_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1264:3: lv_iterations_6_0= RULE_INT
            {
            lv_iterations_6_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePerlinDef2065); 

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

            match(input,30,FOLLOW_30_in_rulePerlinDef2080); 

                    createLeafNode(grammarAccess.getPerlinDefAccess().getTurbulenceKeyword_7(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1290:1: ( (lv_turbulence_8_0= RULE_DECIMAL ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1291:1: (lv_turbulence_8_0= RULE_DECIMAL )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1291:1: (lv_turbulence_8_0= RULE_DECIMAL )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1292:3: lv_turbulence_8_0= RULE_DECIMAL
            {
            lv_turbulence_8_0=(Token)input.LT(1);
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rulePerlinDef2097); 

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

            match(input,21,FOLLOW_21_in_rulePerlinDef2112); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1326:1: entryRuleMarbleDef returns [EObject current=null] : iv_ruleMarbleDef= ruleMarbleDef EOF ;
    public final EObject entryRuleMarbleDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarbleDef = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1327:2: (iv_ruleMarbleDef= ruleMarbleDef EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1328:2: iv_ruleMarbleDef= ruleMarbleDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMarbleDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleMarbleDef_in_entryRuleMarbleDef2148);
            iv_ruleMarbleDef=ruleMarbleDef();
            _fsp--;

             current =iv_ruleMarbleDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarbleDef2158); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1335:1: ruleMarbleDef returns [EObject current=null] : ( 'Marble' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) '}' ) ;
    public final EObject ruleMarbleDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_seed_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1340:6: ( ( 'Marble' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) '}' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1341:1: ( 'Marble' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) '}' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1341:1: ( 'Marble' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) '}' )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1341:3: 'Marble' ( (lv_name_1_0= RULE_ID ) ) '{' 'seed' ( (lv_seed_4_0= RULE_INT ) ) '}'
            {
            match(input,31,FOLLOW_31_in_ruleMarbleDef2193); 

                    createLeafNode(grammarAccess.getMarbleDefAccess().getMarbleKeyword_0(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1345:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1346:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1346:1: (lv_name_1_0= RULE_ID )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1347:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMarbleDef2210); 

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

            match(input,14,FOLLOW_14_in_ruleMarbleDef2225); 

                    createLeafNode(grammarAccess.getMarbleDefAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,26,FOLLOW_26_in_ruleMarbleDef2235); 

                    createLeafNode(grammarAccess.getMarbleDefAccess().getSeedKeyword_3(), null); 
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1377:1: ( (lv_seed_4_0= RULE_INT ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1378:1: (lv_seed_4_0= RULE_INT )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1378:1: (lv_seed_4_0= RULE_INT )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1379:3: lv_seed_4_0= RULE_INT
            {
            lv_seed_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMarbleDef2252); 

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

            match(input,21,FOLLOW_21_in_ruleMarbleDef2267); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1413:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1414:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1415:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2303);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2313); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1422:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1427:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) ) )? ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1428:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1428:1: (this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) ) )? )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1429:5: this_TerminalExpression_0= ruleTerminalExpression ( () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression2360);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;

             
                    current = this_TerminalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1437:1: ( () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=41 && LA13_0<=43)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1437:2: () ( (lv_op_2_0= ruleBOP ) ) ( (lv_right_3_0= ruleExpression ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1437:2: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1438:5: 
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

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1453:2: ( (lv_op_2_0= ruleBOP ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1454:1: (lv_op_2_0= ruleBOP )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1454:1: (lv_op_2_0= ruleBOP )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1455:3: lv_op_2_0= ruleBOP
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getOpBOPParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBOP_in_ruleExpression2390);
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

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1477:2: ( (lv_right_3_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1478:1: (lv_right_3_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1478:1: (lv_right_3_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1479:3: lv_right_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2411);
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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1509:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1510:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1511:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression2449);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression2459); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1518:1: ruleTerminalExpression returns [EObject current=null] : ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( ( RULE_ID ) ) ) | this_BuiltInCall_5= ruleBuiltInCall | ( () ( (lv_variant_7_0= ruleVariant ) ) ) | ( () ( (lv_value_9_0= RULE_DECIMAL ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_9_0=null;
        EObject this_Expression_1 = null;

        EObject this_BuiltInCall_5 = null;

        Enumerator lv_variant_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1523:6: ( ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( ( RULE_ID ) ) ) | this_BuiltInCall_5= ruleBuiltInCall | ( () ( (lv_variant_7_0= ruleVariant ) ) ) | ( () ( (lv_value_9_0= RULE_DECIMAL ) ) ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1524:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( ( RULE_ID ) ) ) | this_BuiltInCall_5= ruleBuiltInCall | ( () ( (lv_variant_7_0= ruleVariant ) ) ) | ( () ( (lv_value_9_0= RULE_DECIMAL ) ) ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1524:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( ( RULE_ID ) ) ) | this_BuiltInCall_5= ruleBuiltInCall | ( () ( (lv_variant_7_0= ruleVariant ) ) ) | ( () ( (lv_value_9_0= RULE_DECIMAL ) ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case 34:
            case 35:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt14=3;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt14=4;
                }
                break;
            case RULE_DECIMAL:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1524:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( ( RULE_ID ) ) ) | this_BuiltInCall_5= ruleBuiltInCall | ( () ( (lv_variant_7_0= ruleVariant ) ) ) | ( () ( (lv_value_9_0= RULE_DECIMAL ) ) ) )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1524:2: ( '(' this_Expression_1= ruleExpression ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1524:2: ( '(' this_Expression_1= ruleExpression ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1524:4: '(' this_Expression_1= ruleExpression ')'
                    {
                    match(input,32,FOLLOW_32_in_ruleTerminalExpression2495); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression2517);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,33,FOLLOW_33_in_ruleTerminalExpression2526); 

                            createLeafNode(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1542:6: ( () ( ( RULE_ID ) ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1542:6: ( () ( ( RULE_ID ) ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1542:7: () ( ( RULE_ID ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1542:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1543:5: 
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

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1553:2: ( ( RULE_ID ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1554:1: ( RULE_ID )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1554:1: ( RULE_ID )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1555:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression2561); 

                    		createLeafNode(grammarAccess.getTerminalExpressionAccess().getRefModuleDefCrossReference_1_1_0(), "ref"); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1569:5: this_BuiltInCall_5= ruleBuiltInCall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBuiltInCallParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBuiltInCall_in_ruleTerminalExpression2590);
                    this_BuiltInCall_5=ruleBuiltInCall();
                    _fsp--;

                     
                            current = this_BuiltInCall_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1578:6: ( () ( (lv_variant_7_0= ruleVariant ) ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1578:6: ( () ( (lv_variant_7_0= ruleVariant ) ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1578:7: () ( (lv_variant_7_0= ruleVariant ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1578:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1579:5: 
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

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1589:2: ( (lv_variant_7_0= ruleVariant ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1590:1: (lv_variant_7_0= ruleVariant )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1590:1: (lv_variant_7_0= ruleVariant )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1591:3: lv_variant_7_0= ruleVariant
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getVariantVariantEnumRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariant_in_ruleTerminalExpression2626);
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
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1614:6: ( () ( (lv_value_9_0= RULE_DECIMAL ) ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1614:6: ( () ( (lv_value_9_0= RULE_DECIMAL ) ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1614:7: () ( (lv_value_9_0= RULE_DECIMAL ) )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1614:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1615:5: 
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

                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1625:2: ( (lv_value_9_0= RULE_DECIMAL ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1626:1: (lv_value_9_0= RULE_DECIMAL )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1626:1: (lv_value_9_0= RULE_DECIMAL )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1627:3: lv_value_9_0= RULE_DECIMAL
                    {
                    lv_value_9_0=(Token)input.LT(1);
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleTerminalExpression2660); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1657:1: entryRuleBuiltInCall returns [EObject current=null] : iv_ruleBuiltInCall= ruleBuiltInCall EOF ;
    public final EObject entryRuleBuiltInCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInCall = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1658:2: (iv_ruleBuiltInCall= ruleBuiltInCall EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1659:2: iv_ruleBuiltInCall= ruleBuiltInCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBuiltInCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleBuiltInCall_in_entryRuleBuiltInCall2702);
            iv_ruleBuiltInCall=ruleBuiltInCall();
            _fsp--;

             current =iv_ruleBuiltInCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInCall2712); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1666:1: ruleBuiltInCall returns [EObject current=null] : ( ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' ) | ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' ) | ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' ) | ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' ) | ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' ) | ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' ) ) ;
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
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1671:6: ( ( ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' ) | ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' ) | ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' ) | ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' ) | ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' ) | ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1672:1: ( ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' ) | ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' ) | ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' ) | ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' ) | ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' ) | ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1672:1: ( ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' ) | ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' ) | ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' ) | ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' ) | ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' ) | ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt15=1;
                }
                break;
            case 35:
                {
                alt15=2;
                }
                break;
            case 37:
                {
                alt15=3;
                }
                break;
            case 38:
                {
                alt15=4;
                }
                break;
            case 39:
                {
                alt15=5;
                }
                break;
            case 40:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1672:1: ( ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' ) | ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' ) | ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' ) | ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' ) | ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' ) | ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' ) )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1672:2: ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1672:2: ( () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1672:3: () 'INV' '(' ( (lv_a_3_0= ruleExpression ) ) ')'
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1672:3: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1673:5: 
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

                    match(input,34,FOLLOW_34_in_ruleBuiltInCall2757); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getINVKeyword_0_1(), null); 
                        
                    match(input,32,FOLLOW_32_in_ruleBuiltInCall2767); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_0_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1691:1: ( (lv_a_3_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1692:1: (lv_a_3_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1692:1: (lv_a_3_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1693:3: lv_a_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getAExpressionParserRuleCall_0_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall2788);
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

                    match(input,33,FOLLOW_33_in_ruleBuiltInCall2798); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_0_4(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1720:6: ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1720:6: ( () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1720:7: () 'MIX' '(' ( (lv_a_8_0= ruleExpression ) ) ',' ( (lv_b_10_0= ruleExpression ) ) ',' ( (lv_t_12_0= ruleExpression ) ) ')'
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1720:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1721:5: 
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

                    match(input,35,FOLLOW_35_in_ruleBuiltInCall2825); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getMIXKeyword_1_1(), null); 
                        
                    match(input,32,FOLLOW_32_in_ruleBuiltInCall2835); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_1_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1739:1: ( (lv_a_8_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1740:1: (lv_a_8_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1740:1: (lv_a_8_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1741:3: lv_a_8_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getAExpressionParserRuleCall_1_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall2856);
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

                    match(input,36,FOLLOW_36_in_ruleBuiltInCall2866); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_1_4(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1767:1: ( (lv_b_10_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1768:1: (lv_b_10_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1768:1: (lv_b_10_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1769:3: lv_b_10_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getBExpressionParserRuleCall_1_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall2887);
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

                    match(input,36,FOLLOW_36_in_ruleBuiltInCall2897); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_1_6(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1795:1: ( (lv_t_12_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1796:1: (lv_t_12_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1796:1: (lv_t_12_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1797:3: lv_t_12_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getTExpressionParserRuleCall_1_7_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall2918);
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

                    match(input,33,FOLLOW_33_in_ruleBuiltInCall2928); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_1_8(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1824:6: ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1824:6: ( () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1824:7: () 'SIN' '(' ( (lv_a_17_0= ruleExpression ) ) ')'
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1824:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1825:5: 
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

                    match(input,37,FOLLOW_37_in_ruleBuiltInCall2955); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getSINKeyword_2_1(), null); 
                        
                    match(input,32,FOLLOW_32_in_ruleBuiltInCall2965); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_2_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1843:1: ( (lv_a_17_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1844:1: (lv_a_17_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1844:1: (lv_a_17_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1845:3: lv_a_17_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getAExpressionParserRuleCall_2_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall2986);
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

                    match(input,33,FOLLOW_33_in_ruleBuiltInCall2996); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_2_4(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1872:6: ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1872:6: ( () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1872:7: () 'BOOL' '(' ( (lv_a_22_0= ruleExpression ) ) ')'
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1872:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1873:5: 
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

                    match(input,38,FOLLOW_38_in_ruleBuiltInCall3023); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getBOOLKeyword_3_1(), null); 
                        
                    match(input,32,FOLLOW_32_in_ruleBuiltInCall3033); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_3_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1891:1: ( (lv_a_22_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1892:1: (lv_a_22_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1892:1: (lv_a_22_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1893:3: lv_a_22_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getAExpressionParserRuleCall_3_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall3054);
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

                    match(input,33,FOLLOW_33_in_ruleBuiltInCall3064); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_3_4(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1920:6: ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1920:6: ( () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1920:7: () 'SCALE' '(' ( (lv_rate_27_0= ruleExpression ) ) ',' ( (lv_expression_29_0= ruleExpression ) ) ')'
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1920:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1921:5: 
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

                    match(input,39,FOLLOW_39_in_ruleBuiltInCall3091); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getSCALEKeyword_4_1(), null); 
                        
                    match(input,32,FOLLOW_32_in_ruleBuiltInCall3101); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_4_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1939:1: ( (lv_rate_27_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1940:1: (lv_rate_27_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1940:1: (lv_rate_27_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1941:3: lv_rate_27_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getRateExpressionParserRuleCall_4_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall3122);
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

                    match(input,36,FOLLOW_36_in_ruleBuiltInCall3132); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getCommaKeyword_4_4(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1967:1: ( (lv_expression_29_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1968:1: (lv_expression_29_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1968:1: (lv_expression_29_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1969:3: lv_expression_29_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExpressionExpressionParserRuleCall_4_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall3153);
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

                    match(input,33,FOLLOW_33_in_ruleBuiltInCall3163); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getRightParenthesisKeyword_4_6(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1996:6: ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1996:6: ( () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1996:7: () 'RADIAL' '(' ( (lv_expression_34_0= ruleExpression ) ) ')'
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1996:7: ()
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:1997:5: 
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

                    match(input,40,FOLLOW_40_in_ruleBuiltInCall3190); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getRADIALKeyword_5_1(), null); 
                        
                    match(input,32,FOLLOW_32_in_ruleBuiltInCall3200); 

                            createLeafNode(grammarAccess.getBuiltInCallAccess().getLeftParenthesisKeyword_5_2(), null); 
                        
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2015:1: ( (lv_expression_34_0= ruleExpression ) )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2016:1: (lv_expression_34_0= ruleExpression )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2016:1: (lv_expression_34_0= ruleExpression )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2017:3: lv_expression_34_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBuiltInCallAccess().getExpressionExpressionParserRuleCall_5_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBuiltInCall3221);
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

                    match(input,33,FOLLOW_33_in_ruleBuiltInCall3231); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2051:1: entryRuleBOP returns [String current=null] : iv_ruleBOP= ruleBOP EOF ;
    public final String entryRuleBOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOP = null;


        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2052:2: (iv_ruleBOP= ruleBOP EOF )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2053:2: iv_ruleBOP= ruleBOP EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBOPRule(), currentNode); 
            pushFollow(FOLLOW_ruleBOP_in_entryRuleBOP3269);
            iv_ruleBOP=ruleBOP();
            _fsp--;

             current =iv_ruleBOP.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOP3280); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2060:1: ruleBOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleBOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2065:6: ( (kw= '+' | kw= '-' | kw= '*' ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2066:1: (kw= '+' | kw= '-' | kw= '*' )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2066:1: (kw= '+' | kw= '-' | kw= '*' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt16=1;
                }
                break;
            case 42:
                {
                alt16=2;
                }
                break;
            case 43:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2066:1: (kw= '+' | kw= '-' | kw= '*' )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2067:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleBOP3318); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBOPAccess().getPlusSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2074:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_ruleBOP3337); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBOPAccess().getHyphenMinusKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2081:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_ruleBOP3356); 

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
    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2094:1: ruleVariant returns [Enumerator current=null] : ( ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'T' ) ) ;
    public final Enumerator ruleVariant() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2098:6: ( ( ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'T' ) ) )
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2099:1: ( ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'T' ) )
            {
            // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2099:1: ( ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'T' ) )
            int alt17=7;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt17=1;
                }
                break;
            case 45:
                {
                alt17=2;
                }
                break;
            case 46:
                {
                alt17=3;
                }
                break;
            case 47:
                {
                alt17=4;
                }
                break;
            case 48:
                {
                alt17=5;
                }
                break;
            case 49:
                {
                alt17=6;
                }
                break;
            case 50:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2099:1: ( ( 'X' ) | ( 'Y' ) | ( 'Z' ) | ( 'U' ) | ( 'V' ) | ( 'W' ) | ( 'T' ) )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2099:2: ( 'X' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2099:2: ( 'X' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2099:4: 'X'
                    {
                    match(input,44,FOLLOW_44_in_ruleVariant3408); 

                            current = grammarAccess.getVariantAccess().getXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVariantAccess().getXEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2105:6: ( 'Y' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2105:6: ( 'Y' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2105:8: 'Y'
                    {
                    match(input,45,FOLLOW_45_in_ruleVariant3423); 

                            current = grammarAccess.getVariantAccess().getYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVariantAccess().getYEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2111:6: ( 'Z' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2111:6: ( 'Z' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2111:8: 'Z'
                    {
                    match(input,46,FOLLOW_46_in_ruleVariant3438); 

                            current = grammarAccess.getVariantAccess().getZEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVariantAccess().getZEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2117:6: ( 'U' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2117:6: ( 'U' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2117:8: 'U'
                    {
                    match(input,47,FOLLOW_47_in_ruleVariant3453); 

                            current = grammarAccess.getVariantAccess().getUEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVariantAccess().getUEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2123:6: ( 'V' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2123:6: ( 'V' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2123:8: 'V'
                    {
                    match(input,48,FOLLOW_48_in_ruleVariant3468); 

                            current = grammarAccess.getVariantAccess().getVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVariantAccess().getVEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2129:6: ( 'W' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2129:6: ( 'W' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2129:8: 'W'
                    {
                    match(input,49,FOLLOW_49_in_ruleVariant3483); 

                            current = grammarAccess.getVariantAccess().getWEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVariantAccess().getWEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2135:6: ( 'T' )
                    {
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2135:6: ( 'T' )
                    // ../org.mgs.graphics.pm/src-gen/org/mgs/graphics/pm/parser/antlr/internal/InternalPmDsl.g:2135:8: 'T'
                    {
                    match(input,50,FOLLOW_50_in_ruleVariant3498); 

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
    public static final BitSet FOLLOW_ruleImport_in_ruleModel173 = new BitSet(new long[]{0x0000000093403002L});
    public static final BitSet FOLLOW_ruleStage_in_ruleModel195 = new BitSet(new long[]{0x0000000093403002L});
    public static final BitSet FOLLOW_ruleModuleDef_in_ruleModel268 = new BitSet(new long[]{0x0000000093403002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStage_in_entryRuleStage452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStage462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleStage497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStage514 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStage529 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStage539 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStage556 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStage571 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStage588 = new BitSet(new long[]{0x0000000000160000L});
    public static final BitSet FOLLOW_17_in_ruleStage604 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStage621 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18_in_ruleStage639 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStage656 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStage671 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStage688 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStage705 = new BitSet(new long[]{0x0007F1ED000000A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStage726 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStage736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleDef_in_entryRuleModuleDef772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleDef782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorDef_in_ruleModuleDef829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDef_in_ruleModuleDef856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoiseDef_in_ruleModuleDef883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerlinDef_in_ruleModuleDef910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarbleDef_in_ruleModuleDef937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorDef_in_entryRuleColorDef972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorDef982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleColorDef1017 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorDef1034 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleColorDef1049 = new BitSet(new long[]{0x00000000008000C0L});
    public static final BitSet FOLLOW_ruleColorFloatDef_in_ruleColorDef1072 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleColorIntDef_in_ruleColorDef1091 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleColorHexaDef_in_ruleColorDef1110 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleColorDef1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFloatDef_in_entryRuleColorFloatDef1159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFloatDef1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1211 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1234 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1256 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleColorFloatDef1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorIntDef_in_entryRuleColorIntDef1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorIntDef1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColorIntDef1374 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColorIntDef1397 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColorIntDef1419 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleColorIntDef1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorHexaDef_in_entryRuleColorHexaDef1485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorHexaDef1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleColorHexaDef1530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleColorHexaDef1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDef_in_entryRuleOperationDef1588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDef1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOperationDef1633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationDef1650 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOperationDef1665 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperationDef1675 = new BitSet(new long[]{0x0007F1ED000000A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleOperationDef1696 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOperationDef1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoiseDef_in_entryRuleNoiseDef1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoiseDef1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleNoiseDef1787 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNoiseDef1804 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNoiseDef1819 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNoiseDef1829 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNoiseDef1846 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNoiseDef1861 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNoiseDef1878 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNoiseDef1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerlinDef_in_entryRulePerlinDef1929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerlinDef1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePerlinDef1974 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePerlinDef1991 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePerlinDef2006 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePerlinDef2016 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePerlinDef2033 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePerlinDef2048 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePerlinDef2065 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePerlinDef2080 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rulePerlinDef2097 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePerlinDef2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarbleDef_in_entryRuleMarbleDef2148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarbleDef2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMarbleDef2193 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMarbleDef2210 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMarbleDef2225 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMarbleDef2235 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMarbleDef2252 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMarbleDef2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression2360 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_ruleBOP_in_ruleExpression2390 = new BitSet(new long[]{0x0007F1ED000000A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression2449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTerminalExpression2495 = new BitSet(new long[]{0x0007F1ED000000A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression2517 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTerminalExpression2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInCall_in_ruleTerminalExpression2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariant_in_ruleTerminalExpression2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleTerminalExpression2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInCall_in_entryRuleBuiltInCall2702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInCall2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBuiltInCall2757 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBuiltInCall2767 = new BitSet(new long[]{0x0007F1ED000000A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall2788 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBuiltInCall2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBuiltInCall2825 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBuiltInCall2835 = new BitSet(new long[]{0x0007F1ED000000A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall2856 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBuiltInCall2866 = new BitSet(new long[]{0x0007F1ED000000A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall2887 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBuiltInCall2897 = new BitSet(new long[]{0x0007F1ED000000A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall2918 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBuiltInCall2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBuiltInCall2955 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBuiltInCall2965 = new BitSet(new long[]{0x0007F1ED000000A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall2986 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBuiltInCall2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBuiltInCall3023 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBuiltInCall3033 = new BitSet(new long[]{0x0007F1ED000000A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall3054 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBuiltInCall3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBuiltInCall3091 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBuiltInCall3101 = new BitSet(new long[]{0x0007F1ED000000A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall3122 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBuiltInCall3132 = new BitSet(new long[]{0x0007F1ED000000A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall3153 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBuiltInCall3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBuiltInCall3190 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBuiltInCall3200 = new BitSet(new long[]{0x0007F1ED000000A0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBuiltInCall3221 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBuiltInCall3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOP_in_entryRuleBOP3269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOP3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBOP3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBOP3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBOP3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleVariant3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVariant3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVariant3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVariant3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVariant3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVariant3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVariant3498 = new BitSet(new long[]{0x0000000000000002L});

}
