package org.xmart.objc.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @version $Id$
 */
@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.METHOD})
public @interface ObjCStructureMember {
    int index();
    String name();
}
