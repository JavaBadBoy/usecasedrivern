package com.mousa.usecasedriven.adapters;

public interface Gateway {
    default void save(DomainModel customer) {}
}
