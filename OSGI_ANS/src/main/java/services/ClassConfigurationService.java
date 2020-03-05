package services;

import org.osgi.service.component.annotations.Component;

import java.util.ArrayList;

public interface ClassConfigurationService {
    Boolean isClassLimitReached(ArrayList list);
    Integer getPassingMarks();
}
