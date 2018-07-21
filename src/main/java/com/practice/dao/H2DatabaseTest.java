package com.practice.dao;

import java.sql.SQLException;

import org.h2.tools.Console;
import org.h2.tools.Server;

public class H2DatabaseTest {

	public static void main(String[] args) throws SQLException {
		new Console().runTool(args);
	}
}
