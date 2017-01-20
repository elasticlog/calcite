/*
 * 
 * Copyright (C) 2016 elasticlog <elasticlog01@gmail.com>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.apache.calcite.prepare;

import org.apache.calcite.prepare.Prepare.PreparedResult;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.sql.SqlNode;

public class SqlCacheEntry {

	private String sql;
	private RelDataType x;
	private SqlNode sqlNode;
	
	public SqlNode getSqlNode() {
		return sqlNode;
	}
	public void setSqlNode(SqlNode sqlNode) {
		this.sqlNode = sqlNode;
	}
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
	public RelDataType getX() {
		return x;
	}
	public void setX(RelDataType x) {
		this.x = x;
	}
	
}
