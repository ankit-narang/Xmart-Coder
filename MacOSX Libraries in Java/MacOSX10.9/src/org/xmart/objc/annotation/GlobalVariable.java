package org.xmart.objc.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface GlobalVariable {
	String name() default "";

}
