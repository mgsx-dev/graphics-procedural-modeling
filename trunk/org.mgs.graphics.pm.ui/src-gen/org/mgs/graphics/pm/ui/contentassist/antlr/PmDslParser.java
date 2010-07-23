/*
* generated by Xtext
*/
package org.mgs.graphics.pm.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.mgs.graphics.pm.services.PmDslGrammarAccess;

public class PmDslParser extends AbstractContentAssistParser {
	
	@Inject
	private PmDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.mgs.graphics.pm.ui.contentassist.antlr.internal.InternalPmDslParser createParser() {
		org.mgs.graphics.pm.ui.contentassist.antlr.internal.InternalPmDslParser result = new org.mgs.graphics.pm.ui.contentassist.antlr.internal.InternalPmDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModuleDefAccess().getAlternatives(), "rule__ModuleDef__Alternatives");
					put(grammarAccess.getColorDefAccess().getDefAlternatives_3_0(), "rule__ColorDef__DefAlternatives_3_0");
					put(grammarAccess.getTerminalExpressionAccess().getAlternatives(), "rule__TerminalExpression__Alternatives");
					put(grammarAccess.getBuiltInCallAccess().getAlternatives(), "rule__BuiltInCall__Alternatives");
					put(grammarAccess.getBOPAccess().getAlternatives(), "rule__BOP__Alternatives");
					put(grammarAccess.getVariantAccess().getAlternatives(), "rule__Variant__Alternatives");
					put(grammarAccess.getStageAccess().getGroup(), "rule__Stage__Group__0");
					put(grammarAccess.getStageAccess().getGroup_7(), "rule__Stage__Group_7__0");
					put(grammarAccess.getStageAccess().getGroup_8(), "rule__Stage__Group_8__0");
					put(grammarAccess.getColorDefAccess().getGroup(), "rule__ColorDef__Group__0");
					put(grammarAccess.getColorFloatDefAccess().getGroup(), "rule__ColorFloatDef__Group__0");
					put(grammarAccess.getColorFloatDefAccess().getGroup_1(), "rule__ColorFloatDef__Group_1__0");
					put(grammarAccess.getColorIntDefAccess().getGroup(), "rule__ColorIntDef__Group__0");
					put(grammarAccess.getColorIntDefAccess().getGroup_1(), "rule__ColorIntDef__Group_1__0");
					put(grammarAccess.getColorHexaDefAccess().getGroup(), "rule__ColorHexaDef__Group__0");
					put(grammarAccess.getOperationDefAccess().getGroup(), "rule__OperationDef__Group__0");
					put(grammarAccess.getNoiseDefAccess().getGroup(), "rule__NoiseDef__Group__0");
					put(grammarAccess.getPerlinDefAccess().getGroup(), "rule__PerlinDef__Group__0");
					put(grammarAccess.getMarbleDefAccess().getGroup(), "rule__MarbleDef__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_0(), "rule__TerminalExpression__Group_0__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_1(), "rule__TerminalExpression__Group_1__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_3(), "rule__TerminalExpression__Group_3__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_4(), "rule__TerminalExpression__Group_4__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_0(), "rule__BuiltInCall__Group_0__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_1(), "rule__BuiltInCall__Group_1__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_2(), "rule__BuiltInCall__Group_2__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_3(), "rule__BuiltInCall__Group_3__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_4(), "rule__BuiltInCall__Group_4__0");
					put(grammarAccess.getBuiltInCallAccess().getGroup_5(), "rule__BuiltInCall__Group_5__0");
					put(grammarAccess.getModelAccess().getStageAssignment_0(), "rule__Model__StageAssignment_0");
					put(grammarAccess.getModelAccess().getDefsAssignment_1(), "rule__Model__DefsAssignment_1");
					put(grammarAccess.getStageAccess().getNameAssignment_1(), "rule__Stage__NameAssignment_1");
					put(grammarAccess.getStageAccess().getWidthAssignment_4(), "rule__Stage__WidthAssignment_4");
					put(grammarAccess.getStageAccess().getHeightAssignment_6(), "rule__Stage__HeightAssignment_6");
					put(grammarAccess.getStageAccess().getDepthAssignment_7_1(), "rule__Stage__DepthAssignment_7_1");
					put(grammarAccess.getStageAccess().getDurationAssignment_8_1(), "rule__Stage__DurationAssignment_8_1");
					put(grammarAccess.getStageAccess().getFpsAssignment_8_3(), "rule__Stage__FpsAssignment_8_3");
					put(grammarAccess.getStageAccess().getOutputAssignment_10(), "rule__Stage__OutputAssignment_10");
					put(grammarAccess.getColorDefAccess().getNameAssignment_1(), "rule__ColorDef__NameAssignment_1");
					put(grammarAccess.getColorDefAccess().getDefAssignment_3(), "rule__ColorDef__DefAssignment_3");
					put(grammarAccess.getColorFloatDefAccess().getRAssignment_0(), "rule__ColorFloatDef__RAssignment_0");
					put(grammarAccess.getColorFloatDefAccess().getGAssignment_1_0(), "rule__ColorFloatDef__GAssignment_1_0");
					put(grammarAccess.getColorFloatDefAccess().getBAssignment_1_1(), "rule__ColorFloatDef__BAssignment_1_1");
					put(grammarAccess.getColorFloatDefAccess().getAAssignment_1_2(), "rule__ColorFloatDef__AAssignment_1_2");
					put(grammarAccess.getColorIntDefAccess().getRAssignment_0(), "rule__ColorIntDef__RAssignment_0");
					put(grammarAccess.getColorIntDefAccess().getGAssignment_1_0(), "rule__ColorIntDef__GAssignment_1_0");
					put(grammarAccess.getColorIntDefAccess().getBAssignment_1_1(), "rule__ColorIntDef__BAssignment_1_1");
					put(grammarAccess.getColorIntDefAccess().getAAssignment_1_2(), "rule__ColorIntDef__AAssignment_1_2");
					put(grammarAccess.getColorHexaDefAccess().getSAssignment_1(), "rule__ColorHexaDef__SAssignment_1");
					put(grammarAccess.getOperationDefAccess().getNameAssignment_1(), "rule__OperationDef__NameAssignment_1");
					put(grammarAccess.getOperationDefAccess().getOutputAssignment_4(), "rule__OperationDef__OutputAssignment_4");
					put(grammarAccess.getNoiseDefAccess().getNameAssignment_1(), "rule__NoiseDef__NameAssignment_1");
					put(grammarAccess.getNoiseDefAccess().getSeedAssignment_4(), "rule__NoiseDef__SeedAssignment_4");
					put(grammarAccess.getNoiseDefAccess().getFrequencyAssignment_6(), "rule__NoiseDef__FrequencyAssignment_6");
					put(grammarAccess.getPerlinDefAccess().getNameAssignment_1(), "rule__PerlinDef__NameAssignment_1");
					put(grammarAccess.getPerlinDefAccess().getSeedAssignment_4(), "rule__PerlinDef__SeedAssignment_4");
					put(grammarAccess.getPerlinDefAccess().getIterationsAssignment_6(), "rule__PerlinDef__IterationsAssignment_6");
					put(grammarAccess.getPerlinDefAccess().getTurbulenceAssignment_8(), "rule__PerlinDef__TurbulenceAssignment_8");
					put(grammarAccess.getMarbleDefAccess().getNameAssignment_1(), "rule__MarbleDef__NameAssignment_1");
					put(grammarAccess.getMarbleDefAccess().getSeedAssignment_4(), "rule__MarbleDef__SeedAssignment_4");
					put(grammarAccess.getExpressionAccess().getOpAssignment_1_1(), "rule__Expression__OpAssignment_1_1");
					put(grammarAccess.getExpressionAccess().getRightAssignment_1_2(), "rule__Expression__RightAssignment_1_2");
					put(grammarAccess.getTerminalExpressionAccess().getRefAssignment_1_1(), "rule__TerminalExpression__RefAssignment_1_1");
					put(grammarAccess.getTerminalExpressionAccess().getVariantAssignment_3_1(), "rule__TerminalExpression__VariantAssignment_3_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4_1(), "rule__TerminalExpression__ValueAssignment_4_1");
					put(grammarAccess.getBuiltInCallAccess().getAAssignment_0_3(), "rule__BuiltInCall__AAssignment_0_3");
					put(grammarAccess.getBuiltInCallAccess().getAAssignment_1_3(), "rule__BuiltInCall__AAssignment_1_3");
					put(grammarAccess.getBuiltInCallAccess().getBAssignment_1_5(), "rule__BuiltInCall__BAssignment_1_5");
					put(grammarAccess.getBuiltInCallAccess().getTAssignment_1_7(), "rule__BuiltInCall__TAssignment_1_7");
					put(grammarAccess.getBuiltInCallAccess().getAAssignment_2_3(), "rule__BuiltInCall__AAssignment_2_3");
					put(grammarAccess.getBuiltInCallAccess().getAAssignment_3_3(), "rule__BuiltInCall__AAssignment_3_3");
					put(grammarAccess.getBuiltInCallAccess().getRateAssignment_4_3(), "rule__BuiltInCall__RateAssignment_4_3");
					put(grammarAccess.getBuiltInCallAccess().getExpressionAssignment_4_5(), "rule__BuiltInCall__ExpressionAssignment_4_5");
					put(grammarAccess.getBuiltInCallAccess().getExpressionAssignment_5_3(), "rule__BuiltInCall__ExpressionAssignment_5_3");
					put(grammarAccess.getModelAccess().getUnorderedGroup(), "rule__Model__UnorderedGroup");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.mgs.graphics.pm.ui.contentassist.antlr.internal.InternalPmDslParser typedParser = (org.mgs.graphics.pm.ui.contentassist.antlr.internal.InternalPmDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PmDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PmDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
