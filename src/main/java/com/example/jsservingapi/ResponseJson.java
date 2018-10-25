package com.example.jsservingapi;

import java.util.Objects;

public class ResponseJson {
    private int id;
    private String message;

    public ResponseJson(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseJson that = (ResponseJson) o;
        return id == that.id &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, message);
    }

    @Override
    public String toString() {
        return "ResponseJson{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
