/*
 * Copyright 2004-2013 SpringSource.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codehaus.groovy.grails.scaffolding;

import java.io.IOException;
import java.io.Writer;

import org.codehaus.groovy.grails.commons.GrailsDomainClass;
import org.springframework.core.io.ResourceLoader;

/**
 * Defines methods for generating Grails artifacts from a domain class.
 *
 * @author Graeme Rocher
 * @since 0.1
 */
public interface GrailsTemplateGenerator {

	/**
	 * The resource loader to use to load templates from.
	 *
	 * @param resourceLoader The ResourceLoader instance
	 */
	void setResourceLoader(ResourceLoader resourceLoader);

	/**
	 * Generates the necessary views for the supplied domain class.
	 * @param domainClass The DomainClass to generate views for
	 * @param destDir The destination directory to generate views to
	 */
	void generateViews(GrailsDomainClass domainClass, String destDir) throws IOException;

	/**
	 * Generates a controller for the supplied domain class.
	 * @param domainClass The DomainClass to generate views for
	 * @param destDir The destination directory to generate views to
	 */
	void generateController(GrailsDomainClass domainClass, String destDir) throws IOException;

	/**
	 * Generates a Restful controller for the supplied domain class.
	 * @param domainClass The DomainClass to generate views for
	 * @param destDir The destination directory to generate views to
	 */
	void generateRestfulController(GrailsDomainClass domainClass, String destDir) throws IOException;

	/**
	 * Generates a controller for the supplied domain class.
	 * @param domainClass The DomainClass to generate views for
	 * @param destDir The destination directory to generate views to
	 */
	void generateAsyncController(GrailsDomainClass domainClass, String destDir) throws IOException;

	/**
	 * Whether the generator should overwrite existing files (defaults to false).
	 *
	 * @param shouldOverwrite Whether views should be overwritten when generating
	 */
	void setOverwrite(boolean shouldOverwrite);

	/**
	 * Generates a view for the specified domain class and view name writing the result to the specified
	 * java.io.Writer instance.
	 *
	 * @param viewName The name of the view
	 * @param out The writer to write to
	 * @param domainClass The domain class to generate views for
	 */
	void generateView(GrailsDomainClass domainClass, String viewName, Writer out) throws IOException;

	/**
	 * Generates a view for the specified domain class and view name to the target directory.
	 * @param domainClass The domain class
	 * @param viewName The view name
	 * @param destDir The destination
	 */
	void generateView(GrailsDomainClass domainClass, String viewName, String destDir) throws IOException;

	/**
	 * Generates a controller for the specified domain class, writing the result to the specified
	 * java.io.Writer instance.
	 *
	 * @param domainClass The domain class to generate a controller for
	 * @param out The Writer to write to
	 */
	void generateController(GrailsDomainClass domainClass, Writer out) throws IOException;

	/**
	 * Generates a controller unit home for the specified domain class.
	 *
	 * @param domainClass The domain class
	 * @param destDir The destination
	 */
	void generateTest(GrailsDomainClass domainClass, String destDir) throws IOException;

	/**
	 * Generates a controller unit home for the specified domain class.
	 *
	 * @param domainClass The domain class
	 * @param destDir The destination
	 */
	void generateRestfulTest(GrailsDomainClass domainClass, String destDir) throws IOException;

	/**
	 * Generates a controller unit home for the specified domain class.
	 *
	 * @param domainClass The domain class
	 * @param destDir The destination
	 */
	void generateAsyncTest(GrailsDomainClass domainClass, String destDir) throws IOException;
}
