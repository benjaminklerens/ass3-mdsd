package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'program'", "'external'", "'('", "')'", "','", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'let'", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainModel"
    // InternalMath.g:64:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // InternalMath.g:64:52: (iv_ruleDomainModel= ruleDomainModel EOF )
            // InternalMath.g:65:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalMath.g:71:1: ruleDomainModel returns [EObject current=null] : (otherlv_0= '\\n' ( (lv_element_1_0= ruleClass ) ) ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( (otherlv_0= '\\n' ( (lv_element_1_0= ruleClass ) ) ) )
            // InternalMath.g:78:2: (otherlv_0= '\\n' ( (lv_element_1_0= ruleClass ) ) )
            {
            // InternalMath.g:78:2: (otherlv_0= '\\n' ( (lv_element_1_0= ruleClass ) ) )
            // InternalMath.g:79:3: otherlv_0= '\\n' ( (lv_element_1_0= ruleClass ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainModelAccess().getLineFeedKeyword_0());
            		
            // InternalMath.g:83:3: ( (lv_element_1_0= ruleClass ) )
            // InternalMath.g:84:4: (lv_element_1_0= ruleClass )
            {
            // InternalMath.g:84:4: (lv_element_1_0= ruleClass )
            // InternalMath.g:85:5: lv_element_1_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getDomainModelAccess().getElementClassParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_1_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainModelRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_1_0,
            						"dk.sdu.mmmi.mdsd.Math.Class");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleClass"
    // InternalMath.g:106:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalMath.g:106:46: (iv_ruleClass= ruleClass EOF )
            // InternalMath.g:107:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalMath.g:113:1: ruleClass returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '\\n' ( ( (lv_externals_3_0= ruleExternal ) ) (otherlv_4= '\\n' ( (lv_externals_5_0= ruleExternal ) ) )* ) )? (otherlv_6= '\\n' ( (lv_math_7_0= ruleMathExp ) ) )? ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_externals_3_0 = null;

        EObject lv_externals_5_0 = null;

        EObject lv_math_7_0 = null;



        	enterRule();

        try {
            // InternalMath.g:119:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '\\n' ( ( (lv_externals_3_0= ruleExternal ) ) (otherlv_4= '\\n' ( (lv_externals_5_0= ruleExternal ) ) )* ) )? (otherlv_6= '\\n' ( (lv_math_7_0= ruleMathExp ) ) )? ) )
            // InternalMath.g:120:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '\\n' ( ( (lv_externals_3_0= ruleExternal ) ) (otherlv_4= '\\n' ( (lv_externals_5_0= ruleExternal ) ) )* ) )? (otherlv_6= '\\n' ( (lv_math_7_0= ruleMathExp ) ) )? )
            {
            // InternalMath.g:120:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '\\n' ( ( (lv_externals_3_0= ruleExternal ) ) (otherlv_4= '\\n' ( (lv_externals_5_0= ruleExternal ) ) )* ) )? (otherlv_6= '\\n' ( (lv_math_7_0= ruleMathExp ) ) )? )
            // InternalMath.g:121:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '\\n' ( ( (lv_externals_3_0= ruleExternal ) ) (otherlv_4= '\\n' ( (lv_externals_5_0= ruleExternal ) ) )* ) )? (otherlv_6= '\\n' ( (lv_math_7_0= ruleMathExp ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getProgramKeyword_0());
            		
            // InternalMath.g:125:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:126:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:126:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:127:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:143:3: (otherlv_2= '\\n' ( ( (lv_externals_3_0= ruleExternal ) ) (otherlv_4= '\\n' ( (lv_externals_5_0= ruleExternal ) ) )* ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==13) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // InternalMath.g:144:4: otherlv_2= '\\n' ( ( (lv_externals_3_0= ruleExternal ) ) (otherlv_4= '\\n' ( (lv_externals_5_0= ruleExternal ) ) )* )
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassAccess().getLineFeedKeyword_2_0());
                    			
                    // InternalMath.g:148:4: ( ( (lv_externals_3_0= ruleExternal ) ) (otherlv_4= '\\n' ( (lv_externals_5_0= ruleExternal ) ) )* )
                    // InternalMath.g:149:5: ( (lv_externals_3_0= ruleExternal ) ) (otherlv_4= '\\n' ( (lv_externals_5_0= ruleExternal ) ) )*
                    {
                    // InternalMath.g:149:5: ( (lv_externals_3_0= ruleExternal ) )
                    // InternalMath.g:150:6: (lv_externals_3_0= ruleExternal )
                    {
                    // InternalMath.g:150:6: (lv_externals_3_0= ruleExternal )
                    // InternalMath.g:151:7: lv_externals_3_0= ruleExternal
                    {

                    							newCompositeNode(grammarAccess.getClassAccess().getExternalsExternalParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_5);
                    lv_externals_3_0=ruleExternal();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassRule());
                    							}
                    							add(
                    								current,
                    								"externals",
                    								lv_externals_3_0,
                    								"dk.sdu.mmmi.mdsd.Math.External");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMath.g:168:5: (otherlv_4= '\\n' ( (lv_externals_5_0= ruleExternal ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==13) ) {
                                alt1=1;
                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMath.g:169:6: otherlv_4= '\\n' ( (lv_externals_5_0= ruleExternal ) )
                    	    {
                    	    otherlv_4=(Token)match(input,11,FOLLOW_6); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLineFeedKeyword_2_1_1_0());
                    	    					
                    	    // InternalMath.g:173:6: ( (lv_externals_5_0= ruleExternal ) )
                    	    // InternalMath.g:174:7: (lv_externals_5_0= ruleExternal )
                    	    {
                    	    // InternalMath.g:174:7: (lv_externals_5_0= ruleExternal )
                    	    // InternalMath.g:175:8: lv_externals_5_0= ruleExternal
                    	    {

                    	    								newCompositeNode(grammarAccess.getClassAccess().getExternalsExternalParserRuleCall_2_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_5);
                    	    lv_externals_5_0=ruleExternal();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getClassRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"externals",
                    	    									lv_externals_5_0,
                    	    									"dk.sdu.mmmi.mdsd.Math.External");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalMath.g:195:3: (otherlv_6= '\\n' ( (lv_math_7_0= ruleMathExp ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:196:4: otherlv_6= '\\n' ( (lv_math_7_0= ruleMathExp ) )
                    {
                    otherlv_6=(Token)match(input,11,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getLineFeedKeyword_3_0());
                    			
                    // InternalMath.g:200:4: ( (lv_math_7_0= ruleMathExp ) )
                    // InternalMath.g:201:5: (lv_math_7_0= ruleMathExp )
                    {
                    // InternalMath.g:201:5: (lv_math_7_0= ruleMathExp )
                    // InternalMath.g:202:6: lv_math_7_0= ruleMathExp
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getMathMathExpParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_math_7_0=ruleMathExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						set(
                    							current,
                    							"math",
                    							lv_math_7_0,
                    							"dk.sdu.mmmi.mdsd.Math.MathExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleExternal"
    // InternalMath.g:224:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalMath.g:224:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalMath.g:225:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
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
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalMath.g:231:1: ruleExternal returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDataTypes ) )? otherlv_4= ')' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:237:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDataTypes ) )? otherlv_4= ')' ) )
            // InternalMath.g:238:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDataTypes ) )? otherlv_4= ')' )
            {
            // InternalMath.g:238:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDataTypes ) )? otherlv_4= ')' )
            // InternalMath.g:239:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDataTypes ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getExternalKeyword_0());
            		
            // InternalMath.g:243:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:244:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:244:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:245:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMath.g:265:3: ( (lv_parameters_3_0= ruleDataTypes ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMath.g:266:4: (lv_parameters_3_0= ruleDataTypes )
                    {
                    // InternalMath.g:266:4: (lv_parameters_3_0= ruleDataTypes )
                    // InternalMath.g:267:5: lv_parameters_3_0= ruleDataTypes
                    {

                    					newCompositeNode(grammarAccess.getExternalAccess().getParametersDataTypesParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_parameters_3_0=ruleDataTypes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExternalRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_3_0,
                    						"dk.sdu.mmmi.mdsd.Math.DataTypes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExternalAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleDataTypes"
    // InternalMath.g:292:1: entryRuleDataTypes returns [String current=null] : iv_ruleDataTypes= ruleDataTypes EOF ;
    public final String entryRuleDataTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataTypes = null;


        try {
            // InternalMath.g:292:49: (iv_ruleDataTypes= ruleDataTypes EOF )
            // InternalMath.g:293:2: iv_ruleDataTypes= ruleDataTypes EOF
            {
             newCompositeNode(grammarAccess.getDataTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTypes=ruleDataTypes();

            state._fsp--;

             current =iv_ruleDataTypes.getText(); 
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
    // $ANTLR end "entryRuleDataTypes"


    // $ANTLR start "ruleDataTypes"
    // InternalMath.g:299:1: ruleDataTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDataTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMath.g:305:2: ( (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* ) )
            // InternalMath.g:306:2: (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* )
            {
            // InternalMath.g:306:2: (this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )* )
            // InternalMath.g:307:3: this_ID_0= RULE_ID (kw= ',' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getDataTypesAccess().getIDTerminalRuleCall_0());
            		
            // InternalMath.g:314:3: (kw= ',' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMath.g:315:4: kw= ',' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getDataTypesAccess().getCommaKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getDataTypesAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleDataTypes"


    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:332:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:332:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:333:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:339:1: ruleMathExp returns [EObject current=null] : ( ( (lv_variables_0_0= ruleVarBinding ) ) (otherlv_1= '\\n' ( (lv_variables_2_0= ruleVarBinding ) ) )* ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variables_0_0 = null;

        EObject lv_variables_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:345:2: ( ( ( (lv_variables_0_0= ruleVarBinding ) ) (otherlv_1= '\\n' ( (lv_variables_2_0= ruleVarBinding ) ) )* ) )
            // InternalMath.g:346:2: ( ( (lv_variables_0_0= ruleVarBinding ) ) (otherlv_1= '\\n' ( (lv_variables_2_0= ruleVarBinding ) ) )* )
            {
            // InternalMath.g:346:2: ( ( (lv_variables_0_0= ruleVarBinding ) ) (otherlv_1= '\\n' ( (lv_variables_2_0= ruleVarBinding ) ) )* )
            // InternalMath.g:347:3: ( (lv_variables_0_0= ruleVarBinding ) ) (otherlv_1= '\\n' ( (lv_variables_2_0= ruleVarBinding ) ) )*
            {
            // InternalMath.g:347:3: ( (lv_variables_0_0= ruleVarBinding ) )
            // InternalMath.g:348:4: (lv_variables_0_0= ruleVarBinding )
            {
            // InternalMath.g:348:4: (lv_variables_0_0= ruleVarBinding )
            // InternalMath.g:349:5: lv_variables_0_0= ruleVarBinding
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVarBindingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_variables_0_0=ruleVarBinding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_0_0,
            						"dk.sdu.mmmi.mdsd.Math.VarBinding");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMath.g:366:3: (otherlv_1= '\\n' ( (lv_variables_2_0= ruleVarBinding ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:367:4: otherlv_1= '\\n' ( (lv_variables_2_0= ruleVarBinding ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getMathExpAccess().getLineFeedKeyword_1_0());
            	    			
            	    // InternalMath.g:371:4: ( (lv_variables_2_0= ruleVarBinding ) )
            	    // InternalMath.g:372:5: (lv_variables_2_0= ruleVarBinding )
            	    {
            	    // InternalMath.g:372:5: (lv_variables_2_0= ruleVarBinding )
            	    // InternalMath.g:373:6: lv_variables_2_0= ruleVarBinding
            	    {

            	    						newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVarBindingParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_variables_2_0=ruleVarBinding();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_2_0,
            	    							"dk.sdu.mmmi.mdsd.Math.VarBinding");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleVarBinding"
    // InternalMath.g:395:1: entryRuleVarBinding returns [EObject current=null] : iv_ruleVarBinding= ruleVarBinding EOF ;
    public final EObject entryRuleVarBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBinding = null;


        try {
            // InternalMath.g:395:51: (iv_ruleVarBinding= ruleVarBinding EOF )
            // InternalMath.g:396:2: iv_ruleVarBinding= ruleVarBinding EOF
            {
             newCompositeNode(grammarAccess.getVarBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarBinding=ruleVarBinding();

            state._fsp--;

             current =iv_ruleVarBinding; 
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
    // $ANTLR end "entryRuleVarBinding"


    // $ANTLR start "ruleVarBinding"
    // InternalMath.g:402:1: ruleVarBinding returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) ;
    public final EObject ruleVarBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:408:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) )
            // InternalMath.g:409:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            {
            // InternalMath.g:409:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            // InternalMath.g:410:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVarBindingAccess().getVarKeyword_0());
            		
            // InternalMath.g:414:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:415:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:415:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:416:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getVarBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:436:3: ( (lv_expression_3_0= ruleExp ) )
            // InternalMath.g:437:4: (lv_expression_3_0= ruleExp )
            {
            // InternalMath.g:437:4: (lv_expression_3_0= ruleExp )
            // InternalMath.g:438:5: lv_expression_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVarBindingAccess().getExpressionExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarBindingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleVarBinding"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:459:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:459:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:460:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:466:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:472:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMath.g:473:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMath.g:473:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMath.g:474:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:482:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=19 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMath.g:483:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMath.g:483:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==19) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==20) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMath.g:484:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMath.g:484:5: ( () otherlv_2= '+' )
            	            // InternalMath.g:485:6: () otherlv_2= '+'
            	            {
            	            // InternalMath.g:485:6: ()
            	            // InternalMath.g:486:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:498:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMath.g:498:5: ( () otherlv_4= '-' )
            	            // InternalMath.g:499:6: () otherlv_4= '-'
            	            {
            	            // InternalMath.g:499:6: ()
            	            // InternalMath.g:500:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,20,FOLLOW_13); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:512:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMath.g:513:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMath.g:513:5: (lv_right_5_0= ruleFactor )
            	    // InternalMath.g:514:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:536:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMath.g:536:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMath.g:537:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:543:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:549:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:550:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:550:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:551:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:559:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=21 && LA10_0<=22)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMath.g:560:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:560:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==21) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==22) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalMath.g:561:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMath.g:561:5: ( () otherlv_2= '*' )
            	            // InternalMath.g:562:6: () otherlv_2= '*'
            	            {
            	            // InternalMath.g:562:6: ()
            	            // InternalMath.g:563:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,21,FOLLOW_13); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:575:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMath.g:575:5: ( () otherlv_4= '/' )
            	            // InternalMath.g:576:6: () otherlv_4= '/'
            	            {
            	            // InternalMath.g:576:6: ()
            	            // InternalMath.g:577:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,22,FOLLOW_13); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:589:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:590:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:590:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:591:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:613:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:613:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:614:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:620:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_ExternalBinding_5= ruleExternalBinding ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject this_Parenthesis_2 = null;

        EObject this_VariableUse_3 = null;

        EObject this_LetBinding_4 = null;

        EObject this_ExternalBinding_5 = null;



        	enterRule();

        try {
            // InternalMath.g:626:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_ExternalBinding_5= ruleExternalBinding ) )
            // InternalMath.g:627:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_ExternalBinding_5= ruleExternalBinding )
            {
            // InternalMath.g:627:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_ExternalBinding_5= ruleExternalBinding )
            int alt11=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt11=1;
                }
                break;
            case 14:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==EOF||LA11_3==11||(LA11_3>=15 && LA11_3<=16)||(LA11_3>=19 && LA11_3<=22)||(LA11_3>=24 && LA11_3<=25)) ) {
                    alt11=3;
                }
                else if ( (LA11_3==14) ) {
                    alt11=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMath.g:628:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMath.g:628:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMath.g:629:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:629:4: ()
                    // InternalMath.g:630:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMathNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:636:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMath.g:637:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMath.g:637:5: (lv_value_1_0= RULE_INT )
                    // InternalMath.g:638:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:656:3: this_Parenthesis_2= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_2=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:665:3: this_VariableUse_3= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_3=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:674:3: this_LetBinding_4= ruleLetBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetBinding_4=ruleLetBinding();

                    state._fsp--;


                    			current = this_LetBinding_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMath.g:683:3: this_ExternalBinding_5= ruleExternalBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalBindingParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalBinding_5=ruleExternalBinding();

                    state._fsp--;


                    			current = this_ExternalBinding_5;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:695:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:695:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:696:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:702:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:708:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalMath.g:709:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalMath.g:709:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalMath.g:710:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMath.g:714:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalMath.g:715:4: (lv_exp_1_0= ruleExp )
            {
            // InternalMath.g:715:4: (lv_exp_1_0= ruleExp )
            // InternalMath.g:716:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleLetBinding"
    // InternalMath.g:741:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalMath.g:741:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalMath.g:742:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
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
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalMath.g:748:1: ruleLetBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_binding_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:754:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMath.g:755:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:755:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMath.g:756:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLetBindingAccess().getLetKeyword_0());
            		
            // InternalMath.g:760:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:761:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:761:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:762:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:782:3: ( (lv_binding_3_0= ruleExp ) )
            // InternalMath.g:783:4: (lv_binding_3_0= ruleExp )
            {
            // InternalMath.g:783:4: (lv_binding_3_0= ruleExp )
            // InternalMath.g:784:5: lv_binding_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_binding_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getLetBindingAccess().getInKeyword_4());
            		
            // InternalMath.g:805:3: ( (lv_body_5_0= ruleExp ) )
            // InternalMath.g:806:4: (lv_body_5_0= ruleExp )
            {
            // InternalMath.g:806:4: (lv_body_5_0= ruleExp )
            // InternalMath.g:807:5: lv_body_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
            lv_body_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetBindingAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleExternalBinding"
    // InternalMath.g:832:1: entryRuleExternalBinding returns [EObject current=null] : iv_ruleExternalBinding= ruleExternalBinding EOF ;
    public final EObject entryRuleExternalBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalBinding = null;


        try {
            // InternalMath.g:832:56: (iv_ruleExternalBinding= ruleExternalBinding EOF )
            // InternalMath.g:833:2: iv_ruleExternalBinding= ruleExternalBinding EOF
            {
             newCompositeNode(grammarAccess.getExternalBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalBinding=ruleExternalBinding();

            state._fsp--;

             current =iv_ruleExternalBinding; 
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
    // $ANTLR end "entryRuleExternalBinding"


    // $ANTLR start "ruleExternalBinding"
    // InternalMath.g:839:1: ruleExternalBinding returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExp ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleExternalBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:845:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExp ) ) )* )? otherlv_5= ')' ) )
            // InternalMath.g:846:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExp ) ) )* )? otherlv_5= ')' )
            {
            // InternalMath.g:846:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExp ) ) )* )? otherlv_5= ')' )
            // InternalMath.g:847:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExp ) ) )* )? otherlv_5= ')'
            {
            // InternalMath.g:847:3: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:848:4: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:848:4: (otherlv_0= RULE_ID )
            // InternalMath.g:849:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalBindingRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalBindingAccess().getRefExternalCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalBindingAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:864:3: ( ( (lv_parameters_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExp ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==14||LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMath.g:865:4: ( (lv_parameters_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExp ) ) )*
                    {
                    // InternalMath.g:865:4: ( (lv_parameters_2_0= ruleExp ) )
                    // InternalMath.g:866:5: (lv_parameters_2_0= ruleExp )
                    {
                    // InternalMath.g:866:5: (lv_parameters_2_0= ruleExp )
                    // InternalMath.g:867:6: lv_parameters_2_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getExternalBindingAccess().getParametersExpParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_parameters_2_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalBindingRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"dk.sdu.mmmi.mdsd.Math.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMath.g:884:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleExp ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMath.g:885:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleExp ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_13); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getExternalBindingAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMath.g:889:5: ( (lv_parameters_4_0= ruleExp ) )
                    	    // InternalMath.g:890:6: (lv_parameters_4_0= ruleExp )
                    	    {
                    	    // InternalMath.g:890:6: (lv_parameters_4_0= ruleExp )
                    	    // InternalMath.g:891:7: lv_parameters_4_0= ruleExp
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalBindingAccess().getParametersExpParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_parameters_4_0=ruleExp();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalBindingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_4_0,
                    	    								"dk.sdu.mmmi.mdsd.Math.Exp");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalBindingAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleExternalBinding"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:918:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:918:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:919:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:925:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:931:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:932:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:932:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:933:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:933:3: (otherlv_0= RULE_ID )
            // InternalMath.g:934:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0());
            			

            }


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
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000804030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000080C030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000018000L});

}