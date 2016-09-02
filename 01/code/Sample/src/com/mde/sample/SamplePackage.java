/**
 */
package com.mde.sample;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.mde.sample.SampleFactory
 * @model kind="package"
 * @generated
 */
public interface SamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sample";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sample";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sample";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SamplePackage eINSTANCE = com.mde.sample.impl.SamplePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mde.sample.impl.StoryImpl <em>Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mde.sample.impl.StoryImpl
	 * @see com.mde.sample.impl.SamplePackageImpl#getStory()
	 * @generated
	 */
	int STORY = 0;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__SCENARIOS = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__BENEFIT = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__TITLE = 4;

	/**
	 * The number of structural features of the '<em>Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mde.sample.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mde.sample.impl.ScenarioImpl
	 * @see com.mde.sample.impl.SamplePackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__WHEN = 0;

	/**
	 * The feature id for the '<em><b>Given</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__GIVEN = 1;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__THEN = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__TITLE = 3;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mde.sample.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mde.sample.impl.WhenImpl
	 * @see com.mde.sample.impl.SamplePackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 2;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__SENTENCES = 0;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mde.sample.impl.GivenImpl <em>Given</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mde.sample.impl.GivenImpl
	 * @see com.mde.sample.impl.SamplePackageImpl#getGiven()
	 * @generated
	 */
	int GIVEN = 3;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN__SENTENCES = 0;

	/**
	 * The number of structural features of the '<em>Given</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Given</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mde.sample.impl.ThenImpl <em>Then</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mde.sample.impl.ThenImpl
	 * @see com.mde.sample.impl.SamplePackageImpl#getThen()
	 * @generated
	 */
	int THEN = 4;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__SENTENCES = 0;

	/**
	 * The number of structural features of the '<em>Then</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Then</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mde.sample.impl.SentenceImpl <em>Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mde.sample.impl.SentenceImpl
	 * @see com.mde.sample.impl.SamplePackageImpl#getSentence()
	 * @generated
	 */
	int SENTENCE = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__VARIABLES = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__ANNOTATION = 2;

	/**
	 * The number of structural features of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.mde.sample.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mde.sample.impl.VariableImpl
	 * @see com.mde.sample.impl.SamplePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mde.sample.impl.RegisterImpl <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mde.sample.impl.RegisterImpl
	 * @see com.mde.sample.impl.SamplePackageImpl#getRegister()
	 * @generated
	 */
	int REGISTER = 7;

	/**
	 * The feature id for the '<em><b>Stories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__STORIES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mde.sample.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mde.sample.impl.AnnotationImpl
	 * @see com.mde.sample.impl.SamplePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.mde.sample.Story <em>Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story</em>'.
	 * @see com.mde.sample.Story
	 * @generated
	 */
	EClass getStory();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mde.sample.Story#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see com.mde.sample.Story#getScenarios()
	 * @see #getStory()
	 * @generated
	 */
	EReference getStory_Scenarios();

	/**
	 * Returns the meta object for the attribute '{@link com.mde.sample.Story#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see com.mde.sample.Story#getRole()
	 * @see #getStory()
	 * @generated
	 */
	EAttribute getStory_Role();

	/**
	 * Returns the meta object for the attribute '{@link com.mde.sample.Story#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see com.mde.sample.Story#getFeature()
	 * @see #getStory()
	 * @generated
	 */
	EAttribute getStory_Feature();

	/**
	 * Returns the meta object for the attribute '{@link com.mde.sample.Story#getBenefit <em>Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Benefit</em>'.
	 * @see com.mde.sample.Story#getBenefit()
	 * @see #getStory()
	 * @generated
	 */
	EAttribute getStory_Benefit();

	/**
	 * Returns the meta object for the attribute '{@link com.mde.sample.Story#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.mde.sample.Story#getTitle()
	 * @see #getStory()
	 * @generated
	 */
	EAttribute getStory_Title();

	/**
	 * Returns the meta object for class '{@link com.mde.sample.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see com.mde.sample.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference '{@link com.mde.sample.Scenario#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see com.mde.sample.Scenario#getWhen()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_When();

	/**
	 * Returns the meta object for the containment reference '{@link com.mde.sample.Scenario#getGiven <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Given</em>'.
	 * @see com.mde.sample.Scenario#getGiven()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Given();

	/**
	 * Returns the meta object for the containment reference '{@link com.mde.sample.Scenario#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see com.mde.sample.Scenario#getThen()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Then();

	/**
	 * Returns the meta object for the attribute '{@link com.mde.sample.Scenario#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.mde.sample.Scenario#getTitle()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Title();

	/**
	 * Returns the meta object for class '{@link com.mde.sample.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see com.mde.sample.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mde.sample.When#getSentences <em>Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentences</em>'.
	 * @see com.mde.sample.When#getSentences()
	 * @see #getWhen()
	 * @generated
	 */
	EReference getWhen_Sentences();

	/**
	 * Returns the meta object for class '{@link com.mde.sample.Given <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Given</em>'.
	 * @see com.mde.sample.Given
	 * @generated
	 */
	EClass getGiven();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mde.sample.Given#getSentences <em>Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentences</em>'.
	 * @see com.mde.sample.Given#getSentences()
	 * @see #getGiven()
	 * @generated
	 */
	EReference getGiven_Sentences();

	/**
	 * Returns the meta object for class '{@link com.mde.sample.Then <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Then</em>'.
	 * @see com.mde.sample.Then
	 * @generated
	 */
	EClass getThen();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mde.sample.Then#getSentences <em>Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentences</em>'.
	 * @see com.mde.sample.Then#getSentences()
	 * @see #getThen()
	 * @generated
	 */
	EReference getThen_Sentences();

	/**
	 * Returns the meta object for class '{@link com.mde.sample.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentence</em>'.
	 * @see com.mde.sample.Sentence
	 * @generated
	 */
	EClass getSentence();

	/**
	 * Returns the meta object for the attribute '{@link com.mde.sample.Sentence#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.mde.sample.Sentence#getText()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mde.sample.Sentence#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see com.mde.sample.Sentence#getVariables()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link com.mde.sample.Sentence#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see com.mde.sample.Sentence#getAnnotation()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_Annotation();

	/**
	 * Returns the meta object for class '{@link com.mde.sample.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see com.mde.sample.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link com.mde.sample.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mde.sample.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mde.sample.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.mde.sample.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link com.mde.sample.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see com.mde.sample.Register
	 * @generated
	 */
	EClass getRegister();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mde.sample.Register#getStories <em>Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stories</em>'.
	 * @see com.mde.sample.Register#getStories()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_Stories();

	/**
	 * Returns the meta object for the attribute '{@link com.mde.sample.Register#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mde.sample.Register#getName()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_Name();

	/**
	 * Returns the meta object for class '{@link com.mde.sample.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see com.mde.sample.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link com.mde.sample.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.mde.sample.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Text();

	/**
	 * Returns the meta object for the attribute '{@link com.mde.sample.Annotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.mde.sample.Annotation#getType()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SampleFactory getSampleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.mde.sample.impl.StoryImpl <em>Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mde.sample.impl.StoryImpl
		 * @see com.mde.sample.impl.SamplePackageImpl#getStory()
		 * @generated
		 */
		EClass STORY = eINSTANCE.getStory();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY__SCENARIOS = eINSTANCE.getStory_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY__ROLE = eINSTANCE.getStory_Role();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY__FEATURE = eINSTANCE.getStory_Feature();

		/**
		 * The meta object literal for the '<em><b>Benefit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY__BENEFIT = eINSTANCE.getStory_Benefit();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY__TITLE = eINSTANCE.getStory_Title();

		/**
		 * The meta object literal for the '{@link com.mde.sample.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mde.sample.impl.ScenarioImpl
		 * @see com.mde.sample.impl.SamplePackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__WHEN = eINSTANCE.getScenario_When();

		/**
		 * The meta object literal for the '<em><b>Given</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__GIVEN = eINSTANCE.getScenario_Given();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__THEN = eINSTANCE.getScenario_Then();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__TITLE = eINSTANCE.getScenario_Title();

		/**
		 * The meta object literal for the '{@link com.mde.sample.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mde.sample.impl.WhenImpl
		 * @see com.mde.sample.impl.SamplePackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN__SENTENCES = eINSTANCE.getWhen_Sentences();

		/**
		 * The meta object literal for the '{@link com.mde.sample.impl.GivenImpl <em>Given</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mde.sample.impl.GivenImpl
		 * @see com.mde.sample.impl.SamplePackageImpl#getGiven()
		 * @generated
		 */
		EClass GIVEN = eINSTANCE.getGiven();

		/**
		 * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIVEN__SENTENCES = eINSTANCE.getGiven_Sentences();

		/**
		 * The meta object literal for the '{@link com.mde.sample.impl.ThenImpl <em>Then</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mde.sample.impl.ThenImpl
		 * @see com.mde.sample.impl.SamplePackageImpl#getThen()
		 * @generated
		 */
		EClass THEN = eINSTANCE.getThen();

		/**
		 * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEN__SENTENCES = eINSTANCE.getThen_Sentences();

		/**
		 * The meta object literal for the '{@link com.mde.sample.impl.SentenceImpl <em>Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mde.sample.impl.SentenceImpl
		 * @see com.mde.sample.impl.SamplePackageImpl#getSentence()
		 * @generated
		 */
		EClass SENTENCE = eINSTANCE.getSentence();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__TEXT = eINSTANCE.getSentence_Text();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__VARIABLES = eINSTANCE.getSentence_Variables();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__ANNOTATION = eINSTANCE.getSentence_Annotation();

		/**
		 * The meta object literal for the '{@link com.mde.sample.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mde.sample.impl.VariableImpl
		 * @see com.mde.sample.impl.SamplePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link com.mde.sample.impl.RegisterImpl <em>Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mde.sample.impl.RegisterImpl
		 * @see com.mde.sample.impl.SamplePackageImpl#getRegister()
		 * @generated
		 */
		EClass REGISTER = eINSTANCE.getRegister();

		/**
		 * The meta object literal for the '<em><b>Stories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER__STORIES = eINSTANCE.getRegister_Stories();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTER__NAME = eINSTANCE.getRegister_Name();

		/**
		 * The meta object literal for the '{@link com.mde.sample.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mde.sample.impl.AnnotationImpl
		 * @see com.mde.sample.impl.SamplePackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__TYPE = eINSTANCE.getAnnotation_Type();

	}

} //SamplePackage
