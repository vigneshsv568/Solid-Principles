
package dependencyinversion.incorrect;


public class Project {

    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

    public void implement() {

        /**
         * So as we can see, the Project class is a high-level module, and it depends on low-level modules 
         * such as BackEndDeveloper and FrontEndDeveloper. We are actually violating the first part of 
         * the dependency inversion principle.
         */
        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }

}
