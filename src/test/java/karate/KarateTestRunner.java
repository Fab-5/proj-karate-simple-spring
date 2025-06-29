package karate;


import com.intuit.karate.junit5.Karate;

public class KarateTestRunner {

    @Karate.Test
    public Karate testAll() {
        return Karate.run("LoginSauceDemo").relativeTo(getClass());
    }
}