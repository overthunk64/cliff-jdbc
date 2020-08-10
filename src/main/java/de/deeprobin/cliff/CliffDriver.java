package de.deeprobin.cliff;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class CliffDriver implements Driver {
    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        if (url == null) {
            throw new SQLException("url is null");
        }

        if (!url.startsWith("jdbc:cliff:")) {
            return null;
        }

        // TODO
        throw new RuntimeException("Not implemented");
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        // TODO
        return false;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        // TODO
        return new DriverPropertyInfo[0];
    }

    // TODO
    @Override
    public int getMajorVersion() {
        return 0;
    }

    // TODO
    @Override
    public int getMinorVersion() {
        return 0;
    }

    // TODO
    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    // TODO
    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
