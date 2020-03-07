import org.apache.log4j.BasicConfigurator;

public class Main {
    public static void main(String []agrs)
    {
        BasicConfigurator.configure();
        Example_ESWC example_eswc = new Example_ESWC();
        Example_ESWC.createModel();
    }
}
