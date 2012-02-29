package de.jbellmann.tomcat.cassandra;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

public class CassandraSessionFacade implements HttpSession {

    private final CassandraSession cassandraSession;

    CassandraSessionFacade(CassandraSession cassandraSession) {
        this.cassandraSession = cassandraSession;
    }

    @Override
    public Object getAttribute(String name) {
        return this.cassandraSession.getAttribute(name);
    }

    @Override
    public Enumeration<String> getAttributeNames() {
        return this.cassandraSession.getAttributeNames();
    }

    @Override
    public long getCreationTime() {
        return this.cassandraSession.getCreationTime();
    }

    @Override
    public String getId() {
        return this.cassandraSession.getId();
    }

    @Override
    public long getLastAccessedTime() {
        return this.cassandraSession.getLastAccessedTime();
    }

    @Override
    public int getMaxInactiveInterval() {
        return this.cassandraSession.getMaxInactiveInterval();
    }

    @Override
    public ServletContext getServletContext() {
        return this.cassandraSession.getServletContext();
    }

    @Override
    public HttpSessionContext getSessionContext() {
        return this.cassandraSession.getSessionContext();
    }

    @Override
    public Object getValue(String name) {
        return this.cassandraSession.getAttribute(name);
    }

    @Override
    public String[] getValueNames() {
        return this.cassandraSession.getValueNames();
    }

    @Override
    public void invalidate() {
        this.cassandraSession.invalidate();
    }

    @Override
    public boolean isNew() {
        return this.cassandraSession.isNew();
    }

    @Override
    public void putValue(String name, Object value) {
        this.cassandraSession.setAttribute(name, value);
    }

    @Override
    public void removeAttribute(String name) {
        this.cassandraSession.removeAttribute(name);
    }

    @Override
    public void removeValue(String name) {
        this.cassandraSession.removeAttribute(name);
    }

    @Override
    public void setAttribute(String name, Object value) {
        this.cassandraSession.setAttribute(name, value);
    }

    @Override
    public void setMaxInactiveInterval(int interval) {
        this.cassandraSession.setMaxInactiveInterval(interval);
    }

}
