package ru.skypro;

import java.util.Objects;

public class Author {
    public String name;


    public Author(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Author: " + name;
    }

    @Override
    public boolean equals(Object some) {
        if (this == some) return true;
        if (some == null || getClass() != some.getClass()) return false;
        Author author = (Author) some;
        return Objects.equals(name, author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
