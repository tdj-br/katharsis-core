package io.katharsis.queryParams.include;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a single inclusion passed as a query param. An example of the value represented by this value is:
 * <i>comments.author</i>.
 */
public class Inclusion {

    private String path;

    public Inclusion(@SuppressWarnings("SameParameterValue") String path) {
        if (path == null) {
            throw new IllegalArgumentException("path cannot be null");
        }
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public List<String> getPathList() {
        return Arrays.asList(path.split("\\."));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Inclusion inclusion = (Inclusion) o;

        return !(path != null ? !path.equals(inclusion.path) : inclusion.path != null);

    }

    @Override
    public int hashCode() {
        return path != null ? path.hashCode() : 0;
    }
}
