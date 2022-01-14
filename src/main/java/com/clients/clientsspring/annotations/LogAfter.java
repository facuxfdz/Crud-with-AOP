package com.clients.clientsspring.annotations;

import java.lang.annotation.*;

@Documented
@Target(value={ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAfter {

}
