import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

import java.awt.print.Paper;
import java.util.Iterator;

import static org.apache.jena.ontology.OntModelSpec.OWL_MEM;
import static org.apache.jena.ontology.OntModelSpec.OWL_MEM_MICRO_RULE_INF;

public class Example_ESWC {

    public static void createModel()
    {
        String source = "http://www.eswc2006.org/technologies/ontology";
        String nS = source + '#';
        OntModel base = ModelFactory.createOntologyModel(OWL_MEM);

        //Reasoning model.

        OntModel inf = ModelFactory.createOntologyModel(OWL_MEM_MICRO_RULE_INF,base);

        //create dummy paper.

        /*OntClass paper = base.getOntClass(nS + "Paper");
        Individual p1 = base.createIndividual(nS + "paper1",paper);

        boolean direct = true;
        for(Iterator<Resource> i = p1.listRDFTypes(direct); i.hasNext();){
            System.out.println(p1.getURI() + "is inferred to be in class"+i.next());
        }*/
        try {
            OntModel m = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
            OntClass artefact = m.getOntClass(nS + "Artefact");
            for (Iterator<OntClass> i = artefact.listSubClasses(); i.hasNext(); ) {
                OntClass c = i.next();
                System.out.println(c.getURI());
            }
        }
        catch(Exception e){}


    }
}
