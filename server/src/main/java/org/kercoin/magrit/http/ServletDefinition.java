/*
Copyright 2011 Frederic Menou

This file is part of Magrit.

Magrit is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of
the License, or (at your option) any later version.

Magrit is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public
License along with Magrit.
If not, see <http://www.gnu.org/licenses/>.
 */
package org.kercoin.magrit.http;

import javax.servlet.Servlet;

public class ServletDefinition {
	private String name;
	private Class<? extends Servlet> type;

	public String getName() {
		return name;
	}

	public ServletDefinition(String name, Class<? extends Servlet> type) {
		super();
		this.name = name;
		this.type = type;
	}

	public Class<? extends Servlet> getType() {
		return type;
	}

}
