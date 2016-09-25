package com.sabre.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface TimeWatch {
	String comments() default "test";  //Annotation methods can’t have parameters.
	//Annotation methods can have default values.
	//Retention policy SOURCE, CLASS and RUNTIME
	//Annotation methods return types are limited to primitives, String, enums, Annotation or array of these.
}
