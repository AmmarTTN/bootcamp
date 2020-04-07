package apps.solution;

import javax.script.Bindings;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.scripting.sightly.pojo.Use;


public class ResourceSelector implements Use {

   private Iterable<Resource> parentPage;

    @Override
    public void init(Bindings bindings) {

        ResourceResolver resourceResolver = (ResourceResolver)bindings.get("resolver");

        parentPage = resourceResolver.getResource("/content/my-options").getChildren();
    }

    public Iterable<Resource> getParentPage() {
        return this.parentPage;
    }

}