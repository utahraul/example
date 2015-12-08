package com.github.greboreda.example.model.exceptions.daoexceptions;

public class DuplicateInstanceException extends InstanceException {

	private static final long serialVersionUID = 8813633570761819259L;

	public DuplicateInstanceException(Object key, String className) {
        super("Duplicate instance", key, className);
    }
    
}