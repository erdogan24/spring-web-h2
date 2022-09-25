package com.E.A.ws.user;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {UniqueUsernameValidator.class})
public @interface UniqueUsername {

    String message() default "{hoaxify.constraintiusername.UniqueUsername.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] Payload() default {};
}
