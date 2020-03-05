package implementations;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="Student Configuration",description = "This is Student description")
public @interface ClassConfig {
    @AttributeDefinition(name = "number of students" , type = AttributeType.INTEGER)
     int maxStudent() default 4;
    @AttributeDefinition(name="passing marks",type = AttributeType.INTEGER)
    int passingMarks() default 35;

}
