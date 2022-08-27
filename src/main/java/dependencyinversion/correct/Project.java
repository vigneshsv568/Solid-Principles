
package dependencyinversion.correct;

import java.util.List;


public class Project {

    private List<Developer> developers;

    public Project(List<Developer> developers) {

        this.developers = developers;
    }

    public void implement() {
        /**
         * Now Project class does not depend on the FrontEndDeveloper and the BackendDeveloper classes.
         */
        developers.forEach(d->d.develop());
    }

}
