package annotations;

import java.lang.annotation.Repeatable;

public @interface Schedules {
    Schedule[] value();
}
