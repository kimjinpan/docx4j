/*
 *  Copyright 2016, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */

package org.docx4j.openpackaging.parts.webextensions;

import org.docx4j.com.microsoft.schemas.office.webextensions.webextension_2010_11.CTOsfWebExtension;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.parts.JaxbXmlPart;
import org.docx4j.openpackaging.parts.PartName;
import org.docx4j.openpackaging.parts.relationships.Namespaces;



/**
 * @author jharrop
 * @since 3.3.2
 */
public final class WebExtensionPart extends JaxbXmlPart<CTOsfWebExtension> {
	
	public WebExtensionPart(PartName partName) throws InvalidFormatException {
		super(partName);
		init();
	}

	public WebExtensionPart() throws InvalidFormatException {
		super(new PartName("/word/webextension1.xml"));
		init();
	}
	
	public void init() {		
		// Used if this Part is added to [Content_Types].xml 
		setContentType(new  org.docx4j.openpackaging.contenttype.ContentType( 
				org.docx4j.openpackaging.contenttype.ContentTypes.WEB_EXTENSION_WEBEXTENSION));

		// Used when this Part is added to a rels 
		setRelationshipType(Namespaces.WEB_EXTENSION_WEBEXTENSION);
		
	}

}
