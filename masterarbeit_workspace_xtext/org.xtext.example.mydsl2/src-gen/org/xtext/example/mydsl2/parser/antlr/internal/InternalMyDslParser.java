package org.xtext.example.mydsl2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl2.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'multiple'", "'ExtensionInclusion'", "'{'", "'name'", "'description'", "'pointCut'", "','", "'}'", "'advice'", "'PointCut'", "'entityName'", "'placementStrategy'", "'Advice'", "'appears'", "'Completion'", "'PlacementStrategy'", "'ExternalCallPlacementStrategy'", "'matchingSignature'", "'InternalActionPlacementStrategy'", "'forAllInternalActionsIn'", "'ControlFlowPlacementStrategy'", "'forAllControlFlowsIn'", "'BEFORE'", "'AFTER'", "'AROUND'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ExtensionInclusion";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExtensionInclusion"
    // InternalMyDsl.g:65:1: entryRuleExtensionInclusion returns [EObject current=null] : iv_ruleExtensionInclusion= ruleExtensionInclusion EOF ;
    public final EObject entryRuleExtensionInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionInclusion = null;


        try {
            // InternalMyDsl.g:65:59: (iv_ruleExtensionInclusion= ruleExtensionInclusion EOF )
            // InternalMyDsl.g:66:2: iv_ruleExtensionInclusion= ruleExtensionInclusion EOF
            {
             newCompositeNode(grammarAccess.getExtensionInclusionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtensionInclusion=ruleExtensionInclusion();

            state._fsp--;

             current =iv_ruleExtensionInclusion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExtensionInclusion"


    // $ANTLR start "ruleExtensionInclusion"
    // InternalMyDsl.g:72:1: ruleExtensionInclusion returns [EObject current=null] : ( ( (lv_multiple_0_0= 'multiple' ) )? otherlv_1= 'ExtensionInclusion' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) (otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}' )? (otherlv_14= 'advice' otherlv_15= '{' ( (lv_advice_16_0= ruleAdvice ) ) (otherlv_17= ',' ( (lv_advice_18_0= ruleAdvice ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleExtensionInclusion() throws RecognitionException {
        EObject current = null;

        Token lv_multiple_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_pointCut_10_0 = null;

        EObject lv_pointCut_12_0 = null;

        EObject lv_advice_16_0 = null;

        EObject lv_advice_18_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( ( (lv_multiple_0_0= 'multiple' ) )? otherlv_1= 'ExtensionInclusion' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) (otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}' )? (otherlv_14= 'advice' otherlv_15= '{' ( (lv_advice_16_0= ruleAdvice ) ) (otherlv_17= ',' ( (lv_advice_18_0= ruleAdvice ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalMyDsl.g:79:2: ( ( (lv_multiple_0_0= 'multiple' ) )? otherlv_1= 'ExtensionInclusion' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) (otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}' )? (otherlv_14= 'advice' otherlv_15= '{' ( (lv_advice_16_0= ruleAdvice ) ) (otherlv_17= ',' ( (lv_advice_18_0= ruleAdvice ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalMyDsl.g:79:2: ( ( (lv_multiple_0_0= 'multiple' ) )? otherlv_1= 'ExtensionInclusion' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) (otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}' )? (otherlv_14= 'advice' otherlv_15= '{' ( (lv_advice_16_0= ruleAdvice ) ) (otherlv_17= ',' ( (lv_advice_18_0= ruleAdvice ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalMyDsl.g:80:3: ( (lv_multiple_0_0= 'multiple' ) )? otherlv_1= 'ExtensionInclusion' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) (otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}' )? (otherlv_14= 'advice' otherlv_15= '{' ( (lv_advice_16_0= ruleAdvice ) ) (otherlv_17= ',' ( (lv_advice_18_0= ruleAdvice ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalMyDsl.g:80:3: ( (lv_multiple_0_0= 'multiple' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:81:4: (lv_multiple_0_0= 'multiple' )
                    {
                    // InternalMyDsl.g:81:4: (lv_multiple_0_0= 'multiple' )
                    // InternalMyDsl.g:82:5: lv_multiple_0_0= 'multiple'
                    {
                    lv_multiple_0_0=(Token)match(input,11,FOLLOW_3); 

                    					newLeafNode(lv_multiple_0_0, grammarAccess.getExtensionInclusionAccess().getMultipleMultipleKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExtensionInclusionRule());
                    					}
                    					setWithLastConsumed(current, "multiple", true, "multiple");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExtensionInclusionAccess().getExtensionInclusionKeyword_1());
            		
            // InternalMyDsl.g:98:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:99:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:99:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:100:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExtensionInclusionAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtensionInclusionRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl2.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getExtensionInclusionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getExtensionInclusionAccess().getNameKeyword_4());
            		
            // InternalMyDsl.g:125:3: ( (lv_name_5_0= ruleEString ) )
            // InternalMyDsl.g:126:4: (lv_name_5_0= ruleEString )
            {
            // InternalMyDsl.g:126:4: (lv_name_5_0= ruleEString )
            // InternalMyDsl.g:127:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExtensionInclusionAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtensionInclusionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.xtext.example.mydsl2.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getExtensionInclusionAccess().getDescriptionKeyword_6());
            		
            // InternalMyDsl.g:148:3: ( (lv_description_7_0= ruleEString ) )
            // InternalMyDsl.g:149:4: (lv_description_7_0= ruleEString )
            {
            // InternalMyDsl.g:149:4: (lv_description_7_0= ruleEString )
            // InternalMyDsl.g:150:5: lv_description_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExtensionInclusionAccess().getDescriptionEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_description_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtensionInclusionRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.xtext.example.mydsl2.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:167:3: (otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:168:4: otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getExtensionInclusionAccess().getPointCutKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getExtensionInclusionAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMyDsl.g:176:4: ( (lv_pointCut_10_0= rulePointCut ) )
                    // InternalMyDsl.g:177:5: (lv_pointCut_10_0= rulePointCut )
                    {
                    // InternalMyDsl.g:177:5: (lv_pointCut_10_0= rulePointCut )
                    // InternalMyDsl.g:178:6: lv_pointCut_10_0= rulePointCut
                    {

                    						newCompositeNode(grammarAccess.getExtensionInclusionAccess().getPointCutPointCutParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_pointCut_10_0=rulePointCut();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtensionInclusionRule());
                    						}
                    						add(
                    							current,
                    							"pointCut",
                    							lv_pointCut_10_0,
                    							"org.xtext.example.mydsl2.MyDsl.PointCut");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:195:4: (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:196:5: otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getExtensionInclusionAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMyDsl.g:200:5: ( (lv_pointCut_12_0= rulePointCut ) )
                    	    // InternalMyDsl.g:201:6: (lv_pointCut_12_0= rulePointCut )
                    	    {
                    	    // InternalMyDsl.g:201:6: (lv_pointCut_12_0= rulePointCut )
                    	    // InternalMyDsl.g:202:7: lv_pointCut_12_0= rulePointCut
                    	    {

                    	    							newCompositeNode(grammarAccess.getExtensionInclusionAccess().getPointCutPointCutParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_pointCut_12_0=rulePointCut();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExtensionInclusionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pointCut",
                    	    								lv_pointCut_12_0,
                    	    								"org.xtext.example.mydsl2.MyDsl.PointCut");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getExtensionInclusionAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:225:3: (otherlv_14= 'advice' otherlv_15= '{' ( (lv_advice_16_0= ruleAdvice ) ) (otherlv_17= ',' ( (lv_advice_18_0= ruleAdvice ) ) )* otherlv_19= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:226:4: otherlv_14= 'advice' otherlv_15= '{' ( (lv_advice_16_0= ruleAdvice ) ) (otherlv_17= ',' ( (lv_advice_18_0= ruleAdvice ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getExtensionInclusionAccess().getAdviceKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getExtensionInclusionAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMyDsl.g:234:4: ( (lv_advice_16_0= ruleAdvice ) )
                    // InternalMyDsl.g:235:5: (lv_advice_16_0= ruleAdvice )
                    {
                    // InternalMyDsl.g:235:5: (lv_advice_16_0= ruleAdvice )
                    // InternalMyDsl.g:236:6: lv_advice_16_0= ruleAdvice
                    {

                    						newCompositeNode(grammarAccess.getExtensionInclusionAccess().getAdviceAdviceParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_advice_16_0=ruleAdvice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtensionInclusionRule());
                    						}
                    						add(
                    							current,
                    							"advice",
                    							lv_advice_16_0,
                    							"org.xtext.example.mydsl2.MyDsl.Advice");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:253:4: (otherlv_17= ',' ( (lv_advice_18_0= ruleAdvice ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:254:5: otherlv_17= ',' ( (lv_advice_18_0= ruleAdvice ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FOLLOW_12); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getExtensionInclusionAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyDsl.g:258:5: ( (lv_advice_18_0= ruleAdvice ) )
                    	    // InternalMyDsl.g:259:6: (lv_advice_18_0= ruleAdvice )
                    	    {
                    	    // InternalMyDsl.g:259:6: (lv_advice_18_0= ruleAdvice )
                    	    // InternalMyDsl.g:260:7: lv_advice_18_0= ruleAdvice
                    	    {

                    	    							newCompositeNode(grammarAccess.getExtensionInclusionAccess().getAdviceAdviceParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_advice_18_0=ruleAdvice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExtensionInclusionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"advice",
                    	    								lv_advice_18_0,
                    	    								"org.xtext.example.mydsl2.MyDsl.Advice");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getExtensionInclusionAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getExtensionInclusionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtensionInclusion"


    // $ANTLR start "entryRulePlacementStrategy"
    // InternalMyDsl.g:291:1: entryRulePlacementStrategy returns [EObject current=null] : iv_rulePlacementStrategy= rulePlacementStrategy EOF ;
    public final EObject entryRulePlacementStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlacementStrategy = null;


        try {
            // InternalMyDsl.g:291:58: (iv_rulePlacementStrategy= rulePlacementStrategy EOF )
            // InternalMyDsl.g:292:2: iv_rulePlacementStrategy= rulePlacementStrategy EOF
            {
             newCompositeNode(grammarAccess.getPlacementStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlacementStrategy=rulePlacementStrategy();

            state._fsp--;

             current =iv_rulePlacementStrategy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlacementStrategy"


    // $ANTLR start "rulePlacementStrategy"
    // InternalMyDsl.g:298:1: rulePlacementStrategy returns [EObject current=null] : (this_PlacementStrategy_Impl_0= rulePlacementStrategy_Impl | this_ExternalCallPlacementStrategy_1= ruleExternalCallPlacementStrategy | this_InternalActionPlacementStrategy_2= ruleInternalActionPlacementStrategy | this_ControlFlowPlacementStrategy_3= ruleControlFlowPlacementStrategy ) ;
    public final EObject rulePlacementStrategy() throws RecognitionException {
        EObject current = null;

        EObject this_PlacementStrategy_Impl_0 = null;

        EObject this_ExternalCallPlacementStrategy_1 = null;

        EObject this_InternalActionPlacementStrategy_2 = null;

        EObject this_ControlFlowPlacementStrategy_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:304:2: ( (this_PlacementStrategy_Impl_0= rulePlacementStrategy_Impl | this_ExternalCallPlacementStrategy_1= ruleExternalCallPlacementStrategy | this_InternalActionPlacementStrategy_2= ruleInternalActionPlacementStrategy | this_ControlFlowPlacementStrategy_3= ruleControlFlowPlacementStrategy ) )
            // InternalMyDsl.g:305:2: (this_PlacementStrategy_Impl_0= rulePlacementStrategy_Impl | this_ExternalCallPlacementStrategy_1= ruleExternalCallPlacementStrategy | this_InternalActionPlacementStrategy_2= ruleInternalActionPlacementStrategy | this_ControlFlowPlacementStrategy_3= ruleControlFlowPlacementStrategy )
            {
            // InternalMyDsl.g:305:2: (this_PlacementStrategy_Impl_0= rulePlacementStrategy_Impl | this_ExternalCallPlacementStrategy_1= ruleExternalCallPlacementStrategy | this_InternalActionPlacementStrategy_2= ruleInternalActionPlacementStrategy | this_ControlFlowPlacementStrategy_3= ruleControlFlowPlacementStrategy )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:306:3: this_PlacementStrategy_Impl_0= rulePlacementStrategy_Impl
                    {

                    			newCompositeNode(grammarAccess.getPlacementStrategyAccess().getPlacementStrategy_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlacementStrategy_Impl_0=rulePlacementStrategy_Impl();

                    state._fsp--;


                    			current = this_PlacementStrategy_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:315:3: this_ExternalCallPlacementStrategy_1= ruleExternalCallPlacementStrategy
                    {

                    			newCompositeNode(grammarAccess.getPlacementStrategyAccess().getExternalCallPlacementStrategyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCallPlacementStrategy_1=ruleExternalCallPlacementStrategy();

                    state._fsp--;


                    			current = this_ExternalCallPlacementStrategy_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:324:3: this_InternalActionPlacementStrategy_2= ruleInternalActionPlacementStrategy
                    {

                    			newCompositeNode(grammarAccess.getPlacementStrategyAccess().getInternalActionPlacementStrategyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalActionPlacementStrategy_2=ruleInternalActionPlacementStrategy();

                    state._fsp--;


                    			current = this_InternalActionPlacementStrategy_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:333:3: this_ControlFlowPlacementStrategy_3= ruleControlFlowPlacementStrategy
                    {

                    			newCompositeNode(grammarAccess.getPlacementStrategyAccess().getControlFlowPlacementStrategyParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ControlFlowPlacementStrategy_3=ruleControlFlowPlacementStrategy();

                    state._fsp--;


                    			current = this_ControlFlowPlacementStrategy_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlacementStrategy"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:345:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:345:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:346:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:352:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:358:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:359:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:359:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:360:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:368:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePointCut"
    // InternalMyDsl.g:379:1: entryRulePointCut returns [EObject current=null] : iv_rulePointCut= rulePointCut EOF ;
    public final EObject entryRulePointCut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointCut = null;


        try {
            // InternalMyDsl.g:379:49: (iv_rulePointCut= rulePointCut EOF )
            // InternalMyDsl.g:380:2: iv_rulePointCut= rulePointCut EOF
            {
             newCompositeNode(grammarAccess.getPointCutRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePointCut=rulePointCut();

            state._fsp--;

             current =iv_rulePointCut; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePointCut"


    // $ANTLR start "rulePointCut"
    // InternalMyDsl.g:386:1: rulePointCut returns [EObject current=null] : (otherlv_0= 'PointCut' otherlv_1= '{' otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) (otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) ) )? otherlv_6= '}' ) ;
    public final EObject rulePointCut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_entityName_3_0 = null;

        EObject lv_placementStrategy_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:392:2: ( (otherlv_0= 'PointCut' otherlv_1= '{' otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) (otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:393:2: (otherlv_0= 'PointCut' otherlv_1= '{' otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) (otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:393:2: (otherlv_0= 'PointCut' otherlv_1= '{' otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) (otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:394:3: otherlv_0= 'PointCut' otherlv_1= '{' otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) (otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPointCutAccess().getPointCutKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getPointCutAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPointCutAccess().getEntityNameKeyword_2());
            		
            // InternalMyDsl.g:406:3: ( (lv_entityName_3_0= ruleEString ) )
            // InternalMyDsl.g:407:4: (lv_entityName_3_0= ruleEString )
            {
            // InternalMyDsl.g:407:4: (lv_entityName_3_0= ruleEString )
            // InternalMyDsl.g:408:5: lv_entityName_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPointCutAccess().getEntityNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_entityName_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointCutRule());
            					}
            					set(
            						current,
            						"entityName",
            						lv_entityName_3_0,
            						"org.xtext.example.mydsl2.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:425:3: (otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:426:4: otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getPointCutAccess().getPlacementStrategyKeyword_4_0());
                    			
                    // InternalMyDsl.g:430:4: ( (lv_placementStrategy_5_0= rulePlacementStrategy ) )
                    // InternalMyDsl.g:431:5: (lv_placementStrategy_5_0= rulePlacementStrategy )
                    {
                    // InternalMyDsl.g:431:5: (lv_placementStrategy_5_0= rulePlacementStrategy )
                    // InternalMyDsl.g:432:6: lv_placementStrategy_5_0= rulePlacementStrategy
                    {

                    						newCompositeNode(grammarAccess.getPointCutAccess().getPlacementStrategyPlacementStrategyParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_placementStrategy_5_0=rulePlacementStrategy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointCutRule());
                    						}
                    						set(
                    							current,
                    							"placementStrategy",
                    							lv_placementStrategy_5_0,
                    							"org.xtext.example.mydsl2.MyDsl.PlacementStrategy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPointCutAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePointCut"


    // $ANTLR start "entryRuleAdvice"
    // InternalMyDsl.g:458:1: entryRuleAdvice returns [EObject current=null] : iv_ruleAdvice= ruleAdvice EOF ;
    public final EObject entryRuleAdvice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvice = null;


        try {
            // InternalMyDsl.g:458:47: (iv_ruleAdvice= ruleAdvice EOF )
            // InternalMyDsl.g:459:2: iv_ruleAdvice= ruleAdvice EOF
            {
             newCompositeNode(grammarAccess.getAdviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdvice=ruleAdvice();

            state._fsp--;

             current =iv_ruleAdvice; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdvice"


    // $ANTLR start "ruleAdvice"
    // InternalMyDsl.g:465:1: ruleAdvice returns [EObject current=null] : (otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) otherlv_4= 'appears' ( (lv_appears_5_0= ruleAppearance ) ) (otherlv_6= 'pointCut' ( ( ruleEString ) ) )? (otherlv_8= 'Completion' ( ( ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleAdvice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_entityName_3_0 = null;

        Enumerator lv_appears_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:471:2: ( (otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) otherlv_4= 'appears' ( (lv_appears_5_0= ruleAppearance ) ) (otherlv_6= 'pointCut' ( ( ruleEString ) ) )? (otherlv_8= 'Completion' ( ( ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalMyDsl.g:472:2: (otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) otherlv_4= 'appears' ( (lv_appears_5_0= ruleAppearance ) ) (otherlv_6= 'pointCut' ( ( ruleEString ) ) )? (otherlv_8= 'Completion' ( ( ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalMyDsl.g:472:2: (otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) otherlv_4= 'appears' ( (lv_appears_5_0= ruleAppearance ) ) (otherlv_6= 'pointCut' ( ( ruleEString ) ) )? (otherlv_8= 'Completion' ( ( ruleEString ) ) )? otherlv_10= '}' )
            // InternalMyDsl.g:473:3: otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'entityName' ( (lv_entityName_3_0= ruleEString ) ) otherlv_4= 'appears' ( (lv_appears_5_0= ruleAppearance ) ) (otherlv_6= 'pointCut' ( ( ruleEString ) ) )? (otherlv_8= 'Completion' ( ( ruleEString ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAdviceAccess().getAdviceKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAdviceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAdviceAccess().getEntityNameKeyword_2());
            		
            // InternalMyDsl.g:485:3: ( (lv_entityName_3_0= ruleEString ) )
            // InternalMyDsl.g:486:4: (lv_entityName_3_0= ruleEString )
            {
            // InternalMyDsl.g:486:4: (lv_entityName_3_0= ruleEString )
            // InternalMyDsl.g:487:5: lv_entityName_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAdviceAccess().getEntityNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_entityName_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdviceRule());
            					}
            					set(
            						current,
            						"entityName",
            						lv_entityName_3_0,
            						"org.xtext.example.mydsl2.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getAdviceAccess().getAppearsKeyword_4());
            		
            // InternalMyDsl.g:508:3: ( (lv_appears_5_0= ruleAppearance ) )
            // InternalMyDsl.g:509:4: (lv_appears_5_0= ruleAppearance )
            {
            // InternalMyDsl.g:509:4: (lv_appears_5_0= ruleAppearance )
            // InternalMyDsl.g:510:5: lv_appears_5_0= ruleAppearance
            {

            					newCompositeNode(grammarAccess.getAdviceAccess().getAppearsAppearanceEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_appears_5_0=ruleAppearance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdviceRule());
            					}
            					set(
            						current,
            						"appears",
            						lv_appears_5_0,
            						"org.xtext.example.mydsl2.MyDsl.Appearance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:527:3: (otherlv_6= 'pointCut' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:528:4: otherlv_6= 'pointCut' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getAdviceAccess().getPointCutKeyword_6_0());
                    			
                    // InternalMyDsl.g:532:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:533:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:533:5: ( ruleEString )
                    // InternalMyDsl.g:534:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdviceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAdviceAccess().getPointCutPointCutCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:549:3: (otherlv_8= 'Completion' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:550:4: otherlv_8= 'Completion' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getAdviceAccess().getCompletionKeyword_7_0());
                    			
                    // InternalMyDsl.g:554:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:555:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:555:5: ( ruleEString )
                    // InternalMyDsl.g:556:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdviceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAdviceAccess().getCompletionComplementumVisnetisCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAdviceAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdvice"


    // $ANTLR start "entryRulePlacementStrategy_Impl"
    // InternalMyDsl.g:579:1: entryRulePlacementStrategy_Impl returns [EObject current=null] : iv_rulePlacementStrategy_Impl= rulePlacementStrategy_Impl EOF ;
    public final EObject entryRulePlacementStrategy_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlacementStrategy_Impl = null;


        try {
            // InternalMyDsl.g:579:63: (iv_rulePlacementStrategy_Impl= rulePlacementStrategy_Impl EOF )
            // InternalMyDsl.g:580:2: iv_rulePlacementStrategy_Impl= rulePlacementStrategy_Impl EOF
            {
             newCompositeNode(grammarAccess.getPlacementStrategy_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlacementStrategy_Impl=rulePlacementStrategy_Impl();

            state._fsp--;

             current =iv_rulePlacementStrategy_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlacementStrategy_Impl"


    // $ANTLR start "rulePlacementStrategy_Impl"
    // InternalMyDsl.g:586:1: rulePlacementStrategy_Impl returns [EObject current=null] : ( () otherlv_1= 'PlacementStrategy' ) ;
    public final EObject rulePlacementStrategy_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:592:2: ( ( () otherlv_1= 'PlacementStrategy' ) )
            // InternalMyDsl.g:593:2: ( () otherlv_1= 'PlacementStrategy' )
            {
            // InternalMyDsl.g:593:2: ( () otherlv_1= 'PlacementStrategy' )
            // InternalMyDsl.g:594:3: () otherlv_1= 'PlacementStrategy'
            {
            // InternalMyDsl.g:594:3: ()
            // InternalMyDsl.g:595:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlacementStrategy_ImplAccess().getPlacementStrategyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPlacementStrategy_ImplAccess().getPlacementStrategyKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlacementStrategy_Impl"


    // $ANTLR start "entryRuleExternalCallPlacementStrategy"
    // InternalMyDsl.g:609:1: entryRuleExternalCallPlacementStrategy returns [EObject current=null] : iv_ruleExternalCallPlacementStrategy= ruleExternalCallPlacementStrategy EOF ;
    public final EObject entryRuleExternalCallPlacementStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCallPlacementStrategy = null;


        try {
            // InternalMyDsl.g:609:70: (iv_ruleExternalCallPlacementStrategy= ruleExternalCallPlacementStrategy EOF )
            // InternalMyDsl.g:610:2: iv_ruleExternalCallPlacementStrategy= ruleExternalCallPlacementStrategy EOF
            {
             newCompositeNode(grammarAccess.getExternalCallPlacementStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCallPlacementStrategy=ruleExternalCallPlacementStrategy();

            state._fsp--;

             current =iv_ruleExternalCallPlacementStrategy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExternalCallPlacementStrategy"


    // $ANTLR start "ruleExternalCallPlacementStrategy"
    // InternalMyDsl.g:616:1: ruleExternalCallPlacementStrategy returns [EObject current=null] : ( () otherlv_1= 'ExternalCallPlacementStrategy' otherlv_2= '{' (otherlv_3= 'matchingSignature' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleExternalCallPlacementStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:622:2: ( ( () otherlv_1= 'ExternalCallPlacementStrategy' otherlv_2= '{' (otherlv_3= 'matchingSignature' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:623:2: ( () otherlv_1= 'ExternalCallPlacementStrategy' otherlv_2= '{' (otherlv_3= 'matchingSignature' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:623:2: ( () otherlv_1= 'ExternalCallPlacementStrategy' otherlv_2= '{' (otherlv_3= 'matchingSignature' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:624:3: () otherlv_1= 'ExternalCallPlacementStrategy' otherlv_2= '{' (otherlv_3= 'matchingSignature' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:624:3: ()
            // InternalMyDsl.g:625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalCallPlacementStrategyAccess().getExternalCallPlacementStrategyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallPlacementStrategyAccess().getExternalCallPlacementStrategyKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalCallPlacementStrategyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:639:3: (otherlv_3= 'matchingSignature' ( ( ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:640:4: otherlv_3= 'matchingSignature' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getExternalCallPlacementStrategyAccess().getMatchingSignatureKeyword_3_0());
                    			
                    // InternalMyDsl.g:644:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:645:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:645:5: ( ruleEString )
                    // InternalMyDsl.g:646:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalCallPlacementStrategyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExternalCallPlacementStrategyAccess().getMatchingSignatureSignatureCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalCallPlacementStrategyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalCallPlacementStrategy"


    // $ANTLR start "entryRuleInternalActionPlacementStrategy"
    // InternalMyDsl.g:669:1: entryRuleInternalActionPlacementStrategy returns [EObject current=null] : iv_ruleInternalActionPlacementStrategy= ruleInternalActionPlacementStrategy EOF ;
    public final EObject entryRuleInternalActionPlacementStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalActionPlacementStrategy = null;


        try {
            // InternalMyDsl.g:669:72: (iv_ruleInternalActionPlacementStrategy= ruleInternalActionPlacementStrategy EOF )
            // InternalMyDsl.g:670:2: iv_ruleInternalActionPlacementStrategy= ruleInternalActionPlacementStrategy EOF
            {
             newCompositeNode(grammarAccess.getInternalActionPlacementStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalActionPlacementStrategy=ruleInternalActionPlacementStrategy();

            state._fsp--;

             current =iv_ruleInternalActionPlacementStrategy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInternalActionPlacementStrategy"


    // $ANTLR start "ruleInternalActionPlacementStrategy"
    // InternalMyDsl.g:676:1: ruleInternalActionPlacementStrategy returns [EObject current=null] : ( () otherlv_1= 'InternalActionPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleInternalActionPlacementStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:682:2: ( ( () otherlv_1= 'InternalActionPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:683:2: ( () otherlv_1= 'InternalActionPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:683:2: ( () otherlv_1= 'InternalActionPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:684:3: () otherlv_1= 'InternalActionPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:684:3: ()
            // InternalMyDsl.g:685:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionPlacementStrategyAccess().getInternalActionPlacementStrategyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionPlacementStrategyAccess().getInternalActionPlacementStrategyKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getInternalActionPlacementStrategyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:699:3: (otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:700:4: otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getInternalActionPlacementStrategyAccess().getForAllInternalActionsInKeyword_3_0());
                    			
                    // InternalMyDsl.g:704:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:705:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:705:5: ( ruleEString )
                    // InternalMyDsl.g:706:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInternalActionPlacementStrategyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInternalActionPlacementStrategyAccess().getForAllInternalActionsInRepositoryComponentCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInternalActionPlacementStrategyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternalActionPlacementStrategy"


    // $ANTLR start "entryRuleControlFlowPlacementStrategy"
    // InternalMyDsl.g:729:1: entryRuleControlFlowPlacementStrategy returns [EObject current=null] : iv_ruleControlFlowPlacementStrategy= ruleControlFlowPlacementStrategy EOF ;
    public final EObject entryRuleControlFlowPlacementStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlFlowPlacementStrategy = null;


        try {
            // InternalMyDsl.g:729:69: (iv_ruleControlFlowPlacementStrategy= ruleControlFlowPlacementStrategy EOF )
            // InternalMyDsl.g:730:2: iv_ruleControlFlowPlacementStrategy= ruleControlFlowPlacementStrategy EOF
            {
             newCompositeNode(grammarAccess.getControlFlowPlacementStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlFlowPlacementStrategy=ruleControlFlowPlacementStrategy();

            state._fsp--;

             current =iv_ruleControlFlowPlacementStrategy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleControlFlowPlacementStrategy"


    // $ANTLR start "ruleControlFlowPlacementStrategy"
    // InternalMyDsl.g:736:1: ruleControlFlowPlacementStrategy returns [EObject current=null] : ( () otherlv_1= 'ControlFlowPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleControlFlowPlacementStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:742:2: ( ( () otherlv_1= 'ControlFlowPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:743:2: ( () otherlv_1= 'ControlFlowPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:743:2: ( () otherlv_1= 'ControlFlowPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:744:3: () otherlv_1= 'ControlFlowPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:744:3: ()
            // InternalMyDsl.g:745:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getControlFlowPlacementStrategyAccess().getControlFlowPlacementStrategyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getControlFlowPlacementStrategyAccess().getControlFlowPlacementStrategyKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getControlFlowPlacementStrategyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:759:3: (otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:760:4: otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getControlFlowPlacementStrategyAccess().getForAllControlFlowsInKeyword_3_0());
                    			
                    // InternalMyDsl.g:764:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:765:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:765:5: ( ruleEString )
                    // InternalMyDsl.g:766:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getControlFlowPlacementStrategyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getControlFlowPlacementStrategyAccess().getForAllControlFlowsInRepositoryComponentCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getControlFlowPlacementStrategyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleControlFlowPlacementStrategy"


    // $ANTLR start "ruleAppearance"
    // InternalMyDsl.g:789:1: ruleAppearance returns [Enumerator current=null] : ( (enumLiteral_0= 'BEFORE' ) | (enumLiteral_1= 'AFTER' ) | (enumLiteral_2= 'AROUND' ) ) ;
    public final Enumerator ruleAppearance() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:795:2: ( ( (enumLiteral_0= 'BEFORE' ) | (enumLiteral_1= 'AFTER' ) | (enumLiteral_2= 'AROUND' ) ) )
            // InternalMyDsl.g:796:2: ( (enumLiteral_0= 'BEFORE' ) | (enumLiteral_1= 'AFTER' ) | (enumLiteral_2= 'AROUND' ) )
            {
            // InternalMyDsl.g:796:2: ( (enumLiteral_0= 'BEFORE' ) | (enumLiteral_1= 'AFTER' ) | (enumLiteral_2= 'AROUND' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 35:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:797:3: (enumLiteral_0= 'BEFORE' )
                    {
                    // InternalMyDsl.g:797:3: (enumLiteral_0= 'BEFORE' )
                    // InternalMyDsl.g:798:4: enumLiteral_0= 'BEFORE'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getAppearanceAccess().getBEFOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAppearanceAccess().getBEFOREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:805:3: (enumLiteral_1= 'AFTER' )
                    {
                    // InternalMyDsl.g:805:3: (enumLiteral_1= 'AFTER' )
                    // InternalMyDsl.g:806:4: enumLiteral_1= 'AFTER'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getAppearanceAccess().getAFTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAppearanceAccess().getAFTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:813:3: (enumLiteral_2= 'AROUND' )
                    {
                    // InternalMyDsl.g:813:3: (enumLiteral_2= 'AROUND' )
                    // InternalMyDsl.g:814:4: enumLiteral_2= 'AROUND'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getAppearanceAccess().getAROUNDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAppearanceAccess().getAROUNDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppearance"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000AC000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002050000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100040000L});

}