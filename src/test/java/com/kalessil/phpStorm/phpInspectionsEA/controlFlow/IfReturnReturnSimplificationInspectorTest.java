package com.kalessil.phpStorm.phpInspectionsEA.controlFlow;

import com.intellij.testFramework.fixtures.CodeInsightFixtureTestCase;
import com.kalessil.phpStorm.phpInspectionsEA.inspectors.ifs.IfReturnReturnSimplificationInspector;

public class IfReturnReturnSimplificationInspectorTest extends CodeInsightFixtureTestCase {
    public void testIfFindsAllPatterns() {
        myFixture.configureByFile("fixtures/if-return-return-simplify.php");
        myFixture.enableInspections(IfReturnReturnSimplificationInspector.class);
        myFixture.testHighlighting(true, false, true);
    }
}
