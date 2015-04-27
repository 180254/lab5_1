package edu.iis.mto.multithread;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Frank Appel
 * @see http://www.codeaffine.com/2013/04/10/running-junit-tests-repeatedly-without-loops/
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
		java.lang.annotation.ElementType.METHOD
})
public @interface Repeat {
	public abstract int times();
}