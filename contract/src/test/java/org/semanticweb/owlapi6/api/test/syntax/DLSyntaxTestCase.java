package org.semanticweb.owlapi6.api.test.syntax;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.semanticweb.owlapi6.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi6.dlsyntax.renderer.DLSyntaxObjectRenderer;
import org.semanticweb.owlapi6.formats.DLSyntaxDocumentFormat;
import org.semanticweb.owlapi6.formats.DLSyntaxHTMLDocumentFormat;
import org.semanticweb.owlapi6.model.OWLAxiom;
import org.semanticweb.owlapi6.model.OWLClass;
import org.semanticweb.owlapi6.model.OWLOntology;

public class DLSyntaxTestCase extends TestBase {

    @Test
    public void testCommasOnDisjointThree() {
        OWLClass a = df.getOWLClass("urn:test#", "A");
        OWLClass b = df.getOWLClass("urn:test#", "B");
        OWLClass c = df.getOWLClass("urn:test#", "C");
        OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b, c);
        DLSyntaxObjectRenderer visitor = new DLSyntaxObjectRenderer();
        String render = visitor.render(ax);
        assertEquals("A ⊑ ¬ B, A ⊑ ¬ C, B ⊑ ¬ C", render);
    }

    @Test
    public void testCommasOnDisjointTwo() {
        OWLClass a = df.getOWLClass("urn:test#", "A");
        OWLClass b = df.getOWLClass("urn:test#", "B");
        OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b);
        DLSyntaxObjectRenderer visitor = new DLSyntaxObjectRenderer();
        String render = visitor.render(ax);
        assertEquals("A ⊑ ¬ B", render);
    }

    @Test
    public void testCommasOnDisjointFour() {
        OWLClass a = df.getOWLClass("urn:test#", "A");
        OWLClass b = df.getOWLClass("urn:test#", "B");
        OWLClass c = df.getOWLClass("urn:test#", "C");
        OWLClass d = df.getOWLClass("urn:test#", "D");
        OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b, c, d);
        DLSyntaxObjectRenderer visitor = new DLSyntaxObjectRenderer();
        String render = visitor.render(ax);
        assertEquals("A ⊑ ¬ B, A ⊑ ¬ C, A ⊑ ¬ D, B ⊑ ¬ C, B ⊑ ¬ D, C ⊑ ¬ D", render);
    }

    @Test
    public void testCommasOnDisjointThreeOntologyHTML() throws Exception {
        OWLOntology o = m.createOntology(df.getIRI("urn:test:onto"));
        OWLClass a = df.getOWLClass("urn:test:", "A");
        OWLClass b = df.getOWLClass("urn:test:", "B");
        OWLClass c = df.getOWLClass("urn:test:", "C");
        OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b, c);
        o.addAxiom(ax);
        String render = saveOntology(o, new DLSyntaxHTMLDocumentFormat()).toString();
        assertEquals(
            "<html>\n<body>\n<h1>Ontology: \nOntologyID(OntologyIRI(<urn:test:onto>) VersionIRI(<null>))</h1>\n<h2><a name=\"A\">urn:test:A</a></h2>\n"
                + "<div class=\"entitybox\">\n<div class=\"axiombox\"> \n"
                + "A &#8849; &#172; <a href=\"#B\">B</a>, A &#8849; &#172; <a href=\"#C\">C</a>, <a href=\"#B\">B</a> &#8849; &#172; <a href=\"#C\">C</a></div>\n"
                + "<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n<h3>Usages (0)</h3>\n</div>\n</div>\n"
                + "<h2><a name=\"B\">urn:test:B</a></h2>\n<div class=\"entitybox\">\n<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n<h3>Usages (0)</h3>\n</div>\n</div>\n"
                + "<h2><a name=\"C\">urn:test:C</a></h2>\n<div class=\"entitybox\">\n<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n<h3>Usages (0)</h3>\n</div>\n</div>\n"
                + "<div>\n</div>\n</body>\n</html>\n",
            render.replace(System.getProperty("line.separator"), "\n"));
    }

    @Test
    public void testCommasOnDisjointTwoOntologyHTML() throws Exception {
        OWLOntology o = m.createOntology(df.getIRI("urn:test:onto"));
        OWLClass a = df.getOWLClass("urn:test:", "A");
        OWLClass b = df.getOWLClass("urn:test:", "B");
        OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b);
        o.addAxiom(ax);
        String render = saveOntology(o, new DLSyntaxHTMLDocumentFormat()).toString();
        assertEquals(
            "<html>\n<body>\n<h1>Ontology: \nOntologyID(OntologyIRI(<urn:test:onto>) VersionIRI(<null>))</h1>\n<h2><a name=\"A\">urn:test:A</a></h2>\n"
                + "<div class=\"entitybox\">\n<div class=\"axiombox\"> \nA &#8849; &#172; <a href=\"#B\">B</a></div>\n"
                + "<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n<h3>Usages (0)</h3>\n</div>\n</div>\n"
                + "<h2><a name=\"B\">urn:test:B</a></h2>\n<div class=\"entitybox\">\n<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n<h3>Usages (0)</h3>\n</div>\n</div>\n"
                + "<div>\n</div>\n</body>\n</html>\n",
            render.replace(System.getProperty("line.separator"), "\n"));
    }

    @Test
    public void testCommasOnDisjointFourOntologyHTML() throws Exception {
        OWLOntology o = m.createOntology(df.getIRI("urn:test:onto"));
        OWLClass a = df.getOWLClass("urn:test:", "A");
        OWLClass b = df.getOWLClass("urn:test:", "B");
        OWLClass c = df.getOWLClass("urn:test:", "C");
        OWLClass d = df.getOWLClass("urn:test:", "D");
        OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b, c, d);
        o.addAxiom(ax);
        String render = saveOntology(o, new DLSyntaxHTMLDocumentFormat()).toString();
        assertEquals(
            "<html>\n<body>\n<h1>Ontology: \nOntologyID(OntologyIRI(<urn:test:onto>) VersionIRI(<null>))</h1>\n<h2><a name=\"A\">urn:test:A</a></h2>\n"
                + "<div class=\"entitybox\">\n<div class=\"axiombox\"> \nA &#8849; &#172; <a href=\"#B\">B</a>, A &#8849; &#172; <a href=\"#C\">C</a>, A &#8849; &#172; <a href=\"#D\">D</a>, <a href=\"#B\">B</a> &#8849; &#172; <a href=\"#C\">C</a>, <a href=\"#B\">B</a> &#8849; &#172; <a href=\"#D\">D</a>, <a href=\"#C\">C</a> &#8849; &#172; <a href=\"#D\">D</a></div>\n"
                + "<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n<h3>Usages (0)</h3>\n</div>\n</div>\n<h2><a name=\"B\">urn:test:B</a></h2>\n"
                + "<div class=\"entitybox\">\n<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n"
                + "<h3>Usages (0)</h3>\n</div>\n</div>\n<h2><a name=\"C\">urn:test:C</a></h2>\n"
                + "<div class=\"entitybox\">\n<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n"
                + "<h3>Usages (0)</h3>\n</div>\n</div>\n<h2><a name=\"D\">urn:test:D</a></h2>\n"
                + "<div class=\"entitybox\">\n<div class=\"usage\" style=\"margin-left: 60px; size: tiny\">\n"
                + "<h3>Usages (0)</h3>\n</div>\n</div>\n<div>\n</div>\n</body>\n</html>\n",
            render.replace(System.getProperty("line.separator"), "\n"));
    }

    @Test
    public void testCommasOnDisjointThreeOntology() throws Exception {
        OWLOntology o = m.createOntology();
        OWLClass a = df.getOWLClass("urn:test:", "A");
        OWLClass b = df.getOWLClass("urn:test:", "B");
        OWLClass c = df.getOWLClass("urn:test:", "C");
        OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b, c);
        o.addAxiom(ax);
        String render = saveOntology(o, new DLSyntaxDocumentFormat()).toString();
        assertEquals("A ⊑ ¬ B, A ⊑ ¬ C, B ⊑ ¬ C", render);
    }

    @Test
    public void testCommasOnDisjointTwoOntology() throws Exception {
        OWLOntology o = m.createOntology();
        OWLClass a = df.getOWLClass("urn:test:", "A");
        OWLClass b = df.getOWLClass("urn:test:", "B");
        OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b);
        o.addAxiom(ax);
        String render = saveOntology(o, new DLSyntaxDocumentFormat()).toString();
        assertEquals("A ⊑ ¬ B", render);
    }

    @Test
    public void testCommasOnDisjointFourOntology() throws Exception {
        OWLOntology o = m.createOntology();
        OWLClass a = df.getOWLClass("urn:test:", "A");
        OWLClass b = df.getOWLClass("urn:test:", "B");
        OWLClass c = df.getOWLClass("urn:test:", "C");
        OWLClass d = df.getOWLClass("urn:test:", "D");
        OWLAxiom ax = df.getOWLDisjointClassesAxiom(a, b, c, d);
        o.addAxiom(ax);
        String render = saveOntology(o, new DLSyntaxDocumentFormat()).toString();
        assertEquals("A ⊑ ¬ B, A ⊑ ¬ C, A ⊑ ¬ D, B ⊑ ¬ C, B ⊑ ¬ D, C ⊑ ¬ D", render);
    }
}