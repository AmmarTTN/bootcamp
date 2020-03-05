package implementations;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import services.ClassConfigurationService;

import java.util.ArrayList;

@Component(service = ClassConfigurationService.class)
@Designate(ocd = ClassConfig.class)
public class ClassConfigurationServiceImpl implements ClassConfigurationService {

    @Activate
    ClassConfig classConfig;

    @Override
    public Boolean isClassLimitReached(ArrayList list) {
        if(list.stream().count()>classConfig.maxStudent()){
            return true;
        }
        return false;    }

    @Override
    public Integer getPassingMarks() {
        return classConfig.passingMarks();
    }
}
