package domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        HintLetterTest.class,
        TekeningTest.class,
        PuntTest.class,
        SpelerTest.class,
        CirkelTest.class,
        DriehoekTest.class,
        LijnStukTest.class,
        RechthoekTest.class,
        OmhullendeTest.class,
        WoordenLijstTest.class
})
public class AllTests {

}