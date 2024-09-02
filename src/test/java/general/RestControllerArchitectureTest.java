package general;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noMethods;

@AnalyzeClasses(packages = {"com.learning.demo"})
public class RestControllerArchitectureTest {
//    JavaClasses classes = new ClassFileImporter().importPackages("org.example");


    @ArchTest
    public static final ArchRule useSpecificRequestMappingAnnotations = noMethods().should().beAnnotatedWith(RequestMapping.class).allowEmptyShould(true);

    //TODO: uncomment below function to check the -ve scenario
//
//    private static final ArchCondition<JavaMethod> nonEmptyGetMappingShouldContainProducesAttribute = new ArchCondition<>("specify produces for GET") {
//        @Override
//        public void check(final JavaMethod item, final ConditionEvents events) {
//            if (item.isAnnotatedWith(GetMapping.class)) {
//                final GetMapping mappingAnnotation = item.getAnnotationOfType(GetMapping.class);
//                if (mappingAnnotation.produces().length == 0) {
//                    events.add(SimpleConditionEvent.violated(item, String.format("%s does not provide a produces attribute", item.getFullName())));
//                }
//            }
//        }
//    };
//
//    private static final ArchCondition<JavaMethod> provideAProducesAttribute =
//            nonEmptyGetMappingShouldContainProducesAttribute.as("provide 'produces' attribute");
//
//    @ArchTest
//    public static final ArchRule nonEmptyResponseShouldProvideProducesAttributes  = methods().that().areDeclaredInClassesThat()
//            .areAnnotatedWith(RestController.class)
//            .and().doNotHaveRawReturnType(Void.TYPE)
//            .should(provideAProducesAttribute)
//            .allowEmptyShould(true);

    //TODO: Check PACKAGE AND ITS METHOD
//    @ArchTest
//    //Mitigates CVE-2024-23080
//    public static final ArchRule JodaTime_PeriodFormat_wordBased_should_not_be_used = noClasses().should()
//            .callMethod("org.slf4j.Logger","info","String")
//            .because("PeriodFormat::wordBased may contain a vulnerability (https://clm.dev.rabobank.nl/assets/index.html#/vulnerabilities/CVE-2024-23080)");

    @ArchTest
    public static final ArchRule annotation_should_used = classes()
            .that().areAnnotatedWith(Service.class)
            .should().haveSimpleNameEndingWith("Service");

}
