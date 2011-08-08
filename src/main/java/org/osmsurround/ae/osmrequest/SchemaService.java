/**
 * This file is part of Amenity Editor for OSM.
 * Copyright (c) 2001 by Adrian Stabiszewski, as@grundid.de
 *
 * Amenity Editor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Amenity Editor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Amenity Editor.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.osmsurround.ae.osmrequest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

@Service
public class SchemaService {

	public Unmarshaller createOsmUnmarshaller() {
		try {
			return JAXBContext.newInstance("de.emaitie.osm.xsd.osm").createUnmarshaller();
		}
		catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

	public Marshaller createOsmMarshaller() {
		try {
			return JAXBContext.newInstance("de.emaitie.osm.xsd.osm").createMarshaller();
		}
		catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}

}